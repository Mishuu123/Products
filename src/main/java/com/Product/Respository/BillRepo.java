package com.Product.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Product.Entity.Bill;

@Repository
public interface BillRepo extends CrudRepository<Bill, Integer> {

	@Query(value = "Select b from Bill b where b.customerId= :customerId")
	public List<Bill> getBillBycustomerId(@Param("customerId") Integer customerId);

}