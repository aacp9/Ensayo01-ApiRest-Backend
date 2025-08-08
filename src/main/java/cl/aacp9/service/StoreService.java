package cl.aacp9.service;

import java.util.List;

import cl.aacp9.DTO.StoreDTO;

public interface StoreService {
	public List<StoreDTO> findByAllStoreNameQuery();
}
