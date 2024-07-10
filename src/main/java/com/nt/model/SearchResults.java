package com.nt.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchResults {
	
	private Integer courseId;
	private String courseName;
	private String location;
	private String courseCategory;
	private String facultyName;
	private Double fee;
	private Long adaminContact;
	private String trainingMode;
	private LocalDateTime startDate;
	private String courseStatus;
	
	

}







