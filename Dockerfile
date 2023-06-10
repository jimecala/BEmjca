FROM amazoncorretto:11
EXPOSE 8080
MAINTAINER MJCA
COPY  target/portfoliomjca-0.0.1-SNAPSHOT.jar portfoliomjca.jar
ENTRYPOINT ["java","-jar","/portfoliomjca.jar"] 