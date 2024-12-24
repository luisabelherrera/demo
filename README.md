# Proyecto de Gestión de Instituciones

Este es un proyecto de gestión de instituciones utilizando Spring Boot. El sistema permite la gestión de estudiantes, tutores, asignaciones de aulas, cursos, y más. Este proyecto tiene como objetivo ofrecer una plataforma completa para administrar información educativa.

## Tecnologías utilizadas

- **Spring Boot**: Framework para crear aplicaciones Java con configuraciones mínimas.
- **Spring Data JPA**: Para la gestión de bases de datos mediante JPA.
- **PostgreSQL**: Base de datos relacional utilizada para almacenar la información.
- **Spring Security**: Para la autenticación y autorización de usuarios.
- **Lombok**: Librería para reducir el código boilerplate en clases Java.
- **Thymeleaf**: Motor de plantillas para la creación de vistas.
- **Maven**: Herramienta de construcción y gestión de dependencias.

## Características

- Gestión de estudiantes, tutores y cursos.
- Asignación de aulas a cursos.
- Autenticación y autorización mediante Spring Security.
- Interfaz de usuario con Thymeleaf y formularios dinámicos.
- Acceso y manipulación de datos a través de Spring Data JPA.

## Diagrama de Modelo Relacional

A continuación se presenta un diagrama de modelo relacional simplificado de la base de datos, que muestra las principales entidades y sus relaciones.

![Diagrama Relacional](![BASE DE DATOS V2](https://github.com/user-attachments/assets/1d7021b9-465d-4d2c-8164-5990a4a2e40a)
)

### Descripción del Modelo:

- **Estudiantes (Student)**: Contiene información de los estudiantes, como nombre, código, documento de identidad, etc.
- **Tutores (Tutor)**: Información de los tutores que gestionan los cursos.
- **Cursos (Course)**: Información sobre los cursos disponibles.
- **Asignaciones de Aula (ClassroomAssignment)**: Relaciona cursos con aulas y horarios.
- **Departamentos (Department)**: Cada tutor pertenece a un departamento específico.
- **Nivel de Tutor (TeacherLevel)**: Define el nivel de experiencia del tutor en un curso.

## Instrucciones para ejecutar el proyecto

### Requisitos previos

1. **JDK 17 o superior**.
2. **Maven** instalado en tu máquina.
3. **PostgreSQL** configurado y en ejecución.

### Configuración

1. Clona este repositorio en tu máquina local:

   ```bash
   git clone https://github.com/tu-usuario/tu-proyecto.git
