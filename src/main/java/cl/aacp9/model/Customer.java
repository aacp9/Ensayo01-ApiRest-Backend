package cl.aacp9.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="customers")
public class Customer {
	@Id
	@Column(name = "customer_id")
	private Long customerId;
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	private String phone;
	private String email;
	private String street;
	private String city;
	private String state;
	
	@Column(name = "zip_code")
	private String zipCode;
	
	//RELATIONSHIP
	//fetch = FetchType.LAZY	:carga los datos relacionados solo cuando se accede a ellos por primera vez
	//fetch = FetchType.EAGER	:carga los datos relacionados inmediatamente junto con la entidad principal.
	//1:N Order
	@OneToMany(targetEntity=Order.class, mappedBy = "customer", fetch = FetchType.LAZY)
	private List<Order> customerOrderList;

	//constructor

	public Customer(Long customerId, String firstName, String lastName, String phone, String email, String street,
			String city, String state, String zipCode, List<Order> customerOrderList) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.customerOrderList = customerOrderList;
	}
	
	

	
	public Customer() {
		super();
	}




	//GETTER Y SETTER
	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public List<Order> getCustomerOrderList() {
		return customerOrderList;
	}

	public void setCustomerOrderList(List<Order> customerOrderList) {
		this.customerOrderList = customerOrderList;
	}

	

	


		
	
	
	
	
	
}
