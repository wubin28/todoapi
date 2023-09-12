# Udemy - Build A TodoList with Java, Spring Boot and Vue

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

### Blank Project Setup - start.spring.io

- lombok
- spring web
- spring data jpa
- flyway migration
- postgresql driver

### API tool Setup

- Install Insomnia (https://insomnia.rest/)

## Front-end Development Setup

- Install node.js and npm using nvm

https://github.com/nvm-sh/nvm

```shell
nvm -v
nvm ls-remote
nvm install --lts
nvm list
```

- Install vue cli using npm

https://cli.vuejs.org/guide/installation.html

```shell
npm install -g @vue/cli
vue --version
```

## How to run the back-end application

- Start postgres database and pgadmin using docker compose

```shell
docker compose up -d
```

- Start the web application

```shell
./gradlew bootRun
```

