package com.study.dbapp.domain.web;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.study.dbapp.domain.post.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{
	
	@Query(value ="select * from post p left outer join user u on u.id= p.user_id", nativeQuery=true)
	Post findByUserId(int user_id);
}
