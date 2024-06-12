# API Auth
![NPM](https://img.shields.io/npm/l/react)

# About the project
Basic API authentication that requires a database query for login.



## Login and Register Page
<div align = "center">
  <img height="500px"  src = "https://github.com/anaeliza12/login/assets/108037430/d193df0b-af75-4f51-be0b-53d8167e08e6" />
  <img height="500px"  src = "https://github.com/anaeliza12/login/assets/108037430/36916821-42aa-46cb-be0a-ee5a8291d8b2" />
</div>


## Routes

### Auth 
Send a POST request to http://localhost:8080/login/auth to log in the site

### Register
Send a POST request to http://localhost:8080/login/register and Register object in the Request Body to register an user


# Testing with Postman  <a href="https://postman.com" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/getpostman/getpostman-icon.svg" alt="postman" width="40" height="40"/> </a> <a href="https://spring.io/" target="_blank" rel="noreferrer">  

```json
{
      "id": "1001",
      "email": "maria@gmail.com",
      "name": "Maria da Silva"

}

```

<br>

# Auth architecture

![image](https://github.com/anaeliza12/login/assets/108037430/0d66b4f0-6da5-4097-8f11-516cd3778356)


# Technologies used
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- MySQL
## Front end
- HTML / CSS / JS 


```bash
# clone repository
git clone https://github.com/anaeliza12/login

```


```plaintext
/apiLogin
│
├── /frontend
│   ├── /boostrap
│   │   ├── /css
│   ├── /css
│   │   ├── style.css
│   ├── /html
│   │   ├── recoverPass.html
│   │   ├── register.html
│   └── /js
│   │   ├── login.js
│   │   ├── register.js
│   └── login.html

│
├── /backend
│   ├── /src
│   │   ├── /main
│   │       ├── /connection
│   │           ├── MySQLConnection.java
│   │       ├── /entities
│   │           ├── Login.java
│   │           ├── Register.java
│   │       ├── /functionalities
│   │           ├── LoginFunctionalities.java
│   │       ├── /repository
│   │           ├── LoginRepopsitory.java
│   │           ├── RegisterRepository.java
│   │       ├── /resource
│   │           ├── LoginResource.java
│   │           ├── RegisterResource.java
│   │       ├── /service
│   │           ├── LoginService.java
│   │           ├── RegisterService.java
│   │   ├── /test
│   │       ├── DemoApplicationTests.java
│   ├── pom.xml
│   └── bin
│   └── mvnw
│   └── application-test.properties
│
├── .gitignore
├── README.md
```



# Autor

Ana Eliza 

<a  href="https://www.linkedin.com/in/ana-eliza-perobelli/" target="_blank"><img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>
