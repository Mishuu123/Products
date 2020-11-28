package com.Product.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.Product.Model.AddressModel;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class AddressModelTest {
 
	
	@Test
	public void getaddressLOne(){
	String addL="sonipat";
	AddressModel a=new AddressModel();
	a.setAddressLOne(addL);
	assertEquals("Provide adressFirstLine",addL,a.getAddressLOne());
		
	}
}
