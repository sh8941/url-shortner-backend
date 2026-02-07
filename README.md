# 🚀 URL-Shortner – URL Shortener Backend

**URL-Shortner** is a scalable, secure, and production-grade URL shortener backend built with **Java & Spring Boot**.
It supports **JWT authentication**, **multi-user isolation**, **role-based access control (RBAC)**, and is designed with **clean architecture** and **scalability** in mind.

This project is built as a **real-world backend system**, not just a demo project — suitable for portfolios, resumes, and enterprise-style development.

---

## ✨ Features

* 🔐 JWT Authentication & Authorization
* 👤 User Registration & Login
* 🧾 Role-Based Access Control (RBAC)
* 🔗 URL Shortening Service
* 📊 Click Tracking & Analytics Ready
* 🧠 Secure Multi-User Data Isolation
* 🏗️ Clean Architecture (Controller → Service → Repository)
* 📦 RESTful API Design
* 🛡️ Spring Security Integration
* 🧩 Scalable Structure (Microservices-ready)

---

## 🏛️ System Architecture

```
Client (Postman / Frontend)
        |
        v
API Controller Layer (REST APIs)
        |
        v
Service Layer (Business Logic)
        |
        v
Repository Layer (JPA / Hibernate)
        |
        v
Database (MySQL / PostgreSQL)

Security Flow:
Client → JWT Filter → Spring Security → Controller
```

---

## 🛠️ Tech Stack

* **Language:** Java
* **Framework:** Spring Boot
* **Security:** Spring Security + JWT
* **Authentication:** Username/Password + Token-based Auth
* **Database:** MySQL / PostgreSQL
* **ORM:** Hibernate / JPA
* **Build Tool:** Maven
* **API Style:** REST
* **Testing Tool:** Postman

---

## 📁 Project Structure

```
url-shortner
│
├── config/        # Security, JWT, filters, configs
├── controller/    # REST controllers
├── service/       # Business logic
├── repository/    # JPA repositories
├── entity/        # Database entities
├── dto/           # Data Transfer Objects
├── exception/     # Global exception handling
└── util/          # Utility classes
```

---

## 🔐 Security Design

* JWT-based stateless authentication
* Password hashing with BCrypt
* Role-based authorization
* Token validation via JWT filter
* Secure endpoint access using Spring Security

---

## 🔗 Core APIs (Sample)

### Auth

* `POST /api/auth/register` → Register user
* `POST /api/auth/login` → Login user (JWT issued)

### URL Management

* `POST /api/urls` → Create short URL
* `GET /{shortCode}` → Redirect to original URL
* `GET /api/urls/my` → Get user's URLs
* `DELETE /api/urls/{id}` → Delete URL

---

## 🧪 Testing

* API testing using **Postman**
* JWT testing via Authorization headers
* Manual security testing using protected endpoints

---

## 🚀 Future Enhancements

* 📈 Advanced analytics dashboard
* 🌍 Custom domain support
* 🧠 AI-based malicious URL detection
* 🧩 Microservices architecture
* 📡 Redis caching for fast redirects
* ☁️ Docker & Kubernetes deployment

---

## 📌 Resume Description

> **URL-Shortner Backend** – A scalable URL shortening backend platform built with Java, Spring Boot, JWT authentication, RBAC, REST APIs, and secure multi-user data isolation.

---

## 🤝 Contribution

Contributions are welcome! Fork the repository, create a feature branch, and submit a pull request.

---

## 📄 License

This project is licensed under the MIT License.
