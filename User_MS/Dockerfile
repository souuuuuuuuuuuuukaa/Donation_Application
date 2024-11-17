
# Utiliser l'image officielle de Java
FROM openjdk:17-jdk

VOLUME /tmp

# Ajouter le JAR généré par Spring Boot
COPY target/*.jar Users.jar

# Démarrer l'application Spring Boot
ENTRYPOINT ["java", "-jar", "Users.jar"]
