package com.zsgs.trainticketbooking.repository;

import com.zsgs.trainticketbooking.model.Train;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TrainRepository extends BaseRepository{


    public boolean addTrain(Train train ) throws SQLException {

        String sql = """
                INSERT INTO train (train_id , train_name , train_type )
                values(?,?,?)
                """;
        int update =0 ;

        try (Connection connection = getConnection();
             PreparedStatement pstmt  = connection.prepareStatement(sql)){

            pstmt.setString(1,train.getTrainId());
            pstmt.setString(2,train.getTrainName());
            pstmt.setString(3,String.valueOf(train.getTrainType()));

            update = pstmt.executeUpdate();


        }
        return update > 0 ;
    }
}
