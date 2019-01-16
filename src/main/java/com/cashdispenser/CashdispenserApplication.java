package com.cashdispenser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CashdispenserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CashdispenserApplication.class, args);

        ATMImpl atmImpl = new ATMImpl();
        atmImpl.connectionConfirmation();
        atmImpl.cashIn();
        atmImpl.cashOut();

        System.out.println(ATM.stopAtm());
    }

}

