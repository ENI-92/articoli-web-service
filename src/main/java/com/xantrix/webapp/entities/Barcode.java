package com.xantrix.webapp.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "BARCODE")
@Data

public class Barcode implements Serializable{

	private static final long serialVersionUID = -1312650237252526296L;
	
	@Id
	@Column(name = "BARCODE")
	private String barcode;
	
	@Column(name = "IDTIPOART")
	private String idTipoART;
}
