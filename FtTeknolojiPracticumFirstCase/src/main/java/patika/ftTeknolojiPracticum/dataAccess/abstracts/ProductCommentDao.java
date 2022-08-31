package patika.ftTeknolojiPracticum.dataAccess.abstracts;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import patika.ftTeknolojiPracticum.entities.concretes.ProductComment;
import patika.ftTeknolojiPracticum.entities.dtos.ProductCommentDto;

public interface ProductCommentDao extends JpaRepository<ProductComment, Integer>{
	
	
	
	@Query("Select new patika.ftTeknolojiPracticum.entities.dtos.ProductCommentDto"
			+" (p.productName,  u.firstName, u.lastName, pc.productComment, pc.postingDate)"
			+" From ProductComment pc Inner Join pc.product p Inner Join pc.user u"
			+" where pc.product.id =:productId")
	List<ProductCommentDto> getProductId(int productId);
	
	@Query("Select new patika.ftTeknolojiPracticum.entities.dtos.ProductCommentDto"
			+" (p.productName,  u.firstName, u.lastName, pc.productComment, pc.postingDate)"
			+" From ProductComment pc Inner Join pc.product p Inner Join pc.user u"
			+" where pc.product.id =:productId and pc.postingDate >= :startDate and pc.postingDate <= :endDate")
	List<ProductCommentDto> getProductIdDateBetween(int productId,@Param("startDate") Date startDate,@Param("endDate") Date endDate);
	
	@Query("Select new patika.ftTeknolojiPracticum.entities.dtos.ProductCommentDto"
			+" (p.productName,  u.firstName, u.lastName, pc.productComment, pc.postingDate)"
			+" From ProductComment pc Inner Join pc.product p Inner Join pc.user u"
			+" where pc.user.id =:userId")
	List<ProductCommentDto> getUserId(int userId);
	
	@Query("Select new patika.ftTeknolojiPracticum.entities.dtos.ProductCommentDto"
			+" (p.productName,  u.firstName, u.lastName, pc.productComment, pc.postingDate)"
			+" From ProductComment pc Inner Join pc.product p Inner Join pc.user u"
			+" where pc.user.id =:userId and pc.postingDate >= :startDate and pc.postingDate <= :endDate")
	List<ProductCommentDto> getUserIdDateBetween(int userId,@Param("startDate") Date startDate,@Param("endDate") Date endDate);
	
	
	
	
}
