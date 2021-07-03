package com.study.dbapp.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository //원래는 JpaRepository에 annotation이 달려있어서 안달아도 무관
public interface UserRepository extends JpaRepository<User,Integer>{
	@Query(value="select * from user where userid = :userid",nativeQuery = true)
	User mFindByUserId(String userid);
	
	@Query(value="select * from user where userid = :userid AND password = :password",nativeQuery = true)
	User mLogin(String userid,String password);
}
