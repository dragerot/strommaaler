FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_PATH=target
ADD target/Strommmaaler-1.0.0.jar target/app.jar
RUN bash -c 'touch target/app.jar'
#COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","target/app.jar"]


#VOLUME /tmp
#ARG JAR_FILE
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

#FROM openjdk:8
#ADD build/libs/StrommmaalerJar-1.0.0.jar strommaalerApp.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","strommaalerApp.jar"]

