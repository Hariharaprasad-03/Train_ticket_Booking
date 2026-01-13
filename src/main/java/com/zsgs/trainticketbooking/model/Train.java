package com.zsgs.trainticketbooking.model;

import com.zsgs.trainticketbooking.enums.TrainType;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private String trainId ;
    private String trainName ;
    private TrainType trainType ;
    private List<Station> stoppings ;

    public Train(){
        stoppings = new ArrayList<>();
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public List<Station> getStoppings() {
        return stoppings;
    }

    public void setStoppings(List<Station> stoppings) {
        this.stoppings = stoppings;
    }

    public TrainType getTrainType() {
        return trainType;
    }

    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainId='" + trainId + '\'' +
                ", train_name='" + trainName + '\'' +
                ", trainType=" + trainType +
                ", stoppings=" + stoppings +
                '}';
    }
}
