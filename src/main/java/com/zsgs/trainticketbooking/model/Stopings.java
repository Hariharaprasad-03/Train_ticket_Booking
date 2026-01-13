package com.zsgs.trainticketbooking.model;

public class Stopings {

    private Station station;
    private int StoppingSequence ;

    public Stopings() {
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public int getStoppingSequence() {
        return StoppingSequence;
    }

    public void setStoppingSequence(int stoppingSequence) {
        StoppingSequence = stoppingSequence;
    }
}
