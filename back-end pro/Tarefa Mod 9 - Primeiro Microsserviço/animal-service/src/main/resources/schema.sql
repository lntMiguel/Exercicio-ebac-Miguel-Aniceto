CREATE TABLE IF NOT EXISTS Species (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         nome_especie VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS Funcionario (
                     id INT AUTO_INCREMENT PRIMARY KEY,
                     nome VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS Animal (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        idade_estimada INT,
                        nome_provisorio VARCHAR(100),
                        condicoes_chegada TEXT,
                        funcionario_recebedor int not null,
                        data_entrada DATE NOT NULL,
                        data_adocao DATE,
                        data_obito DATE,
                        especie INT NOT NULL,
                        FOREIGN KEY (especie) REFERENCES Species(id),
                        FOREIGN KEY (funcionario_recebedor) REFERENCES Funcionario(id)
);

CREATE TABLE IF NOT EXISTS Dog (
                     id INT PRIMARY KEY,
                     raca VARCHAR(50),
                     porte VARCHAR(20),
                     FOREIGN KEY (id) REFERENCES Animal(id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS Cat (
                     id INT PRIMARY KEY,
                     cor VARCHAR(50),
                     FOREIGN KEY (id) REFERENCES Animal(id) ON DELETE CASCADE
);
