# Student Management API

A RESTful API built with Spring Boot for managing student records, supporting full CRUD operations with PostgreSQL database integration.

## Overview

This project implements a layered architecture (Controller-Service-Repository) following Spring Boot best practices, with JPA/Hibernate for object-relational mapping and validation logic to ensure data integrity.

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven
- Postman (for API testing)

## Architecture

- **Controller Layer** – handles HTTP requests and routing
- **Service Layer** – contains business logic and validation
- **Repository Layer** – manages database operations via Spring Data JPA
- **Entity Layer** – defines the data model

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/v1/student` | Retrieve all students |
| POST | `/api/v1/student` | Create a new student |
| PUT | `/api/v1/student/{studentId}` | Update an existing student |
| DELETE | `/api/v1/student/{studentId}` | Delete a student |

## Sample Request Body

```json
{
    "name": "Alex",
    "email": "alex@gmail.com",
    "dob": "2000-01-05",
    "age": 21
}
```

## Setup

1. Clone the repository
```bash
   git clone <repository-url>
```

2. Create a PostgreSQL database named `student`

3. Configure database credentials in `src/main/resources/application.properties`:
```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/student
   spring.datasource.username=your_username
   spring.datasource.password=your_password
```

4. Run the application:
```bash
   ./mvnw spring-boot:run
```

5. The API will be available at `http://localhost:8080/api/v1/student`

## Key Implementation Details

- Email uniqueness validation prevents duplicate student registrations
- Existence checks before update and delete operations, with custom exception handling for invalid requests
- Partial updates supported via optional request parameters (update only the fields provided)
- `@Transactional` ensures data consistency during update operations
- Hibernate auto-generates the database schema on startup based on entity definitions

## Future Improvements

- Authentication and authorization using Spring Security
- Pagination and sorting for large datasets
- Unit and integration testing with JUnit
- Cloud deployment
