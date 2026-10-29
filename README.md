<p align="center"><img src="https://raw.githubusercontent.com/arthurlynow098/arthurlynow098/main/assets/ars-codex-banner.png" alt="Arthur Mendes Entsev — gravura em preto e branco" width="100%"></p>

<p align="center"><sub>spring-boot-product-manager</sub></p>

---

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
* **Back-end:** Java (JDK 17, conforme o pom.xml), Spring Boot, Spring Web, Maven.
* **Front-end:** HTML5, CSS3, JavaScript (Fetch API).
* **IDE Recomendada:** Visual Studio Code / IntelliJ IDEA.

## Como executar

O projeto Maven fica em `Produtos POO`.

```bash
git clone https://github.com/arthurlynow098/spring-boot-product-manager.git
cd "spring-boot-product-manager/Produtos POO"
./mvnw spring-boot:run
```

No Windows, use `mvnw.cmd spring-boot:run`. Acesse o endereço informado pelo servidor, normalmente `http://localhost:8080`. A compilação não foi executada nesta revisão.

---

<p align="center"><sub>Estudo · construção · evolução</sub><br><a href="https://github.com/arthurlynow098">Perfil</a> · <a href="https://arthurentsev.vercel.app/">Portfólio</a></p>
