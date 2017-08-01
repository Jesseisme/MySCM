package cn.itcast.scm.dao;

import cn.itcast.scm.entity.SysParam;
import java.util.List;

public interface SysParamMapper extends BaseMapper<SysParam> {
	public List<SysParam> selectList(String type);

	public List<SysParam> selectOthreTable(String sql);
}