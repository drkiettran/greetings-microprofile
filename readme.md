# Microprofile sample project

## Build

```
mvn clean package
```
## Run

```
java -jar target/demo-thorntail.jar
```

## Test

### Request:

```
GET /greetings/2019/05/22 HTTP/1.1
Host: localhost:8080
Content-Type: application/json
User-Agent: PostmanRuntime/7.13.0
Accept: */*
Cache-Control: no-cache
Postman-Token: 9e36d28c-58b4-4527-ac27-367959fdea35,79b69d17-5d5a-40c5-aed3-d587985891a1
Host: localhost:8080
cookie: JSESSIONID=5E3DEB5E58489C6A1AE07681C4282338.saintgoretti
accept-encoding: gzip, deflate
Connection: keep-alive
cache-control: no-cache

```


### Response:

```json
{
    "name": "Thorntail",
    "message": "2019/5/22"
}
```

### Request:

```

PUT /greetings/2019/05/22 HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Accept: application/json
User-Agent: PostmanRuntime/7.13.0
Cache-Control: no-cache
Postman-Token: 41e48625-f130-4bcf-aab7-14f35f6788d0,bfb5a3dc-31cf-48a4-9e24-66d7285c6bba
Host: localhost:8080
cookie: JSESSIONID=5E3DEB5E58489C6A1AE07681C4282338.saintgoretti
accept-encoding: gzip, deflate
content-length: 61
Connection: keep-alive
cache-control: no-cache
```

```json
{
    "name": "Kiet T. Tran",
    "message": "2019/5/22"
}

```

### Response:

```json
{
    "name": "Kiet T. Tran",
    "message": "Hello, 'Kiet T. Tran' from SaintGoretti/13112@SaintGoretti"
}
```