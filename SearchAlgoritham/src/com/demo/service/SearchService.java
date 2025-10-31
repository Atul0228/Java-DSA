package com.demo.service;

public interface SearchService {

	boolean addValues(int[] array, int size);

	void show(int[] array);

	int sequentialSearch(int[] array, int number);

	int binarySearch(int[] array, int number);

}
