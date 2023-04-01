package com.tasukuinc.tasukucore.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Table (name = "sprint")
@Data
public class Sprint {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "sprint_id")
	private long id;

	@Column (name = "from_date")
	private Date fromDate;

	@Column (name = "to_date")
	private Date toDate;

	@ManyToOne
	private Project project;
}