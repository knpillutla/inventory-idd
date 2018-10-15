package com.threedsoft.inventory.dto.responses;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.threedsoft.util.dto.WMSResourceDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@NoArgsConstructor
@Data
@AllArgsConstructor
public class InventoryResourceDTO  extends WMSResourceDTO{
	Long id;
	Long orderId;
	Long orderLineId;
	Integer orderLineNbr;
	String busName;
	Integer locnNbr;
	String company;
	String division;
	String busUnit;
	String locnBrcd;
	String itemBrcd;
	Integer qty;
	Integer statCode;
	String ilpn;
	String orderNbr;
	String packageNbr;
	String transitContainerNbr;
	String source;
	String transactionName;
	String trackByLPN;
	String refField1;
	String refField2;
	LocalDateTime updatedDttm;
	String updatedBy;
	String batchNbr;
	String userId;
}
