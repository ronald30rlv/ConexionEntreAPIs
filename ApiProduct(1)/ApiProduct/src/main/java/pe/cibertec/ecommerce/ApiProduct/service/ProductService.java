
package pe.cibertec.ecommerce.ApiProduct.service;

import pe.cibertec.ecommerce.ApiProduct.dto.ProductDTO;
import pe.cibertec.ecommerce.ApiProduct.entity.Product;


public interface ProductService {
    
    public Product add(Product product);
    public ProductDTO findById(Long id);
}
