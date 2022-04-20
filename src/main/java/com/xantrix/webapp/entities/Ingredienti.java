package com.xantrix.webapp.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "INGREDIENTI")
@Data
public class Ingredienti implements Serializable{

	
	private static final long serialVersionUID = 5847787496903001925L;
	
		@Id
		@Column(name = "CODART")
		private String codart;
		
		@Column(name = "INFO")
		private String info;

}
