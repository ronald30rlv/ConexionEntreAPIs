
package pe.cibertec.ecommerce.ApiProduct.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.cibertec.ecommerce.ApiProduct.entity.Category;

@FeignClient(value = "feig-client",url="http://localhost:8085")
public interface ApiRestClient {
    //Recuerda que se crearon 2 entidades, Catedory no es tabla
   @GetMapping("api/category/findByIdCategory/{idCategory}") //Lo llamas de la ApiCategory(buscas la ruta(endpoint) del findByIdCategory)
   public Category finByCategoryId(@PathVariable String idCategory); 
}
