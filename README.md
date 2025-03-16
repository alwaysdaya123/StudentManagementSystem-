# Student Management System - Spring Boot REST API

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7.0-green) ![MySQL](https://img.shields.io/badge/MySQL-8.0-blue) ![Postman](https://img.shields.io/badge/Postman-API%20Testing-orange)

A **Student Management System** built using **Spring Boot**, **Spring Data JPA**, and **MySQL** that provides RESTful CRUD operations to manage student data. The API allows users to create, read, update, and delete student records, and it can be tested using **Postman**.

---

## 🚀 Features

- 🏗 **Spring Boot & REST API** - Built using Spring Boot framework.
- 📌 **CRUD Operations** - Supports Create, Read, Update, and Delete operations.
- 📊 **MySQL Database** - Uses MySQL for persistent data storage.
- 🔧 **Spring Data JPA** - Simplifies database interactions.
- 🛠 **HikariCP Connection Pooling** - Efficient database connectivity.
- 📝 **Postman API Testing** - Easily test API endpoints.

---

## 🛠 Tech Stack

- **Backend:** Java, Spring Boot, Spring Data JPA
- **Database:** MySQL
- **Tools:** Postman, HikariCP, Lombok

---

## 📌 API Endpoints

### ➤ **Student API**

| Method | Endpoint | Description |
|--------|----------|--------------|
| **POST** | `/students` | Add a new student |
| **GET** | `/students` | Get all students |
| **GET** | `/students/{id}` | Get student by ID |
| **PUT** | `/students/{id}` | Update student details |
| **DELETE** | `/students/{id}` | Delete a student by ID |

---

## 🔧 Setup & Installation

### 📌 Prerequisites
- Install **Java 17+**
- Install **MySQL 8.0+**
- Install **Postman** (optional for API testing)

### 📌 Steps to Run the Project

1️⃣ **Clone the Repository**
```sh
git clone https://github.com/yourusername/StudentManagementSystem.git
cd StudentManagementSystem
```

2️⃣ **Configure MySQL Database**
- Create a database named `studentdb` in MySQL.
- Update the `application.properties` file:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

3️⃣ **Build & Run the Application**
```sh
mvn spring-boot:run
```

4️⃣ **Access API in Postman**
- Base URL: `http://localhost:9090/students`

---

## 📜 Example JSON Request

### ➤ Create a New Student (POST `/students`)
```json
{
  "student_name": "John Doe",
  "student_branch": "Computer Science",
  "student_percentage": 85.6
}
```

### ➤ Response (201 Created)
```json
{
  "roll_no": 1,
  "student_name": "John Doe",
  "student_branch": "Computer Science",
  "student_percentage": 85.6
}
```

---

## 📜 License

This project is licensed under the **MIT License**.

---

## 🤝 Contributing

1. Fork the repository
2. Create a new branch (`feature-branch`)
3. Commit changes (`git commit -m 'Add a new feature'`)
4. Push to the branch (`git push origin feature-branch`)
5. Submit a Pull Request

---

## ⭐ Show Your Support

If you liked this project, don't forget to ⭐ star the repository!

---

🚀 **Developed by [Your Name](https://github.com/alwaysdaya123)** 🚀

