### Prerequisite

* Java17
* maven 3.6
* docker 26
* docker compose 1.28

### Start the haproxy

`cd etc/ha-proxy`

`docker compose up`

### Build the server

`mvn clean install -DskipTests`

### start the servers

`cd target/`

`java -jar greet-service-0.0.1-SNAPSHOT.jar --port=8081`

`java -jar greet-service-0.0.1-SNAPSHOT.jar --port=8082`

### Test the load balance

`curl http://localhost/hello`
