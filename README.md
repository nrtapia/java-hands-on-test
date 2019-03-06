# Java Hands On Test

## Prerequisites
- Node.js
- npm package manager
- Angular CLI
- Java 8
- Maven

## View
- Angular, Angular CLI
- Bootstrap 

## Services
This project was generated with [Spring Initializr](https://start.spring.io/) version 2.12.


## Development server

Run `$ mvn spring-boot:run` for a dev server. REST endpoint to `http://localhost:8080/employees`. 

Go to `frontend` folder run `$ ng serve --open`. 
The --open (or just -o) option automatically opens your browser to `http://localhost:4200/`

## Build

Go to `frontend` folder Run `ng build --prod` to build the view. 

Run `mvn package` to build the project. The build artifacts will be stored in the `target/` directory. 

## Config

To configure the API URL settings update `src/main/resources/application.properties` change properties `app.employee.apiUrl`

## Run

Run `java -jar target/employee-app-0.0.1-SNAPSHOT.jar`

Run with a custom port `java -jar -Dserver.port=7070 target/employee-app-0.0.1-SNAPSHOT.jar`



