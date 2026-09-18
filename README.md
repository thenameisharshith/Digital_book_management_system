# Digital Book Management System

A fresher-friendly Digital Book Management System built with Java, Spring Boot, REST APIs, Spring Data JPA, Hibernate and MySQL.

## Features
- Book CRUD
- User CRUD
- Issue and return books
- Available quantity tracking
- User and book issue history
- Validation and global exception handling
- Layered architecture: Controller -> Service -> Repository -> MySQL

## Technologies
Java 17 | Spring Boot 3.5.6 | Spring Web | Spring Data JPA | Hibernate | MySQL | Maven | Jakarta Validation

## Run
1. Create the database with database/schema.sql.
2. Set your MySQL password in src/main/resources/application.properties.
3. Run mvn spring-boot:run.
4. API base URL: http://localhost:8080

## APIs
Books: GET/POST/PUT/DELETE /api/books
Users: GET/POST/PUT/DELETE /api/users
Issue: POST /api/issues/book/{bookId}/user/{userId}
Return: PUT /api/issues/{id}/return
History: GET /api/issues/user/{id} and /api/issues/book/{id}

## Example
POST /api/books
{"title":"Java Programming","author":"James Gosling","category":"Programming","quantity":5}

Project flow: Client/Frontend -> REST Controller -> Service -> JPA Repository -> MySQL.