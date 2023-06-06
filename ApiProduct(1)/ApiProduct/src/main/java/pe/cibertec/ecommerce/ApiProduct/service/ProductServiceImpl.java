
package pe.cibertec.ecommerce.ApiProduct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiProduct.dao.ProductRepository;
import pe.cibertec.ecommerce.ApiProduct.dto.ProductDTO;
import pe.cibertec.ecommerce.ApiProduct.entity.Category;
import pe.cibertec.ecommerce.ApiProduct.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ApiRestClient apiRestClient;

    @Override
    public Product add(Product product) {
        return productRepository.save(product);
        
    }

    @Override
    public ProductDTO findById(Long id) {
        Product p=productRepository.findById(id).get();
        Category c=apiRestClient.finByCategoryId(p.getIdCategory());
        ProductDTO productDTO=new ProductDTO();
        productDTO.setId(p.getId());
        productDTO.setProducName(p.getProductName());
        productDTO.setUnitPrice(p.getUnitPrice());
        productDTO.setCategory(c);
        return productDTO;
    }
    
}
