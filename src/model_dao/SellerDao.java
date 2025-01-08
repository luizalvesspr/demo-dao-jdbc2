package model_dao;

import java.util.List;

import Model.Entities.Department;
import Model.Entities.Seller;

public interface SellerDao {
	void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
    
}
