/**
 * 
 */
package com.geico.fd.ruleservice;

import java.util.List;

/**
 * @author Amey_IBM
 *
 */
public class RulesServiceRequest {
	
	private List<PolicyVehicle> policyVehicles;
	
	private List<PolicyDriver> policyDrivers;
	
	private ClaimDetails claim;
	
	private PolicyDetails policy;

	/**
	 * @param policyVehicles
	 * @param policyDrivers
	 * @param claim
	 * @param policy
	 */
	public RulesServiceRequest(List<PolicyVehicle> policyVehicles,
			List<PolicyDriver> policyDrivers, ClaimDetails claim,
			PolicyDetails policy) {
		super();
		this.policyVehicles = policyVehicles;
		this.policyDrivers = policyDrivers;
		this.claim = claim;
		this.policy = policy;
	}

	/**
	 * @return the policyVehicles
	 */
	public List<PolicyVehicle> getPolicyVehicles() {
		return policyVehicles;
	}

	/**
	 * @param policyVehicles the policyVehicles to set
	 */
	public void setPolicyVehicles(List<PolicyVehicle> policyVehicles) {
		this.policyVehicles = policyVehicles;
	}

	/**
	 * @return the policyDrivers
	 */
	public List<PolicyDriver> getPolicyDrivers() {
		return policyDrivers;
	}

	/**
	 * @param policyDrivers the policyDrivers to set
	 */
	public void setPolicyDrivers(List<PolicyDriver> policyDrivers) {
		this.policyDrivers = policyDrivers;
	}

	/**
	 * @return the claim
	 */
	public ClaimDetails getClaim() {
		return claim;
	}

	/**
	 * @param claim the claim to set
	 */
	public void setClaim(ClaimDetails claim) {
		this.claim = claim;
	}

	/**
	 * @return the policy
	 */
	public PolicyDetails getPolicy() {
		return policy;
	}

	/**
	 * @param policy the policy to set
	 */
	public void setPolicy(PolicyDetails policy) {
		this.policy = policy;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RulesServiceRequest [policyVehicles=");
		builder.append(policyVehicles);
		builder.append(", policyDrivers=");
		builder.append(policyDrivers);
		builder.append(", claim=");
		builder.append(claim);
		builder.append(", policy=");
		builder.append(policy);
		builder.append("]");
		return builder.toString();
	}

	
	
}
