package guru.springfamework.api.v1.mapper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import guru.springfamework.api.v1.model.CategoryDTO;
import guru.springfamework.domain.Category;

public class CategoryMapperTest {

	private static final String NAME = "Joe";
	private static final long ID = 1L;
	CategoryMapper categoryMapper = CategoryMapper.INSTANCE;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void categoryToCategoryDTO() {
		//given
		Category category = new Category();
		category.setName(NAME);
		category.setId(ID);
		
		//when
		CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDTO(category);
		
		//then
		assertEquals(Long.valueOf(ID), categoryDTO.getId());
		assertEquals(NAME, categoryDTO.getName());
	}

}
