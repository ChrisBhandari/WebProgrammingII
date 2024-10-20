package com.ticket.project.business.service;

import com.ticket.project.data.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
