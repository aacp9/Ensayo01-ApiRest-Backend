package cl.aacp9.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.aacp9.DTO.OrderReportByStoreDTO;
import cl.aacp9.model.Order;
import cl.aacp9.service.OrderService;

@RestController
@RequestMapping("api/v1")
public class OrderReportByStoreController {
	@Autowired
	public OrderService orderReportByStoreService;  

	
	//@PathVariable: se envía por la URL
	//@RequestParam: se envía por la QUERY	
	//@RequestBody:  se envía por el OBJETO 
	@GetMapping("/OrderReportByStoreParams")
	public ResponseEntity<List<OrderReportByStoreDTO>> findAllByOrderReportByStoreParams(
			@RequestParam Integer storeId,//este es el nombre del parametro que se coloca en el Insomnia
			@RequestParam Integer orderStatus, //este es el nombre del parametro que se coloca en el Insomnia
			@RequestParam String orderDateFrom, //este es el nombre del parametro que se coloca en el Insomnia
			@RequestParam String orderDateUntil //este es el nombre del parametro que se coloca en el Insomnia
			){
		try {
			List<OrderReportByStoreDTO> listaOrderReportByStore = orderReportByStoreService.reportListQueryParams(
					storeId,
					orderStatus,
					orderDateFrom,
					orderDateUntil
					);
			if (!listaOrderReportByStore.isEmpty()) {
				return new ResponseEntity<>(listaOrderReportByStore,HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


}
