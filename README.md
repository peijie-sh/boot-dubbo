#try-spring-cloud

* eureka-server：服务注册中心
* eureka-servers-peer1：高可用服务注册中心1
* eureka-servers-peer2：高可用服务注册中心2
* eureka-client1：服务1，可获得服务实例的name
* eureka-client2：服务2，可获得服务实例的name
* eureka-consumer：服务3，通过注入`LoadBalancerClient`来间接均衡调用服务1/2
* eureka-consumer-ribbon：服务4，直接依赖`Ribbon`，使用`@LoadBalanced`实现负载均衡
* eureka-consumer-feign：服务5，依赖`Feign`（整合spring mvc和Ribbon），使用`@FeignClient`实现服务消费
* eureka-consumer-feign-upload：服务6，基于`Feign`接收文件
* eureka-consumer-ribbon-hystrix：服务7，服务熔断保护
* config-server：配置中心（可注册为服务，实现集群高可用）
* config-client：配置消费服务1（可集群高可用），用【POST】`/refresh`刷新中心的配置
* config-properties-repo：配置中心仓库
* hystrix-dashboard：hystrix监控图形界面（一直返回404无法连接，有待研究）
* api-gateway：zuul实现服务网关，最外层实现负载均衡和过滤（鉴权）
* stream-hello：继承消息驱动，使用rabbit实现（也支持kafka）

* config-client2：配置服务2
