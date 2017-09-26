package com.ondot.recipe.repository;

import com.ondot.recipe.domain.Recipe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.CrudRepository;

public  interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
