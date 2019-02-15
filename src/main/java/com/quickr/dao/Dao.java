package com.quickr.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quickr.pojo.UserAccount;

@RestController
public class Dao {
	@Autowired
	QuickrDao quickrDao;
	@RequestMapping(method=RequestMethod.POST,value="/api/users/create")
	void addUser(UserAccount userAccount) {
		quickrDao.save(userAccount);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/api/users")
	List<UserAccount> findUser(UserAccount userAccount) {
		List<UserAccount> userList	=quickrDao.findAll();
		 
		return userList;
		
		
	}

}
