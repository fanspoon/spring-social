## Setting up the Backend Server (spring-social)

+ **Create MySQL database**

  ```bash
  mysql> create database spring_social
  ```

+ **Configure database username and password**

  ```yml
  # spring-social/src/main/resources/application.yml
  spring:
      datasource:
          url: jdbc:mysql://localhost:3306/spring_social?useSSL=false
          username: <YOUR_DB_USERNAME>
          password: <YOUR_DB_PASSWORD>
  ```

+ **Add application-oauth.yml file**

  ```yml
  첨부파일 참고
  ```

+ **Run spring-social**

  ```bash
  mvn spring-boot:run
  or
  Application run
  ```