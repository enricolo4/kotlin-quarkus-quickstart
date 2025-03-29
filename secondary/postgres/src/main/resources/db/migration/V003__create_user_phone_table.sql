CREATE TABLE user_phones
(
    user_id      BIGINT PRIMARY KEY REFERENCES users (id) NOT NULL,
    created_at   TIMESTAMP WITH TIME ZONE                 NOT NULL,
    modified_at  TIMESTAMP WITH TIME ZONE                 NULL,
    country_code VARCHAR(3)                               NOT NULL,
    area_code    VARCHAR(2)                               NOT NULL,
    number       VARCHAR(10)                              NOT NULL
);

CREATE INDEX IF NOT EXISTS user_id ON user_phones (user_id);

