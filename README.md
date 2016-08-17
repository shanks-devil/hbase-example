Hadoop(2.7.2) & Hbase()
====================

Hadoop Download & Install
-----------------------

### Dwonload

	[Apache Hadoop(2.7.2)](http://www.apache.org/dyn/closer.cgi/hadoop/common/hadoop-2.7.2/hadoop-2.7.2.tar.gz)
	
### Install

	Pseudo-Distributed Operation(为分布式)
	hadoop-2.7.1/etc/hadoop
	vi core-site.xml 
	<configuration>
  		<property>
    		<name>fs.defaultFS</name>
    		<value>hdfs://localhost:9000</value>
  		</property>
	</configuration>
	
	vi hdfs-site.xml
	<configuration>
  		<property>
    		<name>dfs.replication</name>
    		<value>1</value>
  		</property>
	</configuration>
	
	ssh to localhost without a passphrase
	
	cd 
	ssh-keygen -t dsa -P '' -f ~/.ssh/id_dsa
	cat ~/.ssh/id_dsa.pub >> ~/.ssh/authorized_keys
	chmod 0600 ~/.ssh/authorized_keys
	
	Format the filesystem
	bin/hdfs namenode -format
	
	Start NameNode daemon and DataNode daemon
	sbin/start-dfs.sh
	
	[web interface http://localhost:50070/](http://localhost:50070/)
	
	./hdfs dfs -mkdir -p /Users/xxxx/hadoop/dfs/
	
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
	
	$ sbin/start-yarn.sh
	[ResourceManager - http://localhost:8088/](http://localhost:8088/)
	
	
	
Hbase Download & Instanll
------------------------------------