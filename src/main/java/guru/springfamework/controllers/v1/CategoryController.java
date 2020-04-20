package guru.springfamework.controllers.v1;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springfamework.api.v1.model.CategoryDTO;
import guru.springfamework.api.v1.model.CategoryListDTO;
import guru.springfamework.services.CategoryService;

@Controller
@RequestMapping("/api/v1/categories/")
public class CategoryController {

	private final CategoryService categoryService;

	public CategoryController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}
	
	@GetMapping
	public ResponseEntity<List<CategoryDTO>> getAllCategories() {
		
		return new ResponseEntity<List<CategoryDTO>>(categoryService.getAllCategories(), HttpStatus.OK);
	}
	
	
    @GetMapping("{name}")
    public ResponseEntity<CategoryDTO> getCategoryByName( @PathVariable String name){
        return new ResponseEntity<CategoryDTO>(
                categoryService.getCategoryByName(name), HttpStatus.OK
        );
    }
	
	
}
