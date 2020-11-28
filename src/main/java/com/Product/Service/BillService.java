package com.Product.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Product.Helper.ProductHelper;
import com.Product.Mapper.BillMapper;
import com.Product.Model.BillModel;
import com.Product.entity.Bill;
import com.Product.respository.BillRepo;
import com.Product.respository.CustomerRepo;

@Service
public class BillService {

	
	@Autowired
	BillRepo prodRepo;

	@Autowired
	CustomerRepo customRepo;

	@Autowired
	ProductHelper prodHelper;

	public BillModel getBill(Integer id) {
		Optional<Bill> response = prodRepo.findById(id);
		return BillMapper.INSTANCE.entityToBillModel(response.get());

	}

	public BillModel addBill(BillModel model) {
		Bill bill = BillMapper.INSTANCE.billModelToEntity(model);
		prodHelper.billAssociation(bill);
		Bill response = prodRepo.save(bill);
		return BillMapper.INSTANCE.entityToBillModel(response);

	}

	public List<BillModel> getAllBill() {
		Iterable<Bill> response = prodRepo.findAll();
		return BillMapper.INSTANCE.entityToBillModel(response);

	}

	public Double getTotalOfCustomer(Integer id) {
		List<Bill> bills = prodRepo.getBillBycustomerId(id);
		Double total = bills.stream().mapToDouble(b -> b.getTotalPrice()).sum();
		return total;

	}
	
}
