package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BankRelationsBase
 */
public class BankRelationsBase   {
  private String customerReference = null;

  private String bankRelationType = null;

  private String businessUnitEmployeeReference = null;


  /**
   * `status: Provisionally Registered`   bian-reference:  CustomerRegistryEntry.RegisteredCustomer 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Provisionally Registered`   bian-reference:  CustomerRegistryEntry.RegisteredCustomer.RelationshipManager   general-info: relationship manager 
   * @return bankRelationType
  **/

  public String getBankRelationType() {
    return bankRelationType;
  }

  public void setBankRelationType(String bankRelationType) {
    this.bankRelationType = bankRelationType;
  }


  /**
   * `status: Provisionally Registered`   bian-reference:  CustomerRegistryEntry.RegisteredCustomer.RelationshipManager.BusinessUnit 
   * @return businessUnitEmployeeReference
  **/

  public String getBusinessUnitEmployeeReference() {
    return businessUnitEmployeeReference;
  }

  public void setBusinessUnitEmployeeReference(String businessUnitEmployeeReference) {
    this.businessUnitEmployeeReference = businessUnitEmployeeReference;
  }


}

