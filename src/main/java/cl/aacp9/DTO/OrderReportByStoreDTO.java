package cl.aacp9.DTO;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//Los DTO deben seguir los mismo TIPOS DE DATO del ORIGEN
@Data					//genera automáticamente métodos getter, setter, equals(), hashCode() y toString() para una clase, simplificando la escritura de código repetitivo en beans y POJOs
@AllArgsConstructor		//genera automáticamente un constructor con todos los parametros
@NoArgsConstructor		//genera automáticamente un constructor vacio
@ToString				//genera automáticamante el método ToString para despliegue del objeto
public class OrderReportByStoreDTO {
	private Long orderId;
	private String firstNameStaff;
	private String lastNameStaff;
	private String firstNameCustomer;
	private String lastNameCustomer;
	private Date orderDate;
	private Date requiredDate;
	private int orderStatus;
	
	
	//CONSTRUCTOR
	
	public OrderReportByStoreDTO(Long orderId, String firstNameStaff, String lastNameStaff, String firstNameCustomer,
			String lastNameCustomer, Date orderDate, Date requiredDate, int orderStatus) {
		super();
		this.orderId = orderId;
		this.firstNameStaff = firstNameStaff;
		this.lastNameStaff = lastNameStaff;
		this.firstNameCustomer = firstNameCustomer;
		this.lastNameCustomer = lastNameCustomer;
		this.orderDate = orderDate;
		this.requiredDate = requiredDate;
		this.orderStatus = orderStatus;
	}

	
	public OrderReportByStoreDTO() {
		super();
	}


	//GETTER AND SETTER

	public Long getOrderId() {
		return orderId;
	}


	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}


	public String getFirstNameStaff() {
		return firstNameStaff;
	}


	public void setFirstNameStaff(String firstNameStaff) {
		this.firstNameStaff = firstNameStaff;
	}


	public String getLastNameStaff() {
		return lastNameStaff;
	}


	public void setLastNameStaff(String lastNameStaff) {
		this.lastNameStaff = lastNameStaff;
	}


	public String getFirstNameCustomer() {
		return firstNameCustomer;
	}


	public void setFirstNameCustomer(String firstNameCustomer) {
		this.firstNameCustomer = firstNameCustomer;
	}


	public String getLastNameCustomer() {
		return lastNameCustomer;
	}


	public void setLastNameCustomer(String lastNameCustomer) {
		this.lastNameCustomer = lastNameCustomer;
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


	public int getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	

	
}
