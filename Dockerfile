FROM openjdk:17
ADD /target/demo-0.0.1-SNAPSHOT.jar task-docker.jar
ENTRYPOINT ["java","-jar","task-docker.jar"]