package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BankRelationsBaseWithIdAndRoot
 */
public class BankRelationsBaseWithIdAndRoot   {
  private String customerReferenceDataDirectoryEntryReference = null;

  private String bankRelationsDirectoryEntryReference = null;

  private String customerReference = null;

  private String bankRelationType = null;

  private String businessUnitEmployeeReference = null;


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
   * @return bankRelationsDirectoryEntryReference
  **/

  public String getBankRelationsDirectoryEntryReference() {
    return bankRelationsDirectoryEntryReference;
  }

  public void setBankRelationsDirectoryEntryReference(String bankRelationsDirectoryEntryReference) {
    this.bankRelationsDirectoryEntryReference = bankRelationsDirectoryEntryReference;
  }


  /**
   * `status: Provisionally Registered`  bian-reference:  CustomerRegistryEntry.RegisteredCustomer 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Provisionally Registered`  bian-reference:  CustomerRegistryEntry.RegisteredCustomer.RelationshipManager  general-info: relationship manager 
   * @return bankRelationType
  **/

  public String getBankRelationType() {
    return bankRelationType;
  }

  public void setBankRelationType(String bankRelationType) {
    this.bankRelationType = bankRelationType;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer.RelationshipManager.BusinessUnit 
   * @return businessUnitEmployeeReference
  **/

  public String getBusinessUnitEmployeeReference() {
    return businessUnitEmployeeReference;
  }

  public void setBusinessUnitEmployeeReference(String businessUnitEmployeeReference) {
    this.businessUnitEmployeeReference = businessUnitEmployeeReference;
  }


}

