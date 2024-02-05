## User Account Creation
- Allows users to create a new account with the specified details.
- Checks for existing accounts to avoid duplication.
- Returns a response with account information upon successful creation.

![User Account Creation](images/user_account_creation.png)

## Sending Email Alerts

![Email Alert](images/send_mail_alert.png)

# Account Enquiries

## Name Enquiry

![Name Enquiry](images/name_enquiry.png)

The banking app now supports name enquiry, allowing users to retrieve account holder names by providing the accountNumber. This feature is useful for quick verification and reference.

## Balance Enquiry

![Balance Enquiry](images/balance_enquiry.png)

Additionally, users can inquire about the account balance using the accountNumber. The balance enquiry feature provides users with instant access to their account's financial status, promoting transparency and ease of use.

## Credit Account

### Success Scenario

When successfully crediting an account, the user's account balance is updated.

![Success Credit](images/success_credit.png)

### Failure Scenario

If the account number provided for crediting does not exist, an appropriate error response is returned, and the account balance remains unchanged.

![Failed Credit](images/failed_credit.png)