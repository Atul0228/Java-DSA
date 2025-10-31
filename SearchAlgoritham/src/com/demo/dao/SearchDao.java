package com.demo.dao;

public interface SearchDao {

	boolean addValues(int[] array, int size);

	void show(int[] array);

	int sequentialSearch(int[] array, int number);

	int binarySearch(int[] array, int number);

}
