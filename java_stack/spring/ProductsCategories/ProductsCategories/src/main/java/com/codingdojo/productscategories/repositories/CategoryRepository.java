package com.codingdojo.productscategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.productscategories.models.Category;
import com.codingdojo.productscategories.models.Product;

//...
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{
// this method retrieves all the books from the database
List<Category> findAll();
List<Category> findByProductsNotContains(Product product);
// this method finds books with descriptions containing the search string
//List<Travel> findByDescriptionContaining(String search);
// this method counts how many titles contain a certain string
//Long countByTitleContaining(String search);
// this method deletes a book that starts with a specific title
//Long deleteByTitleStartingWith(String search);
}
