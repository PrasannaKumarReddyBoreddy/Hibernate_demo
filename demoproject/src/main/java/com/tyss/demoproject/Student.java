package com.tyss.demoproject;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;
@Data
@Entity
public class Student implements Serializable {
	
	@Id
	@Column(name="s_id")
	private int sid;
	@Column (name="s_name")
	private String sName;
	@Column(name="s_marks")
	private double marks;
	

}
