package com.mulesoft.samples;
import javax.jws.WebService;

@WebService
public interface IProcessWorkOrder {
	 WorkOrderRequestAck ProcessWorkOrder(WorkOrderRequest request) throws Exception;
}


