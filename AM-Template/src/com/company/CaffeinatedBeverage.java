package com.company;

public abstract  class CaffeinatedBeverage {


    final void prepareRecipe(){

        getMug();
        brewBeverage();
        pourInCup();

        if (wantsLemon()){
        addLemon();}

        if (wantsSugar()){
            addSugar();}

        if (wantsMilk()){
            addMilk();}

        if (HeatingDrPepper()){
            HeatDrPepper();}

        if (Boilingwater()){
            boilWater();}
    }

    abstract boolean brewBeverage();


   boolean wantsLemon(){return false;}
   boolean wantsMilk(){return true;}
   boolean wantsSugar(){return true;}
   boolean HeatingDrPepper(){return false;}
   boolean Boilingwater(){return false;}



    final void addLemon(){
        System.out.println("Adding lemon"); }

    final void addSugar(){
        System.out.println("Adding sugar"); }

    final void addMilk(){
        System.out.println("Adding milk");    }

    final void getMug(){
        System.out.println("Got mug"); }

    final void boilWater(){
        System.out.println("Boiling water"); }

    final void pourInCup(){
        System.out.println("Pouring in cup"); }

    final void HeatDrPepper(){
        System.out.println("Heating Dr Pepper");
    }
}
