FROM maven:3.10.0-eclipse-temurin-27 AS builder

WORKDIR /app

COPY pom.xml .

RUN mvn -B -ntp dependency:go-offline

COPY src src

RUN mvn -B -ntp clean package

FROM eclipse-temurin:27-jre AS runner

WORKDIR /app

COPY --from=builder --chown=10001:10001 /app/target/billing-service-*.jar app.jar

USER 10001:10001

EXPOSE 4001 9001

ENTRYPOINT ["java", "--enable-native-access=ALL-UNNAMED", "-jar", "/app/app.jar"]
