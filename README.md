
# DTI Java Reminders

This is a simple reminder generator for a test at DTI. This repo consists of a Java application using spring boot to manage reminders.

This project uses:
 - Java 17
- Spring boot v3.1.0
- MAVEN

## Environment Variables

To run this project, you will need to change the following MySQL environment variables to your .application.properties file (located at /resources).


`spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/***DATABASE_NAME***`

`spring.datasource.username=*USERNAME*`

`spring.datasource.password=*PASSWORD*`



## Deployment

To deploy a .jar file for this this project run:

```bash
  ./mvnw clean package
```

Or run the DtiApplication.java with VS Code / Eclipse IDE
## API Reference

#### Post and delete reminders

```http
  POST | DELETE /v1/lembrete
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `nome` | `string` | **Required**. Reminder description |
| `dataDoLembrete` | `string` | **Required**. Reminder date |

#### Get reminders

```http
  GET /v1/lembrete
```



