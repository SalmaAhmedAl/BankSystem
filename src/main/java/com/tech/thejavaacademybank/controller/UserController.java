package com.tech.thejavaacademybank.controller;

import com.tech.thejavaacademybank.dto.*;
import com.tech.thejavaacademybank.service.impl.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Tag(name = "User Account Management APIs")
public class UserController {
    @Autowired
    UserService userService;

    @Operation(
            summary = "Create New User Account",
            description = "Creating a new user and assigning an account ID"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 created"
    )
    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest) {
        return userService.createAccount(userRequest);
    }

    @Operation(
            summary = "Name Enquiry",
            description = "Get account holder's name based on the account number"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 created"
    )
    @GetMapping("/nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest enquiryRequest) {
        return userService.nameEnquiry(enquiryRequest);
    }

    @Operation(
            summary = "Balance Enquiry",
            description = "Get account balance based on the account number"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 created"
    )
    @GetMapping("/balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest enquiryRequest) {
        return userService.balanceEnquiry(enquiryRequest);
    }

    @Operation(
            summary = "Credit Account",
            description = "Credit the account with a specified amount"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 created"
    )
    @PostMapping("/credit")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest creditDebitRequest) {
        return userService.creditAccount(creditDebitRequest);
    }

    @Operation(
            summary = "Debit Account",
            description = "Debit the account with a specified amount"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 created"
    )
    @PostMapping("/debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest creditDebitRequest) {
        return userService.debitAccount(creditDebitRequest);
    }

    @Operation(
            summary = "Transfer Amount",
            description = "Transfer amount from one account to another"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 created"
    )
    @PostMapping("/transfer")
    public BankResponse transfer(@RequestBody TransferRequest transferRequest) {
        return userService.transfer(transferRequest);
    }
}