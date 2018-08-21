![Cerise BIP-0171](logo.png)
# Cerise server mock.
This project is a mocked BIP-0171 compliant server to help you develop your client applications. 

## Run it as a standalone Java application.
Download `cerise-server-mock.jar` from [releases](https://github.com/straumat/cerise-server-mock/releases) and run it with the command : `java -jar cerise-server-mock.jar`.

## Run it as a docker image.
`docker run -p 8080:8080 straumat/cerise-server-mock:0.4`

## Get it, build it and run it.
```
git clone git@github.com:straumat/cerise-server-mock.git
cd cerise-server-mock
mvn spring-boot:run
```

## View documentation and call the API.
Once the application is launched, you can access the API at this address : [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html).