package com.beingjavaguys.dao;

import java.util.List;
import com.beingjavaguys.domain.User;

public interface UserDao {
	
public void saveUser ( User user );
public List<User> getUser();

}
