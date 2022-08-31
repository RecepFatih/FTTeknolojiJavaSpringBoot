package patika.ftTeknolojiPracticum.entities.dtos;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProductCommentDto {

	private String productName;
	private String userFirstName;
	private String userLastName;
	private String productComment;
	private Date postingDate;
}
