package cl.aacp9.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cl.aacp9.DTO.StoreDTO;
import cl.aacp9.service.StoreService;

@RestController
@RequestMapping("api/v1")
public class StoreController {
	@Autowired
	public StoreService storeService;
	
	@GetMapping("/stores")
	@ResponseBody
	public ResponseEntity<List<StoreDTO>> findAllQuery(){
		try {
			List<StoreDTO> listaStore = storeService.findByAllStoreNameQuery();
			if (!listaStore.isEmpty()) {
				return new ResponseEntity<>(listaStore,HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
