
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






