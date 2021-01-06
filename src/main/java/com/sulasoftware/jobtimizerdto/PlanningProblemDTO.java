package com.sulasoftware.jobtimizerdto;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "PlanningProblemDTO")
@XmlAccessorType (XmlAccessType.FIELD)
public class PlanningProblemDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message = "Problem ID is empty, this is not allowed")
	private String id;
	
	@NotEmpty(message = "Case DTO is empty, this is not allowed")
	private List<CaseDTO> caseDTOs;
	
	@NotEmpty(message = "Assignee DTO is empty, this is not allowed")
	private List<AssigneeDTO> AssigneeDTOs;

}
