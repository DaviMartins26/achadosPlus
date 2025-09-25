CREATE DATABASE IF NOT EXISTS AchadosPlus;

USE AchadosPlus;

-- Usuários do sistema
CREATE TABLE IF NOT EXISTS Usuario(
    id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL,
    tipo_usuario ENUM('ADM','FUNCIONARIO','NORMAL') NOT NULL
);

-- Categorias de objetos
CREATE TABLE IF NOT EXISTS Categoria (
    id_categoria INT PRIMARY KEY AUTO_INCREMENT,
    nome_categoria VARCHAR(100) NOT NULL
);

-- Objetos cadastrados
CREATE TABLE IF NOT EXISTS Objeto (
    id_objeto INT PRIMARY KEY AUTO_INCREMENT,
    nome_objeto VARCHAR(150) NOT NULL,
    descricao TEXT,
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES Categoria(id_categoria)
);

-- Protocolos (ligados a usuário + objeto)
CREATE TABLE IF NOT EXISTS Protocolo (
    id_protocolo INT PRIMARY KEY AUTO_INCREMENT,
    id_objeto INT NOT NULL,
    id_usuario_criador INT NOT NULL,
    id_usuario_fechador INT,
    id_status INT NOT NULL,
    data_criacao DATETIME NOT NULL,
    data_fechamento DATETIME,
    FOREIGN KEY (id_objeto) REFERENCES Objeto(id_objeto),
    FOREIGN KEY (id_usuario_criador) REFERENCES Usuario(id_usuario),
    FOREIGN KEY (id_usuario_fechador) REFERENCES Usuario(id_usuario)
);

-- Logs unificados
CREATE TABLE IF NOT EXISTS Log (
    id_log INT PRIMARY KEY AUTO_INCREMENT,
    data_ocorrido DATETIME NOT NULL,
    id_usuario_responsavel INT NOT NULL,
    tipo_log ENUM('FUNCIONARIO','PROTOCOLO') NOT NULL,

    -- Campos específicos (dependendo do tipo de log)
    mudanca TEXT, -- usado em LogFun
    id_protocolo_relacionado INT, -- usado em LogProtocolo
    old_status INT,
    new_status INT,

    FOREIGN KEY (id_usuario_responsavel) REFERENCES Usuario(id_usuario),
    FOREIGN KEY (id_protocolo_relacionado) REFERENCES Protocolo(id_protocolo)
);
