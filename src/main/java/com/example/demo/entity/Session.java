/**
 * 
 */
package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.redis.core.RedisHash;

import lombok.Data;

/**
 * @author balaj
 *
 */

@Data
@RedisHash("session")
public class Session implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String contextPath;
	private List<String> sessionValue;
}
