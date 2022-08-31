package patika.ftTeknolojiPracticum.api.controllers;


import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import patika.ftTeknolojiPracticum.business.abstracts.ProductCommentService;
import patika.ftTeknolojiPracticum.core.utilities.results.DataResult;
import patika.ftTeknolojiPracticum.entities.dtos.ProductCommentDto;

@RestController
@RequestMapping("/api/productComment/")
public class ProductCommentController {
	
	private ProductCommentService productCommentService;

	public ProductCommentController(ProductCommentService productCommentService) {
		super();
		this.productCommentService = productCommentService;
	}
	
	
	@GetMapping("getByProduct")
	public DataResult<List<ProductCommentDto>> getProductId(@RequestParam int productId){
		return this.productCommentService.getProductId(productId);
	}

	
	@GetMapping("getProductIdDateBetween")
	public DataResult<List<ProductCommentDto>> getProductIdDateBetween
	(@RequestParam int productId,@RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate,
			@RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate){
		return this.productCommentService.getProductIdDateBetween(productId ,startDate, endDate);
	}
	
	@GetMapping("getByUserId")
	public DataResult<List<ProductCommentDto>> getByUserId(@RequestParam int userId){
		return this.productCommentService.getUserId(userId);
	}
	
	@GetMapping("getUserIdDateBetween")
	public DataResult<List<ProductCommentDto>> getUserIdDateBetween(@RequestParam int userId, 
			@RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate,
			@RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate){
		return this.productCommentService.getUserIdDateBetween(userId, startDate, endDate);
	}
	
	
}
