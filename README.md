# Spring Boot Product Manager

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)

## Sobre o Projeto
Este é um sistema de gerenciamento de inventário desenvolvido como uma aplicação *Full-Stack* leve. O back-end consiste em uma API RESTful construída com **Java e Spring Boot**, enquanto o front-end utiliza **HTML, CSS e JavaScript** puros (Vanilla JS) com um design moderno e responsivo.

O principal objetivo técnico deste projeto é a implementação prática de **Programação Orientada a Objetos (POO)**, especificamente o conceito de **Herança**, separando a lógica de produtos normais e produtos especiais (VIP) que possuem atributos exclusivos.

## Funcionalidades
* **CRUD Completo:** Criação, leitura, atualização e exclusão de produtos no inventário.
* **Herança em POO:** * Classe base `Produto` (ID, Nome, Preço).
  * Subclasse `ProdutoEspecial` (Herda de Produto e adiciona o atributo `Beneficio`).
* **Interface Dinâmica:** Front-end estilizado em formato de *Dashboard* com feedback visual, renderizando cards dinamicamente baseados no tipo do produto.
* **Armazenamento em Memória:** Estrutura ágil baseada em listas estáticas para fácil execução e testes sem necessidade de configuração de banco de dados externo.

## Tecnologias Utilizadas
* **Back-end:** Java (JDK 17+), Spring Boot, Spring Web, Maven.
* **Front-end:** HTML5, CSS3, JavaScript (Fetch API).
* **IDE Recomendada:** Visual Studio Code / IntelliJ IDEA.

## Como executar o projeto na sua máquina

1. Clone este repositório:
   bash
   git clone [https://github.com/SEU_USUARIO/spring-boot-product-manager.git](https://github.com/SEU_USUARIO/spring-boot-product-manager.git)

2. Acesse a pasta do projeto através do terminal.

3. Inicie o servidor Spring Boot usando o Maven Wrapper:
 ./mvnw spring-boot:run
4. Abra o seu navegador e acesse a interface gráfica em:
 http://localhost:8080



Desenvolvido por Arthur Mendes Entsev.
