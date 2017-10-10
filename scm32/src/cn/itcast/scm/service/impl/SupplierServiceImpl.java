package cn.itcast.scm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.scm.dao.SupplierMapper;
import cn.itcast.scm.entity.Page;
import cn.itcast.scm.entity.Supplier;
import cn.itcast.scm.service.SupplierService;

@Service("supplierService")
public class SupplierServiceImpl implements SupplierService {
	//这里用autowired 定义Dao层的接口
	@Autowired
	private SupplierMapper supplierMapper;
	
	@Override
	public int insert(Supplier supplier) throws Exception {
		return supplierMapper.insert(supplier);
	}

	@Override
	public int updata(Supplier entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Supplier entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Supplier select(Supplier entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Integer selecPageCount(Supplier entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Supplier> selectPage(Page<Supplier> page) {
		page.setList(supplierMapper.selectPageList(page));
		page.setTotalRecord(supplierMapper.selecPageCount(page));
		return page;
	}

	@Override
	public int deleteList(String[] pks) throws Exception {
		// TODO Auto-generated method stub
		return supplierMapper.deleteList(pks);
	}

	@Override
	public Page<Supplier> selectPageUseDyc(Page<Supplier> page) {
		page.setList(supplierMapper.selectPageListUseDyc(page));
		page.setTotalRecord(supplierMapper.selectPageCountUseDyc(page));
		return page;
	}

}
