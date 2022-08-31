package patika.ftTeknolojiPracticum.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import patika.ftTeknolojiPracticum.business.abstracts.ProductService;
import patika.ftTeknolojiPracticum.core.utilities.results.DataResult;import patika.ftTeknolojiPracticum.entities.dtos.ProductDto;

@RestController
@RequestMapping("/api/product/")
public class ProductController {
	
	private ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping("getOverExpireDateProduct")
	public DataResult<List<ProductDto>> getOverExpireDateProduct(){
		return this.productService.getOverExpireDateProduct();
	}
	
	@GetMapping("getDoesntOverExpireDateProduct")
	public DataResult<List<ProductDto>> getDoesntOverExpireDateProduct(){
		return this.productService.getDoesntOverExpireDateProduct();
	}

}
