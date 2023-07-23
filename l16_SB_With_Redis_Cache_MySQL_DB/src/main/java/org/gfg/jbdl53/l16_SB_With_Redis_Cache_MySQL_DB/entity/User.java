package org.gfg.jbdl53.l16_SB_With_Redis_Cache_MySQL_DB.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int followers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFollowers() {
		return followers;
	}
	public void setFollowers(int followers) {
		this.followers = followers;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", followers=" + followers + "]";
	}
	public User(int id, String name, int followers) {
		super();
		this.id = id;
		this.name = name;
		this.followers = followers;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
