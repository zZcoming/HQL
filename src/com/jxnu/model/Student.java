package com.jxnu.model;

import javax.persistence.*;

/**
 * Created by Administrator on 2016-3-14.
 */
@Entity
@Table(name = "s")
public class Student {
	private Integer id;
	private String name;
	private String address;

	public Student() {
	}

	@Id
	@GeneratedValue
	@Column(name = "s_id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "s_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "s_address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
