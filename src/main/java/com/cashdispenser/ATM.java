package com.cashdispenser;

public interface ATM {

    void cashIn();
    void cashOut();

    default void connectionConfirmation(){
        System.out.println("You are connected.");
    }

    static String stopAtm() {
        return "Goodbye!";
    }
}
