/**
 * 
 */
package com.geico.fd.ruleservice;

import java.util.Date;

/**
 * @author Amey_IBM
 *
 */
public class PolicyVehicle {
	
	private String model;
	
	private String make;
	
	private long year;
	
	private String vin;

	private Date inspectionDate;

	/**
	 * @param model
	 * @param make
	 * @param year
	 * @param vin
	 * @param inspectionDate
	 */
	public PolicyVehicle(String model, String make, long year, String vin,
			Date inspectionDate) {
		super();
		this.model = model;
		this.make = make;
		this.year = year;
		this.vin = vin;
		this.inspectionDate = inspectionDate;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the year
	 */
	public long getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(long year) {
		this.year = year;
	}

	/**
	 * @return the vin
	 */
	public String getVin() {
		return vin;
	}

	/**
	 * @param vin the vin to set
	 */
	public void setVin(String vin) {
		this.vin = vin;
	}

	/**
	 * @return the inspectionDate
	 */
	public Date getInspectionDate() {
		return inspectionDate;
	}

	/**
	 * @param inspectionDate the inspectionDate to set
	 */
	public void setInspectionDate(Date inspectionDate) {
		this.inspectionDate = inspectionDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PolicyVehicle [model=");
		builder.append(model);
		builder.append(", make=");
		builder.append(make);
		builder.append(", year=");
		builder.append(year);
		builder.append(", vin=");
		builder.append(vin);
		builder.append(", inspectionDate=");
		builder.append(inspectionDate);
		builder.append("]");
		return builder.toString();
	}
	
	
}
