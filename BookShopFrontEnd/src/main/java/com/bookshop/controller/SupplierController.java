package com.bookshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookshop.dao.SupplierDAO;
import com.bookshop.model.Supplier;

@Controller
public class SupplierController {

	@Autowired
	Supplier supplier;

	@Autowired
	SupplierDAO supplierDAO;

	//add supplier get method
	@RequestMapping(value = "/manage_supplier_create", method = RequestMethod.GET)
	public ModelAndView getcreateSupplierForm() {

		ModelAndView mv = new ModelAndView("createSupplierForm");
		mv.addObject("createSupplierObj", supplier);// domain
		return mv;

	}

	//add supplier post method
	@RequestMapping(value = "/manage_supplier_create", method = RequestMethod.POST)
	public ModelAndView createSupplier(@ModelAttribute(value = "createSupplierObj") Supplier supplier) {

		ModelAndView mv = new ModelAndView("adminHome");
		if (supplierDAO.insertSupplier(supplier)) {
			mv.addObject("message", "Successfully created the supplier");
			List<Supplier> supplierList = supplierDAO.getAllSuppliers();
			mv.addObject("supplierList", supplierList);
			mv.addObject("isUserClickedSuppliers", "true");

		} else {
			mv.addObject("message", "Not able to create Supplier.Please contact Administrator");
		}

		return mv;

	}

	//delete Supplier method
	@RequestMapping(value = "/manage_supplier_delete/{id}", method = RequestMethod.GET)
	public String deleteSupplier(@PathVariable(value = "id") int id, Model model) {

		Supplier supplier = supplierDAO.getSupplierById(id);
		supplierDAO.deleteSupplier(supplier);
		return "redirect:/getAllSuppliers";

	}

	// displays all the Suppliers 
	@RequestMapping(value = "/getAllSuppliers")
	public ModelAndView getAllSuppliers() {
		List<Supplier> allSuppliers = supplierDAO.getAllSuppliers();
		ModelAndView mv = new ModelAndView("supplier", "supplierList", allSuppliers);
		return mv;
	}

	// edit supplier get method
	@RequestMapping(value = "/manage_supplier_edit/{id}", method = RequestMethod.GET)
	public ModelAndView getEditSupplierForm(@PathVariable(value = "id") int id) {

		Supplier supplier = this.supplierDAO.getSupplierById(id);
		return new ModelAndView("editSupplierForm", "editSupplierObj", supplier);
	}

	// edit supplier post method
	@RequestMapping(value = "/manage_supplier_edit", method = RequestMethod.POST)
	public String editSupplier(@ModelAttribute(value = "editSupplierObj") Supplier supplier, Model model) {
		this.supplierDAO.updateSupplier(supplier);
		return "redirect:/getAllSuppliers";

	}

}
