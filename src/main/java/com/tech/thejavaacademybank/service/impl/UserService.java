package com.tech.thejavaacademybank.service.impl;

import com.tech.thejavaacademybank.dto.BankResponse;
import com.tech.thejavaacademybank.dto.CreditDebitRequest;
import com.tech.thejavaacademybank.dto.EnquiryRequest;
import com.tech.thejavaacademybank.dto.UserRequest;

public interface UserService {

    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);
    String nameEnquiry(EnquiryRequest enquiryRequest);
    BankResponse creditAccount(CreditDebitRequest creditDebitRequest);
}
