# Trello - Project Management Application

## Overview
This is a Trello-like project management application built using **Spring Boot**. It provides functionalities for creating boards, managing lists, inviting users, handling join requests, managing tickets, and commenting on tickets.

## Features
- **User Management**: Users can register, log in, and manage their profiles.
- **Board Management**: Create, update, and delete boards with different visibility levels.
- **Board Membership**: Invite users to boards and manage roles.
- **Lists & Tickets**: Organize tasks into lists and manage ticket statuses.
- **Comments**: Add and update comments on tickets.
- **Access Control**: Role-based access control for managing boards and tickets.

## Technologies Used
- **Spring Boot** - Backend framework
- **Spring Data JPA** - ORM and database handling
- **Hibernate** - ORM framework
- **MySQL/PostgreSQL** - Database
- **Lombok** - Reduces boilerplate code
- **Java 11+** - Programming language

## Getting Started
### Prerequisites
- Java 11+
- Maven
- MySQL/PostgreSQL

### Installation
1. Clone the repository:
   ```sh
   https://github.com/praveenrampk/trello-board.git
   cd trello-board
   ```
2. Configure database in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/trello_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```
3. Run the application:
   ```sh
   mvn spring-boot:run
   ```
