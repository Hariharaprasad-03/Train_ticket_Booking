package com.zsgs.trainticketbooking.payload;

import com.zsgs.trainticketbooking.enums.TrainType;

import java.util.List;

public class AddTrainRequest {

    private String trainName ;
    private TrainType trainType;
    private List<String> stoppings;

    public AddTrainRequest() {
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public TrainType getTrainType() {
        return trainType;
    }

    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }

    public List<String> getStoppings() {
        return stoppings;
    }

    public void setStoppings(List<String> stoppings) {
        this.stoppings = stoppings;
    }
}
