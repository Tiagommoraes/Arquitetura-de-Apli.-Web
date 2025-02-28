## Projeto Spring Boot - Hello World

Este projeto é uma aplicação simples criada com Spring Boot que expõe dois endpoints REST para responder a requisições HTTP.

Estrutura do Projeto

O projeto contém um controlador chamado HelloController dentro do pacote com.projetospringboot.helloword. Este controlador tem dois endpoints:

GET /test - Retorna a mensagem "Hello, World!".

GET /users?name={seu_nome} - Retorna uma mensagem de boas-vindas personalizada com o nome passado como parâmetro na URL.

## Como Executar a Aplicação

Pré-requisitos

Java 17 ou superior instalado

Maven instalado (caso não esteja usando um wrapper do Maven)

Visual Studio Code ou outra IDE compatível com Java

Passos para Execução

Clone o repositório do GitHub:

git clone https://github.com/seu-usuario/seu-repositorio.git

Navegue até o diretório do projeto:

cd seu-repositorio

Compile e execute o projeto com Maven:

mvn spring-boot:run

Ou, se estiver usando um wrapper do Maven:

./mvnw spring-boot:run

Acesse os endpoints no navegador ou usando um cliente HTTP:

http://localhost:8080/test → Devolve "Hello, World!"

http://localhost:8080/users?name=SeuNome → Retorna "SeuNome Seja bem-vindo!"
