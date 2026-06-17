Student Management System
Overview

The Student Management System is a RESTful backend application developed using Java, Spring Boot, and MySQL. The system allows users to perform CRUD (Create, Read, Update, Delete) operations on student records through REST APIs.

This project was built to strengthen my backend development skills and demonstrate practical experience with Spring Boot, database integration, and API development.

Features
Create new student records
Retrieve all students
Retrieve a student by ID
Update student information
Delete student records
MySQL database integration
RESTful API architecture
API testing using Postman
Technologies Used
Java
Spring Boot
Spring Data JPA
MySQL
Maven
Postman
Git & GitHub
IntelliJ IDEA
Project Structure

student-management-system

├── controller

├── service

├── repository

├── entity

├── resources

├── pom.xml

└── README.md

API Endpoints
Method	Endpoint	Description
GET	/students	Retrieve all students
GET	/students/{id}	Retrieve a student by ID
POST	/students	Create a new student
PUT	/students/{id}	Update a student
DELETE	/students/{id}	Delete a student
Setup Instructions
Clone the Repository

git clone https://github.com/Bubele-Ernest-Mtsora/student-management-system.git

Configure MySQL

Create a database:

CREATE DATABASE student_db;

Update application.properties with your database credentials.

Run the Application

mvn spring-boot

The application will start on:

http://localhost:8080

Testing

All API endpoints were tested using Postman to verify the functionality of CRUD operations and database connectivity.

What I Learned

Through this project, I gained practical experience in:

Building REST APIs with Spring Boot
Working with MySQL databases
Using Spring Data JPA for data persistence
Implementing layered architecture (Controller, Service, Repository)
Testing APIs with Postman
Managing source code with Git and GitHub
Future Improvements
Add Spring Security authentication and authorization
Implement input validation
Add Swagger/OpenAPI documentation
Improve exception handling
Deploy the application to a cloud platform
Author

Bubele Mtsora

BCom Honours Information Systems Student at North-West University

Aspiring Software Developer with interests in Backend Development, Software Engineering, and Cybersecurity.
