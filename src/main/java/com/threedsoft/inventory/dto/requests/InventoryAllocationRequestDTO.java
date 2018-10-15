package com.threedsoft.inventory.dto.requests;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.util.dto.WMSRequestDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
public class InventoryAllocationRequestDTO  extends WMSRequestDTO{
	public Long orderLineId;
	public Long orderId;
	public Integer orderLineNbr;
	public String busName;
	public Integer locnNbr;
	public String busUnit;
	public String company;
	public String division;
	private String locnBrcd;
	private String itemBrcd;
	private String ilpn;
	private Integer qty;
	private String batchNbr;
	private String orderNbr;
	private String packageNbr;
	private String userId;

	public InventoryAllocationRequestDTO(Long orderLineId, Long orderId, String busName, Integer locnNbr, String busUnit, String company,
			String division, String locnBrcd, String itemBrcd, String ilpn, Integer qty, String batchNbr,
			String orderNbr, Integer orderLineNbr, String packageNbr, String userId) {
		super();
		this.orderLineId = orderLineId;
		this.orderId = orderId;
		this.busName = busName;
		this.locnNbr = locnNbr;
		this.busUnit = busUnit;
		this.company = company;
		this.division = division;
		this.locnBrcd = locnBrcd;
		this.itemBrcd = itemBrcd;
		this.ilpn = ilpn;
		this.qty = qty;
		this.batchNbr = batchNbr;
		this.orderNbr = orderNbr;
		this.orderLineNbr=orderLineNbr;
		this.packageNbr = packageNbr;
		this.userId = userId;
	}
}
