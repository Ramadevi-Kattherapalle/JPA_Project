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
JPAproject/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com.example/
│       │       ├── Controller/
│       │       │   ├── LoginJPA.java        (URL: /login)
│       │       │   ├── RegisterJPA.java     (URL: /register)
│       │       │   ├── HomeJPA.java         (URL: /home)
│       │       │   ├── EditJPA.java         (URL: /edit)
│       │       │   └── DeleteJPA.java       (URL: /delete)
│       │       │
│       │       ├── dao/
│       │       │   └── DataBaseOperation.java   (DAO Interface)
│       │       │
│       │       ├── daoimplementation/
│       │       │   └── DataBaseOperationImp.java (JPA Implementation)
│       │       │
│       │       ├── Entity/
│       │       │   └── Employee.java        (JPA Entity)
│       │       │
│       │       ├── Service/
│       │       │   └── Service.java         (Service Interface)
│       │       │
│       │       └── ServiceImplementation/
│       │           └── ServiceImp.java      (Business Logic)
│       │
│       ├── resources/
│       │   └── META-INF/
│       │       └── persistence.xml          (JPA Configuration)
│       │
│       └── webapp/
│           ├── login.jsp
│           ├── register.jsp
│           └── home.jsp
│
└── pom.xml

## 4. Technology Stack
- **Language:** Java 8  
- **Backend:** JPA (Java Persistence API), Servlets (Jakarta EE)  
- **Frontend:** JSP + CSS  
- **Build Tool:** Maven  
- **Server:** Apache Tomcat  
- **Architecture:** MVC with DAO and Service Layer  

---

## 5. Employee Entity Fields
| Field        | Type   | Description              |
|--------------|--------|--------------------------|
| id           | int    | Primary Key (Auto Generated) |
| name         | String | Employee Name (Login)    |
| mail_id      | String | Email Address            |
| phonenumber  | String | Contact Number           |
| role         | String | Job Role / Course        |
| company      | String | Company / College Name   |
| password     | String | Login Password           |

---

## 6. Application Flow
1. **Register** – User registers using the registration form and data is saved using JPA `persist()`.
2. **Login** – User logs in with name and password (validated using JPQL query).
3. **Home Page** – Displays all employee records in a table.
4. **Edit** – Update employee details using `merge()`.
5. **Delete** – Delete employee record using `remove()`.
6. **Logout** – Ends the user session and redirects to login page.

---

## 7. Servlet Endpoints
| Servlet     | URL       | Method | Description |
|-------------|-----------|--------|-------------|
| LoginJPA    | /login    | GET/POST | User Login |
| RegisterJPA | /register | GET/POST | Register User |
| HomeJPA     | /home     | GET    | Show Dashboard |
| EditJPA     | /edit     | POST   | Update Employee |
| DeleteJPA   | /delete   | POST   | Delete Employee |

---

## 8. JPA Queries Used
### Login Query
```sql
SELECT e FROM Employee e WHERE e.name = :name AND e.password = :password
Fetch All Employees
SELECT e FROM Employee e
Operations Used

Save: em.persist(emp)

Update: em.merge(emp)

Delete: em.remove(emp)

Transactions handled using EntityTransaction

9. Database Configuration

JPA configuration file location:
src/main/resources/META-INF/persistence.xml
Persistence Unit Name:
employeePU
Important Property:
hibernate.hbm2ddl.auto = update
10. Supported Databases

You can use any JDBC-compatible database by updating pom.xml and persistence.xml.

Example Drivers:

MySQL

PostgreSQL

Oracle

H2 Database

SQL Server

No changes required in Java code while switching databases.
11. Setup and Installation
Prerequisites

Java 8 or higher

Maven 3.x

Apache Tomcat 10+

MySQL / Any Database

Eclipse or IntelliJ IDE

Steps to Run the Project

1.Clone the repository:
git clone https://github.com/your-username/JPAproject.git
2.Open the project in IDE (Eclipse/IntelliJ)

3.Add database driver dependency in pom.xml

4.Update database details in persistence.xml

5.Build the project:
mvn clean install
6.Deploy the generated WAR file to Tomcat webapps folder

7.Start Tomcat server

8.Open in browser:
http://localhost:8080/JPAproject/login
12. Features

User Registration & Login

Session Management

Full CRUD Operations

Layered Architecture (MVC)

Database Independent (JPA)

Clean UI using JSP & CSS
