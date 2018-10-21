/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Register;

@BianRestController
public class CustomerReferenceDataManagementApiController {

	@Autowired
	CustomerReferenceDataManagementApiService service;
	
	@Register.Record
	public BianResponse<CustomerReferenceDataRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerReferenceDataRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("bankrelations")
	@Register.RegisterAt
	public BianResponse<BankRelationsBaseWithIdAndRoot> registerAtBankrelations(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BankRelationsBase> bianRequest) {
		return BianResponse.forSuccess(service.registerAtBankrelations(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("demographics")
	@Register.RegisterAt
	public BianResponse<DemographicBaseWithIdAndRoot> registerAtDemographics(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DemographicBase> bianRequest) {
		return BianResponse.forSuccess(service.registerAtDemographics(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("references")
	@Register.RegisterAt
	public BianResponse<ReferenceBaseWithIdAndRoot> registerAtReferences(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ReferenceBase> bianRequest) {
		return BianResponse.forSuccess(service.registerAtReferences(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("associations")
	@Register.RegisterAt
	public BianResponse<CustomerAssociationBaseWithIdAndRoot> registerAtAssociations(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerAssociationBase> bianRequest) {
		return BianResponse.forSuccess(service.registerAtAssociations(crReferenceId, bianRequest.getData()));
	}
	
	@Register.RequestPost
	public BianResponse<ReferenceBaseWithIdAndRoot> requestPost(@RequestBody BianRequest<ReferenceBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Register.RequestPut
	public BianResponse<ReferenceBaseWithIdAndRoot> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ReferenceBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Register.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Register.Retrieve
	public BianResponse<RetrieveCustomerReferenceDataManagementRoot> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("associations")
	@Register.Retrieve
	public BianResponse<CustomerAssociationBaseWithIdAndRoot> retrieveAssociations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAssociations(crReferenceId, bqReferenceId));
	}
	
	@BQ("bankrelations")
	@Register.Retrieve
	public BianResponse<BankRelationsBaseWithIdAndRoot> retrieveBankrelations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBankrelations(crReferenceId, bqReferenceId));
	}
	
	@BQ("demographics")
	@Register.Retrieve
	public BianResponse<DemographicBaseWithIdAndRoot> retrieveDemographics(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDemographics(crReferenceId, bqReferenceId));
	}
	
	@BQ("references")
	@Register.Retrieve
	public BianResponse<ReferenceBaseWithIdAndRoot> retrieveReferences(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReferences(crReferenceId, bqReferenceId));
	}
	
	@Register.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Register.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@Register.Update
	public BianResponse<ReferenceBaseWithIdAndRoot> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ReferenceBaseUpdateRequest> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
