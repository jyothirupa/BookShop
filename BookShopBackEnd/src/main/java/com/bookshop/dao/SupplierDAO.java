package com.bookshop.dao;

import java.util.List;

import com.bookshop.model.Supplier;

public interface SupplierDAO {

	public boolean insertSupplier(Supplier supplier);

	public void updateSupplier(Supplier supplier);

	public void deleteSupplier(Supplier supplier);

	public Supplier getSupplierById(int id);

	public List<Supplier> getAllSuppliers();
}
