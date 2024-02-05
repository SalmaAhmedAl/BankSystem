package com.tech.thejavaacademybank.utils;

import java.time.Year;

public class AccountUtils {
    public static final String ACCOUNT_EXISTS_CODE ="001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account created!";
    public static final String ACCOUNT_CREATION_SUCCESS_CODE ="002";
    public static final String ACCOUNT_CREATION_MESSAGE ="Account has been successfully created!";
    public static final String ACCOUNT_NOT_EXIST_CODE ="003";
    public static final String ACCOUNT_NOT_EXIST_MESSAGE ="User with the provided Account Number does not exist!";
    public static final String ACCOUNT_FOUND_CODE ="004";
    public static final String ACCOUNT_FOUND_MESSAGE ="User Account Found";
    public static String generateAccountNumber(){
        /**
         * 2023 + random six digits
         */

        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        //generate a random number between min and max
        int randNumber = (int) (Math.random() * (max - min + 1) + min);
        //convert the current and randomNumber to string, then concatenate them.

        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);
        StringBuilder accountNumber = new StringBuilder();
        return accountNumber.append(year).append(randomNumber).toString();
    }
}
