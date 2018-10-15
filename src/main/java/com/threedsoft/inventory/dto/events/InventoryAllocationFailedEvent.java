package com.threedsoft.inventory.dto.events;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.inventory.dto.requests.InventoryAllocationRequestDTO;
import com.threedsoft.util.dto.events.ExceptionEvent;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class InventoryAllocationFailedEvent extends ExceptionEvent {

	public InventoryAllocationFailedEvent(InventoryAllocationRequestDTO req, String serviceName, String errorMsg) {
		this(req, serviceName, errorMsg, null);
	}

	public InventoryAllocationFailedEvent(InventoryAllocationRequestDTO req, String serviceName, String errorMsg,
			Exception exObj) {
		this(req, serviceName, errorMsg, exObj, null);
	}

	public InventoryAllocationFailedEvent(InventoryAllocationRequestDTO req, String serviceName, String errorMsg,
			Exception exObj, Map headerMap) {
		super("InventoryAllocationFailedEvent", req.getBusName(), req.getLocnNbr(), req.getCompany(), req.getDivision(),
				req.getBusUnit(), "Order", req.getOrderNbr(), serviceName, req, errorMsg, exObj);
		this.addHeader("orderNbr", req.getOrderNbr());
		this.addHeader("orderLineNbr", req.getOrderLineNbr());
		if (headerMap != null)
			this.setHeaderMap(headerMap);
	}
}
