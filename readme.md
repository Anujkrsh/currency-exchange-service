# Currency Exchange Microservice

## Overview

The Currency Exchange Microservice is a Java-based microservice developed with Spring Boot and Spring Cloud. It handles currency exchange operations and integrates with other microservices in a distributed system. This microservice is responsible for providing exchange rates between different currencies.

## Features

- **Currency Exchange:** Get exchange rates between different currencies.
- **Microservice Architecture:** Designed as an independent microservice, allowing for modular development, deployment, and scalability.
- **Spring Cloud Integration:** Utilizes Spring Cloud components for service registration and discovery (Eureka), declarative REST clients (Feign), and centralized configuration (Config Server).

## Prerequisites

Before running the application, ensure you have the following installed:

- Java Development Kit (JDK)
- Integrated Development Environment (IDE) such as IntelliJ or Eclipse
- [Spring Boot](https://spring.io/projects/spring-boot)

## Setup

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/currency-exchange-service.git



- Open the project in your preferred IDE.

- Review and update the application properties:

- src/main/resources/application.properties or src/main/resources/application.yml
- Ensure Maven dependencies and plugins are configured:

- Check the Maven POM file.


# Configurations

## Application Properties

- spring.application.name: Name of the microservice. (Default: currency-exchange)
- server.port: Port on which the microservice will run. (Default: 8000)
- spring.config.import: Configuration import strategy for connecting to a Config Server. (Optional: http://localhost:8888)
- eureka.client.service-url.defaultZone: Eureka server URL for service registration and discovery. (Default: http://localhost:8761/eureka)

## Endpoints

- Currency Exchange Endpoint: /currency-exchange/from/{from}/to/{to}