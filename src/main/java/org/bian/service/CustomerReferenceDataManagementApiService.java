/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerReferenceDataManagementApiService {

	CustomerReferenceDataRecordResponse record(String crReferenceId, CustomerReferenceDataRecordRequest request);
	
	BankRelationsBaseWithIdAndRoot registerAtBankrelations(String crReferenceId, BankRelationsBase request);
	
	DemographicBaseWithIdAndRoot registerAtDemographics(String crReferenceId, DemographicBase request);
	
	ReferenceBaseWithIdAndRoot registerAtReferences(String crReferenceId, ReferenceBase request);
	
	CustomerAssociationBaseWithIdAndRoot registerAtAssociations(String crReferenceId, CustomerAssociationBase request);
	
	ReferenceBaseWithIdAndRoot requestPost(ReferenceBase request);
	
	ReferenceBaseWithIdAndRoot requestPut(String crReferenceId, ReferenceBase request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	RetrieveCustomerReferenceDataManagementRoot retrieve(String crReferenceId);
	
	CustomerAssociationBaseWithIdAndRoot retrieveAssociations(String crReferenceId, String bqReferenceId);
	
	BankRelationsBaseWithIdAndRoot retrieveBankrelations(String crReferenceId, String bqReferenceId);
	
	DemographicBaseWithIdAndRoot retrieveDemographics(String crReferenceId, String bqReferenceId);
	
	ReferenceBaseWithIdAndRoot retrieveReferences(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	ReferenceBaseWithIdAndRoot update(String crReferenceId, ReferenceBaseUpdateRequest request);
	
}
