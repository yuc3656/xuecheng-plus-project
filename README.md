# xuecheng-plus-project
黑马程序员-学成在线项目实战，基于SpringCloud、SpringCloudAlibaba

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

