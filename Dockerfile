FROM openjdk
COPY ./target/MiniProject1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar"]