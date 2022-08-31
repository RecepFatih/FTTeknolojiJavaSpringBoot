package patika.ftTeknolojiPracticum.business.abstracts;

import java.util.List;


import patika.ftTeknolojiPracticum.core.utilities.results.DataResult;
import patika.ftTeknolojiPracticum.entities.dtos.ProductDto;

public interface ProductService {
	
	DataResult<List<ProductDto>> getOverExpireDateProduct();
	DataResult<List<ProductDto>> getDoesntOverExpireDateProduct();

}
