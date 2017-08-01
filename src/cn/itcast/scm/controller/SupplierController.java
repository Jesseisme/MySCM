package cn.itcast.scm.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.scm.entity.Page;
import cn.itcast.scm.entity.Supplier;
import cn.itcast.scm.service.SupplierService;

@Controller
@RequestMapping("/supplier")
public class SupplierController extends BaseController{
	
	@Resource
	private SupplierService supplierService;
	
	@RequestMapping("/insert")
	@ResponseBody //如果返回的是Jason 需要此注解
	public Object insertSupplier(Supplier supplier){
		System.out.println("---------"+supplier);
		int i = 0;
		try {
			i = supplierService.insert(supplier);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return i;
	}
	
	//根据主键修改
	@RequestMapping("/update")
	@ResponseBody
	public Object updataSupplier(Supplier supplier){
		int i = 0;
		System.out.println("-------update");
		 try {
			i = supplierService.update(supplier);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return i;
	}
	//根据主键（数组） 删除
	@RequestMapping("/deleteList")
	@ResponseBody //如果返回的是Jason 需要此注解
	public Object deleteList(String [] pks){
		int i=0;
		try {
			i = supplierService.deleteList(pks);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	//多条件分页查询
	@RequestMapping("/selectPageUseDyc")
	@ResponseBody //如果返回json格式，需要这个注解，这里用来测试环境
	public Object selectPageUseDyc(Page<Supplier> page,Supplier supplier){
		
		page.setParamEntity(supplier);
		//System.out.println("----page:"+page);
		
		Page<Supplier> p = supplierService.selectPageUseDyc(page);//查询后的
		//System.out.println("----page:"+page);
		//supplier.setSupName("supName1");
/*		Map<String, Object> map =new HashMap<String, Object>();
		map.put("total",p.getTotalRecord());
		map.put("rows",p.getList());*/
		return p.getPageMap();
	}
	

	
	//通过关键字分页查询
	@RequestMapping("/selectPage")
	@ResponseBody //如果返回json格式，需要这个注解，这里用来测试环境
	public Object selectPage(Page<Supplier> page){

		supplierService.selectPage(page);//查询后的
		System.out.println("----page:"+page);
		//supplier.setSupName("supName1");
/*		Map<String, Object> map =new HashMap<String, Object>();
		map.put("total",p.getTotalRecord());
		map.put("rows",p.getList());*/
		return page.getPageMap();
	}
	
	/*@RequestMapping(value="/supplierlist")
	public String list(){
		System.out.println("---action.list:");
	
		return "forward:/WEB-INF/supplier/supplierlist.jsp";
	}*/
	

	
	@RequestMapping("/doAjax")
	@ResponseBody //如果返回的是Jason 需要此注解
	public Object doAjax(Supplier supplier){
		System.out.println("----"+supplier);
		supplier.setSupName("modify");
		return supplier;
	}
	
	
}
