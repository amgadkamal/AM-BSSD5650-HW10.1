package com.company;

public class DrPepper extends CaffeinatedBeverage {


    //no brewBeverage
    @Override
    boolean brewBeverage() {return false;}

    //no milk
    @Override
    boolean wantsMilk() {return false;}

    //Heating Dr Pepper
    @Override
    boolean HeatingDrPepper(){return true;}

    //No boiling water
    @Override
    boolean Boilingwater(){return false;}

    //add lemon
    @Override
    boolean wantsLemon(){return true;}





}
