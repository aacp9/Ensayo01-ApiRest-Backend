package cl.aacp9.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cl.aacp9.DTO.StoreDTO;
import cl.aacp9.model.Store;
@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
	@Query(value="SELECT new cl.aacp9.DTO.StoreDTO(sto.storeId, sto.storeName) "
			+ "FROM Store sto")
	List<StoreDTO> findByAllStoreNameQuery();

}
