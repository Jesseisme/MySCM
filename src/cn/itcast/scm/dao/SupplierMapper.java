package cn.itcast.scm.dao;

import cn.itcast.scm.entity.Supplier;

public interface SupplierMapper extends BaseMapper<Supplier> {
	
	public int insertSupplier(Supplier supplier);
}