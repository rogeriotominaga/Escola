# Escola

Version 1 of the school project: includes the structure of classes and methods for registering students, feeding a database

Requirements:

- SQL server express
- jcalendar-1.4.jar (if IDE does not include it)

The School system is divided into 3 packages:

- Classes package:

Includes the structuring of fields to register the student (Aluno.java)

-Interface package:

Includes the structuring, assembly of screens and method calls to feed data into the table

+ Tela_Principal.java - Contains the structure and designer of the main screen

+ JitCadastro.java - Sub menu of the main screen that includes the entry of data that will feed the database

- Persistence Package:

It includes the class method for connecting to the database and structuring the fields of tables

+ conexao.java - Includes the program connection with the database

+ IncluirEditar.java - Includes the assembly of data to feed the database
