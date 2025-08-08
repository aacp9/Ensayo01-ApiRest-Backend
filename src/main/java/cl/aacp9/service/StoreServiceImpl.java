package cl.aacp9.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.aacp9.DTO.StoreDTO;
import cl.aacp9.repository.StoreRepository;
@Service
public class StoreServiceImpl implements StoreService {
	@Autowired
	private StoreRepository storeRepository;
	@Override
	public List<StoreDTO> findByAllStoreNameQuery() {
		// TODO Auto-generated method stub
		return storeRepository.findByAllStoreNameQuery();
	}

}
