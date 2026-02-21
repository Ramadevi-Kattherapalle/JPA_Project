## JPA-project – Employee Management System 

A Java web application that demonstrates full CRUD (Create, Read, Update, Delete) operations using Java Persistence API (JPA) with Hibernate.
The project follows a clean layered architecture including Controller, Service, DAO, and Entity layers, with JSP-based UI and PostgreSQL database integration.

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

10.Setup and Installation

11.Contributing

12.License

13.Author

## 1. Project Overview

JPA-project is a session-based Employee Management System where users can register, log in, and perform CRUD operations on employee records stored in a relational database.
The persistence layer is implemented using JPA with EntityManager, making the application database-independent (any JDBC-supported database can be configured via pom.xml and persistence.xml).

## 2. Architecture

The application follows a 4-layer architecture:

Controller Layer
Jakarta Servlets handle HTTP requests and responses and interact with the Service layer.

Service Layer
Contains business logic. It converts request data into Employee entity objects and calls DAO methods.

DAO Layer
Defines database operations using JPA EntityManager and JPQL queries.

Entity Layer
The Employee class is a JPA entity mapped to the database table.

## </> 3. Project Structure
 JPA-project/
│
├── src/main/java/
│   ├── com.example.Controller/
│   │   ├── LoginJPA.java
│   │   ├── RegisterJPA.java
│   │   ├── HomeJPA.java
│   │   ├── EditJPA.java
│   │   └── DeleteJPA.java
│   │
│   ├── com.example.dao/
│   │   └── DataBaseOperation.java
│   │
│   ├── com.example.daoimplementation/
│   │   └── DataBaseOperationImp.java
│   │
│   ├── com.example.Entity/
│   │   └── Employee.java
│   │
│   ├── com.example.Service/
│   │   └── Service.java
│   │
│   └── com.example.ServiceImplementation/
│       └── ServiceImp.java
│
├── src/main/resources/META-INF/
│   └── persistence.xml
│
├── src/main/webapp/
│   ├── login.jsp
│   ├── register.jsp
│   └── home.jsp
│
├── pom.xml
└── README.md
## 4. Technology Stack
Component	Technology
Language	Java 8+
Persistence	JPA (Hibernate)
Web	Jakarta Servlet & JSP
Build Tool	Maven
Architecture	MVC + DAO + Service Layer
Server	Apache Tomcat
Database	PostgreSQL (configurable)
5. Employee Entity Fields

The Employee entity is mapped to the Employee table in the database.

Field	Type	Description
id	int	Primary Key (Auto Generated)
name	String	Employee name (used for login)
mail_id	String	Email address
phonenumber	String	Contact number
role	String	Role / Course
company	String	Company or College
password	String	Login password
## 6. Application Flow

Register – User fills the registration form. Data is saved using JPA persist() method.

Login – User authentication using JPQL query and session management.

Home Page – Displays all employee records in a table.

Edit – Updates employee details using merge() method.

Delete – Removes employee record using remove() method.

Logout – Ends the session and redirects to login page.

## 7. Servlet Endpoints
Servlet	URL	Method	Action
LoginJPA	/login	GET/POST	Login & Authentication
RegisterJPA	/register	GET/POST	User Registration
HomeJPA	/home	GET	Display all employees
EditJPA	/edit	POST	Update employee
DeleteJPA	/delete	POST	Delete employee
## 8. JPA Queries Used

Login Query:

SELECT e FROM Employee e WHERE e.name = :name AND e.password = :password

Fetch All Records:

SELECT e FROM Employee e

Insert → em.persist(emp)

Update → em.merge(emp)

Delete → em.remove(emp)

All database operations are handled using EntityTransaction with proper commit and rollback handling.

## 9. Database Configuration

JPA configuration file location:

src/main/resources/META-INF/persistence.xml

Persistence Unit Name:

employeePU

Important properties:

hibernate.hbm2ddl.auto = update (auto table creation)

hibernate.show_sql = true (optional for debugging)

You can change database by updating:

Driver class

JDBC URL

Username & Password in persistence.xml

## 10. Setup and Installation
Prerequisites

Java 8 or higher

Maven

Apache Tomcat 9/10

PostgreSQL or any RDBMS

Eclipse / IntelliJ IDE

Steps to Run

Clone the repository

git clone https://github.com/Hemapadmavathi-sanka/JPA-project.git

Open project in Eclipse / IntelliJ

Configure database in persistence.xml

Run mvn clean install

Deploy WAR file to Tomcat server

Open in browser:

http://localhost:8080/JPA-project/login

Register and login to manage employee records

## 11. Contributing

Contributions are welcome.
You can:

Fork the repository

Create a new branch

Make changes

Submit a Pull Request

## 12. License

This project is open-source and available under the MIT License.

## 13. Author

Ramadevi Kattherapalle
GitHub: https://github.com/Ramadevi-Kattherapalle/JPA_project
