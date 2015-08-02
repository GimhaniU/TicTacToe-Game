/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Player;
import db_utilities.DBConnection;
import db_utilities.DBHandler;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DinsuG
 */
public class playerController {
      public static boolean addNewPlay(Player player) throws ClassNotFoundException, SQLException {
        Connection conn=DBConnection.getDBConnection().getConnection();
        String sql = "Insert into Player Values('" + player.getName() + "','" + player.getPlayerType() + "','" + player.getCurrentDate() + "','" + player.getIsWin() + "');";
        int returnValue = DBHandler.setData(conn, sql);         
        return returnValue>0;
      }
      
      public static ArrayList<Player> getAllplayer() throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "Select * From player";
        ResultSet rst = DBHandler.getData(conn, sql);
        ArrayList<Player> playList = new ArrayList<>();
        while (rst.next()) {
            Player player = new Player(rst.getString("Name"),rst.getString("playDate"), rst.getString("playType"),  rst.getInt("isWin"));
            playList.add(player);
        }
        return playList;
    }
    

}
