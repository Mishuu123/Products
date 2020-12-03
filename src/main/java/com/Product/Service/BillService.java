package com.Product.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Product.Entity.Bill;
import com.Product.Helper.ProductHelper;
import com.Product.Mapper.BillMapper;
import com.Product.Model.BillModel;
import com.Product.Respository.BillRepo;
import com.Product.Respository.CustomerRepo;

@Service
public class BillService {

	@Autowired
	BillRepo billRepo;

	@Autowired
	CustomerRepo customRepo;

	@Autowired
	ProductHelper prodHelper;

	public BillModel getBill(Integer id) {
		Bill savedBills = billRepo.findByBillId(id);
		return BillMapper.INSTANCE.entityToBillModel(savedBills);
	}

	public BillModel addBill(BillModel model) {
		Bill bill = BillMapper.INSTANCE.billModelToEntity(model);
		bill.getBillRef().forEach(ref -> {
			ref.getBillRefPk().setBill(bill);
		});
		Bill response = billRepo.save(bill);
		return BillMapper.INSTANCE.entityToBillModel(response);

	}

	public List<BillModel> getAllBill() {
		List<Bill> response = billRepo.findAll();
		return BillMapper.INSTANCE.entityToBillModelList(response);

	}

	public Double getTotalOfCustomer(Integer id) {
		List<Bill> bills = billRepo.getBillBycustomerId(id);
		Double total = bills.stream().mapToDouble(b -> b.getFinalPrice()).sum();
		return total;

	}

	public void deleteBill(Integer id) {
		billRepo.deleteByBillId(id);
	}

}
