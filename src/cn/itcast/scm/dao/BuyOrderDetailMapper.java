package cn.itcast.scm.dao;

import cn.itcast.scm.entity.BuyOrderDetail;
import java.util.List;

public interface BuyOrderDetailMapper extends BaseMapper<BuyOrderDetail> {
	public int insertList(List<BuyOrderDetail> buyOrderDetails);
}