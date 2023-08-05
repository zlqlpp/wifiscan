# wifiscan

此项目参考 https://spring.io/projects/spring-boot 官网
https://spring.io/quickstart 教程生成基本的代码结构 ，
后google的方式加入 swagger,mybatis plus

加入dockerfile 用于运行在 云托管（不需要https，它会自动转换）。
执行 mvn的package  后，将target下的jar包 复制到根目录（修改的 pom里的plugin）