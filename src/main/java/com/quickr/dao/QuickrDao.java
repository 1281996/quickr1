package com.quickr.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.quickr.pojo.UserAccount;

public interface QuickrDao extends MongoRepository<UserAccount, String> {

}
