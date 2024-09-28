CREATE TABLE users (
                       id SERIAL PRIMARY KEY,
                       firstname VARCHAR(255) NOT NULL,
                       lastname VARCHAR(255) NOT NULL,
                       email VARCHAR(255) NOT NULL UNIQUE,
                       password VARCHAR(255) NOT NULL,
                       is_enabled BOOLEAN NOT NULL,
                       is_account_non_expired BOOLEAN NOT NULL,
                       is_account_non_locked BOOLEAN NOT NULL,
                       is_credentials_non_expired BOOLEAN NOT NULL
);

CREATE TABLE authorities (
                             user_id INTEGER NOT NULL,
                             role VARCHAR(50) NOT NULL,
                             FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);
