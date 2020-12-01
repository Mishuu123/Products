package com.Product.Respository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Product.Entity.Bill;
import com.Product.Entity.User;

@Repository
public interface BillRepo extends CrudRepository<Bill, Integer> {

	public Bill save(Bill bill);

	public Optional<Bill> findById(Integer id);

	public Iterable<Bill> findAll();
	@Query(value = "Select b from Bill b where b.customerId= :customerId")
	public List<Bill> getBillBycustomerId(@Param("customerId")Integer customerId);



}