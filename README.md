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
###더미 데이터
'''sql
INSERT INTO user (userid, PASSWORD, email, address) VALUES('jeong1','1234','jeong@22','부산');
INSERT INTO user (userid, PASSWORD, email, address) VALUES('jeong2','1234','jeong@33','부산1');
INSERT INTO user (userid, PASSWORD, email, address) VALUES('jeong3','1234','jeong@44','부산2');
INSERT INTO user (userid, PASSWORD, email, address) VALUES('jeong4','1234','jeong@55','부산3');
'''