package com.example.inventory.dto.requests;

import com.example.util.dto.BaseDTO;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
@AllArgsConstructor
public class InventoryCreationRequestDTO extends BaseDTO{
	public String eventName="InventoryCreationRequest";
	public String busName;
	public Integer locnNbr;
	public String busUnit;
	public String company;
	public String division;
	public String locnBrcd;
	public String itemBrcd;
	public Integer qty;
	public String ilpn;
	public boolean trackByLPN;
	public String userId;
	public boolean locked;
}
