/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerReferenceDataManagementApiServiceImpl implements CustomerReferenceDataManagementApiService {

	public CustomerReferenceDataRecordResponse record(String crReferenceId, CustomerReferenceDataRecordRequest request){
		return JsonReader.read("record-CustomerReferenceDataRecordResponse.json",new TypeReference<CustomerReferenceDataRecordResponse>(){});
	}
	
	public BankRelationsBaseWithIdAndRoot registerAtBankrelations(String crReferenceId, BankRelationsBase request){
		return JsonReader.read("registerAt-BankRelationsBaseWithIdAndRoot.json",new TypeReference<BankRelationsBaseWithIdAndRoot>(){});
	}
	
	public DemographicBaseWithIdAndRoot registerAtDemographics(String crReferenceId, DemographicBase request){
		return JsonReader.read("registerAt-DemographicBaseWithIdAndRoot.json",new TypeReference<DemographicBaseWithIdAndRoot>(){});
	}
	
	public ReferenceBaseWithIdAndRoot registerAtReferences(String crReferenceId, ReferenceBase request){
		return JsonReader.read("registerAt-ReferenceBaseWithIdAndRoot.json",new TypeReference<ReferenceBaseWithIdAndRoot>(){});
	}
	
	public CustomerAssociationBaseWithIdAndRoot registerAtAssociations(String crReferenceId, CustomerAssociationBase request){
		return JsonReader.read("registerAt-CustomerAssociationBaseWithIdAndRoot.json",new TypeReference<CustomerAssociationBaseWithIdAndRoot>(){});
	}
	
	public ReferenceBaseWithIdAndRoot requestPost(ReferenceBase request){
		return JsonReader.read("requestPost-ReferenceBaseWithIdAndRoot.json",new TypeReference<ReferenceBaseWithIdAndRoot>(){});
	}
	
	public ReferenceBaseWithIdAndRoot requestPut(String crReferenceId, ReferenceBase request){
		return JsonReader.read("requestPut-ReferenceBaseWithIdAndRoot.json",new TypeReference<ReferenceBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public RetrieveCustomerReferenceDataManagementRoot retrieve(String crReferenceId){
		return JsonReader.read("retrieve-RetrieveCustomerReferenceDataManagementRoot.json",new TypeReference<RetrieveCustomerReferenceDataManagementRoot>(){});
	}
	
	public CustomerAssociationBaseWithIdAndRoot retrieveAssociations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerAssociationBaseWithIdAndRoot.json",new TypeReference<CustomerAssociationBaseWithIdAndRoot>(){});
	}
	
	public BankRelationsBaseWithIdAndRoot retrieveBankrelations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BankRelationsBaseWithIdAndRoot.json",new TypeReference<BankRelationsBaseWithIdAndRoot>(){});
	}
	
	public DemographicBaseWithIdAndRoot retrieveDemographics(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DemographicBaseWithIdAndRoot.json",new TypeReference<DemographicBaseWithIdAndRoot>(){});
	}
	
	public ReferenceBaseWithIdAndRoot retrieveReferences(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ReferenceBaseWithIdAndRoot.json",new TypeReference<ReferenceBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public ReferenceBaseWithIdAndRoot update(String crReferenceId, ReferenceBaseUpdateRequest request){
		return JsonReader.read("update-ReferenceBaseWithIdAndRoot.json",new TypeReference<ReferenceBaseWithIdAndRoot>(){});
	}
	
}
