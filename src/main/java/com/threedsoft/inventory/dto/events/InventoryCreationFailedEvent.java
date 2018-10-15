package com.threedsoft.inventory.dto.events;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.inventory.dto.requests.InventoryAllocationRequestDTO;
import com.threedsoft.inventory.dto.requests.InventoryCreationRequestDTO;
import com.threedsoft.util.dto.events.ExceptionEvent;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class InventoryCreationFailedEvent extends ExceptionEvent{
	public InventoryCreationFailedEvent(InventoryCreationRequestDTO req, String serviceName, String errorMsg) {
		this(req, serviceName, errorMsg, null);
	}

	public InventoryCreationFailedEvent(InventoryCreationRequestDTO req, String serviceName, String errorMsg,
			Exception exObj) {
		this(req, serviceName, errorMsg, exObj, null);
	}

	public InventoryCreationFailedEvent(InventoryCreationRequestDTO req, String serviceName, String errorMsg,
			Exception exObj, Map headerMap) {
		super("InventoryCreationFailedEvent", req.getBusName(), req.getLocnNbr(), req.getCompany(), req.getDivision(),
				req.getBusUnit(), "CustomerOrder", req.getItemBrcd(), serviceName, req, errorMsg, exObj);
		this.addHeader("itemBrcd", req.getItemBrcd());
		this.addHeader("lpn", req.getIlpn());
		if (headerMap != null)
			this.setHeaderMap(headerMap);
	}	
}
