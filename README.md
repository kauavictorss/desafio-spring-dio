# 🚀 Desafio Spring Boot - DIO

Projeto desenvolvido como desafio prático da plataforma de cursos **[DIO (Digital Innovation One)](https://www.dio.me/)**, 
aplicando meus conhecimentos básicos em **Spring Boot** para construção de uma API REST de cadastro de clientes com
endereço.

---

## 📋 Sobre o Projeto

API RESTful para gerenciamento de clientes, permitindo cadastrar, listar, atualizar e deletar clientes junto com seus
endereços. O projeto utiliza banco de dados H2 em memória para facilitar a execução local sem necessidade de
configuração de banco externo.

---

## 🛠️ Tecnologias e Bibliotecas

| Tecnologia            | Versão | Descrição                                               |
|-----------------------|--------|---------------------------------------------------------|
| **Java**              | 21     | Linguagem principal                                     |
| **Spring Boot**       | 3.5.11 | Framework base da aplicação                             |
| **Spring Data JPA**   | —      | Persistência e mapeamento ORM                           |
| **Spring Web**        | —      | Criação dos endpoints REST                              |
| **H2 Database**       | —      | Banco de dados em memória para desenvolvimento          |
| **Lombok**            | —      | Redução de boilerplate (getters, setters, construtores) |
| **SpringDoc OpenAPI** | 2.8.5  | Geração automática do Swagger UI                        |
| **Spring DevTools**   | —      | Reload automático em desenvolvimento                    |

---

## 📁 Estrutura do Projeto

```
src/main/java/dio/spring/api/
├── controller/
│   └── ClienteController.java   # Endpoints REST
├── dto/
│   ├── ClienteDto.java          # DTO de entrada do cliente
│   └── EnderecoDto.java         # DTO de entrada do endereço
├── model/
│   ├── Cliente.java             # Entidade cliente
│   └── Endereco.java            # Entidade endereço
├── repository/
│   ├── ClienteRepository.java   # Repositório JPA de cliente
│   └── EnderecoRepository.java  # Repositório JPA de endereço
├── service/
│   └── ClienteService.java      # Regras de negócio
└── ApiApplication.java          # Classe principal
```

---

## ▶️ Como Executar

### Pré-requisitos

- Java 21+
- Maven 3.8+ (ou use o `mvnw` incluso no projeto)

### Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/desafio-spring-dio.git
   cd desafio-spring-dio
   ```

2. Execute a aplicação:
   ```bash
   ./mvnw spring-boot:run
   ```
   > No Windows: `.\mvnw.cmd spring-boot:run`

3. A API estará disponível em: `http://localhost:8080`

---

## 📌 Endpoints

| Método   | Rota             | Descrição                  |
|----------|------------------|----------------------------|
| `GET`    | `/clientes`      | Lista todos os clientes    |
| `GET`    | `/clientes/{id}` | Busca cliente por ID       |
| `POST`   | `/clientes`      | Cadastra novo cliente      |
| `PUT`    | `/clientes/{id}` | Atualiza cliente existente |
| `DELETE` | `/clientes/{id}` | Remove cliente             |

### Exemplo de Body (POST/PUT)

```json
{
  "nome": "João Silva",
  "idade": 30,
  "endereco": {
    "cep": "01310100",
    "numero": "1000",
    "bairro": "Bela Vista",
    "cidade": "São Paulo",
    "estado": "SP",
    "complemento": "Apto 42"
  }
}
```

---

## 🗄️ Console H2

Com a aplicação rodando, acesse o banco em memória pelo console:

- **URL:** `http://localhost:8080/h2-console`
- **JDBC URL:** `jdbc:h2:mem:desafio_dio`
- **Usuário:** `sa`
- **Senha:** *(vazio)*

---

## 📖 Documentação Swagger

A documentação interativa da API está disponível em:

- **Swagger UI:** `http://localhost:8080/swagger-ui.html`
- **OpenAPI JSON:** `http://localhost:8080/v3/api-docs`

---

## 👨‍💻 Autor

<div align="center">
  <img src="https://github.com/kauavictorss.png" width="150px" style="border-radius: 50%;" alt="Kauã Victor"/>
  <br>
  <h1>Kauã Victor Silva dos Santos</h1>
  <p>🚀 Desenvolvedor Java em constante aprendizado, focado na construção de APIs robustas e escaláveis.</p>

[![GitHub](https://img.shields.io/badge/-GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/kauavictorss)
[![LinkedIn](https://img.shields.io/badge/-LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/kaua-victor-santos/)
</div>

---

## 🎓 Certificação DIO

Projeto desenvolvido como parte do Bootcamp **Accenture - Desenvolvimento Java & Cloud** da **[Digital Innovation One (DIO)](https://www.dio.me)**, no módulo **Desenvolvimento de APIs REST com Java e Spring Boot**.

[![Certificado DIO](https://img.shields.io/badge/Certificado-DIO-6DB33F?style=for-the-badge&logo=douban)](https://www.dio.me/certificate/9NZIQH9Q/share)

