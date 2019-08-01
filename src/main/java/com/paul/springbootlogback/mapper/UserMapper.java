package com.paul.springbootlogback.mapper;

import com.paul.springbootlogback.model.User;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author paul
 * @date 2019/8/1 17:10
 */
@Repository
public interface UserMapper {
    @Select("SELECT id, user_id userId, user_name userName FROM user_tab WHERE user_id = #{userId}")
    @ResultType(User.class)
    User selectUser(String userId);
}
