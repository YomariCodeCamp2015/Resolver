package com.ashim.base;

import java.util.List;

public interface DaoModel<T>
{

	public void insertOrUpdate(T obj);

	public void deleteRow(T obj);

	public T getRowById(Integer id);

	public List<T> getList();
}