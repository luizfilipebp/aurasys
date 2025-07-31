# Aurasys

## Descrição do Projeto

Aurasys é uma aplicação desenvolvida em **Java** utilizando o framework **Spring Boot**, com foco na aplicação dos
princípios de **Clean Architecture** para garantir modularidade, testabilidade e manutenibilidade. O projeto inclui
funcionalidades como gerenciamento de estabelecimentos e serviços, com suporte a APIs RESTful e documentação interativa
via Swagger.

## Tecnologias Utilizadas

- **Java 24**
- **Spring Boot 3.4.5**
- **Gradle** para automação de builds
- **PostgreSQL** como banco de dados relacional
- **Flyway** para versionamento de banco de dados
- **MapStruct** para mapeamento de objetos
- **Lombok** para redução de código boilerplate
- **SpringDoc** para documentação da API

## Estrutura do Projeto

O projeto segue os princípios da **Clean Architecture**, com as seguintes camadas:

- **Domínio**: Contém as entidades e regras de negócio.
- **Casos de Uso**: Implementa a lógica de aplicação.
- **Interface de Entrada**: Controladores REST para receber requisições.
- **Interface de Saída**: Gateways para comunicação com a infraestrutura.

## Configuração do Ambiente

### Perfis de Ambiente

- **Dev**: Configurações locais definidas no arquivo `application-dev.yml`.
- **Railway**: Configurações para o ambiente de produção hospedado no Railway, definidas no arquivo
  `application-railway.yml`.

## Como Executar Localmente

1. Clone o repositório:
   ```bash
   git clone https://github.com/luizfilipebp/aurasys
   ```

- Navegue até o diretório do projeto:

 ```bash
cd aurasys
   ```

- Execute o projeto:

```bash
./gradlew bootRun
```

## Documentação da API
Acesse a documentação interativa da API em:

http://localhost:8081/swagger-ui.html

## Hospedagem
O projeto está hospedado no Railway e pode ser acessado pelo
link: https://railway.com/project/a1f9c223-0827-4472-99da-704c42941fa9?environmentId=18e6cb39-34aa-4087-9967-5289e039311a