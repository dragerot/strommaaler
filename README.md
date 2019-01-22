
https://projects.spring.io/spring-security-oauth/docs/oauth2.html
https://developer.okta.com/blog/2018/04/02/client-creds-with-spring-boot


https://developer.okta.com/blog/2017/11/20/add-sso-spring-boot-15-min
https://developer.okta.com/docs/api/resources/oidc#id-token

docker build --build-arg JAR_FILE=./build/libs/StrommmaalerJar-1.0.0.jar .
docker run -d e4b8a479e31a
docker exec -it 526efb58876a ps

## Innledning
Dette er en spring boot applikasjon, rest tjeneste

http://localhost:8080/strommaaler/swagger-ui.html

curl -X GET "http://localhost:8080/strommaaler/maalinger" -H "accept: */*"


https://www.youtube.com/watch?v=FlSup_eelYE&t=216s

https://www.youtube.com/watch?v=CWPyBXNAo_o

## Build docker image
docker build -f Dockerfile -t strommaaler-app .

#Run image exposed port is 8081
docker run -p 8081:8080 strommaaler-app


Run at 
http://localhost:8080/strommaaler/swagger-ui.html

docker ps
docker stop <containerid>
docker rm <containerid>
docker rmi strommaaler-app --force






