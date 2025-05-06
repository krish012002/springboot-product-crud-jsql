# Spring Boot Product CRUD using JSQL (JDBC)

This is a simple Spring Boot project that performs CRUD operations on a Product using the MVC pattern and JDBC (JSQL). The APIs are tested using Postman.

## Features

- Add a new product
- Get all products
- Get product by ID
- Update product
- Delete product

## Technologies Used

- Java
- Spring Boot
- Spring MVC
- JDBC (JSQL)
- MySQL
- Postman
- Maven
  
## Project Structure

- model - Product class
- dao or repository - JSQL-based database access logic
- service - Business logic
- controller - REST APIs

## How to Run

1. Clone the repository:
2. Import the project into your IDE (IntelliJ, Eclipse, etc.)
3. Configure your database in application.properties  
4. Run the application: Postman Collection, Import it into Postman to test all APIs.

## Example API Endpoints

- GET /product
- GET /product/{id}
- POST /product
- PUT /product/{id}
- DELETE /product/{id}
- 
## License

This project is for learning/demo purposes only.
