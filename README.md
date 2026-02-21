# JPA CRUD Web Application (Maven Project)

##  Project Description

This project is a Java Web Application developed using JPA (Java Persistence API), Servlets, JSP, and Maven.
It performs basic CRUD operations such as Register, Login, Edit, Delete, and Home management using layered architecture (Controller, Service, DAO, Entity).

The application follows MVC architecture and demonstrates how JPA integrates with a web application for database operations.

---

##  Project Structure

```
JPA_Project
│── src
│   ├── main
│   │   ├── java
│   │   │   ├── com.example.Controller
│   │   │   │   ├── RegisterJPA.java
│   │   │   │   ├── LoginJPA.java
│   │   │   │   ├── EditJPA.java
│   │   │   │   ├── DeleteJPA.java
│   │   │   │   └── HomeJPA.java
│   │   │   ├── com.example.dao
│   │   │   ├── com.example.daoImpl
│   │   │   ├── com.example.entity
│   │   │   ├── com.example.service
│   │   │   └── com.example.serviceImpl
│   │   │
│   │   ├── resources
│   │   └── webapp
│   │       ├── META-INF
│   │       ├── WEB-INF
│   │       ├── home.jsp
│   │       ├── login.jsp
│   │       └── register.jsp
│
│── pom.xml
```

---

##  Features

* User Registration using JPA
* User Login Authentication
* Edit User Details
* Delete User Records
* Home Page Navigation
* MVC Layered Architecture
* Maven Dependency Management
* JSP Frontend + Servlet Backend
* Database connectivity using JPA (Hibernate)

---

##  Technologies Used

* Java
* JPA (Hibernate)
* Servlets
* JSP
* Maven
* MySQL / PostgreSQL (Any RDBMS)
* Apache Tomcat Server
* Eclipse / STS IDE

---

##  Modules Explanation

1️. Controller Layer

Contains Servlet classes:

* RegisterJPA.java – Handles user registration
* LoginJPA.java – Handles login logic
* EditJPA.java – Updates user data
* DeleteJPA.java – Deletes user record
* HomeJPA.java – Redirects to home page

 2️. Service Layer

* Business logic implementation
* Connects Controller and DAO

 3.DAO Layer

* Database operations using JPA
* CRUD operations implementation

 4️. Entity Layer

* JPA Entity classes
* Database table mapping using annotations

 5️. View Layer (JSP)

* login.jsp
* register.jsp
* home.jsp
  Used for UI and user interaction.

---

🗄️ Database Configuration

Update your persistence.xml or configuration file with:

* Database URL
* Username
* Password
* Dialect (MySQL/PostgreSQL)

Example:

```
jdbc:mysql://localhost:3306/your_database
```

---

##  How to Run the Project

1. Clone the repository
2. Import project into Eclipse/STS as Maven Project
3. Configure Apache Tomcat Server
4. Update database credentials
5. Run the project on server
6. Open in browser:

```
http://localhost:8080/JPA_Project/
```

---

##  Learning Outcomes

* Understanding JPA with Web Applications
* MVC Architecture implementation
* Layered project structure
* CRUD operations using Hibernate JPA
* Maven project setup and deployment

---

##  Author

Rama Devi Kattherapalle
GitHub: https://github.com/Ramadevi-Kattherapalle/JPA_Project.git
