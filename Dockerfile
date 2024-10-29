FROM openjdk:17-oracle
COPY ./target/author-0.0.1-SNAPSHOT.jar author.jar
CMD ["java","-jar","author.jar"]