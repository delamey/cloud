FROM carsharing/alpine-oraclejdk8-bash:latest
VOLUME /tmp
ADD testCloud.jar app.jar
EXPOSE 7001:7001
ENTRYPOINT ["java","-jar","/app.jar"]