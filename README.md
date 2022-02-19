## Swagger UI
[Swagger UI (localhost)](http://localhost:8090/swagger-ui.html)

# Docker
```
docker build -t jamesvrooney/library-api:v1 .
```

```
docker run --name library-app -p 8090:8080 --rm -d jamesvrooney/library-api:v1
```

```
docker compose up -d
```