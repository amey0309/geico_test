/**
 * 
 */
package com.geico.fd.ruleservice;

import java.util.Date;

/**
 * @author Amey_IBM
 *
 */
public class PolicyDetails {
	
	private String policyNumber;
	
	private Date coverageStartDate;
	
	private Date coverageEndDate;
	
	private boolean isCollisionIncluded;
	
	private boolean isComprehensiveIncluded;
	
	private Date policyChangeDate;
	
	private boolean isCollisionChanged;
	
	private boolean isComprehensiveChanged;

	/**
	 * @param policyNumber
	 * @param coverageStartDate
	 * @param coverageEndDate
	 * @param isCollisionIncluded
	 * @param isComprehensiveIncluded
	 * @param policyChangeDate
	 * @param isCollisionChanged
	 * @param isComprehensiveChanged
	 */
	public PolicyDetails(String policyNumber, Date coverageStartDate,
			Date coverageEndDate, boolean isCollisionIncluded,
			boolean isComprehensiveIncluded, Date policyChangeDate,
			boolean isCollisionChanged, boolean isComprehensiveChanged) {
		super();
		this.policyNumber = policyNumber;
		this.coverageStartDate = coverageStartDate;
		this.coverageEndDate = coverageEndDate;
		this.isCollisionIncluded = isCollisionIncluded;
		this.isComprehensiveIncluded = isComprehensiveIncluded;
		this.policyChangeDate = policyChangeDate;
		this.isCollisionChanged = isCollisionChanged;
		this.isComprehensiveChanged = isComprehensiveChanged;
	}

	/**
	 * @return the policyNumber
	 */
	public String getPolicyNumber() {
		return policyNumber;
	}

	/**
	 * @param policyNumber the policyNumber to set
	 */
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	/**
	 * @return the coverageStartDate
	 */
	public Date getCoverageStartDate() {
		return coverageStartDate;
	}

	/**
	 * @param coverageStartDate the coverageStartDate to set
	 */
	public void setCoverageStartDate(Date coverageStartDate) {
		this.coverageStartDate = coverageStartDate;
	}

	/**
	 * @return the coverageEndDate
	 */
	public Date getCoverageEndDate() {
		return coverageEndDate;
	}

	/**
	 * @param coverageEndDate the coverageEndDate to set
	 */
	public void setCoverageEndDate(Date coverageEndDate) {
		this.coverageEndDate = coverageEndDate;
	}

	/**
	 * @return the isCollisionIncluded
	 */
	public boolean isCollisionIncluded() {
		return isCollisionIncluded;
	}

	/**
	 * @param isCollisionIncluded the isCollisionIncluded to set
	 */
	public void setCollisionIncluded(boolean isCollisionIncluded) {
		this.isCollisionIncluded = isCollisionIncluded;
	}

	/**
	 * @return the isComprehensiveIncluded
	 */
	public boolean isComprehensiveIncluded() {
		return isComprehensiveIncluded;
	}

	/**
	 * @param isComprehensiveIncluded the isComprehensiveIncluded to set
	 */
	public void setComprehensiveIncluded(boolean isComprehensiveIncluded) {
		this.isComprehensiveIncluded = isComprehensiveIncluded;
	}

	/**
	 * @return the policyChangeDate
	 */
	public Date getPolicyChangeDate() {
		return policyChangeDate;
	}

	/**
	 * @param policyChangeDate the policyChangeDate to set
	 */
	public void setPolicyChangeDate(Date policyChangeDate) {
		this.policyChangeDate = policyChangeDate;
	}

	/**
	 * @return the isCollisionChanged
	 */
	public boolean isCollisionChanged() {
		return isCollisionChanged;
	}

	/**
	 * @param isCollisionChanged the isCollisionChanged to set
	 */
	public void setCollisionChanged(boolean isCollisionChanged) {
		this.isCollisionChanged = isCollisionChanged;
	}

	/**
	 * @return the isComprehensiveChanged
	 */
	public boolean isComprehensiveChanged() {
		return isComprehensiveChanged;
	}

	/**
	 * @param isComprehensiveChanged the isComprehensiveChanged to set
	 */
	public void setComprehensiveChanged(boolean isComprehensiveChanged) {
		this.isComprehensiveChanged = isComprehensiveChanged;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PolicyDetails [policyNumber=");
		builder.append(policyNumber);
		builder.append(", coverageStartDate=");
		builder.append(coverageStartDate);
		builder.append(", coverageEndDate=");
		builder.append(coverageEndDate);
		builder.append(", isCollisionIncluded=");
		builder.append(isCollisionIncluded);
		builder.append(", isComprehensiveIncluded=");
		builder.append(isComprehensiveIncluded);
		builder.append(", policyChangeDate=");
		builder.append(policyChangeDate);
		builder.append(", isCollisionChanged=");
		builder.append(isCollisionChanged);
		builder.append(", isComprehensiveChanged=");
		builder.append(isComprehensiveChanged);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
