package cl.aacp9.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="staffs")
public class Staff {
	@Id
	@Column(name = "staff_id")
	private Long staffId;
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	private String email;
	private String phone;
	private int active;

//  Llave foranea - entidad declarada al final, 	
//	@Column(name = "store_id")
//	private int storeId;
	
	@Column(name = "manager_id")
	private int managerId;

	//RELATIONSHIP
	//fetch = FetchType.LAZY	:carga los datos relacionados solo cuando se accede a ellos por primera vez
	//fetch = FetchType.EAGER	:carga los datos relacionados inmediatamente junto con la entidad principal.
	//1:N Order
	@OneToMany(targetEntity=Order.class, mappedBy = "staff", fetch = FetchType.LAZY)
	private List<Order> staffOrderList;

	//N:1 Store
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="store_id") //se indica el nombre el id de la tabla en DB 
	private Store store;

//Constructor	
	
	public Staff(Long staffId, String firstName, String lastName, String email, String phone, int active, int managerId,
		List<Order> staffOrderList, Store store) {
	super();
	this.staffId = staffId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.phone = phone;
	this.active = active;
	this.managerId = managerId;
	this.staffOrderList = staffOrderList;
	this.store = store;
}

	public Staff() {
	super();
}

	//GETTER AND SETTER
	
	public Long getStaffId() {
		return staffId;
	}

	public void setStaffId(Long staffId) {
		this.staffId = staffId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public List<Order> getStaffOrderList() {
		return staffOrderList;
	}

	public void setStaffOrderList(List<Order> staffOrderList) {
		this.staffOrderList = staffOrderList;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	
	
}
