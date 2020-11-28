package com.Product.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ProductControllerTest {

	protected MockMvc mvc;
	
	@Autowired
private TestRestTemplate template;
	
	@WithMockUser(username="product",password="varusha")
	@Test
	public void createProduct() throws Exception {
	   String uri = "/bill/";
	   String inputJson ="{\r\n\t\"customerId\":8,\r\n\t\"taxRate\":18,\r\n\t\"totalPrice\":1700,\r\n\t\"product\":[{\r\n\t\t\"productName\":\"banana\",\r\n\t\t\"totalPrice\":500,\r\n\t\t\"rate\":4,\r\n\t\t\"quantity\":5000\r\n\t}]\r\n}";
	   MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
	      .contentType(MediaType.APPLICATION_JSON).content(inputJson).contentType(MediaType.APPLICATION_JSON)).andReturn();
	   
	   int status = mvcResult.getResponse().getStatus();
	   assertEquals(200, status);
	   String content = mvcResult.getResponse().getContentAsString();
	   assertEquals(content, "Bill is created successfully");
	}
	
	@Test
    public void givenAuthRequestOnPrivateService_shouldSucceedWith200() throws Exception {
        ResponseEntity<String> result = template.withBasicAuth("product", "varusha")
          .getForEntity("/api/vi", String.class);
        assertEquals(HttpStatus.OK, result.getStatusCode());
    }
}
