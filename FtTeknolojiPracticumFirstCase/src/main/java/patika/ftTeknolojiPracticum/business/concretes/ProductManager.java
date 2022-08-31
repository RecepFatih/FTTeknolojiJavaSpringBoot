package patika.ftTeknolojiPracticum.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import patika.ftTeknolojiPracticum.business.abstracts.ProductService;
import patika.ftTeknolojiPracticum.core.utilities.results.DataResult;
import patika.ftTeknolojiPracticum.core.utilities.results.SuccessDataResult;
import patika.ftTeknolojiPracticum.dataAccess.abstracts.ProductDao;
import patika.ftTeknolojiPracticum.entities.dtos.ProductDto;

@Service
public class ProductManager implements ProductService{
	
	private ProductDao productDao;
	
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<ProductDto>> getOverExpireDateProduct() {
		
		LocalDate now = LocalDate.now();
		
		
		return new SuccessDataResult<List<ProductDto>>
		(this.productDao.getOverExpireDateProduct(java.sql.Date.valueOf(now)),
				"Product which is expiry date is over are listed.");
	}

	@Override
	public DataResult<List<ProductDto>> getDoesntOverExpireDateProduct() {
		
		LocalDate now = LocalDate.now();
		
		return new SuccessDataResult<List<ProductDto>>
		(this.productDao.getDoesntOverExpireDateProduct(java.sql.Date.valueOf(now)),
				"Product which is expiry date is not over are listed.");
	}

}
