CREATE TABLE users
(
    id          BIGINT PRIMARY KEY,
    created_at  TIMESTAMP WITH TIME ZONE NOT NULL,
    modified_at TIMESTAMP WITH TIME ZONE NULL,
    name        VARCHAR                  NOT NULL,
    email       VARCHAR                  NOT NULL,
    cpf         VARCHAR                  NOT NULL UNIQUE
);

