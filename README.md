# 💳 Microserviço de Pagamento — MarcosFood

Este microserviço é responsável por gerenciar os pagamentos realizados na plataforma **MarcosFood**, oferecendo
endpoints REST para criação, consulta, atualização e exclusão de transações.

---

## 🚀 Tecnologias Utilizadas

- **Quarkus 3.25.4**
- **Java 21**
- **Jakarta REST (JAX-RS)**
- **Hibernate ORM Panache**
- **PostgreSQL**
- **ModelMapper**
- **Lombok**
- **MicroProfile OpenAPI**
- **Docker (via quarkus-container-image-docker)**

---

## 📦 Endpoints REST

| Método | Endpoint           | Descrição                       |
|--------|--------------------|---------------------------------|
| GET    | `/pagamentos`      | Lista todos os pagamentos       |
| GET    | `/pagamentos/{id}` | Busca pagamento por ID          |
| POST   | `/pagamentos`      | Cria um novo pagamento          |
| PUT    | `/pagamentos/{id}` | Atualiza um pagamento existente |
| DELETE | `/pagamentos/{id}` | Remove um pagamento por ID      |

---

## 📁 Estrutura do Projeto

src/ ├── main/ │ ├── java/ │ │ └── pagamentos.v1 │ │ ├── rest/ → Recursos REST │ │ ├── dto/ → Objetos de transferência │
│ ├── entity/ → Entidades JPA │ │ ├── mapper/ → Conversão entre DTO e entidade │ │ └── service/ → Regras de negócio │
└── resources/ │ └── application.properties


---

## ⚙️ Como Executar Localmente

1. Clone o repositório:
   ```bash
   git clone https://github.com/MarcosDev1982/microservico-pagamento.git
   cd microservico-pagamento

Configure o banco de dados no application.properties

quarkus.datasource.db-kind=postgresql
quarkus.datasource.jdbc.url=jdbc:postgresql://localhost:5432/pagamentos
quarkus.datasource.username=seu_usuario
quarkus.datasource.password=sua_senha

3. Execute o projeto com Maven:

   ./mvnw quarkus:dev

📡 Documentação da AP

http://localhost:8080/q/openapi

E a interface Swagger em:

http://localhost:8080/q/swagger-ui

🛡️ Saúde da Aplicaçã

http://localhost:8080/q/health












