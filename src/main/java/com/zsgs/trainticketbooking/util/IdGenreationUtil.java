package com.zsgs.trainticketbooking.util;

import com.zsgs.trainticketbooking.repository.BaseRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IdGenreationUtil extends BaseRepository  {

    public String generateId(String prefix) {

        String sql = """
                SELECT id FROM  idgeneration WHERE prefix =(?)
                """;

        String key = null;
        try(Connection connection = getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql)){

            pstmt.setString(1,prefix);
            ResultSet rs = pstmt.executeQuery();

            if ( rs.next()  ){

                int id =  rs.getInt("id");
                key =  prefix + String.format("%3d",id);
            }





        }catch (SQLException e) {

            System.out.println(e.getMessage());
        }

        return key ;
    }
}
