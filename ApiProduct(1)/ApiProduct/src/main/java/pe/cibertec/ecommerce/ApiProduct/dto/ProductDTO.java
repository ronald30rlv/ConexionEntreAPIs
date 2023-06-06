
package pe.cibertec.ecommerce.ApiProduct.dto;

import lombok.Data;
import pe.cibertec.ecommerce.ApiProduct.entity.Category;

@Data
public class ProductDTO {
    private Long id;
    private String producName;
    private Double unitPrice;
    private Category category;
}
