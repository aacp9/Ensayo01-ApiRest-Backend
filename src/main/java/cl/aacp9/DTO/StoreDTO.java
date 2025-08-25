package cl.aacp9.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//Los DTO deben seguir los mismo TIPOS DE DATO del ORIGEN
@Data					//genera automáticamente métodos getter, setter, equals(), hashCode() y toString() para una clase, simplificando la escritura de código repetitivo en beans y POJOs
@AllArgsConstructor		//genera automáticamente un constructor con todos los parametros
@NoArgsConstructor		//genera automáticamente un constructor vacio
@ToString				//genera automáticamante el método ToString para despliegue del objeto
public class StoreDTO {
	private Long storeId;
	private String storeName;

}
