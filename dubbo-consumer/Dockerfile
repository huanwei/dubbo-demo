FROM huanwei/alpine-oraclejdk8:slim
ADD target/dubbo-consumer-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
