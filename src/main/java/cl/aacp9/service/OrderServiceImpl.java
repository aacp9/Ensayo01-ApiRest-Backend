package cl.aacp9.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.aacp9.DTO.OrderReportByStoreDTO;
import cl.aacp9.model.Order;
import cl.aacp9.repository.OrderRepository;
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	public List<Order> findAllOrders(){
		return orderRepository.findAll();
	}
	
	@Autowired
	private OrderRepository orderReportByStoreRepository;

	@Override
	public List<OrderReportByStoreDTO> reportListQueryParams(
			Integer storeIdService, 
			Integer orderStatusService,
			String orderDateFromService, 
			String orderDateUntilService) {
		// TODO Auto-generated method stub
		return orderReportByStoreRepository.reportListQueryParams(
				storeIdService, 
				orderStatusService, 
				orderDateFromService, 
				orderDateUntilService);
	}

}
