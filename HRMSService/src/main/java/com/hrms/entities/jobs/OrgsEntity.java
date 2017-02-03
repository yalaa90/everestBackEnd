package com.hrms.entities.jobs;

import javax.persistence.Entity;

import org.hibernate.annotations.Type;

import com.hrms.entities.core.BaseEntityCodeName;

@Entity
public class OrgsEntity  extends BaseEntityCodeName{

	Boolean status;
	
	@Type(type="org.hibernate.type.StringNVarcharType")
	String note;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
}
