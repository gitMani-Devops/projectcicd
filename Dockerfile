FROM eclipse-temurin:21-jre
WORKDIR /app
COPY BillingApplication-0.0.1-SNAPSHOT.jar /app
EXPOSE 9090
ENTRYPOINT ["java","-jar","BillingApplication-0.0.1-SNAPSHOT.jar"
