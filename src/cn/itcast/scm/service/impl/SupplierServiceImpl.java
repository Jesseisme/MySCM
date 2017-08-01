package cn.itcast.scm.service.impl;

import org.springframework.stereotype.Service;

import cn.itcast.scm.entity.Supplier;
import cn.itcast.scm.service.SupplierService;

@Service("supplierService")
public class SupplierServiceImpl extends BaseServiceImpl<Supplier> implements SupplierService {

/*	@Autowired
	private SupplierMapper supplierMapper;

	@Override
	public int insert(Supplier supplier) throws Exception {

		return supplierMapper.insert(supplier);
	}

	@Override
	public int update(Supplier entity) throws Exception {
		// TODO Auto-generated method stub
		return supplierMapper.update(entity);
	}

	@Override
	public int delete(Supplier entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int deleteList(String[] pks) throws Exception {
		
		return supplierMapper.deleteList(pks);
	}

	@Override
	public Supplier select(Supplier entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Supplier> selectPage(Page<Supplier> page) {
		page.setList(supplierMapper.selectPageList(page));
		page.setTotalRecord(supplierMapper.selectPageCount(page));
		return page;
	}

	@Override
	public Page<Supplier> selectPageUseDyc(Page<Supplier> page) {
		page.setList(supplierMapper.selectPageListUseDyc(page));
		page.setTotalRecord(supplierMapper.selectPageCountUseDyc(page));
		return page;
	}*/



}
