### Mongo DB Installation
Install MongoDB  and start service
```sh
$ brew tap mongodb/brew
$ brew install mongodb-community
$ brew services start mongodb-community
$ brew services stop mongodb-community
$ brew services list
```
###  Build and Run 
- Build and Run the application in IDE or use gradle commands
- CRUD Operations using below curl or postman tool
```sh
curl --location --request POST 'localhost:8080/products' \
--header 'Content-Type: application/json' \
--data-raw '    {
        "name": "Moto Razr",
        "price": 199.99
    }'
```

```sh
curl --location --request GET 'localhost:8080/products'
```

```sh
curl --location --request GET 'localhost:8080/products/1'
```

```sh
curl --location --request PUT 'localhost:8080/products/1' \
--header 'Content-Type: application/json' \
--data-raw '    {
        "name": "Moto Razr4",
        "price": 200.99
    }'
```

```sh
curl --location --request DELETE 'localhost:8080/products/1'
```

- File Upload and Download

```sh
curl --location --request POST 'localhost:8080/images' \
--header 'Content-Type: application/json' \
--form 'file=@"/Users/Srikanth/Desktop/test.txt"' \
--form 'name="test.txt"'
```

```sh
curl --location --request GET 'localhost:8080/images/6031e2678e4bff08ef95d429' \
--header 'Content-Type: application/json'
```
