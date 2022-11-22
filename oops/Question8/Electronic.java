package com.oops.Question8;

public class Electronic {
	private String id;
	private String semiconductorType;
	private String dateOfManufacturing;

	public void ElectronicDisplay() {
		System.out.println("id is:" + id + " semiconductorType is:" + semiconductorType + " dateOfManufacturing Is:"
				+ dateOfManufacturing);
	}

	public Electronic(String id, String semiconductorType, String dateOfManufacturing) {
		super();
		this.id = id;
		this.semiconductorType = semiconductorType;
		this.dateOfManufacturing = dateOfManufacturing;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSemiconductorType() {
		return semiconductorType;
	}

	public void setSemiconductorType(String semiconductorType) {
		this.semiconductorType = semiconductorType;
	}

	public String getDateOfManufacturing() {
		return dateOfManufacturing;
	}

	public void setDateOfManufacturing(String dateOfManufacturing) {
		this.dateOfManufacturing = dateOfManufacturing;
	}
}
