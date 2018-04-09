[![CircleCI](https://circleci.com/gh/ertyui/moip-challenge/tree/master.svg?style=svg)](https://circleci.com/gh/ertyui/moip-challenge/tree/master)

# spring-boot-medium

Repository for the article example: [Blindando sua API Spring Boot com o padrão DTO](https://medium.com/p/44f97020d1a0/)

## Requirements

For building and running the application you need:

- [Maven](http://maven.apache.org/download.cgi)
- [MySQL](http://maven.apache.org/download.cgi)
- [Lombok](https://projectlombok.org/) - Download the Lombok plugin for your IDE. This is required to add Lombok dependency support.

## Running

First, clone the project and build locally:

```shell
git clone https://github.com/ertyui/spring-boot-dto-medium.git
```

Make sure you have a MySQL database called "dto".

From project root directory run:

```shell
mvn spring-boot:run
```