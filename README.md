<p align="center">
  <img src="assets/banner.png" alt="Spring Boot Product Manager" width="100%">
</p>

<p align="center">
  Sistema Full-Stack de gerenciamento de inventário com API RESTful em Java 17 e Spring Boot, dashboard web integrado e modelagem orientada a objetos com herança.
</p>

<p align="center">
  <img alt="Java 17" src="https://img.shields.io/badge/Java-17-C52E36?style=for-the-badge&logo=openjdk&logoColor=white">
  <img alt="Spring Boot" src="https://img.shields.io/badge/Spring_Boot-REST_API-11120F?style=for-the-badge&logo=spring&logoColor=C52E36">
  <img alt="Full-Stack" src="https://img.shields.io/badge/Front--End-Vanilla_JS_Dashboard-18181B?style=for-the-badge&logo=javascript&logoColor=C52E36">
</p>

## Sobre o projeto

O **Spring Boot Product Manager** é uma aplicação *Full-Stack* leve e autocontida que une uma **API RESTful em Java 17 + Spring Boot** a um painel de controle moderno servido diretamente pelo próprio back-end em **HTML5, CSS3 e JavaScript (Fetch API)**.

O diferencial técnico do projeto está na aplicação prática de **Programação Orientada a Objetos (POO)** dentro de uma API web: a classe base Produto (id, 
ome, preco) é estendida pela subclasse ProdutoEspecial (que adiciona o atributo exclusivo eneficio), permitindo gerenciar tanto itens convencionais quanto produtos VIP no mesmo inventário polimórfico.

## Principais recursos

| Recurso | Como funciona |
|---|---|
| CRUD RESTful Completo | ProdutoController expõe rotas para listar, cadastrar, atualizar e remover produtos do inventário. |
| Herança e Polimorfismo em POO | ProdutoEspecial extends Produto herda os atributos base e acrescenta regras e benefícios exclusivos para itens VIP. |
| Dashboard Web Integrado | Interface responsiva em static/index.html e static/style.css que consome a API via etch e diferencia visualmente cards normais e VIP. |
| Execução Zero-Config | Armazenamento em memória estruturado em coleções para execução imediata com um único comando, sem exigir banco externo. |

## Tecnologias

<p>
  <img alt="Java 17" src="https://img.shields.io/badge/Java_17-C52E36?style=flat-square&logo=openjdk&logoColor=white">
  <img alt="Spring Boot" src="https://img.shields.io/badge/Spring_Boot-11120F?style=flat-square&logo=spring&logoColor=C52E36">
  <img alt="Maven" src="https://img.shields.io/badge/Maven-C52E36?style=flat-square&logo=apachemaven&logoColor=white">
  <img alt="JavaScript" src="https://img.shields.io/badge/Fetch_API_%2F_JS-11120F?style=flat-square&logo=javascript&logoColor=C52E36">
  <img alt="HTML5 & CSS3" src="https://img.shields.io/badge/HTML5_%26_CSS3-C52E36?style=flat-square&logo=html5&logoColor=white">
</p>

- **Java 17 & Spring Boot Web** para exposição dos endpoints REST e servidor Tomcat embutido;
- **HTML5, CSS3 & Vanilla JavaScript** para renderização dinâmica dos cards de produtos;
- **Maven Wrapper (mvnw / mvnw.cmd)** para compilação e execução em qualquer plataforma.

## Arquitetura

`mermaid
flowchart LR
    A[Dashboard Web · index.html] <-->|Fetch API JSON| B[ProdutoController · REST]
    B --> C[Coleção Polimórfica em Memória]
    C --> D[Produto · ID, Nome, Preço]
    D --> E[ProdutoEspecial · + Benefício VIP]
`

## Estrutura do repositório

`	ext
spring-boot-product-manager/
├── assets/
│   ├── banner.png                                  Banner principal Product Manager
│   └── project-animal.png                          Símbolo do bisão
├── Produtos POO/
│   ├── src/main/java/com/projetomusica/demo/
│   │   ├── controller/ProdutoController.java       Endpoints REST do inventário
│   │   ├── model/Produto.java                      Superclasse base de produtos
│   │   ├── model/ProdutoEspecial.java              Subclasse VIP (Herança)
│   │   └── DemoApplication.java                    Inicialização do Spring Boot
│   ├── src/main/resources/static/
│   │   ├── index.html                              Painel interativo Full-Stack
│   │   └── style.css                               Estilização do dashboard e cards
│   └── pom.xml                                     Configuração Maven e Java 17
└── README.md
`

## Executando o código

1. Clone o repositório e acesse o diretório Maven:
   `powershell
   git clone https://github.com/arthurlynow098/spring-boot-product-manager.git
   cd "spring-boot-product-manager/Produtos POO"
   `
2. Inicie o servidor Spring Boot:
   `powershell
   .\mvnw.cmd spring-boot:run
   `
   *(No Linux/macOS, utilize ./mvnw spring-boot:run).*
3. Abra http://localhost:8080 no navegador para interagir com o dashboard e cadastrar produtos normais e especiais.

## Decisões técnicas

- **Front-end servido pelo Spring Boot (
esources/static):** elimina problemas de CORS durante o desenvolvimento e entrega a aplicação inteira na porta 8080.
- **Polimorfismo na camada de modelo:** demonstra como a orientação a objetos evita duplicação de código entre categorias de produtos que compartilham a mesma identidade.

---

<p align="center"><sub>Estudo · construção · evolução</sub><br><a href="https://github.com/arthurlynow098">Perfil</a> · <a href="https://arthurentsev.vercel.app/">Portfólio</a> · <a href="https://www.linkedin.com/in/entsevarthur/">LinkedIn</a></p>
