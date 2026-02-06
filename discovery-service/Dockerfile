FROM eclipse-temurin:25.0.2_10-jdk-alpine
ENV APP_FILE discovery-service-1.2-SNAPSHOT.jar
ENV APP_HOME /usr/apps
EXPOSE 8761
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]