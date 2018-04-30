FROM java:8

EXPOSE 8081

ADD target/DemoGVR-0.0.1-SNAPSHOT.jar DemoGVR-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","DemoGVR-0.0.1-SNAPSHOT.jar","--server.port=8081"]