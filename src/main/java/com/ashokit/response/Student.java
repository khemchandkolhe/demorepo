package com.ashokit.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
	@XmlElement(name="Student-Id")
	private Integer studentId;
	@XmlElement(name="Student-Name")
	private String studentName;
	@XmlElement(name="Student-Skill")
	private String studentSkill;
	

}
