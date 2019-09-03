FROM tomcat:8.5.45-jdk11-openjdk
WORKDIR /app

RUN apt update; apt install maven -y

COPY pom.xml /app/pom.xml
COPY src /app/src
COPY webapp /app/webapp
COPY server /app/server

RUN mkdir -p /app/target

ENV JVM_OPTS "-XX:+UseCGroupMemoryLimitForHeap -XX:MaxRAMFraction=1"
RUN mvn install
RUN rm -rf /usr/local/tomcat/webapps/ROOT
RUN cp /app/webapp/target/webapp.war /usr/local/tomcat/webapps/ROOT.war
