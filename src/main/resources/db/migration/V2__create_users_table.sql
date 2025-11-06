CREATE TABLE users (
                                          id varchar(100) NOT NULL,
                                          username varchar(100) NOT NULL,
                                          password varchar(100) NOT NULL,
                                          roles varchar(200) DEFAULT NULL,
                                          PRIMARY KEY (id)
);