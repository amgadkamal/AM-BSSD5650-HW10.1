package com.company;

public class Tea extends CaffeinatedBeverage{

   boolean brewBeverage(){
       System.out.println("Steeping the tea bag");
       return false; }

    @Override
    boolean Boilingwater(){return true;}

    @Override
    boolean wantsLemon(){return true;}

    @Override
    boolean wantsMilk(){return false;}

}
