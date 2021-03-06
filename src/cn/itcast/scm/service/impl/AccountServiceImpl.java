package cn.itcast.scm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.scm.dao.AccountMapper;
import cn.itcast.scm.entity.Account;
import cn.itcast.scm.service.AccountService;
@Service("accountService")
public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService {
	
	@Autowired
	private AccountMapper accountMapper;
	
	@Override
	public Account login(Account account) {
		
		return accountMapper.login(account);
	}
	
/*

	@Override
	public int insert(Account account) throws Exception {
		accountMapper.insert(account);
		return 0;
	}

	@Override
	public int update(Account account) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Account account) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Account select(Account account) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Page<Account> selectPage(Page<Account> page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Account> selectPageUseDyc(Page<Account> page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteList(String[] pks) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
*/
}
