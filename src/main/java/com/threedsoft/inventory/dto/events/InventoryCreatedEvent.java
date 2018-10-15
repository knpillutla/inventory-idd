package com.threedsoft.inventory.dto.events;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.inventory.dto.responses.InventoryResourceDTO;
import com.threedsoft.util.dto.events.WMSEvent;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class InventoryCreatedEvent extends WMSEvent {

	public InventoryCreatedEvent(InventoryResourceDTO resourceDTO, String serviceName) {
		this(resourceDTO, serviceName, null);
	}

	public InventoryCreatedEvent(InventoryResourceDTO resourceDTO, String serviceName, Map headerMap) {
		super("InventoryCreatedEvent", resourceDTO.getBusName(), resourceDTO.getLocnNbr(), resourceDTO.getCompany(),
				resourceDTO.getDivision(), resourceDTO.getBusUnit(), "Inventory", resourceDTO.getOrderNbr(),
				serviceName, resourceDTO);
		this.addHeader("itemBrcd", resourceDTO.getItemBrcd());
		this.addHeader("lpn", resourceDTO.getIlpn());
		
		if (headerMap != null)
			this.setHeaderMap(headerMap);
	}
}
