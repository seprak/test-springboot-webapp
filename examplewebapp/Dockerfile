FROM maven

WORKDIR /code

# Prepare by downloading dependencies
ADD pom.xml /code/pom.xml

# Adding source, compile and package into a fat jar
ADD src /code/src
RUN ["mvn", "install"]

ADD /target/examplewebapp-0.0.1-SNAPSHOT.jar examplewebapp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","examplewebapp-0.0.1-SNAPSHOT.jar"]
