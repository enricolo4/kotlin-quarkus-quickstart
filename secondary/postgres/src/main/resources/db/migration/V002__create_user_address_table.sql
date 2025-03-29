CREATE TABLE user_addresses
(
    user_id      BIGINT PRIMARY KEY REFERENCES users (id) NOT NULL,
    created_at   TIMESTAMP WITH TIME ZONE                 NOT NULL,
    modified_at  TIMESTAMP WITH TIME ZONE                 NULL,
    country      VARCHAR                                  NOT NULL,
    state        VARCHAR                                  NOT NULL,
    city         VARCHAR                                  NOT NULL,
    address      VARCHAR                                  NOT NULL,
    build_number VARCHAR                                  NOT NULL,
    complement   VARCHAR                                  NULL,
    neighborhood VARCHAR                                  NOT NULL,
    zip_code     VARCHAR                                  NOT NULL
);

CREATE INDEX IF NOT EXISTS user_id ON user_addresses (user_id);

