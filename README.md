Create A Basic Project for Kafka 
Understanding how Producer,Consumer and Topic works 
Created a basic REST Flow architecture 

1) First download Kafka Scala version from below link
https://kafka.apache.org/downloads.html .

2)for installing zookeeper and Kafka run below command in kafka project 
a) .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
b) .\bin\windows\kafka-server-start.bat .\config\server.properties

3) give some messg from local like below 
 http://localhost:8080/rest/api/producermesg?message=%22CongratsforFirstKafkaImpl%22


