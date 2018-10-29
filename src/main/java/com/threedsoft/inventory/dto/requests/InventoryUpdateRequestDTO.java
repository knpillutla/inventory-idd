package com.threedsoft.inventory.dto.requests;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.util.dto.WMSRequestDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
@AllArgsConstructor
public class InventoryUpdateRequestDTO extends WMSRequestDTO{
	public Long id;
	public String locnBrcd;
	public String itemBrcd;
	public Integer qty;
	public String ilpn;
	public String trackByLPN;
	public String locked;
	public String userId;
}
