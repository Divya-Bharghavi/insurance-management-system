# Insurance Management System

A full-stack Insurance Management System developed using Java, Spring Boot, Spring Data JPA, Thymeleaf, and MySQL. The application allows users to register, log in, manage insurance policies, search policies, and perform policy management operations through a web-based interface.

## Features

### User Management

* User Registration
* User Login Authentication
* Duplicate Username Validation
* Logout Functionality
* Session Management

### Insurance Policy Management

* Create New Insurance Policies
* View All Policies
* Update Existing Policies
* Delete Policies
* Search Policies by Policy Type

### Design Patterns Implemented

* Singleton Pattern
* Facade Pattern
* Chain of Responsibility Pattern

### Technical Features

* MVC Architecture
* Spring Boot Framework
* Spring Data JPA
* Thymeleaf Template Engine
* MySQL Database Integration
* Form Validation
* Exception Handling
* Responsive User Interface

---

## Technologies Used

* Java 17
* Spring Boot 3
* Spring Data JPA
* Thymeleaf
* MySQL
* Maven
* HTML5
* CSS3

---

## Project Structure

```text
src
├── controller
├── domain
├── repository
├── service
├── facade
├── chainOfRes
└── templates
```

---

## Database Configuration

Create a database named:

```sql
CREATE DATABASE insurance;
```

Update the `application.properties` file:

```properties
spring.datasource.url=jdbc:mariadb://localhost:3306/insurance
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
server.port=7000
```

---

## How to Run the Project

### Clone Repository

```bash
git clone <repository-url>
```

### Navigate to Project

```bash
cd Insurance-Management-System
```

### Build Project

```bash
mvn clean install
```

### Run Application

```bash
mvn spring-boot:run
```

### Access Application

Open your browser:

```text
http://localhost:7000
```

---

## Screenshots

Add screenshots of:

* Home Page
* Login Page
* Registration Page
* Policy Management Page

---

## Learning Outcomes

This project helped me gain practical experience in:

* Spring Boot Application Development
* MVC Design Pattern
* Database Integration with JPA/Hibernate
* RESTful Web Application Concepts
* Authentication and Validation
* Object-Oriented Programming
* Design Patterns Implementation

---

## Future Enhancements

* Spring Security Integration
* Password Encryption
* Email Notifications
* Policy Premium Calculator
* Admin Dashboard
* REST API Support

---

## Author

**Divya Bhargavi**

Java Developer | Spring Boot Enthusiast

---

## License

This project is intended for educational and portfolio purposes.
