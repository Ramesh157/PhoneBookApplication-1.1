package com.ramesh.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class Contact  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private Long contactNumber;
	private Date createdDate;
	private Date updatedDate;
	
	

}
