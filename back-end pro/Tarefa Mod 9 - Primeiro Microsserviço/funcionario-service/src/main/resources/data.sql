INSERT INTO SPECIES (nome_especie) VALUES ('Cachorro');
INSERT INTO SPECIES (nome_especie) VALUES ('Gato');

INSERT INTO Funcionario (nome) VALUES ('jonas');
INSERT INTO Funcionario (nome) VALUES ('douglas');

INSERT INTO ANIMAL (nome_provisorio, condicoes_chegada, idade_estimada, funcionario_recebedor, data_entrada, especie)
VALUES ('Ronaldo', 'Coitadinho', 4, (SELECT id FROM Funcionario WHERE nome = 'jonas'), CURRENT_DATE, (SELECT id FROM SPECIES WHERE nome_especie = 'Cachorro'));

INSERT INTO DOG (id, porte, raca)
VALUES ((SELECT MAX(id) FROM ANIMAL), 'Médio', 'Labrador');

INSERT INTO ANIMAL (nome_provisorio, condicoes_chegada, idade_estimada, funcionario_recebedor, data_entrada, data_adocao, especie)
VALUES ('Cegovinha', 'Pulguento', 6, (SELECT id FROM Funcionario WHERE nome = 'douglas'), CURRENT_DATE, CURRENT_DATE, (SELECT id FROM SPECIES WHERE nome_especie = 'Cachorro'));

INSERT INTO DOG (id, porte, raca)
VALUES ((SELECT MAX(id) FROM ANIMAL), 'Médio', 'Labrador');

INSERT INTO ANIMAL (nome_provisorio, condicoes_chegada, idade_estimada, funcionario_recebedor, data_entrada, data_adocao, especie)
VALUES ('Aroldo', 'Capenga', 4, (SELECT id FROM Funcionario WHERE nome = 'jonas'), CURRENT_DATE, CURRENT_DATE, (SELECT id FROM SPECIES WHERE nome_especie = 'Gato'));

INSERT INTO CAT (id, cor)
VALUES ((SELECT MAX(id) FROM ANIMAL), 'Preto');

INSERT INTO ANIMAL (nome_provisorio, condicoes_chegada, idade_estimada, funcionario_recebedor, data_entrada, data_adocao, especie)
VALUES ('Miau', 'Cansado', 6, (SELECT id FROM Funcionario WHERE nome = 'douglas'), CURRENT_DATE, CURRENT_DATE, (SELECT id FROM SPECIES WHERE nome_especie = 'Gato'));

INSERT INTO CAT (id, cor)
VALUES ((SELECT MAX(id) FROM ANIMAL), 'Branco');

INSERT INTO ANIMAL (nome_provisorio, condicoes_chegada, idade_estimada, funcionario_recebedor, data_entrada, especie)
VALUES ('Bolt', 'Com fome', 2, (SELECT id FROM Funcionario WHERE nome = 'jonas'), CURRENT_DATE, (SELECT id FROM SPECIES WHERE nome_especie = 'Cachorro'));

INSERT INTO DOG (id, porte, raca)
VALUES ((SELECT MAX(id) FROM ANIMAL), 'Grande', 'Pastor Alemão');

INSERT INTO ANIMAL (nome_provisorio, condicoes_chegada, idade_estimada, funcionario_recebedor, data_entrada, data_adocao, especie)
VALUES ('Max', 'Sujinho', 3, (SELECT id FROM Funcionario WHERE nome = 'douglas'), CURRENT_DATE, CURRENT_DATE, (SELECT id FROM SPECIES WHERE nome_especie = 'Cachorro'));

INSERT INTO DOG (id, porte, raca)
VALUES ((SELECT MAX(id) FROM ANIMAL), 'Médio', 'Golden Retriever');

INSERT INTO ANIMAL (nome_provisorio, condicoes_chegada, idade_estimada, funcionario_recebedor, data_entrada, especie)
VALUES ('Whiskers', 'Esquelético', 5, (SELECT id FROM Funcionario WHERE nome = 'jonas'), CURRENT_DATE, (SELECT id FROM SPECIES WHERE nome_especie = 'Gato'));

INSERT INTO CAT (id, cor)
VALUES ((SELECT MAX(id) FROM ANIMAL), 'Cinza');

INSERT INTO ANIMAL (nome_provisorio, condicoes_chegada, idade_estimada, funcionario_recebedor, data_entrada, data_adocao, especie)
VALUES ('Luna', 'Arranhada', 3, (SELECT id FROM Funcionario WHERE nome = 'douglas'), CURRENT_DATE, CURRENT_DATE, (SELECT id FROM SPECIES WHERE nome_especie = 'Gato'));

INSERT INTO CAT (id, cor)
VALUES ((SELECT MAX(id) FROM ANIMAL), 'Branca');