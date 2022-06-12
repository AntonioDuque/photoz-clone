# photoz-clone -> Maven Project -> https://start.spring.io/

Proyecto realizado con: 
          
    Spring Boot -> 2.7.0     
    Java        -> 11
    H2 Database -> 2.1.212
    
# Concepto

Programa pequeño que simula un clon de Google Photos desde el lado del 🔙🔄️

Utilizando la inyección de dependencias de Spring, el marco MVC, manejos de archivos

También el CrudRepository  que es una interfaz de Spring , que maneja métodos de búsquedas y ordenamientos de manera automática

Tiene un pequeño script de JavaScript que pertime subir las img desde el lado del cliente


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
