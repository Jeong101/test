# DB APP

##데이터베이스 생성방법
```SQL
CREATE USER 'study'@'%' IDENTIFIED BY 'study1234';
GRANT ALL PRIVILEGES ON *.* TO 'study'@'%';
CREATE DATABASE studydb;
```

###의존성 추가
```
<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
			<version>1.2</version>
		</dependency>
		<dependency>
			<groupId>org.apache.tomcat</groupId>
			<artifactId>tomcat-jasper</artifactId>
			<version>9.0.46</version>
		</dependency>
```
