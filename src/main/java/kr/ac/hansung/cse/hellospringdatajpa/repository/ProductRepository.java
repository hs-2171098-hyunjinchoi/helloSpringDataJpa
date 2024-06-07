package kr.ac.hansung.cse.hellospringdatajpa.repository;

import kr.ac.hansung.cse.hellospringdatajpa.entity.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Product에 대한 CRUD가 자동으로 생성됨
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String name);
    List<Product> findByNameContaining(String searchKeyword, Pageable paging);


}
