CREATE TABLE IF NOT EXISTS products
(
    id          BIGSERIAL PRIMARY KEY,
    title       VARCHAR(255) NOT NULL,
    price       FLOAT        NOT NULL
    );

INSERT INTO products(title, price)
VALUES ('Lenovo', 44990),
       ('iPhone', 66490),
       ('LG', 32290),
       ('Samsung', 32290),
       ('Indesit', 31145);