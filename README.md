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
      "name": "Maria Brown",
      "password": "123maria

}




/meu-projeto
│
├── /frontend
│   ├── /src
│   │   ├── /components
│   │   ├── /pages
│   │   ├── App.js
│   │   └── index.js
│   ├── /public
│   ├── package.json
│   └── ... (outros arquivos e pastas do front-end)
│
├── /backend
│   ├── /src
│   │   ├── /controllers
│   │   ├── /models
│   │   ├── /routes
│   │   ├── app.js
│   │   └── server.js
│   ├── package.json
│   └── ... (outros arquivos e pastas do back-end)
│
├── .gitignore
├── README.md
└── ... (outros arquivos na raiz do projeto)
