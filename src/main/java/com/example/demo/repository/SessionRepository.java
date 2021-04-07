/**
 * 
 */
package com.example.demo.repository;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Session;

/**
 * @author balaj
 *
 */
@Repository
@Transactional
public class SessionRepository {
	
	private static final String KEY = "session";
	  
	  @Resource(name="redisTemplate")
	  private HashOperations<String,String,Session> hashOps;
	  
	  
	  public Session addSessionData (Session session) {
		  hashOps.put(KEY, session.getId(), session);
		  return session;
	  }
	  public Session getSessionData(String id) {
		  return hashOps.get(KEY, id);
	  }
};
