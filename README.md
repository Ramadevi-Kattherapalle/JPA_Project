# JPA Employee Management System

This project is a Java-based web application for managing employee records using **JPA (Java Persistence API)** and **MySQL**. It follows the **MVC (Model-View-Controller)** architecture and is deployed on an **Apache Tomcat** server.

---

## 1. Project Overview
The application allows users to perform CRUD operations (Create, Read, Update, Delete) on employee data. It uses `persistence.xml` for database configuration and JPA for object-relational mapping.

## 2. Features
* **Add Employee**: Register new employees into the system.
* **View List**: Display all employee details in a structured table.
* **Edit Details**: Update existing employee information.
* **Delete Record**: Remove employee entries from the database.

---

## 3. Technology Stack

| Component | Technology |
| :--- | :--- |
| **Language** | Java 8 (JavaSE-1.8) |
| **Persistence** | JPA (Java Persistence API) |
| **Servlet API** | Jakarta Servlet (Jakarta EE) |
| **View Layer** | JSP with embedded CSS |
| **Build Tool** | Maven |
| **Architecture** | MVC with DAO and Service Layers |
| **Server** | Apache Tomcat (or any Java EE server) |

---

## 4. Project Structure

Using `EntityManager` and JPQL queries. The `Employee` class is a JPA-annotated entity that maps directly to the Employee table in the database.

```text
JPAproject/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.example/
│   │   │       ├── Controller/
│   │   │       │   ├── LoginJPA.java (URL: /login)
│   │   │       │   ├── RegisterJPA.java (URL: /register)
│   │   │       │   ├── HomeJPA.java (URL: /home)
│   │   │       │   ├── EditJPA.java (URL: /edit)
│   │   │       │   └── DeleteJPA.java (URL: /delete)
│   │   │       ├── dao/
│   │   │       │   ├── DatabaseOperation.java (DAO Interface)
│   │   │       │   └── DatabaseOperationImpl.java (JPA Implementation)
│   │   │       ├── Service/
│   │   │       │   ├── Service.java (Service Interface)
│   │   │       │   └── ServiceImpl.java (Business Logic)
│   │   │       └── Entity/
│   │   │           └── Employee.java (JPA Entity)
│   │   ├── resources/
│   │   │   └── META-INF/
│   │   │       └── persistence.xml (JPA Configuration)
│   │   └── webapp/
│   │       ├── login.jsp
│   │       ├── register.jsp
│   │       ├── home.jsp
│   │       └── edit.jsp
└── pom.xml
