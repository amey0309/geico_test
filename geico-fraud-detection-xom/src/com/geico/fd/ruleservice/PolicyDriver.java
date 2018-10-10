/**
 * 
 */
package com.geico.fd.ruleservice;

/**
 * @author Amey_IBM
 *
 */
public class PolicyDriver {
	
	private String fullName;

	/**
	 * @param fullName
	 */
	public PolicyDriver(String fullName) {
		super();
		this.fullName = fullName;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PolicyDriver [fullName=");
		builder.append(fullName);
		builder.append("]");
		return builder.toString();
	}
	
	

}
