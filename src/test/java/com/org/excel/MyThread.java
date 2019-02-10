package com.org.excel;

import org.mockito.Mock;

import com.org.excel.service.ScmpService;

public class MyThread extends Thread 
{ 
	@Mock
	ScmpService  scmpService;
    public void run() 
    { 
        try
        { 
        	 for (int i=0; i<8; i++) 
             {
        		 long version =2000+i;
    		     scmpService.addVersionNumber("20"+i+currentThread(), version); 
             }
  
        } 
        catch (Exception e) 
        { 
           
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
  