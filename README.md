# todoapi - Udemy - Build A TodoList with Java, Spring Boot and Vue

https://www.udemy.com/course/build-a-todolist-with-java-spring-boot-and-vue/learn/lecture/28872522#overview

## Back-end Development Setup

### Proxy Setup

- As to Ubuntu, set ignore hosts in Network Proxy Settings

```value
0.0.0.0, localhost, 127.0.0.0/8, ::1
```

### Docker Setup

- Install Docker for Ubuntu (not Docker Desktop)
- Install Docker desktop for Mac
- Install Docker desktop with WSL2 for Windows

### JDK Setup

- Install JDK 17 using SDKMAN(for Mac/Linux) or Chocolatey/Jabba(for Windows)
- Install Gradle 8.3 using SDKMAN(for Mac/Linux) or Chocolatey(for Windows)

### IDE Setup

- Install Intellij IDEA Ultimate Edition
- Install JPA Buddy plugin in Intellij IDEA

### Blank Back-end Project Setup - start.spring.io

- lombok
- spring web
- spring data jpa
- flyway migration
- postgresql driver

## How to run the back-end application

- Start postgres database and pgadmin using docker compose

```shell
docker compose up -d
```

- Start the web application

```shell
./gradlew bootRun
```

- Check the API using Insomnia

open Insomnia -> Java Todo collection -> GetAll

- Check the database using pgadmin

open portainer -> http://localhost:9443 -> Containers -> todoapi-pgadmin-1 -> click the link "5050:80" -> 
username/password: wubin28@gmail.com/wubin28@gmail.com -> Servers 

  - Register a server

  right-click Servers -> Register -> Server... -> General -> Name: mypostgres -> Connection -> 
  Host name/address: postgres -> 
  Port: 5432 -> Maintenance database: postgres -> Username: postgres -> Password: postgres -> Save password? Yes

  - Connect to the server
  
  mypostgres -> databases -> javaTodo -> 
  schemas -> public -> tables -> todo -> right-click -> "View/Edit Data" -> All Rows

## How to check api documentation

http://localhost:8081/swagger-ui.html

### How to check API functions in a tool

- Install Insomnia (https://insomnia.rest/)
- Run database and db admin: ```docker compose up -d```
- Run the application: ```./gradlew bootRun```
- Open Insomnia -> add a collection -> add POST request -> add GET request -> add PUT request -> add DELETE request

