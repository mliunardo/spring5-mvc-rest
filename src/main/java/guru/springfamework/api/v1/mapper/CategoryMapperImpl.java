package guru.springfamework.api.v1.mapper;

import org.springframework.stereotype.Component;

import guru.springfamework.api.v1.model.CategoryDTO;
import guru.springfamework.domain.Category;

@Component
public class CategoryMapperImpl implements CategoryMapper{

	@Override
	public CategoryDTO categoryToCategoryDTO(Category category) {
		if (category == null) {
			return null;
		}
		
		CategoryDTO categoryDTO = new CategoryDTO();
		
		categoryDTO.setId(category.getId());
		categoryDTO.setName(category.getName());
		
		return categoryDTO;
	}
}
