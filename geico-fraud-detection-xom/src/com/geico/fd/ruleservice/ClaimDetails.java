/**
 * 
 */
package com.geico.fd.ruleservice;

import java.sql.Time;
import java.util.Date;



/**
 * @author Amey_IBM
 *
 */
public class ClaimDetails {

	private String claimantName;
	
	private boolean isClaimantGeico;
	
	private String claimantPolicyNumber;
	
	private Date incidentDate;
	
	private Time incidentTime;
	
	private boolean isRentalVehicleInvolved;
	
	private String vehicleMakeInvolved;
	
	private String vehicleModelInvolved;
	
	private long vehicleYearInvolved;
	
	private String vinOfVehicleInvolved;
	
	private boolean isClaimantOnWatch;
	
	private boolean isCollisionClaim;
	
	private boolean isComprehensiveClaim;
	
	private boolean isPhysicalDamageClaim;
	
	private int totalNumberOfCollisionClaims;
	
	private int totalNumberOfComprehensiveClaims;
	
	private int totalNumberOfPhysicalDamageClaims;
	
	private Date repairDateOfVehicle;

	/**
	 * @param claimantName
	 * @param isClaimantGeico
	 * @param claimantPolicyNumber
	 * @param incidentDate
	 * @param incidentTime
	 * @param isRentalVehicleInvolved
	 * @param vehicleMakeInvolved
	 * @param vehicleModelInvolved
	 * @param vehicleYearInvolved
	 * @param vinOfVehicleInvolved
	 * @param isClaimantOnWatch
	 * @param isCollisionClaim
	 * @param isComprehensiveClaim
	 * @param isPhysicalDamageClaim
	 * @param totalNumberOfCollisionClaims
	 * @param totalNumberOfComprehensiveClaims
	 * @param totalNumberOfPhysicalDamageClaims
	 * @param repairDateOfVehicle
	 */
	public ClaimDetails(String claimantName, boolean isClaimantGeico,
			String claimantPolicyNumber, Date incidentDate, Time incidentTime,
			boolean isRentalVehicleInvolved, String vehicleMakeInvolved,
			String vehicleModelInvolved, long vehicleYearInvolved,
			String vinOfVehicleInvolved, boolean isClaimantOnWatch,
			boolean isCollisionClaim, boolean isComprehensiveClaim,
			boolean isPhysicalDamageClaim, int totalNumberOfCollisionClaims,
			int totalNumberOfComprehensiveClaims,
			int totalNumberOfPhysicalDamageClaims, Date repairDateOfVehicle) {
		super();
		this.claimantName = claimantName;
		this.isClaimantGeico = isClaimantGeico;
		this.claimantPolicyNumber = claimantPolicyNumber;
		this.incidentDate = incidentDate;
		this.incidentTime = incidentTime;
		this.isRentalVehicleInvolved = isRentalVehicleInvolved;
		this.vehicleMakeInvolved = vehicleMakeInvolved;
		this.vehicleModelInvolved = vehicleModelInvolved;
		this.vehicleYearInvolved = vehicleYearInvolved;
		this.vinOfVehicleInvolved = vinOfVehicleInvolved;
		this.isClaimantOnWatch = isClaimantOnWatch;
		this.isCollisionClaim = isCollisionClaim;
		this.isComprehensiveClaim = isComprehensiveClaim;
		this.isPhysicalDamageClaim = isPhysicalDamageClaim;
		this.totalNumberOfCollisionClaims = totalNumberOfCollisionClaims;
		this.totalNumberOfComprehensiveClaims = totalNumberOfComprehensiveClaims;
		this.totalNumberOfPhysicalDamageClaims = totalNumberOfPhysicalDamageClaims;
		this.repairDateOfVehicle = repairDateOfVehicle;
	}

	/**
	 * @return the claimantName
	 */
	public String getClaimantName() {
		return claimantName;
	}

	/**
	 * @param claimantName the claimantName to set
	 */
	public void setClaimantName(String claimantName) {
		this.claimantName = claimantName;
	}

	/**
	 * @return the isClaimantGeico
	 */
	public boolean isClaimantGeico() {
		return isClaimantGeico;
	}

