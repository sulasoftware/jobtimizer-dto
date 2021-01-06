package com.sulasoftware.jobtimizerdto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "AssigneeDTO")
@XmlAccessorType (XmlAccessType.FIELD)
public class AssigneeDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String subject;
	private Integer freeTime;
	private List<String> skills;
	private List<String> certificates;
	private List<CaseDTO> assignedCases = new ArrayList<>(); // Is populated on the way back from OptaPlanner
	private String postcode;
	private Double[] coordinates;
	
	/**
	 * Adds a Case DTO to the assignee's assigned cases
	 * @param caseDTO
	 */
	public void appendCaseDTOToCaseList(CaseDTO caseDTO) {
		assignedCases.add(caseDTO);
	}
	
}
