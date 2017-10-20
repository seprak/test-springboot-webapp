FROM maven
EXPOSE 8080
CMD ["mvn install"]
ADD /tmp/target/examplewebapp-0.0.1-SNAPSHOT.jar examplewebapp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","examplewebapp-0.0.1-SNAPSHOT.jar"]