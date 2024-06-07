package kr.ac.hansung.cse.hellospringdatajpa.repository;

import kr.ac.hansung.cse.hellospringdatajpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// Product에 대한 CRUD가 자동으로 생성됨
public interface ProductRepository extends JpaRepository<Product, Long> {

}
