# Branches Organization 

Feature for every branch are added, so everything existing in previous is also available in next 

| Branch name                | Description                                                                                                                                    | Features                |
|----------------------------|------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------|
| in-memory                  | Simplest and starting solution. User can login and logout. Everything is saved in memory and on every restart of the application state is lost | authentication, logout  |
| persistent-postgres-docker | Added docker-compose Spring Boot feature, so that using Postgres database is easy. Client, users and consent are saved in the database.        | durability              |
    