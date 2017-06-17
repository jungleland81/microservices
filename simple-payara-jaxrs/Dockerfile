FROM payara/micro
WORKDIR /opt
EXPOSE 8080
ADD ./target/simple-payara-microservice.war ROOT.war
ENTRYPOINT java -jar /opt/payara/payara-micro.jar --deploy ROOT.war
