package cn.itcast.scm.service;

import cn.itcast.scm.entity.Page;

public interface BaseService<T> {
	// ��ӵ�������

	int insert(T entity) throws Exception;

	// �޸ĵ�������

	int updata(T entity) throws Exception;

	// ɾ����������

	int delete(T entity) throws Exception;

	// ��ѯ��������

	T select(T entity) throws Exception;

	// ͨ���ؼ��ַ�ҳ��ѯ

	Page<T> selectPage(Page<T> page);

	// ͨ���ؼ��ַ�ҳ��ѯ�������ܼ�¼��

	Integer selecPageCount(T entity);

	// ͨ�����������飩����ɾ������

	int deleteList(String[] pks) throws Exception;

	// ͨ����������ҳ��ѯ
	Page<T> selectPageUseDyc(Page<T> page);

}
