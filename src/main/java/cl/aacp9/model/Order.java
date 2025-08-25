package cl.aacp9.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="orders")
public class Order {
	@Id
	@Column(name = "order_id")
	private Long orderId;

//  Llave foranea - entidad declarada al final, 
//	@Column(name = "customer_id")
//	private Long customerId;

	@Column(name = "order_status")
	private int orderStatus;

	@Column(name = "order_date")
	private Date orderDate;

	@Column(name = "required_date")
	private Date requiredDate;

	@Column(name = "shipped_date")
	private Date shippedDate;

	
//  Llave foranea - entidad declarada al final, 
//	@Column(name = "store_id")
//	private Long storeId;

//  Llave foranea - entidad declarada al final, 
//	@Column(name = "staff_id")
//	private Long staffId;
	
	//RELATIONSHIP
	//fetch = FetchType.LAZY	:carga los datos relacionados solo cuando se accede a ellos por primera vez
	//fetch = FetchType.EAGER	:carga los datos relacionados inmediatamente junto con la entidad principal.
	//N:1 Customer
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="customer_id") //se indica el nombre el id de la tabla en DB 
	private Customer customer;
					 
	//N:1 Staff
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="staff_id") //se indica el nombre el id de la tabla en DB 
	private Staff staff;

	//N:1 Store
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="store_id") //se indica el nombre el id de la tabla en DB 
	private Store store;

}
