package com.wipro.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.wipro.task.DailyTask;

public class App {

	
		DailyTask d= new DailyTask();
		@Test
		public void test(){
//			assertEquals("abc def", d.doStringConcat("abc", "def"));
			assertEquals("a b", d.doStringConcat("a", "b"));
		}
		public void testsort() {
			int arr[]= {3,2,1};
			int as[]=d.sortValues(arr);
			assertEquals(as,arr);
		}
		
		public void check() {
			assertEquals(true, d.checkPresence("abc", "ab"));
		}
		
	}

