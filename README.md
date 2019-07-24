## 1. deploy ZK and expose service by HostNetwork

## 2. deploy provider 

### configmap for provider

cat application.properties
```
## Dubbo 服务提供者配置
spring.dubbo.application.name=dubbo-provider
spring.dubbo.registry.address=zookeeper://${ZK_IP}:2181
spring.dubbo.protocol.name=dubbo
spring.dubbo.protocol.port=20880
spring.dubbo.scan=cn.harmonycloud.dubbo.service

```

### provider deployment

command:
```
java
-jar
app.jar
--spring.config.location=/tmp/config/
```

## 3. deploy consumer and expose service by ingress-nginx-controller

### configmap for consumer

cat application.properties
```
## 避免和 provider 工程端口冲突
server.port=8081
## Dubbo 服务消费者配置
spring.dubbo.application.name=dubbo-consumer
spring.dubbo.registry.address=zookeeper://${ZK_IP}:2182
spring.dubbo.scan=cn.harmonycloud.dubbo.service
```

### consumer deployment

command:
```
java
-jar
app.jar
--spring.config.location=/tmp/config/
```

## validation
```
curl http://${consumer_svc_IP}:${consumer_svc_port}/getUser?id=1
```



