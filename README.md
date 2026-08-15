# Library Management System

Taller 1 - Programación de Computadores III - UPC

## Autor
Misael Maestre Acosta - mandresmaestre@unicesar.edu.co

## Descripción
Aplicación de consola en Java para gestionar clientes, libros y préstamos de una biblioteca. Almacenamiento en memoria (ArrayList).

## Cómo ejecutar
1. Abrir el proyecto en NetBeans
2. Compilar con Maven
3. Ejecutar `Main.java`

## Funcionalidades
- CRUD de Clientes
- CRUD de Libros
- Registro de préstamos y devoluciones
- Listar préstamos activos

## Estructura del proyecto

src/main/java/App/
├── Main.java # Menú principal y CRUD
├── Person.java # Clase padre de Client
├── Client.java # Hereda de Person
├── Material.java # Clase padre de Book
├── Book.java # Hereda de Material
└── Loan.java # Relaciona Client y Book


## Tecnologías
- Java
- Maven
- Git y GitHub