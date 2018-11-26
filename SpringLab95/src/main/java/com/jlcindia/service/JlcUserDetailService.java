package com.jlcindia.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.jlcindia.dao.UserDAO;
import com.jlcindia.hibernate.UserRole;

@Service("userDetailsService")
public class JlcUserDetailService implements UserDetailsService {
@Autowired
private UserDAO userDao;
@Transactional(readOnly=true)
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
{
com.jlcindia.hibernate.User user= userDao.findUserByUsername(username);
List<GrantedAuthority>authorities=new ArrayList<GrantedAuthority>();
for(UserRole userRole : user.getUserRole())
{
authorities.add(new SimpleGrantedAuthority(userRole.getRole()));	
}
return new User(user.getUsername(),user.getPassword(),user.isEnabled(),true,true,true,authorities);
}
}
