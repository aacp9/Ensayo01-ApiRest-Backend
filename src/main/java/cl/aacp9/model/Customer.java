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

	
}
