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

	
	//constructor
	public Order(Long orderId, int orderStatus, Date orderDate, Date requiredDate, Date shippedDate, Customer customer,
			Staff staff, Store store) {
		super();
		this.orderId = orderId;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
		this.requiredDate = requiredDate;
		this.shippedDate = shippedDate;
		this.customer = customer;
		this.staff = staff;
		this.store = store;
	}
	
	
	
	public Order() {
		super();
	}



	//GETTER AND SETTER
	public Long getOrderId() {
		return orderId;
	}

	

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}

	public Date getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	


	
	
	
	
	

}
