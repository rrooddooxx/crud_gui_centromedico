# 🩻 CRUD para Centro Médico, gestión de fichas de pacientes.

> **CRUD con GUI en Java SE + Swing + MySQL!**
> Realizado por [Sebastián Kravetz](mailto:sebastiankravetz@icloud.com) para la asignatura de programación de software de escritorio (PGY2121) en Duoc UC, Sede Viña Del Mar.

Stack utilizado:

- Java SE (OpenJDK 11)
- IDE NetBeans
- Swing (javax.swing)
- MySQL
- DataGrip
- Maven

## 📦 Dependencias:

- mysql-connector-j@8.0.31

## 🛠 Ejecución:

Para ejecutar la aplicación ya compilada con sus dependencias empaquetadas (Maven):

1. Clonar el repositorio y ejecutar:

```
java -jar target/centromedico-1.0-SNAPSHOT-jar-with-dependencies.jar
```

ó 2. Dirgirse a la carpeta _"target"_ y hacer doble click en el archivo centromedico-1.0-SNAPSHOT-jar-with-dependencies.jar

## 💽 Base de Datos:

Se ha proporcionado un archivo _paciente.sql_ para la importación en una base de datos MySQL que debe desplegar de manera local para que la aplicación se comunique y pueda persistir los datos de las fichas médicas. El string de conexión está presente en el archivo `/src/main/java/com/skravetz/centromedico/database/Conexion.java` en donde puede configurar el usuario y clave respecto de la configuración de su servidor local MySQL.
