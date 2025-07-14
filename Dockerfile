FROM openjdk:17
EXPOSE 8082
VOLUME /tmp
COPY target/product-service.jar product-service.jar
ENTRYPOINT ["java","-jar","/product-service.jar"]
