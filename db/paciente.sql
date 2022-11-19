CREATE TABLE paciente (
  rut varchar(12) NOT NULL PRIMARY KEY,
  nombre varchar(60) NOT NULL,
  genero varchar(1) NOT NULL,
  edad int NOT NULL,
  direccion varchar(60) NOT NULL,
  ciudad varchar(45) NOT NULL,
  isapre varchar(1) NOT NULL,
  donante bit NOT NULL
);

INSERT INTO
  consultaMedica.paciente (
    rut,
    nombre,
    genero,
    edad,
    direccion,
    ciudad,
    isapre,
    donante
  )
VALUES
  (
    '111111111',
    'seba',
    'M',
    33,
    'calle falsa 123',
    'viña del mar',
    'S',
    false
  );

INSERT INTO
  consultaMedica.paciente (
    rut,
    nombre,
    genero,
    edad,
    direccion,
    ciudad,
    isapre,
    donante
  )
VALUES
  (
    '12222333-4',
    'otro paciente',
    'F',
    23,
    'lala 23',
    'concepción',
    'N',
    TRUE
  );

INSERT INTO
  consultaMedica.paciente (
    rut,
    nombre,
    genero,
    edad,
    direccion,
    ciudad,
    isapre,
    donante
  )
VALUES
  (
    '17353841-3',
    'sebastián leiva',
    'M',
    33,
    'calle falsa 345',
    'viña del mar',
    'S',
    TRUE
  );

INSERT INTO
  consultaMedica.paciente (
    rut,
    nombre,
    genero,
    edad,
    direccion,
    ciudad,
    isapre,
    donante
  )
VALUES
  (
    '222222222',
    'raúl',
    'M',
    25,
    'callesita otra 456',
    'valparaíso',
    'S',
    TRUE
  );