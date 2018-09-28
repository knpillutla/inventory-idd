package com.example.inventory.dto.events;

import com.example.inventory.dto.requests.InventoryAllocationRequestDTO;
import com.example.util.dto.events.ExceptionEvent;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class InventoryAllocationFailedEvent extends ExceptionEvent{
	private static String EVENT_NAME = "InventoryAllocationFailedEvent";
	InventoryAllocationRequestDTO allocationReq;
	
	public InventoryAllocationFailedEvent(InventoryAllocationRequestDTO failedReq, String errorMsg) {
		super(EVENT_NAME, errorMsg);
		allocationReq = failedReq;
	}
}
