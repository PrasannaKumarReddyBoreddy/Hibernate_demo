package com.tyss.demoproject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Emp implements Serializable {
	@Id
	@Column
	private int empid;
	@Column
	private String ename;
	

}
