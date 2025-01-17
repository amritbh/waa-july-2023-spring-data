package com.w1d3.springdata.repository;

import com.w1d3.springdata.entity.Category;
import com.w1d3.springdata.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product,Integer> {
    List<Product> findByPriceGreaterThan(double minPrice);
    List<Product> findByCategory_NameIgnoreCaseAndPriceLessThan(String cat, double maxPrice);

    List<Product> findByNameContainsIgnoreCase(String keyword);
}