	/**
	 * @param isClaimantGeico the isClaimantGeico to set
	 */
	public void setClaimantGeico(boolean isClaimantGeico) {
		this.isClaimantGeico = isClaimantGeico;
	}

	/**
	 * @return the claimantPolicyNumber
	 */
	public String getClaimantPolicyNumber() {
		return claimantPolicyNumber;
	}

	/**
	 * @param claimantPolicyNumber the claimantPolicyNumber to set
	 */
	public void setClaimantPolicyNumber(String claimantPolicyNumber) {
		this.claimantPolicyNumber = claimantPolicyNumber;
	}

	/**
	 * @return the incidentDate
	 */
	public Date getIncidentDate() {
		return incidentDate;
	}

	/**
	 * @param incidentDate the incidentDate to set
	 */
	public void setIncidentDate(Date incidentDate) {
		this.incidentDate = incidentDate;
	}

	/**
	 * @return the incidentTime
	 */
	public Time getIncidentTime() {
		return incidentTime;
	}

	/**
	 * @param incidentTime the incidentTime to set
	 */
	public void setIncidentTime(Time incidentTime) {
		this.incidentTime = incidentTime;
	}

	/**
	 * @return the isRentalVehicleInvolved
	 */
	public boolean isRentalVehicleInvolved() {
		return isRentalVehicleInvolved;
	}

	/**
	 * @param isRentalVehicleInvolved the isRentalVehicleInvolved to set
	 */
	public void setRentalVehicleInvolved(boolean isRentalVehicleInvolved) {
		this.isRentalVehicleInvolved = isRentalVehicleInvolved;
	}

	/**
	 * @return the vehicleMakeInvolved
	 */
	public String getVehicleMakeInvolved() {
		return vehicleMakeInvolved;
	}

	/**
	 * @param vehicleMakeInvolved the vehicleMakeInvolved to set
	 */
	public void setVehicleMakeInvolved(String vehicleMakeInvolved) {
		this.vehicleMakeInvolved = vehicleMakeInvolved;
	}

	/**
	 * @return the vehicleModelInvolved
	 */
	public String getVehicleModelInvolved() {
		return vehicleModelInvolved;
	}

	/**
	 * @param vehicleModelInvolved the vehicleModelInvolved to set
	 */
	public void setVehicleModelInvolved(String vehicleModelInvolved) {
		this.vehicleModelInvolved = vehicleModelInvolved;
	}

	/**
	 * @return the vehicleYearInvolved
	 */
	public long getVehicleYearInvolved() {
		return vehicleYearInvolved;
	}

	/**
	 * @param vehicleYearInvolved the vehicleYearInvolved to set
	 */
	public void setVehicleYearInvolved(long vehicleYearInvolved) {
		this.vehicleYearInvolved = vehicleYearInvolved;
	}

	/**
	 * @return the vinOfVehicleInvolved
	 */
	public String getVinOfVehicleInvolved() {
		return vinOfVehicleInvolved;
	}

	/**
	 * @param vinOfVehicleInvolved the vinOfVehicleInvolved to set
	 */
	public void setVinOfVehicleInvolved(String vinOfVehicleInvolved) {
		this.vinOfVehicleInvolved = vinOfVehicleInvolved;
	}

	/**
	 * @return the isClaimantOnWatch
	 */
	public boolean isClaimantOnWatch() {
		return isClaimantOnWatch;
	}

	/**
	 * @param isClaimantOnWatch the isClaimantOnWatch to set
	 */
	public void setClaimantOnWatch(boolean isClaimantOnWatch) {
		this.isClaimantOnWatch = isClaimantOnWatch;
	}

	/**
	 * @return the isCollisionClaim
	 */
	public boolean isCollisionClaim() {
		return isCollisionClaim;
	}

	/**
	 * @param isCollisionClaim the isCollisionClaim to set
	 */
	public void setCollisionClaim(boolean isCollisionClaim) {
		this.isCollisionClaim = isCollisionClaim;
	}

	/**
	 * @return the isComprehensiveClaim
	 */
	public boolean isComprehensiveClaim() {
		return isComprehensiveClaim;
	}

	/**
	 * @param isComprehensiveClaim the isComprehensiveClaim to set
	 */
	public void setComprehensiveClaim(boolean isComprehensiveClaim) {
		this.isComprehensiveClaim = isComprehensiveClaim;
	}

