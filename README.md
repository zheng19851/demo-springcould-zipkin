## 基于springcloud、zkipin、kafka、elasticsearch实现的微服务调用链路跟踪demo  


### 一、安装zookeeper  
    http://zookeeper.apache.org/doc/current/zookeeperStarted.html

### 二、安装kafka  
    http://kafka.apache.org/quickstart
    
### 三、安装elasticsearch  
https://www.elastic.co/guide/en/elasticsearch/reference/6.2/install-elasticsearch.html  

### 四、启动应用  
    1、启动zkipin-server服务
       ServerZipkinApplication
       
    2、启动service-provider服务
        ServiceProviderApplication
        
    3、启动service-consumer服务
        ServiceConsumerApplication
    
    4、打开游览器访问服务消费方
        访问http://localhost:8765/hi?name=lisi
        
    5、访问zipkin server
        http://localhost:9411