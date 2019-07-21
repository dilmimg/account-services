# Account Services REST API

This is an application which implements a REST API to support a web application to allow a user to view bank accounts and subsequently view transactions on any of the accounts they hold. 
The application exposes 2 end points as follows.

```
/account-services/accounts - Retrieves all the accounts for a given user

/account-services/accounts/{accountId}/transactions - Given an account Id, retrieves all the transactions for that account
```

This project is generated using Spring Boot 2.1.6, Java 1.8, Maven 3+ and H2 in-memory database. It is packaged as a .war and runs on Apache Tomcat 9.

## Assumptions

User will be authenticated and user id will be provided when retrieving account and transaction data.


## Tests
Integration tests are implemented.
Unit tests are currently not implemented.

## UI
Not applicable and outside of the scope of this project. 
