package com.lk.dynamicprogramming.tracxn.test;

import com.lk.dynamicprogramming.tracxn.MessageDycriptor;

import junit.framework.TestCase;

public class MessageDycriptorTest extends TestCase {
	
	
	public void test() {
		// TODO Auto-generated method stub
		
		/*assertEquals("12345.123.456", "1234502468.123.456135");
		// expected:<....123.456> but was:<...02468.123.456135>
*/		
		MessageDycriptor dycriptor=new MessageDycriptor();
		//Checking pure number
          /* assertEquals(false, dycriptor.case1("124354.23323w.232"));
           assertEquals(false, dycriptor.case1("12435423323w.232"));
           assertEquals(true, dycriptor.case1("124354.23323.232"));
           assertEquals(false, dycriptor.case1("124354weweewwe.23323.232"));*/
           //case2
           /*
       	 * number of digits is equal to no.of digit after it otherwise two more
       	 * digits after it i.e. 12345.45648.123.345.1 or 12345.123.1
       	 */
           assertEquals(true, dycriptor.case2("12345.123.1"));
           assertEquals(false, dycriptor.case2("1234522123.123.1"));
           
		


	}
	
	
	

}
