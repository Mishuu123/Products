package com.Product.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Product.Entity.Bill;

@Repository
public interface BillRepo extends JpaRepository<Bill, Integer> {

	@Query(value = "Select b from Bill b where b.customerId= :customerId")
	public List<Bill> getBillBycustomerId(@Param("customerId") Integer customerId);

	@Query(value = "Select b from Bill b where b.id= :id")
	public Bill findByBillId(@Param("id") Integer id);

	@Modifying
	@Query(value = "Delete from Bill b where b.id= :id")
	public void deleteByBillId(Integer id);

}