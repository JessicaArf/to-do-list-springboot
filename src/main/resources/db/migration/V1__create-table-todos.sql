CREATE TABLE todos(
id SERIAL PRIMARY KEY UNIQUE,
nome TEXT NOT NULL,
descricao TEXT,
realizado BOOLEAN,
prioridade INT NOT NULL
);