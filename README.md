API de Gerenciamento de Clientes

Aplicação Spring Boot para cadastro e gerenciamento de clientes.

Tecnologias

* Java 17
* Spring Boot
* Spring Data JPA
* H2 Database

Estrutura do projeto

* models → entidades JPA
* repositories → acesso ao banco de dados
* services → regras de negócio
* controllers → endpoints REST

Endpoints

* POST /clientes
* GET /clientes
* GET /clientes/{id}
* PUT /clientes/{id}
* DELETE /clientes/{id}

Como testar

Os endpoints podem ser testados utilizando:

Postman
ou
Swagger: http://localhost:8080/swagger-ui/index.html
