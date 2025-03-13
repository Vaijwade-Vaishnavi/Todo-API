# To-Do API

A simple **Spring Boot REST API** for managing to-do tasks with features like **CRUD operations, task priority, due dates, and status tracking**. The API uses **Spring Boot, Hibernate, MySQL, and Spring Security (JWT authentication)**.

## Features
✅ **User Authentication** – Secure login/signup with JWT.  
✅ **Task Management** – Create, update, delete, and retrieve tasks.  
✅ **Task Prioritization** – High, Medium, Low priority.  
✅ **Due Date & Status** – Assign deadlines and track completion.  
✅ **Pagination & Sorting** – Efficient data retrieval.  
✅ **API Documentation** – Swagger/OpenAPI included.  

## Tech Stack
- **Spring Boot** (Spring MVC, Spring Security, Hibernate)
- **MySQL** (for data storage)
- **JWT** (for authentication)
- **Swagger** (for API documentation)
- **Maven** (build tool)

## Setup & Installation
1. **Clone the repository:**
   ```sh
   git clone https://github.com/yourusername/todo-api.git
   cd todo-api
   ```
2. **Configure the database** (update `application.properties` with your MySQL credentials):
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```
3. **Run the application:**
   ```sh
   mvn spring-boot:run
   ```
4. **Access the API:**
   - Swagger UI: [http://localhost:8080/swagger-ui/](http://localhost:8080/swagger-ui/)

## API Endpoints
| Method | Endpoint         | Description              |
|--------|----------------|--------------------------|
| POST   | `/auth/signup` | Register a new user      |
| POST   | `/auth/login`  | User login (returns JWT) |
| GET    | `/tasks`       | Get all tasks            |
| POST   | `/tasks`       | Create a new task        |
| PUT    | `/tasks/{id}`  | Update a task            |
| DELETE | `/tasks/{id}`  | Delete a task            |

## License
This project is open-source and available under the **MIT License**.

---
### 🚀 Happy Coding!
