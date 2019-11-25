package com.manthan.calculator;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class FilterTest {

	@Test
	void testMyFilter() {
		DBUtilImp dbUtilImp=mock(DBUtilImp.class);
		Filter f=new Filter(dbUtilImp);
		when(dbUtilImp.getname()).thenReturn(Arrays.asList("Amit","divya","banu"));
		
		List<String> myList=f.myfilter();
		assertEquals(1, myList.size());
	}
}
