/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Gimhani
 */
public class Player {
    private String name;
    private int playerNumber; //player 1 or 2
    private int image; //gold_x=1 ,gold_o=2, red_x=3, red_o=4
    private int port;
    private String ipAddress;
    
    private boolean isServer;
    private int turn; //turn 1 and 2

    public Player(String name, int playerNumber, int image, int turn) {
        this.name = name;
        this.playerNumber = playerNumber;
        this.image = image;
        this.turn = turn;
    }

    public Player(int port, String ipAddress, boolean isServer, int turn) {
        this.port = port;
        this.ipAddress = ipAddress;
        this.isServer = isServer;
        this.turn=turn;
        
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public boolean isIsServer() {
        return isServer;
    }

    public void setIsServer(boolean isServer) {
        this.isServer = isServer;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    
}
