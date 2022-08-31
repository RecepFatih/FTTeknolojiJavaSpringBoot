package patika.ftTeknolojiPracticum.dataAccess.abstracts;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import patika.ftTeknolojiPracticum.entities.concretes.Product;
import patika.ftTeknolojiPracticum.entities.dtos.ProductDto;

public interface ProductDao extends JpaRepository<Product, Integer>{
	
	@Query("Select new patika.ftTeknolojiPracticum.entities.dtos.ProductDto"
			+" (p.productName, p.expireDate, p.unitPrice)"
			+" From Product p"
			+" where p.expireDate <= :now")
	List<ProductDto> getOverExpireDateProduct(@Param("now") Date now);
	
	@Query("Select new patika.ftTeknolojiPracticum.entities.dtos.ProductDto"
			+" (p.productName, p.expireDate, p.unitPrice)"
			+" From Product p"
			+" where p.expireDate >= :now or p.expireDate = null")
	List<ProductDto> getDoesntOverExpireDateProduct(@Param("now") Date now);
	
	
}
