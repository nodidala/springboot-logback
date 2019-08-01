package com.paul.springbootlogback.service;

import com.paul.springbootlogback.model.User;

/**
 * @author paul
 * @Description
 * @date 2019/8/1 17:11
 */
public interface UserService {

    /**
     *根据员工工号，查询员工
     * @param userId 员工编号
     * @return 员工
     */
     User selectUser(String userId);
}
