# ibex
Service to return client's IP address

## Quick Start
```
$ git clone https://github.com/jtgeiger/ibex.git
$ cd ibex
$ ./mvnw clean verify
$ java -jar target/ibex*-SNAPSHOT.jar
$ curl http://localhost:8080
{"clientAddress":"127.0.0.1","clientPort":46702}
