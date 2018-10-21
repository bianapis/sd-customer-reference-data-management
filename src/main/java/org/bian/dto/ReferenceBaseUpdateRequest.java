package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ReferenceBaseUpdateRequest
 */
public class ReferenceBaseUpdateRequest   {
  private String customerNameSalutation = null;

  private String governmentIssuedIdentityReference = null;

  private String governmentIssuedDocumentDetails = null;

  private String residencyStatus = null;

  private String dateOfBirth = null;

  private String nationality = null;

  private String residentialAddress = null;

  private String emailAddress = null;

  private String cellPhoneNumber = null;

  private String socialNetworkContacts = null;

  private String politicalExposureType = null;

  private Object politicalExposureRecord = null;

  private String corporateCustomerReference = null;

  private String corporateAddress = null;

  private String companyOfficerRole = null;

  private String companyOfficerReference = null;

  private String customerSinceDate = null;

  private Object customerReferenceRecord = null;


  /**
   * Get customerNameSalutation
   * @return customerNameSalutation
  **/

  public String getCustomerNameSalutation() {
    return customerNameSalutation;
  }

  public void setCustomerNameSalutation(String customerNameSalutation) {
    this.customerNameSalutation = customerNameSalutation;
  }


  /**
   * Get governmentIssuedIdentityReference
   * @return governmentIssuedIdentityReference
  **/

  public String getGovernmentIssuedIdentityReference() {
    return governmentIssuedIdentityReference;
  }

  public void setGovernmentIssuedIdentityReference(String governmentIssuedIdentityReference) {
    this.governmentIssuedIdentityReference = governmentIssuedIdentityReference;
  }


  /**
   * Get governmentIssuedDocumentDetails
   * @return governmentIssuedDocumentDetails
  **/

  public String getGovernmentIssuedDocumentDetails() {
    return governmentIssuedDocumentDetails;
  }

  public void setGovernmentIssuedDocumentDetails(String governmentIssuedDocumentDetails) {
    this.governmentIssuedDocumentDetails = governmentIssuedDocumentDetails;
  }


  /**
   * Get residencyStatus
   * @return residencyStatus
  **/

  public String getResidencyStatus() {
    return residencyStatus;
  }

  public void setResidencyStatus(String residencyStatus) {
    this.residencyStatus = residencyStatus;
  }


  /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  /**
   * Get nationality
   * @return nationality
  **/

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  /**
   * Get residentialAddress
   * @return residentialAddress
  **/

  public String getResidentialAddress() {
    return residentialAddress;
  }

  public void setResidentialAddress(String residentialAddress) {
    this.residentialAddress = residentialAddress;
  }


  /**
   * Get emailAddress
   * @return emailAddress
  **/

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  /**
   * Get cellPhoneNumber
   * @return cellPhoneNumber
  **/

  public String getCellPhoneNumber() {
    return cellPhoneNumber;
  }

  public void setCellPhoneNumber(String cellPhoneNumber) {
    this.cellPhoneNumber = cellPhoneNumber;
  }


  /**
   * Get socialNetworkContacts
   * @return socialNetworkContacts
  **/

  public String getSocialNetworkContacts() {
    return socialNetworkContacts;
  }

  public void setSocialNetworkContacts(String socialNetworkContacts) {
    this.socialNetworkContacts = socialNetworkContacts;
  }


  /**
   * Get politicalExposureType
   * @return politicalExposureType
  **/

  public String getPoliticalExposureType() {
    return politicalExposureType;
  }

  public void setPoliticalExposureType(String politicalExposureType) {
    this.politicalExposureType = politicalExposureType;
  }


  /**
   * Get politicalExposureRecord
   * @return politicalExposureRecord
  **/

  public Object getPoliticalExposureRecord() {
    return politicalExposureRecord;
  }

  public void setPoliticalExposureRecord(Object politicalExposureRecord) {
    this.politicalExposureRecord = politicalExposureRecord;
  }


  /**
   * Get corporateCustomerReference
   * @return corporateCustomerReference
  **/

  public String getCorporateCustomerReference() {
    return corporateCustomerReference;
  }

  public void setCorporateCustomerReference(String corporateCustomerReference) {
    this.corporateCustomerReference = corporateCustomerReference;
  }


  /**
   * Get corporateAddress
   * @return corporateAddress
  **/

  public String getCorporateAddress() {
    return corporateAddress;
  }

  public void setCorporateAddress(String corporateAddress) {
    this.corporateAddress = corporateAddress;
  }


  /**
   * Get companyOfficerRole
   * @return companyOfficerRole
  **/

  public String getCompanyOfficerRole() {
    return companyOfficerRole;
  }

  public void setCompanyOfficerRole(String companyOfficerRole) {
    this.companyOfficerRole = companyOfficerRole;
  }


  /**
   * Get companyOfficerReference
   * @return companyOfficerReference
  **/

  public String getCompanyOfficerReference() {
    return companyOfficerReference;
  }

  public void setCompanyOfficerReference(String companyOfficerReference) {
    this.companyOfficerReference = companyOfficerReference;
  }


  /**
   * Get customerSinceDate
   * @return customerSinceDate
  **/

  public String getCustomerSinceDate() {
    return customerSinceDate;
  }

  public void setCustomerSinceDate(String customerSinceDate) {
    this.customerSinceDate = customerSinceDate;
  }


  /**
   * Get customerReferenceRecord
   * @return customerReferenceRecord
  **/

  public Object getCustomerReferenceRecord() {
    return customerReferenceRecord;
  }

  public void setCustomerReferenceRecord(Object customerReferenceRecord) {
    this.customerReferenceRecord = customerReferenceRecord;
  }


}

