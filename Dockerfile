FROM openjdk:8
ADD build/libs/StrommmaalerJar-1.0.0.jar strommaalerApp.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","strommaalerApp.jar"]

