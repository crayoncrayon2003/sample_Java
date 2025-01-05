# Root Dir
```
cd 90_Maven/sampl2/project
```

# Exec
## Build
```
mvn compile
```
## Run
```
mvn exec:java -Dexec.mainClass=com.example.HttpServerExample
```

# JarFile
## Make
```
mvn clean package
```
## Run
```
java -jar target/http-server-example-1.0-SNAPSHOT-shade.jar
```

