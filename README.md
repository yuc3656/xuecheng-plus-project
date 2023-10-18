# xuecheng-plus-project
黑马程序员-学成在线项目实战，基于SpringCloud、SpringCloudAlibaba

## centos7 安装docker
https://blog.csdn.net/u013481793/article/details/128189113

## docker 脚本备忘
```shell
## mysql
docker run --restart=always \
--name mysql --privileged=true \
-p 3306:3306 \
-v /root/Docker/WorkSpace/MySQL/conf/my.cnf:/etc/mysql/my.cnf \
-v /root/Docker/WorkSpace/MySQL/logs:/logs \
-v /root/Docker/WorkSpace/MySQL/data:/var/lib/mysql \
-e MYSQL_ROOT_PASSWORD=123456 \
-d mysql:8.0.29

### redis
docker run -it \
--name redis_6379 \
--privileged \
-p 6379:6379 \
-v /root/Docker/Redis/redis/6379/conf/redis.conf:/usr/local/etc/redis/redis.conf \
-v /root/Docker/Redis/redis/6379/data/:/data \
-v /root/Docker/Redis/redis/6379/log/redis.log:/var/log/redis.log \
-d redis:6.2.7 
```

## 虚拟机静态ip配置
```shell
# 本机查看网关ip
cd /Library/Preferences/VMware\ Fusion
# 进入vmnet3
cd vmnet3
# 查看nat.conf nat gateway address
sudo vim nat.conf
```
![](/Users/yuc/Library/Mobile Documents/com~apple~CloudDocs/Screenshot/截屏2023-10-18 14.03.59.png)

```shell
# 进入虚拟机
cd /etc/sysconfig/network-scripts/

vim ifcfg-ens33

# GATEWAY 要和本机上的网关保持一致
```
![](/Users/yuc/Library/Mobile Documents/com~apple~CloudDocs/资源素材/技术文档/20210715135608389.png)
```shell
# 重启网络
systemctl restart network
```
