package com.threedsoft.inventory.dto.events;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.inventory.dto.requests.InventoryCreationRequestDTO;
import com.threedsoft.util.dto.events.WMSEvent;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class InventoryReceivedEvent extends WMSEvent{

	String itemBrcd;
	String lpn;
	Integer qty;
	InventoryCreationRequestDTO invnCreationReq;
	public InventoryReceivedEvent(InventoryCreationRequestDTO req, String serviceName) {
		this(req, serviceName, null);
	}

	public InventoryReceivedEvent(InventoryCreationRequestDTO req, String serviceName, Map headerMap) {
		super("InventoryReceivedEvent", req.getBusName(), req.getLocnNbr(), req.getCompany(),
				req.getDivision(), req.getBusUnit(), "inventory", req.getItemBrcd(),
				serviceName, req);
		invnCreationReq = req;
		this.addHeader("itemBrcd", req.getItemBrcd());
		this.addHeader("lpn", req.getIlpn());
		if (headerMap != null)
			this.setHeaderMap(headerMap);
	}	
}
