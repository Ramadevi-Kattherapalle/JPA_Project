# JPA Employee Management System

A full-stack Java web application that performs CRUD (Create, Read, Update, Delete) operations using Java Persistence API (JPA) with a layered architecture.
This project demonstrates real-time employee data management with JSP-based frontend and JPA-based backend connected to a relational database.

---

## 📌 Project Overview

The **JPA Employee Management System** is a web-based application designed to manage employee records efficiently.
It follows a clean MVC-style layered structure including Controller, Service, DAO, and Entity layers.

Users can:

* Register new employees
* Login to the system
* View employee data
* Edit employee details
* Delete employee records

---

## 🏗️ Project Architecture

This project follows a layered architecture:

Controller → Service → DAO → Entity → Database

* **Controller Layer** – Handles HTTP requests (Servlets)
* **Service Layer** – Contains business logic
* **DAO Layer** – Handles database operations using JPA
* **Entity Layer** – Represents database tables
* **JSP Pages** – Frontend UI

---

## 📂 Project Structure

```
JPAproject/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       ├── Controller/
│   │   │       │   ├── LoginJPA.java
│   │   │       │   ├── RegisterJPA.java
│   │   │       │   ├── HomeJPA.java
│   │   │       │   ├── EditJPA.java
│   │   │       │   └── DeleteJPA.java
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
│   │       ├── home.jsp
│   │       └── edit.jsp
└── pom.xml
```

---

## 🚀 Features

* Employee Registration
* Secure Login System
* View Employee Details (Home Page)
* Update Employee Information
* Delete Employee Records
* Layered Architecture (Clean Code Structure)
* JPA Configuration using persistence.xml
* Maven Dependency Management

---

## 🛠️ Technology Stack

* Java (JDK 8+)
* JPA (Java Persistence API)
* Hibernate (JPA Implementation)
* JSP & Servlets
* HTML & CSS
* Maven (Build Tool)
* MySQL / PostgreSQL (Database)
* Apache Tomcat (Server)

---

## ⚙️ Prerequisites

Make sure you have installed:

* JDK 8 or above
* Maven
* Apache Tomcat Server
* MySQL or PostgreSQL Database
* IDE (Eclipse / STS / IntelliJ)

---

## 🔧 How to Run the Project (Step-by-Step)

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/JPA-project.git
```

### 2️⃣ Import into IDE

* Open STS / Eclipse
* Click: File → Import → Existing Maven Project
* Select the JPAproject folder

### 3️⃣ Configure Database

* Open `persistence.xml`
* Update:

  * Database URL
  * Username
  * Password
  * Database Dialect

### 4️⃣ Add Server

* Configure Apache Tomcat Server in IDE
* Deploy the project on Tomcat

### 5️⃣ Run the Application

Start the server and open browser:

```
http://localhost:8080/JPAproject/login
```

---

## 🌐 Application URLs

| Module          | URL       |
| --------------- | --------- |
| Login Page      | /login    |
| Register Page   | /register |
| Home Page       | /home     |
| Edit Employee   | /edit     |
| Delete Employee | /delete   |

---

## 🧩 Key Components Explanation

* **Employee.java** → JPA Entity mapped to database table
* **DatabaseOperationImpl.java** → Handles CRUD using EntityManager
* **ServiceImpl.java** → Contains business logic
* **Controllers** → Handles user requests and navigation
* **persistence.xml** → JPA configuration file

---

## 📸 Frontend Pages

* login.jsp – User login interface
* register.jsp – Employee registration form
* home.jsp – Employee dashboard
* edit.jsp – Update employee details

---

## 👩‍💻 Author

Developed by: Ramadevi Kattherapalle
Project Type: Academic / Learning Project (JPA CRUD Web Application)

---

## 📜 License

This project is for educational and learning purposes.
