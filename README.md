# Projeto de Estudo: Integração com Datadog

🚀 Este projeto tem como objetivo estudar e implementar a integração de uma aplicação Java com o Datadog, utilizando **Java 17**, **Maven** e **Spring Boot**.

## 🛠️ Tecnologias Utilizadas

- **☕ Java 17**: Linguagem principal do projeto.
- **📦 Maven**: Gerenciador de dependências e build.
- **🌱 Spring Boot**: Framework para construção de aplicações Java.
- **📊 Datadog**: Plataforma de monitoramento e análise.

## ✅ Pré-requisitos

Antes de começar, certifique-se de ter instalado em sua máquina:

- ☕ **Java 17** ou superior
- 📦 **Maven 3.8** ou superior
- 🌐 Uma conta no [Datadog](https://www.datadoghq.com/)

## 🌟 Funcionalidades do Projeto

- 📝 Configuração do Datadog para monitorar logs, métricas e traces.
- 📡 Implementação de um exemplo básico de monitoramento de APIs com Spring Boot.
- 📈 Envio de métricas personalizadas ao Datadog.

## 📂 Estrutura do Projeto

```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.datadog
│   │   │       ├── controller
│   │   │       ├── service
│   │   │       └── DatadogApplication.java
│   ├── test
│       └── java
│           └── com.example.datadog
├── pom.xml
└── README.md
```

## ⚙️ Configuração

1. **Clonar o repositório**

   ```bash
   git clone https://github.com/sua-conta/datadog-study.git
   cd datadog-study
   ```

2. **Configurar as dependências do Maven**

   Adicione ao `pom.xml` as dependências necessárias para integração com o Datadog:

   ```xml
   <dependency>
       <groupId>com.datadoghq</groupId>
       <artifactId>dd-trace-api</artifactId>
       <version>1.13.0</version>
   </dependency>
   <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter</artifactId>
   </dependency>
   ```

3. **Configurar o Datadog Agent**

    - 🔧 Baixe e instale o [Datadog Agent](https://docs.datadoghq.com/agent/).
    - 🔑 Configure o agente com sua chave de API.

4. **Configurar variáveis de ambiente**

   Crie as seguintes variáveis de ambiente para integração:

   ```bash
   export DD_AGENT_HOST=localhost
   export DD_TRACE_ENABLED=true
   export DD_ENV=dev
   export DD_SERVICE=datadog-study
   export DD_VERSION=1.0.0
   ```

## ▶️ Como Executar

1. **Compile o projeto:**

   ```bash
   mvn clean install
   ```

2. **Execute a aplicação:**

   ```bash
   mvn spring-boot:run
   ```

3. **Verifique se os logs e métricas estão sendo enviados ao Datadog.**

## 🔮 Próximos Passos

- 🔧 Adicionar suporte para métricas personalizadas.
- 🗄️ Configurar monitoramento de bancos de dados.
- 📊 Implementar dashboards no Datadog.

## 📚 Recursos Úteis

- 📖 [Documentação Oficial do Datadog](https://docs.datadoghq.com/)
- 🌱 [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- 📦 [Maven Documentation](https://maven.apache.org/)

## 📝 Licença

Este projeto é apenas para fins de estudo e não possui uma licença específica.
