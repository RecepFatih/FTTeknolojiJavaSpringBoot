package patika.ftTeknolojiPracticum.entities.concretes;

import java.util.List;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","productComment"})
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private int id;
	
	@Column(name = "product_name", nullable = false)
	private String productName;
	
	@Positive
	@Column(name = "unit_price", nullable = false)
	private double unitPrice;
	
	@Column(name= "expire_date")
	private Date expireDate;
	
	@OneToMany(mappedBy = "product")
	private List<ProductComment> productComment;

}
