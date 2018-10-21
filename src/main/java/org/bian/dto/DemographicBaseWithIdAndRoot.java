package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DemographicBaseWithIdAndRoot
 */
public class DemographicBaseWithIdAndRoot   {
  private String customerReferenceDataDirectoryEntryReference = null;

  private String demographicsDirectoryEntryReference = null;

  private String customerReference = null;

  private String socioEconomicClassification = null;

  private String ethnicityReligion = null;

  private String employment = null;

  private String employmentHistory = null;

  private String educationHistory = null;

  private String servicingConstraints = null;


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
   * @return demographicsDirectoryEntryReference
  **/

  public String getDemographicsDirectoryEntryReference() {
    return demographicsDirectoryEntryReference;
  }

  public void setDemographicsDirectoryEntryReference(String demographicsDirectoryEntryReference) {
    this.demographicsDirectoryEntryReference = demographicsDirectoryEntryReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Registered`   bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asPerson).Household   iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNXOwMTGEeChad0JzLk7QA_-1677946147/elements/_0Lx2wLZeEeOpCN0IL2Swqw)   `status: Registered`   bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asPerson).PersonProfile   iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNXOwMTGEeChad0JzLk7QA_-1677946147/elements/_q6wNUB9uEeO3iLV2voicmw) 
   * @return socioEconomicClassification
  **/

  public String getSocioEconomicClassification() {
    return socioEconomicClassification;
  }

  public void setSocioEconomicClassification(String socioEconomicClassification) {
    this.socioEconomicClassification = socioEconomicClassification;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asPerson).Ethnicity `status: Provisionally Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asPerson).Religion 
   * @return ethnicityReligion
  **/

  public String getEthnicityReligion() {
    return ethnicityReligion;
  }

  public void setEthnicityReligion(String ethnicityReligion) {
    this.ethnicityReligion = ethnicityReligion;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asParty)(asPerson).PersonProfile.SalaryRange iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_ZUHGwB9uEeO3iLV2voicmw/elements/_FNg_wMTGEeChad0JzLk7QA_666058283) `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asParty)(asPerson).Profession iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNXOwMTGEeChad0JzLk7QA_-1677946147/elements/_FNXOx8TGEeChad0JzLk7QA_-382216715) `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer(asRole).Player(asPerson).EmployerIdentificationNumber iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E7VDkcTGEeChad0JzLk7QA_-2076942625/elements/_E7VDlcTGEeChad0JzLk7QA_-912215424) `status: Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer.(asRole).Player(asParty)(asPerson).PersonProfile.EmploymentTerminationIndicator iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_ZUHGwB9uEeO3iLV2voicmw/elements/_SfbZ0CHSEeO3iLV2voicmw) general-info: employer and position 
   * @return employment
  **/

  public String getEmployment() {
    return employment;
  }

  public void setEmployment(String employment) {
    this.employment = employment;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: employer, job position, salary 
   * @return employmentHistory
  **/

  public String getEmploymentHistory() {
    return employmentHistory;
  }

  public void setEmploymentHistory(String employmentHistory) {
    this.employmentHistory = employmentHistory;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer.(asRole).Player(asPerson).EducationLevel   general-info: academic institutions, duration, certifications 
   * @return educationHistory
  **/

  public String getEducationHistory() {
    return educationHistory;
  }

  public void setEducationHistory(String educationHistory) {
    this.educationHistory = educationHistory;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer.CustomerMasterAgreement(asAgreement).TermsAndConditions `status: Provisionally Registered` bian-reference:  CustomerRegistryEntry.RegisteredCustomer.CustomerMasterAgreement.TermsAndConditions 
   * @return servicingConstraints
  **/

  public String getServicingConstraints() {
    return servicingConstraints;
  }

  public void setServicingConstraints(String servicingConstraints) {
    this.servicingConstraints = servicingConstraints;
  }


}

