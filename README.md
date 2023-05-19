
# DTI Java Reminders

This is a simple reminder generator for a test at DTI. This repo consists of a Java application using spring boot to manage reminders.

This project uses:
 - Java 17
- Spring boot v3.0.6
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

Then a "dti-0.0.1-SNAPSHOT.jar" will be created in the target folder. Open a CMD in that folder and run:

```bash
  java -jar dti-0.0.1-SNAPSHOT.jar
```

The application will be live at http://localhost:8080.


OR run the DtiApplication.java with VS Code / Eclipse IDE.

*Make SURE your MySQL database is running and configured.*

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



