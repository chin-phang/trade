# Getting Started

### Docker Containers
Start Kafka and Zookeeper services:

```sh
docker-compose -f ./docker-compose.yml up -d
```

### Kafka Setup
Copy and run commands in kafka-stream-scripts.txt:

```sh
# run commands in kafka container
docker exec -it kafka bash

# go to kafka bin directory
cd /opt/kafka/bin
```