	/**
	 * @return the isPhysicalDamageClaim
	 */
	public boolean isPhysicalDamageClaim() {
		return isPhysicalDamageClaim;
	}

	/**
	 * @param isPhysicalDamageClaim the isPhysicalDamageClaim to set
	 */
	public void setPhysicalDamageClaim(boolean isPhysicalDamageClaim) {
		this.isPhysicalDamageClaim = isPhysicalDamageClaim;
	}

	/**
	 * @return the totalNumberOfCollisionClaims
	 */
	public int getTotalNumberOfCollisionClaims() {
		return totalNumberOfCollisionClaims;
	}

	/**
	 * @param totalNumberOfCollisionClaims the totalNumberOfCollisionClaims to set
	 */
	public void setTotalNumberOfCollisionClaims(int totalNumberOfCollisionClaims) {
		this.totalNumberOfCollisionClaims = totalNumberOfCollisionClaims;
	}

	/**
	 * @return the totalNumberOfComprehensiveClaims
	 */
	public int getTotalNumberOfComprehensiveClaims() {
		return totalNumberOfComprehensiveClaims;
	}

	/**
	 * @param totalNumberOfComprehensiveClaims the totalNumberOfComprehensiveClaims to set
	 */
	public void setTotalNumberOfComprehensiveClaims(
			int totalNumberOfComprehensiveClaims) {
		this.totalNumberOfComprehensiveClaims = totalNumberOfComprehensiveClaims;
	}

	/**
	 * @return the totalNumberOfPhysicalDamageClaims
	 */
	public int getTotalNumberOfPhysicalDamageClaims() {
		return totalNumberOfPhysicalDamageClaims;
	}

	/**
	 * @param totalNumberOfPhysicalDamageClaims the totalNumberOfPhysicalDamageClaims to set
	 */
	public void setTotalNumberOfPhysicalDamageClaims(
			int totalNumberOfPhysicalDamageClaims) {
		this.totalNumberOfPhysicalDamageClaims = totalNumberOfPhysicalDamageClaims;
	}

	/**
	 * @return the repairDateOfVehicle
	 */
	public Date getRepairDateOfVehicle() {
		return repairDateOfVehicle;
	}

	/**
	 * @param repairDateOfVehicle the repairDateOfVehicle to set
	 */
	public void setRepairDateOfVehicle(Date repairDateOfVehicle) {
		this.repairDateOfVehicle = repairDateOfVehicle;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClaimDetails [claimantName=");
		builder.append(claimantName);
		builder.append(", isClaimantGeico=");
		builder.append(isClaimantGeico);
		builder.append(", claimantPolicyNumber=");
		builder.append(claimantPolicyNumber);
		builder.append(", incidentDate=");
		builder.append(incidentDate);
		builder.append(", incidentTime=");
		builder.append(incidentTime);
		builder.append(", isRentalVehicleInvolved=");
		builder.append(isRentalVehicleInvolved);
		builder.append(", vehicleMakeInvolved=");
		builder.append(vehicleMakeInvolved);
		builder.append(", vehicleModelInvolved=");
		builder.append(vehicleModelInvolved);
		builder.append(", vehicleYearInvolved=");
		builder.append(vehicleYearInvolved);
		builder.append(", vinOfVehicleInvolved=");
		builder.append(vinOfVehicleInvolved);
		builder.append(", isClaimantOnWatch=");
		builder.append(isClaimantOnWatch);
		builder.append(", isCollisionClaim=");
		builder.append(isCollisionClaim);
		builder.append(", isComprehensiveClaim=");
		builder.append(isComprehensiveClaim);
		builder.append(", isPhysicalDamageClaim=");
		builder.append(isPhysicalDamageClaim);
		builder.append(", totalNumberOfCollisionClaims=");
		builder.append(totalNumberOfCollisionClaims);
		builder.append(", totalNumberOfComprehensiveClaims=");
		builder.append(totalNumberOfComprehensiveClaims);
		builder.append(", totalNumberOfPhysicalDamageClaims=");
		builder.append(totalNumberOfPhysicalDamageClaims);
		builder.append(", repairDateOfVehicle=");
		builder.append(repairDateOfVehicle);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
