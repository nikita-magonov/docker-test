FROM eclipse-temurin:21
RUN mkdir /opt/app
COPY abc/build/libs/abc.jar /opt/app
CMD ["java", "-jar", "/opt/app/abc.jar"]
