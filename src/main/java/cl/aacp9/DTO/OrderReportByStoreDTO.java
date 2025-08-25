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
	
	
	
}
