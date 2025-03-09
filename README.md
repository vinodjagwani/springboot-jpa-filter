# Spring Boot JPA Filter Demo

This is a simple Spring Boot project demonstrating how to use Hibernate filters with `@FilterDef` and `@Filter` in JPA.

## Setup

1. Clone the repository:
   ```sh
   git clone https://github.com/example/springboot-jpa-filter.git
   ```
2. Navigate to the project directory:
   ```sh
   cd springboot-jpa-filter
   ```
3. Build and run the project:
   ```sh
   mvn spring-boot:run
   ```

## API Usage

### Get Users by Status
```sh
GET http://localhost:8080/users/status/Active
```

## Database Console
The project uses an in-memory H2 database. Access it at:
```sh
http://localhost:8080/h2-console
```
JDBC URL: `jdbc:h2:mem:testdb`
