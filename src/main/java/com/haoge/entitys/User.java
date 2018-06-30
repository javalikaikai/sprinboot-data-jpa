package com.haoge.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//使用JPA注解配置映射关系
@Entity//告诉jpa这是一个和数据库映射的实体类
@Table(name="tbl_user")//@Table来指定和哪个数据表对应;如果省略默认表名就是user;即默认表名为类名
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="last_name",length=16)
	private String lastName;
	@Column
	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return lastName;
	}

	public void setName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
