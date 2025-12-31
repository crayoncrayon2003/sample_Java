# Install Gradle
## Check Java Version
```
java -version
> jdk version "11.0.x"
```

## Install Gradle
```
sudo apt update
sudo apt install gradle
```

## Check
```
gradle -v
```

# Root Dir
```
cd 91_Gradle/sample1
```

3333333333
# Make GradleProject
```
gradle wrapper --gradle-version 8.3 --distribution-type all
gradle init
> Enter selection (default: basic) [1..4] 2
> Enter selection (default: Java) [1..6] 3
> Generate multiple subprojects for application? (default: no) [yes, no] enter
> Enter selection (default: Kotlin) [1..2] enter
> Enter selection (default: JUnit Jupiter) [1..4] enter
> Project name (default: gradle-demo): enter
> Source package (default: gradle.demo): enter
> Enter target version of Java (min. 7) (default: 17): enter
> Generate build using new APIs and behavior (some features may change in the next minor release)? (default: no) [yes, no] : enter
```

# Build
```
gradlew build
```

# Run
```
gradlew run
```