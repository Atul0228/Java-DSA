package com.demo.service;

import com.demo.dao.SearchDao;
import com.demo.dao.SearchDaoImplementation;

public class SearchServiceImplementation implements SearchService{
	
	SearchDao sDao=new SearchDaoImplementation();

	@Override
	public boolean addValues(int[] array, int size) {
		
		return sDao.addValues(array,size);
	}

	@Override
	public void show(int[] array) {
		sDao.show(array);
		
	}

	@Override
	public int sequentialSearch(int[] array, int number) {
		
		return sDao.sequentialSearch(array,number);
	}

	@Override
	public int binarySearch(int[] array, int number) {
		
		return sDao.binarySearch(array,number);
	}
	
	


}
