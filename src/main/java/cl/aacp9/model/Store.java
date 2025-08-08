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
@Table(name="stores")
public class Store {

	@Id
	@Column(name = "store_id")
	private Long storeId;
	
	@Column(name = "store_name")
	private String storeName;

	private String phone;
	private String email;
	private String street;
	private String city;
	private String state;

	@Column(name = "zip_code")
	private String zipCode ;

	//RELATIONSHIP
	//fetch = FetchType.LAZY	:carga los datos relacionados solo cuando se accede a ellos por primera vez
	//fetch = FetchType.EAGER	:carga los datos relacionados inmediatamente junto con la entidad principal.
	//1:N Order
	@OneToMany(targetEntity=Order.class, mappedBy = "store", fetch = FetchType.LAZY)
	private List<Order> storeOrderList;

	//1:N Staff
	@OneToMany(targetEntity=Order.class, mappedBy = "store", fetch = FetchType.LAZY)
	private List<Staff> storeStaffList;

	//Constructor
	public Store(Long storeId, String storeName, String phone, String email, String street, String city, String state,
			String zipCode, List<Order> storeOrderList, List<Staff> storeStaffList) {
		super();
		this.storeId = storeId;
		this.storeName = storeName;
		this.phone = phone;
		this.email = email;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.storeOrderList = storeOrderList;
		this.storeStaffList = storeStaffList;
	}

	
	public Store() {
		super();
	}


	//GETTER AND SETTER
	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
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

	public List<Order> getStoreOrderList() {
		return storeOrderList;
	}

	public void setStoreOrderList(List<Order> storeOrderList) {
		this.storeOrderList = storeOrderList;
	}

	public List<Staff> getStoreStaffList() {
		return storeStaffList;
	}

	public void setStoreStaffList(List<Staff> storeStaffList) {
		this.storeStaffList = storeStaffList;
	}

	
	

}
