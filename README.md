# 🚀 Student Management System

## 📌 Overview

The Student Management System is a RESTful backend application developed using Java, Spring Boot, and MySQL. The system allows users to perform CRUD (Create, Read, Update, Delete) operations on student records through REST APIs.

This project was built to strengthen my backend development skills and demonstrate practical experience with Spring Boot, database integration, and API development.

## ✨ Features
- Create new student records  
- Retrieve all students  
- Retrieve student by ID  
- Update student information  
- Delete student records  
- MySQL database integration  
- RESTful API architecture  
- API testing using Postman  

## 🛠️ Tech Stack
- Java  
- Spring Boot  
- Spring Data JPA  
- MySQL  
- Maven  
- Postman  
- Git & GitHub  
- IntelliJ IDEA

  ## 📁 Project Structure

student-management-system
├── controller
├── service
├── repository
├── entity
├── resources
├── pom.xml
└── README.md

## 🔗 API Endpoints

| Method | Endpoint           | Description              |
|--------|--------------------|--------------------------|
| GET    | /students          | Retrieve all students    |
| GET    | /students/{id}     | Retrieve student by ID   |
| POST   | /students          | Create a new student     |
| PUT    | /students/{id}     | Update student details   |
| DELETE | /students/{id}     | Delete a student         |


## ⚙️ Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/Bubele-Ernest-Mtsora/student-management-system-crud-Api.git

Configure MySQL

Create a database:

CREATE DATABASE student_db;

Update application.properties with your database credentials.
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

Run the Application

mvn spring-boot:run

The application will start on:

http://localhost:8080

🧪 Testing

All endpoints were tested using Postman to ensure correct CRUD operations and database connectivity.

📚 What I Learned
Building RESTful APIs with Spring Boot
Working with MySQL databases
Using Spring Data JPA for persistence
Implementing layered architecture (Controller, Service, Repository)
API testing with Postman
Version control using Git & GitHub

## 📸 Screenshots

### 🧱 Project Structure

![project structure](project-screenshots/project-Structure.png)

### 🧱 Package Structure

![Package Structure](project-screenshots/package-structure.png)

### 📄 Get All Students

![Get All Students](project-screenshots/get-all-students.png)

### 🔎 Get Student by ID

![Get Students Id](project-screenshots/get-student-by-id.png)

### ➕ Create Student

![Create Student](project-screenshots/create-student.png)

### ✏️ Update Student

![Update Student](project-screenshots/update-student-information.png)

### 🗑️ Delete Student

![Delete Student](project-screenshots/delete-student.png)

### 🗄️ Database Table

![Database Table](project-screenshots/mysql-database.png)

Author

Bubele Mtsora

BCom Honours Information Systems Student at North-West University

Aspiring Software Developer with interests in Backend Development, Software Engineering, and Cybersecurity.
