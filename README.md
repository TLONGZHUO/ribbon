# ribbon
ribbon负载均衡


erueka + ribbon + executor + clienta
可实现
1.rest风格的feign服务调用(仿佛在调用本地函数)
2.erueka注册中心(zookeeper小伙伴.差别自行gg)
3.ribbon完成的负载均衡
clienta 为模拟的服务提供者 修改端口多次启动来为ribbon负载均衡模拟场景
