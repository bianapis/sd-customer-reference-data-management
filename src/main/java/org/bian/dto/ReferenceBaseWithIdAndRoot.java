package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ReferenceBaseWithIdAndRoot
 */
public class ReferenceBaseWithIdAndRoot   {
  private String customerReferenceDataDirectoryEntryReference = null;

  private String referenceDirectoryEntryReference = null;

  private String customerReference = null;

  private String customerLegalEntityReference = null;

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

  private String corporateCustomerLegalEntityReference = null;

  private String corporateAddress = null;

  private String companyOfficerRole = null;

  private String companyOfficerReference = null;

  private String customerSinceDate = null;

  private Object customerReferenceRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReferenceDataDirectoryEntryReference
  **/

  public String getCustomerReferenceDataDirectoryEntryReference() {
    return customerReferenceDataDirectoryEntryReference;
  }

  public void setCustomerReferenceDataDirectoryEntryReference(String customerReferenceDataDirectoryEntryReference) {
    this.customerReferenceDataDirectoryEntryReference = customerReferenceDataDirectoryEntryReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return referenceDirectoryEntryReference
  **/

  public String getReferenceDirectoryEntryReference() {
    return referenceDirectoryEntryReference;
  }

  public void setReferenceDirectoryEntryReference(String referenceDirectoryEntryReference) {
    this.referenceDirectoryEntryReference = referenceDirectoryEntryReference;
  }


  /**
   * `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asParty) iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EwTfUMTGEeChad0JzLk7QA_-1978180945/elements/_EwTfUcTGEeChad0JzLk7QA_434950303) general-info: consumer 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asParty).Identification iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/_FNqJucTGEeChad0JzLk7QA_1357540588) 
   * @return customerLegalEntityReference
  **/

  public String getCustomerLegalEntityReference() {
    return customerLegalEntityReference;
  }

  public void setCustomerLegalEntityReference(String customerLegalEntityReference) {
    this.customerLegalEntityReference = customerLegalEntityReference;
  }


  /**
   * `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asParty).Identification.PartyName iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FEHzNMTGEeChad0JzLk7QA_-1382123937/elements/_FEHzN8TGEeChad0JzLk7QA_1608854558) 
   * @return customerNameSalutation
  **/

  public String getCustomerNameSalutation() {
    return customerNameSalutation;
  }

  public void setCustomerNameSalutation(String customerNameSalutation) {
    this.customerNameSalutation = customerNameSalutation;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNXOwMTGEeChad0JzLk7QA_-1677946147/elements/_wetlYA93EeGeV5vP7Mvdig_1485186470) general-info: social security number 
   * @return governmentIssuedIdentityReference
  **/

  public String getGovernmentIssuedIdentityReference() {
    return governmentIssuedIdentityReference;
  }

  public void setGovernmentIssuedIdentityReference(String governmentIssuedIdentityReference) {
    this.governmentIssuedIdentityReference = governmentIssuedIdentityReference;
  }


  /**
   * `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asPerson).PersonIdentification iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E7VDkcTGEeChad0JzLk7QA_-2076942625/elements/_E7VDksTGEeChad0JzLk7QA_-855295891) general-info: driving license/passport details 
   * @return governmentIssuedDocumentDetails
  **/

  public String getGovernmentIssuedDocumentDetails() {
    return governmentIssuedDocumentDetails;
  }

  public void setGovernmentIssuedDocumentDetails(String governmentIssuedDocumentDetails) {
    this.governmentIssuedDocumentDetails = governmentIssuedDocumentDetails;
  }


  /**
   * `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asPerson).ResidentialStatus iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNXOwMTGEeChad0JzLk7QA_-1677946147/elements/_FNXOxsTGEeChad0JzLk7QA_-1496564084) 
   * @return residencyStatus
  **/

  public String getResidencyStatus() {
    return residencyStatus;
  }

  public void setResidencyStatus(String residencyStatus) {
    this.residencyStatus = residencyStatus;
  }


  /**
   * `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asPerson).BirthDate iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNXOwMTGEeChad0JzLk7QA_-1677946147/elements/_FNXOwcTGEeChad0JzLk7QA_-1677946145) 
   * @return dateOfBirth
  **/

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  /**
   * `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asParty)(asPerson).Nationality iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNXOwMTGEeChad0JzLk7QA_-1677946147/elements/_FNXOxMTGEeChad0JzLk7QA_-1677946132) `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asPerson).PlaceOfBirth iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNXOwMTGEeChad0JzLk7QA_-1677946147/elements/_FNXOyMTGEeChad0JzLk7QA_-1037578805) 
   * @return nationality
  **/

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  /**
   * `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asParty).Residence iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/_FNz6sMTGEeChad0JzLk7QA_1111100108) 
   * @return residentialAddress
  **/

  public String getResidentialAddress() {
    return residentialAddress;
  }

  public void setResidentialAddress(String residentialAddress) {
    this.residentialAddress = residentialAddress;
  }


  /**
   * `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asParty).ContactPoint(asElectronicAddress) iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/_FEHzOMTGEeChad0JzLk7QA_-1894201405) `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asParty).ContactPoint(asElectronicAddress) iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FQ8HM8TGEeChad0JzLk7QA_1582936206) 
   * @return emailAddress
  **/

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  /**
   * `status: Registered`  bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asParty).ContactPoint(asPhoneAddress)  iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/_FEHzOMTGEeChad0JzLk7QA_-1894201405)  `status: Registered`  bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asParty).ContactPoint(asPhoneAddress)  iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNz6usTGEeChad0JzLk7QA_352593535) 
   * @return cellPhoneNumber
  **/

  public String getCellPhoneNumber() {
    return cellPhoneNumber;
  }

  public void setCellPhoneNumber(String cellPhoneNumber) {
    this.cellPhoneNumber = cellPhoneNumber;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asParty).ContactPoint(asElectronicAddress).SocialNetworkAddress `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asParty).ContactPoint(asElectronicAddress).SocialNetworkAddress iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/_FEHzOMTGEeChad0JzLk7QA_-1894201405) 
   * @return socialNetworkContacts
  **/

  public String getSocialNetworkContacts() {
    return socialNetworkContacts;
  }

  public void setSocialNetworkContacts(String socialNetworkContacts) {
    this.socialNetworkContacts = socialNetworkContacts;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return politicalExposureType
  **/

  public String getPoliticalExposureType() {
    return politicalExposureType;
  }

  public void setPoliticalExposureType(String politicalExposureType) {
    this.politicalExposureType = politicalExposureType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Binary 
   * @return politicalExposureRecord
  **/

  public Object getPoliticalExposureRecord() {
    return politicalExposureRecord;
  }

  public void setPoliticalExposureRecord(Object politicalExposureRecord) {
    this.politicalExposureRecord = politicalExposureRecord;
  }


  /**
   * `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asOrganisation) iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EwTfUMTGEeChad0JzLk7QA_-1978180945/elements/_EwTfUcTGEeChad0JzLk7QA_434950303) `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asOrganisation) iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNg_x8TGEeChad0JzLk7QA_908383601) general-info: Company 
   * @return corporateCustomerReference
  **/

  public String getCorporateCustomerReference() {
    return corporateCustomerReference;
  }

  public void setCorporateCustomerReference(String corporateCustomerReference) {
    this.corporateCustomerReference = corporateCustomerReference;
  }


  /**
   * `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asOrganisation).OrganisationIdentification(asPartyIdentificationInformation).LEI iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FEHzNMTGEeChad0JzLk7QA_-1382123937/elements/_yagFILl5EeOpCN0IL2Swqw) 
   * @return corporateCustomerLegalEntityReference
  **/

  public String getCorporateCustomerLegalEntityReference() {
    return corporateCustomerLegalEntityReference;
  }

  public void setCorporateCustomerLegalEntityReference(String corporateCustomerLegalEntityReference) {
    this.corporateCustomerLegalEntityReference = corporateCustomerLegalEntityReference;
  }


  /**
   * `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asOrganisation).PlaceOfOperation iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNg_x8TGEeChad0JzLk7QA_908383601/elements/_FNqJtcTGEeChad0JzLk7QA_-1846259904) `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asOrganisation).PlaceOfRegistration iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNg_x8TGEeChad0JzLk7QA_908383601/elements/_FNqJtMTGEeChad0JzLk7QA_-847083437) 
   * @return corporateAddress
  **/

  public String getCorporateAddress() {
    return corporateAddress;
  }

  public void setCorporateAddress(String corporateAddress) {
    this.corporateAddress = corporateAddress;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer.RelationshipManager `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer.RelationshipManager iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EwKVZ8TGEeChad0JzLk7QA_-1034255710) 
   * @return companyOfficerRole
  **/

  public String getCompanyOfficerRole() {
    return companyOfficerRole;
  }

  public void setCompanyOfficerRole(String companyOfficerRole) {
    this.companyOfficerRole = companyOfficerRole;
  }


  /**
   * `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer.RelationshipManager(asRole).Player(asPerson) iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EwTfUMTGEeChad0JzLk7QA_-1978180945/elements/_EwTfUcTGEeChad0JzLk7QA_434950303) `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer.RelationshipManager(asRole).Player(asPerson) iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNXOwMTGEeChad0JzLk7QA_-1677946147) 
   * @return companyOfficerReference
  **/

  public String getCompanyOfficerReference() {
    return companyOfficerReference;
  }

  public void setCompanyOfficerReference(String companyOfficerReference) {
    this.companyOfficerReference = companyOfficerReference;
  }


  /**
   * `status: Provisionally Registered`   bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).ApplicablePeriod.FromDateTime   `status: Registered`   bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).ApplicablePeriod.FromDateTime   iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FJ8HVcTGEeChad0JzLk7QA_726404707) 
   * @return customerSinceDate
  **/

  public String getCustomerSinceDate() {
    return customerSinceDate;
  }

  public void setCustomerSinceDate(String customerSinceDate) {
    this.customerSinceDate = customerSinceDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Binary 
   * @return customerReferenceRecord
  **/

  public Object getCustomerReferenceRecord() {
    return customerReferenceRecord;
  }

  public void setCustomerReferenceRecord(Object customerReferenceRecord) {
    this.customerReferenceRecord = customerReferenceRecord;
  }


}

