package com.org.excel;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.org.excel.controller.ScmpController;
import com.org.excel.service.ScmpService;


@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class ExcelSpringBootApplicationTests {
	@InjectMocks
	ScmpController scmpController;
	
	@Mock
	ScmpService  scmpService;
	
	
	@Test
	public void loadMap() {
		{ 
			 for (int i=0; i<100; i++) 
		        {
					MyThread object = new MyThread(); 
		            object.start(); 
		        }
        } 
	}



}
