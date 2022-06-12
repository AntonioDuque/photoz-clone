# photoz-clone -> Maven Project -> https://start.spring.io/

Proyecto realizado con: 
          
    Spring Boot -> 2.7.0     
    Java        -> 11
    H2 Database -> 2.1.212
    
# Resumen

 Programa pequeño que simula un clon de Google Photos desde el lado del 🔙🔄️

 Utilizando la inyección de dependencias de Spring, el marco MVC, manejos de archivos

 También la interfaz CrudRepository de Spring , que maneja métodos de búsquedas y ordenamientos de manera automática

 Tiene un pequeño script de JavaScript que pertime subir las img desde el lado del cliente

 De igual forma utilizo la estructura API REST que define un conjunto de funciones para realizar solicitudes 
 y recibir respuestas a través del protocolo HTTP, como GET   y POST.

 H2 es una base de datos relacional que se encuentra escrita en Java y funciona como una base de datos en memoria, 
 cuyo uno de sus puntos fuertes es que puede trabajar como una base de datos embebida en aplicaciones Java o 
 ejecutarse en modo cliente servidor.
 
 http://localhost:8080/h2-console

# Revisar

pom.xml

El archivo XML tiene información sobre las dependencias, 
configuraciones y otra información importante sobre el proyecto. 

Maven revisa esta información y luego realiza la tarea designada.

Además chequear la carpeta resources que contiene diferentes archivos upload.html | application.properties | schema.sql

https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html
https://www.h2database.com/html/cheatSheet.html

# Comandos finales para desplegar el proyecto desde CDM

./mvnw clean package

cd target 

java -jar .\photoz-clone-0.0.1-SNAPSHOT.jar
