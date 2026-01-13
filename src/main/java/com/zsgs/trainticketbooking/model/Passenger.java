package com.zsgs.trainticketbooking.model;

public class Passenger {

    private String passenger_id;
    private String passenger_name ;

    public Passenger() {
    }

    public String getPassenger_id() {
        return passenger_id;
    }

    public void setPassenger_id(String passenger_id) {
        this.passenger_id = passenger_id;
    }

    public String getPassenger_name() {
        return passenger_name;
    }

    public void setPassenger_name(String passenger_name) {
        this.passenger_name = passenger_name;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passenger_id='" + passenger_id + '\'' +
                ", passenger_name='" + passenger_name + '\'' +
                '}';
    }
}
