package com.jlcindia.dao;

import com.jlcindia.hibernate.User;

public interface UserDAO {
User findUserByUsername(String username);

}
