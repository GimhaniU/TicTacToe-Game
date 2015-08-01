/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Gimhani
 */
public class NetworkPlayer {

    private Socket socket;
    private DataOutputStream dos;
    private DataInputStream dis;
    private ServerSocket serverSocket;

    private String ip = "localhost";
    private int port = 22222;

    private String[] matrix = new String[9];

    private boolean yourTurn = false;
    private boolean is_server = true;
    private boolean accepted = false;
    private boolean unableToCommunicateWithOpponent = false;
    private boolean won = false;
    private boolean enemyWon = false;
    private boolean tie = false;

    private int error_count;

    //to be added to a label
    private String waitingString = "Waiting for another player";
    private String unableToCommunicateWithOpponentString = "Unable to communicate with opponent.";
    private String wonString = "You won!";
    private String enemyWonString = "Opponent won!";
    private String tieString = "Game ended in a tie.";

    private int[][] wins = new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};

    public NetworkPlayer(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public void tick() {
        if (error_count >= 10) {
            unableToCommunicateWithOpponent = true;
        }

        if (!yourTurn && !unableToCommunicateWithOpponent) {
            try {
                int space = dis.readInt();
                if (is_server) {
                    matrix[space] = "X";
                } else {
                    matrix[space] = "O";
                }
                checkForEnemyWin();
                checkForTie();
                yourTurn = true;
            } catch (IOException e) {
                e.printStackTrace();
                error_count++;
            }
        }
    }

    private void checkForWin() {
        for (int i = 0; i < wins.length; i++) {
            if (is_server) {
                if (matrix[wins[i][0]] == "O" && matrix[wins[i][1]] == "O" && matrix[wins[i][2]] == "O") {
                    won = true;
                }
            } else {
                if (matrix[wins[i][0]] == "X" && matrix[wins[i][1]] == "X" && matrix[wins[i][2]] == "X") {
                    won = true;
                }
            }
        }
    }

    private void checkForEnemyWin() {
        for (int i = 0; i < wins.length; i++) {
            if (is_server) {
                if (matrix[wins[i][0]] == "X" && matrix[wins[i][1]] == "X" && matrix[wins[i][2]] == "X") {
                    enemyWon = true;
                }
            } else {
                if (matrix[wins[i][0]] == "O" && matrix[wins[i][1]] == "O" && matrix[wins[i][2]] == "O") {
                    enemyWon = true;
                }
            }
        }
    }

    public boolean isWon() {
        return won;
    }

    public void setWon(boolean won) {
        this.won = won;
    }

    public boolean isEnemyWon() {
        return enemyWon;
    }

    public void setEnemyWon(boolean enemyWon) {
        this.enemyWon = enemyWon;
    }

    public boolean isTie() {
        return tie;
    }

    public void setTie(boolean tie) {
        this.tie = tie;
    }

    private void checkForTie() {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == null) {
                return;
            }
        }
        tie = true;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public void listenForServerRequest() {
        Socket socket = null;
        try {
            socket = serverSocket.accept();
            dos = new DataOutputStream(socket.getOutputStream());
            dis = new DataInputStream(socket.getInputStream());
            accepted = true;
            System.out.println("CLIENT HAS REQUESTED TO JOIN, AND WE HAVE ACCEPTED");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean connect() {
        try {
            socket = new Socket(ip, port);
            dos = new DataOutputStream(socket.getOutputStream());
            dis = new DataInputStream(socket.getInputStream());
            accepted = true;
        } catch (IOException e) {
            System.out.println("Unable to connect to the address: " + ip + ":" + port + " | Starting a server");
            return false;
        }
        System.out.println("Successfully connected to the server.");
        return true;
    }

    private void initializeServer() {
        try {
            serverSocket = new ServerSocket(port, 8, InetAddress.getByName(ip));
        } catch (Exception e) {
            e.printStackTrace();
        }
        yourTurn = true;
        is_server = false;
    }

    public void control(int position) {
        if (accepted) {
            if (!unableToCommunicateWithOpponent && !won && !enemyWon) {

                if (matrix[position] == null) {
                    if (!is_server) {
                        matrix[position] = "X";
                    } else {
                        matrix[position] = "O";
                    }

                    try {
                        dos.writeInt(position);
                        dos.flush();
                    } catch (IOException e1) {
                        error_count++;
                        e1.printStackTrace();
                    }

                    System.out.println("DATA WAS SENT");
                    checkForWin();
                    checkForTie();
                }
            }
        }
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public boolean isIs_server() {
        return is_server;
    }

    public void setIs_server(boolean is_server) {
        this.is_server = is_server;
    }

}
