# Branches Organization 

Features are added incrementally from one branch to the next, meaning everything available in a previous branch is also available in the subsequent ones. **The main branch will always represent the latest branch from the list.**

| Branch name                | Description                                                                                                                                                  | Features                       |
|----------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------|
| in-memory                  | The simplest starting solution. Users can log in and log out. Everything is saved in memory, and the application state is lost upon every restart.           | **authentication**, **logout** |
| persistent-postgres-docker | Added docker-compose support for Spring Boot, simplifying the use of a Postgres database. Clients, users, and consent information are saved in the database. | **durability**                 |
    