package cl.aacp9.service;

import java.util.List;


import cl.aacp9.DTO.OrderReportByStoreDTO;

public interface OrderService {
	
	public List<OrderReportByStoreDTO> reportListQueryParams(
			Integer storeIdService,
			Integer orderStatusService,
			String orderDateFromService,
			String orderDateUntilService );
	

}
