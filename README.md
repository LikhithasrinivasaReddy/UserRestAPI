# UserRestAPI
Develop a simple simple Rest API using SpringBoot and MySQL.This project is a RESTful API built using Spring Boot and MySQL for managing user data. The application follows the MVC (Model-View-Controller) architecture to ensure separation of concerns and maintainability. The key components include:
Entity Layer: Defines the UserEntity model with annotations for persistence.
Repository Layer: Uses Spring Data JPA to interact with the MySQL database.
Service Layer: Handles business logic and validation.
Controller Layer: Exposes RESTful endpoints for CRUD operations.
Exception Handling: Includes error handling for invalid user requests.

#Key considerations in the design:
Scalability: Follows a layered architecture, making it easier to extend.
Security: Uses proper request validation and exception handling.
Usability: Simple RESTful API with well-defined endpoints.

#Setup InstructionsPrerequisitesJava 17 or later
Maven
MySQL Database
Postman (optional for testing API)
