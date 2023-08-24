FROM maven:3.6.3-openjdk-17
COPY ./ ./
COPY ../target/ProducerConsumer-1.0-SNAPSHOT-jar-with-dependencies.jar /
CMD ["java","-jar","ProducerConsumer-1.0-SNAPSHOT-jar-with-dependencies.jar"]

