Problem
====================
### If an Exception "org.apache.phoenix.exception.PhoenixIOException: SYSTEM.CATALOG" is encountered  when run test case in your PC
	1 stop hbase Master and regionServers,and still keep ZK alive.
	2 bin/hbase clean --cleanZk 
	3 start Master and regionServers
	
### Create Table
	[create table use phoenix]
	apache-phoenix-4.8.0-HBase-1.2-bin/bin/psql.py localhost:2184 example.sql 
	apache-phoenix-4.8.0-HBase-1.2-bin/bin/psql.py localhost:2184 user_access.sql
	
	[mapping a exist table]
	execute command in hbase_shell.txt to create 'ARTICLE' table in hbase
	apache-phoenix-4.8.0-HBase-1.2-bin/bin/psql.py localhost:2184 article.sql
	
	
Hadoop(2.7.2) & Hbase()
====================

Hadoop Download & Install
-----------------------

### Dwonload

	[Apache Hadoop(2.7.2)](http://www.apache.org/dyn/closer.cgi/hadoop/common/hadoop-2.7.2/hadoop-2.7.2.tar.gz)
	
### Prerequisites

	Install Java and set JAVA_HOME "Env Variables"
	
### Install

	Hadoop Cluster Setup(集群模式)
	
	系统参数配置
	hadoop-2.7.1/etc/hadoop
	vi core-site.xml 
	<configuration>
  		<property>
    		<name>fs.defaultFS</name>
    		<value>hdfs://localhost:9000</value>
  		</property>
	</configuration>
	
	hdfs参数配置
	vi hdfs-site.xml
	<configuration>
  		<property>
    		<name>dfs.replication</name>
    		<value>1</value>
  		</property>
	</configuration>
	
	互信配置
	ssh to localhost without a passphrase
	
	cd 
	ssh-keygen -t dsa -P '' -f ~/.ssh/id_dsa
	cat ~/.ssh/id_dsa.pub >> ~/.ssh/authorized_keys
	chmod 0600 ~/.ssh/authorized_keys
	
	格式化文件系统
	Format the filesystem
	bin/hdfs namenode -format
	
	启动dfs
	Start NameNode daemon and DataNode daemon
	sbin/start-dfs.sh
	
	[web interface http://localhost:50070/](http://localhost:50070/)
	
	./hdfs dfs -mkdir -p /Users/xxxx/hadoop/dfs/
	
	Yarn配置
	Yarn
	cp mapred-site.xml.template mapred-site.xml 
	vi mapred-site.xml
	<configuration>
		<property>
        	<name>mapreduce.framework.name</name>
        	<value>yarn</value>
    	</property>
	</configuration>
	
	vi yarn-site.xml
	<configuration>
	    <property>
	    	<name>yarn.nodemanager.aux-services</name>
	        <value>mapreduce_shuffle</value>
	    </property>
	</configuration>
	
	启动Yarn
	$ sbin/start-yarn.sh
	[ResourceManager - http://localhost:8088/](http://localhost:8088/)
	
	
	
Hbase Download & Instanll
------------------------------------