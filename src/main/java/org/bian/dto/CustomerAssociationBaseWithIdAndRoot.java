package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerAssociationBaseWithIdAndRoot
 */
public class CustomerAssociationBaseWithIdAndRoot   {
  private String customerReferenceDataDirectoryEntryReference = null;

  private String associationsDirectoryEntryReference = null;

  private String customerReference = null;

  private String employeeReference = null;

  private String associateType = null;

  private String associateReference = null;

  private String associateObligationDependencyDescription = null;

  private String associationValidFromTo = null;

  private String productInstanceReference = null;

  private String preferredBeneficiary = null;

  private String proxyRepresentativePowerOfAttorneyReference = null;


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
   * @return associationsDirectoryEntryReference
  **/

  public String getAssociationsDirectoryEntryReference() {
    return associationsDirectoryEntryReference;
  }

  public void setAssociationsDirectoryEntryReference(String associationsDirectoryEntryReference) {
    this.associationsDirectoryEntryReference = associationsDirectoryEntryReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer.RelationshipManager(asRole).Player(asPerson).EmployerIdentificationNumber iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E7VDkcTGEeChad0JzLk7QA_-2076942625/elements/_E7VDlcTGEeChad0JzLk7QA_-912215424) 
   * @return employeeReference
  **/

  public String getEmployeeReference() {
    return employeeReference;
  }

  public void setEmployeeReference(String employeeReference) {
    this.employeeReference = employeeReference;
  }


  /**
   * `status: Provisionally Registered`  bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).PartyRelationship.PartyRelationshipType  general-info: familial or corporate 
   * @return associateType
  **/

  public String getAssociateType() {
    return associateType;
  }

  public void setAssociateType(String associateType) {
    this.associateType = associateType;
  }


  /**
   * `status: Provisionally Registered`  bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).PartyRelationship 
   * @return associateReference
  **/

  public String getAssociateReference() {
    return associateReference;
  }

  public void setAssociateReference(String associateReference) {
    this.associateReference = associateReference;
  }


  /**
   * `status: Provisionally Registered`  bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).PartyRelationship.Agreement 
   * @return associateObligationDependencyDescription
  **/

  public String getAssociateObligationDependencyDescription() {
    return associateObligationDependencyDescription;
  }

  public void setAssociateObligationDependencyDescription(String associateObligationDependencyDescription) {
    this.associateObligationDependencyDescription = associateObligationDependencyDescription;
  }


  /**
   * `status: Provisionally Registered`  bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).PartyRelationship.ValidityPeriod 
   * @return associationValidFromTo
  **/

  public String getAssociationValidFromTo() {
    return associationValidFromTo;
  }

  public void setAssociationValidFromTo(String associationValidFromTo) {
    this.associationValidFromTo = associationValidFromTo;
  }


  /**
   * `status: Provisionally Registered`  bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).PartyRelationship.RelationshipAgreement.Product  general-info: association tied to bank product/service 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player.Role(asAccountPartyRole).Account.A iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EuN0p8TGEeChad0JzLk7QA_-1821987913) general-info: list 
   * @return preferredBeneficiary
  **/

  public String getPreferredBeneficiary() {
    return preferredBeneficiary;
  }

  public void setPreferredBeneficiary(String preferredBeneficiary) {
    this.preferredBeneficiary = preferredBeneficiary;
  }


  /**
   * `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asParty).PowerOfAttorney iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/___CLVmIiEeGD28DQaMef-g) 
   * @return proxyRepresentativePowerOfAttorneyReference
  **/

  public String getProxyRepresentativePowerOfAttorneyReference() {
    return proxyRepresentativePowerOfAttorneyReference;
  }

  public void setProxyRepresentativePowerOfAttorneyReference(String proxyRepresentativePowerOfAttorneyReference) {
    this.proxyRepresentativePowerOfAttorneyReference = proxyRepresentativePowerOfAttorneyReference;
  }


}

