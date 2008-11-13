package org.hyperic.hq.hqapi1.test;

import org.hyperic.hq.hqapi1.EscalationApi;
import org.hyperic.hq.hqapi1.types.Escalation;
import org.hyperic.hq.hqapi1.types.GetEscalationResponse;

public class EscalationGetEscalation_test extends EscalationTestBase {

    public EscalationGetEscalation_test(String name) {
        super(name);
    }

    public void testGetEscalationById() throws Exception {
        
        EscalationApi escApi = getEscalationApi();
        Escalation esc = getTestEscalation();
              
        // Look up escalation by id
        GetEscalationResponse response = escApi.getEscalation(esc.getId());
        hqAssertSuccess(response);
    }

    public void testGetEscalationByName() throws Exception {
       
        EscalationApi escApi = getEscalationApi();
        Escalation esc = getTestEscalation();
              
        // Look up escalation by name
        GetEscalationResponse response = escApi.getEscalation(esc.getName());
        hqAssertSuccess(response);
    }
    
}