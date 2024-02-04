package com.tech.thejavaacademybank.service.impl;

import com.tech.thejavaacademybank.dto.BankResponse;
import com.tech.thejavaacademybank.dto.UserRequest;

public interface UserService {

    BankResponse createAccount(UserRequest userRequest);
}
