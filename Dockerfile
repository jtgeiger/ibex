FROM openjdk:8-jre-alpine

COPY target/ibex*-SNAPSHOT.jar /opt/app.jar

WORKDIR /opt

CMD ["java", "-jar", "app.jar"]


#Build the image:
# $ docker build -t jt/ibex .
#Run it:
# $ docker run -p 8053:8080 -d --name ibex jt/ibex
