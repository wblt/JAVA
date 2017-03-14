###下载spring 
http://repo.springsource.org/libs-release-local/org/springframework/spring/

###下载commons-logging
http://commons.apache.org/proper/commons-logging/download_logging.cgi 点击commons-logging-1.2-bin.zip 下载解压

###新建一个TestSpring java project
在项目目录下新建一个libs文件夹 将springframework 下libs jar 包 和commons-logging-1.2下的commons-logging-1.2.jar拷到我们新建的libs里面 然后修改build path 添加依赖包

###添加主代码
1.在src新建一个bean包 和 测试包

###创建配置文件

###运行测试

###总结
这里我们并没有手动创建HelloWorldImpl的实例（对象），是Spring通过ApplicationContext帮我们创建的放在IoC容器里。ApplicationContext是一个IoC容器接口，它所创建的对象都称作是bean，也就是xml文件里的这行配置信息。getBean方法就是从IoC容器里取得这个对象（根据标识id 和类名class），然后我们就可以调用该类的方法。

咱们的Main类需要用到HelloWorldImpl类，也就是说Main类依赖于HelloWorldImpl类，但是Main自己不用创建HelloWorldImpl对象，而是交由IoC容器给我们主动创建，这就是通过配置文件实现了依赖注入。