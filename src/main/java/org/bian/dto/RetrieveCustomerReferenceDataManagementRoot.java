package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RetrieveCustomerReferenceDataManagementRoot
 */
public class RetrieveCustomerReferenceDataManagementRoot   {
  private String customerReferenceDataDirectoryEntryReference = null;


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


}

