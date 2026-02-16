# Install Java
## Install
```
sudo apt update
sudo apt install openjdk-17-jdk　# For java version 17
sudo apt install openjdk-21-jdk　# For java version 21

```
## Check
```
java -version
javac -version
```

## Setting JAVA_HOME
### Case1
```
vim ~/.bashrc
```
```
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64   # For java version 17
# export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64 # For java version 21
export PATH=$JAVA_HOME/bin:$PATH```
```


### Case2
#### Search for Java path
```
sudo update-alternatives --config java
```
