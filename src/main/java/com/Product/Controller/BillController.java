package com.Product.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Product.Model.BillModel;
import com.Product.Service.BillService;

@RestController
public class BillController {

	@Autowired
	BillService billService;

	@PostMapping("/bill/")
	public ResponseEntity<BillModel> createBill(@Valid @RequestBody BillModel billRequest) {
		BillModel billResponse = billService.addBill(billRequest);
		return ResponseEntity.status(HttpStatus.OK).body(billResponse);
	}

	@PutMapping("/bill/")
	public ResponseEntity<BillModel> updateBill(@Valid @RequestBody BillModel billRequest) {
		BillModel billResponse = billService.updateBill(billRequest);
		return ResponseEntity.status(HttpStatus.OK).body(billResponse);
	}

	@GetMapping("/bill/{id}")
	public ResponseEntity<BillModel> getBill(@PathVariable(value = "id") Integer id) {
		BillModel billResponse = billService.getBill(id);
		return ResponseEntity.status(HttpStatus.OK).body(billResponse);

	}

	@GetMapping("get/billAll/")
	public ResponseEntity<List<BillModel>> getAllBill() {
		List<BillModel> billResponse = billService.getAllBill();
		return ResponseEntity.status(HttpStatus.OK).body(billResponse);

	}

	@GetMapping("billPrice/{customerId}")
	public ResponseEntity<Double> getPriceOfCustomer(@PathVariable(value = "customerId") Integer customerId) {
		Double billResponse = billService.getTotalOfCustomer(customerId);
		return ResponseEntity.status(HttpStatus.OK).body(billResponse);

	}

	@DeleteMapping("/deleteBill/{id}")
	public void deleteBill(@Valid @PathVariable(value = "id") Integer id) {
		billService.deleteBill(id);

	}
}
