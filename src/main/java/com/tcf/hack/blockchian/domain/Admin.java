package com.tcf.hack.blockchian.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tcf.hack.blockchian.domain.AbstractAuditingEntity;

@Entity
@Table(name = "admin")
public class Admin extends AbstractAuditingEntity implements Serializable
{


	@Override
	public String toString() {
		return "Admin [id=" + id + ", lastName=" + lastName + ", flag=" + flag + ", cust_id=" + cust_id + "]";
	}


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
  
    @Size(min = 1, max = 50)
    @Column(name = "last_name",length = 50)
    private String lastName;

    @JsonIgnore
    @Column(name = "flag")
    private boolean flag;
    

    

	@JsonIgnore
    @Column(name = "cust_id")
    private Long cust_id;
	public Long getCust_id() {
		return cust_id;
	}


	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public boolean isFlag() {
		return flag;
	}


	public void setFlag(boolean flag) {
		this.flag = flag;
	}


	

	


}
