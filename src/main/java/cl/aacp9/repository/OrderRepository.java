package cl.aacp9.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cl.aacp9.DTO.OrderReportByStoreDTO;
import cl.aacp9.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
	//método de prueba con dato duro
	//con @Query se utiliza los nombres de las entidades de la clase
	@Query(value="SELECT new cl.aacp9.DTO.OrderReportByStoreDTO("
			+ "ord.orderId, "
			+ "sta.firstName, "
			+ "sta.lastName, "
			+ "cus.firstName, "
			+ "cus.lastName, "
			+ "ord.orderDate, "
			+ "ord.requiredDate, "
			+ "ord.orderStatus)"
			+ "FROM Order ord JOIN ord.customer cus "
			+ "JOIN ord.staff sta "
			+ "JOIN ord.store sto "
			+ "WHERE sto.storeName='Rowlett Bikes' "
			+ "AND ord.orderStatus=4 "
			+ "AND ord.orderDate BETWEEN TO_DATE('2018-01-01','YYYY-MM-DD') AND TO_DATE('2018-12-31','YYYY-MM-DD')"
			+ "ORDER BY ord.orderDate DESC"
			)
	List<OrderReportByStoreDTO> reportListQuery();

	//método definitivo con parametros
	@Query(value="SELECT new cl.aacp9.DTO.OrderReportByStoreDTO("
			+ "ord.orderId, "
			+ "sta.firstName, "
			+ "sta.lastName, "
			+ "cus.firstName, "
			+ "cus.lastName, "
			+ "ord.orderDate, "
			+ "ord.requiredDate, "
			+ "ord.orderStatus)"
			+ "FROM Order ord JOIN ord.customer cus "
			+ "JOIN ord.staff sta "
			+ "JOIN ord.store sto "
			+ "WHERE sto.storeId=:storeIdReceived "//comparamos con el dato recibido de la vista con @Param
			+ "AND ord.orderStatus=:orderStatusReceived "//comparamos con el dato recibido de la vista con @Param
			+ "AND ord.orderDate BETWEEN TO_DATE(:orderDateFromReceived,'YYYY-MM-DD') "//comparamos con el dato recibido de la vista con @Param
			+ "AND TO_DATE(:orderDateUntilReceived,'YYYY-MM-DD')"//comparamos con el dato recibido de la vista con @Param
			)
	public List<OrderReportByStoreDTO> reportListQueryParams(
			@Param("storeIdReceived") Integer storeIdRepository, 
			@Param("orderStatusReceived") Integer orderStatusRepository, 
			@Param("orderDateFromReceived") String orderDateFromRepository, 
			@Param("orderDateUntilReceived") String orderDateUntilRepository );
	

}
