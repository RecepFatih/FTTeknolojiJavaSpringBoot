package patika.ftTeknolojiPracticum.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

	private String productName;
	private Date expireDate;
	private double unitPrice;
}
