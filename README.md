🚀 Full-Stack User Management System (Spring Boot + JS)
This project is a Full-Stack web application that provides a complete solution for user management. It features a robust REST API built with Spring Boot and a dynamic, responsive Frontend integrated via JavaScript.

🏗️ Backend Architecture (Usuariocontroller)
The core logic is handled by a Spring Boot controller that implements the following RESTful services:

Registration: POST /api/usuarios/registrar - Persists new user data using Spring Data JPA.

Authentication: POST /api/usuarios/login - Implements business logic to validate credentials, returning custom HTTP status codes (401 Unauthorized for wrong passwords or 404 Not Found for missing emails).

User Management: * GET /api/usuarios/listar - Retrieves the full list of users.

DELETE /api/usuarios/{id} - Removes a specific user from the MySQL database.

CORS Configuration: Enabled via @CrossOrigin(origins = "*") to allow seamless communication with the frontend template.

🛠 Tech Stack
Backend: Java 17+, Spring Boot, Spring Data JPA, Hibernate.

Database: MySQL (managed via phpMyAdmin).

Frontend: HTML5, CSS3, JavaScript (Vanilla ES6), UI Template.

API Testing: Postman.
