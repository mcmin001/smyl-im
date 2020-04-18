# smyl-im
基于java NIO实现的一个即时通讯系统。
#### 核心
- niohdl包：核心网络库，以多路复用的模式实现消息接收与发送。
#### 服务端
- Server：服务启动入口；
- SvrFrame：服务启动框架的具体实现，包括监听客户端连接，启动关闭核心服务方法等；
- clihdl.ClientHandler：继承核心包中的Connector类，处理客户端的消息收发。每一个已连接的客户端对应一个ClientHandler对象。
#### 客户端
- 客户端以及压测代码都在test模块中。