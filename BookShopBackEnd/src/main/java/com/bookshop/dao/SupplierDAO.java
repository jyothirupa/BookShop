package com.bookshop.dao;

import java.util.List;

import com.bookshop.model.Supplier;

public interface SupplierDAO {

	public Supplier insertSupplier(Supplier supplier);

	public Supplier updateSupplier(Supplier supplier);

	void deleteSupplier(int id);

	Supplier getSupplierById(int id);

	List<Supplier> getAllSuppliers();
}
