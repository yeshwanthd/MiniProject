FROM openjdk
COPY ./target/untitled-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "untitled-1.0-SNAPSHOT-jar-with-dependencies.jar"]