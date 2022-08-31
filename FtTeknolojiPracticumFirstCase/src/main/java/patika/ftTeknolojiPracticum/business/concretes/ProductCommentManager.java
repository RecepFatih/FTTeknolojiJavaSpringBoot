package patika.ftTeknolojiPracticum.business.concretes;


import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import patika.ftTeknolojiPracticum.business.abstracts.ProductCommentService;
import patika.ftTeknolojiPracticum.core.utilities.results.DataResult;
import patika.ftTeknolojiPracticum.core.utilities.results.SuccessDataResult;
import patika.ftTeknolojiPracticum.dataAccess.abstracts.ProductCommentDao;
import patika.ftTeknolojiPracticum.entities.dtos.ProductCommentDto;

@Service
public class ProductCommentManager implements ProductCommentService{
	
	private ProductCommentDao productCommentDao;
	
	public ProductCommentManager(ProductCommentDao productCommentDao) {
		super();
		this.productCommentDao = productCommentDao;
	}

	@Override
	public DataResult<List<ProductCommentDto>> getProductId(int productId) {
		
		return new SuccessDataResult<List<ProductCommentDto>>
		(this.productCommentDao.getProductId(productId),"Comment of the product are listed.");
	}

	@Override
	public DataResult<List<ProductCommentDto>> getUserId(int userId) {
		return new SuccessDataResult<List<ProductCommentDto>>
		(this.productCommentDao.getUserId(userId),"Comment of the product are listed.");
	}

	@Override
	public DataResult<List<ProductCommentDto>> getProductIdDateBetween(int productId, Date startDate, Date endDate) {
		
		return new SuccessDataResult<List<ProductCommentDto>>
		(this.productCommentDao.getProductIdDateBetween(productId, startDate, endDate),"The products in the desired date range are listed.");
	}

	@Override
	public DataResult<List<ProductCommentDto>> getUserIdDateBetween(int userId, Date startDate, Date endDate) {
		return new SuccessDataResult<List<ProductCommentDto>>
		(this.productCommentDao.getUserIdDateBetween(userId, startDate, endDate),"User's comments are listed.");
	
	}

	

}
