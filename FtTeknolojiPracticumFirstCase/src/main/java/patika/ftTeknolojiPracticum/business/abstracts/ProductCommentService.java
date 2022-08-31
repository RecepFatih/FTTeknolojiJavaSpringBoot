package patika.ftTeknolojiPracticum.business.abstracts;


import java.util.Date;
import java.util.List;

import org.springframework.data.repository.query.Param;

import patika.ftTeknolojiPracticum.core.utilities.results.DataResult;
import patika.ftTeknolojiPracticum.entities.dtos.ProductCommentDto;

public interface ProductCommentService {
	
	DataResult<List<ProductCommentDto>> getProductId(int productId);
	DataResult<List<ProductCommentDto>> getProductIdDateBetween(int productId,@Param("startDate") Date startDate,@Param("endDate") Date endDate);
	DataResult<List<ProductCommentDto>> getUserId(int userId);
	DataResult<List<ProductCommentDto>> getUserIdDateBetween(int userId,@Param("startDate") Date startDate,@Param("endDate") Date endDate);
	
	
}
