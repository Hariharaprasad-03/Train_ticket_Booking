package com.zsgs.trainticketbooking.repository;

import com.zsgs.trainticketbooking.config.DatabaseConfig;

import java.sql.Connection;
import java.sql.SQLException;

public  abstract class BaseRepository {

     private   DatabaseConfig databaseConfig ;

     public BaseRepository(){

         databaseConfig = DatabaseConfig.getInstance();
     }

     protected Connection getConnection() throws SQLException {

         return databaseConfig.getConnection();
     }
}
