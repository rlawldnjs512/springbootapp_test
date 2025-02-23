FROM amazoncorretto:17
EXPOSE 8080
COPY target/*.war SpringBootApp.war
ENTRYPOINT ["java","-jar","SpringBootApp.war"]