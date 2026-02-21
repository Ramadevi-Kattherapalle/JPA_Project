# JPA Project - Employee Management System

A Java EE web application that performs full CRUD (Create, Read, Update, Delete) operations for managing employee records using Java Persistence API (JPA).This project follows a clean layered architecture with Controller, Service, DAO, and Entity layers.  
The frontend is built using JSP and pure CSS.

Table of Contents
1.Project Overview
2.Architecture
3.Project Structure
4.Technology Stack
5.Employee Entity Fields
6.Application Flow
7.Servlet Endpoints
8.JPA Queries Used
9.Database Configuration
10.How to Add Your Own Database Driver
11.Setup and Installation
12.Screenshots
13.Contributing

## 1. Project Overview
JPAProject is a session-based Employee Management System where users can:
- Register
- Login
- View Employees
- Update Employee Details
- Delete Employee Records

The persistence layer uses JPA with EntityManager, making the project database-independent.  
Any JDBC-compatible database can be used by updating `pom.xml` and `persistence.xml`.

---

## 2. Architecture
The application follows a four-layer architecture.

Controller Layer - Jakarta Servlets handle HTTP requests and responses. Each servlet maps to a specific URL endpoint and delegates business logic to the Service layer.

Service Layer - The Service interface and its implementation (ServiceImp) contain the business rules. The service converts raw request parameters into Employee entity objects before passing them to the DAO layer.

DAO Layer - The DataBaseOperation interface defines database operations. DataBaseOperationImp implements these operations using JPA EntityManager and JPQL queries.

Entity Layer - The Employee class is a JPA-annotated entity that maps directly to the Employee table in the database.
### 3. Project Structure

```text
JPAproject/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.example/
│   │   │       ├── Controller/
│   │   │       │   ├── LoginJPA.java
│   │   │       │   ├── RegisterJPA.java
│   │   │       │   └── ...
│   │   │       ├── dao/
│   │   │       │   ├── DatabaseOperation.java
│   │   │       │   └── DatabaseOperationImpl.java
│   │   │       ├── Service/
│   │   │       │   ├── Service.java
│   │   │       │   └── ServiceImpl.java
│   │   │       └── Entity/
│   │   │           └── Employee.java
│   │   ├── resources/
│   │   │   └── META-INF/
│   │   │       └── persistence.xml
│   │   └── webapp/
│   │       ├── login.jsp
│   │       ├── register.jsp
│   │       └── home.jsp
└── pom.xml
