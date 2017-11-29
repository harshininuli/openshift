FROM java

EXPOSE 8080

VOLUME /opt
ADD /demo-1.0.9.jar /app.jar

ENTRYPOINT exec java -Dspring.config.location=/opt/props/dev/application.properties -jar /app.jar