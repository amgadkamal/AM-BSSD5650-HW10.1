package com.company;

public class Coffe extends CaffeinatedBeverage {


    boolean brewBeverage() {
        System.out.println("Dripping coffe through filter");
        return false; }


    @Override
    boolean wantsLemon() {
        return false; }

    @Override
    boolean wantsSugar() {
        return true; }


    @Override
    boolean Boilingwater() {
        return true; }
}