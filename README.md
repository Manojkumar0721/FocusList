# 📝 FocusList - A Simple Todo List API

FocusList is a simple and clean RESTful Todo List API built using Spring Boot, Spring Data JPA, and H2 Database. It allows users to manage tasks by performing CRUD operations.

---

## 🚀 Features

- Add new tasks ✅
- View all tasks 📋
- Update task details ✏️
- Delete tasks ❌
- In-memory H2 database for easy setup 💾

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database
- Lombok

---

## 📁 Project Structure

<pre>  src/ 
       └── main/ 
          └── java/ 
              └── com/ 
                  └── example/ 
                      └── todo/ 
                          ├── controller/ # Handles HTTP requests (REST API) 
                          │   └── TodoController.java 
                          ├── entity/ # Contains the Todo entity class 
                          │   └── Todo.java 
                          ├── repository/ # Spring Data JPA repository 
                          │   └── TodoRepository.java 
                          ├── service/ # Business logic layer 
                          │    ├── TodoService.java 
                          │    └── TodoServiceImpl.java 
                          └── TodoApplication.java # Main Spring Boot application class
</pre>

---

## 📬 API Endpoints

| Method | Endpoint             | Description        |
|--------|----------------------|--------------------|
| GET    | `/api/todos`         | Get all todos      |
| GET    | `/api/todos/{id}`    | Get todo by ID     |
| POST   | `/api/todos`         | Create new todo    |
| PUT    | `/api/todos/{id}`    | Update todo by ID  |
| DELETE | `/api/todos/{id}`    | Delete todo by ID  |

---
### 🧾 Sample JSON for POST/PUT

```json
{
  "title": "Finish Spring Boot project",
  "completed": false
}
