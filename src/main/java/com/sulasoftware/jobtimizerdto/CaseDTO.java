package com.sulasoftware.jobtimizerdto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "CaseDTO")
@XmlAccessorType (XmlAccessType.FIELD)
public class CaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String subject;
	private Integer duration;
	private List<String> activityTypes;
	private List<String> certifications;
	private String postcode;
	private Double[] coordinates;
	private String alreadyAllocatedAssigneeId;
	private Boolean alreadyAllocated;
	private Integer allocationOrder;
	private String allocationBatchId;

}
