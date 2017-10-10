package cn.itcast.scm.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.scm.entity.Page;
import cn.itcast.scm.entity.Supplier;
import cn.itcast.scm.service.SupplierService;

@Controller
@RequestMapping("/supplier")
public class SupplierAction extends BaseAction {
	@Resource
	private SupplierService supplierService;

	@RequestMapping(value = "/insert")
	@ResponseBody
	public Object insert(Supplier supplier) {
		System.out.println("---action.supplier:" + supplier);
		int i=0;
		try {
			i=supplierService.insert(supplier);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	// ͨ���ؼ��ַ�ҳ��ѯ
	@RequestMapping("/selectPage")
	@ResponseBody
	// �������json��ʽ����Ҫ���ע�⣬�����������Ի���
	public Object selectPage(Page<Supplier> page,Supplier supplier) {
	
		Page p=supplierService.selectPage(page);
		System.out.println(p);
		
		/*Map<String, Object> map=new HashMap<String,Object >();
		map.put("total", p.getTotalRecord());
		map.put("rows", p.getList());*/
		return page.getPageMap() ;

	}

	// ͨ���ؼ��ַ�ҳ��ѯ
		@RequestMapping("/deleteList")
		@ResponseBody
		// �������json��ʽ����Ҫ���ע�⣬�����������Ի�������ǩ�����첽����
		public Object deleteList(String[] pks) {
		
			System.out.println("--------"+pks);
			int i=0;
			try {
				i=supplierService.deleteList(pks);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return i ;

		}
		
		// ͨ���ؼ��ַ�ҳ��ѯ
		@RequestMapping("/selectPageUseDyc")
		@ResponseBody
		// �������json��ʽ����Ҫ���ע�⣬�����������Ի���
		public Object selectPageUseDyc(Page<Supplier> page,Supplier supplier) {
		
			page.setParaEntity(supplier);			
			System.out.println("---------"+page);
			Page p=supplierService.selectPageUseDyc(page);
			
			/*Map<String, Object> map=new HashMap<String,Object >();
			map.put("total", p.getTotalRecord());
			map.put("rows", p.getList());*/
			return p.getPageMap() ;

		}	
		
	 @RequestMapping("/doAjax")
	 @ResponseBody //�������json��ʽ����Ҫ���ע�⣬�����������Ի���
	 public Object doAjax(Supplier supplier){
	 System.out.println("---doAjax.supplier:"+supplier);
	 supplier.setSupName("supName1");
	 return supplier;
	 }
}
