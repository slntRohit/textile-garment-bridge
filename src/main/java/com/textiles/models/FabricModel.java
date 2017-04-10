package com.textiles.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "FABRICS")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FabricModel {

	@Id
	@GeneratedValue
	@Column(name = "PK_FABRIC_ID")
	Long id;
	
	@Column(name = "NAME")
	String name;
	
	@Column(name = "TYPE_WEAVE")
	String weaveType;
	
	@Column(name = "TYPE_YARN")
	String yarnType;
	
	@Column(name = "WIDTH")
	Double width;
	
	@Column(name = "LENGTH")
	Double length;
	
	@Column(name = "PRICE")
	Double price;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "FK_SELLER_ID")
	SellerModel seller;

}
