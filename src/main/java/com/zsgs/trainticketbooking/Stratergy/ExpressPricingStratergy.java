package com.zsgs.trainticketbooking.Stratergy;

public class ExpressPricingStratergy implements PricingStratergy{


    private final  double calculatingFactor = 0.8 ;


    @Override
    public double calculatePrice(int distanceKm) {
        return distanceKm * calculatingFactor;
    }
}
