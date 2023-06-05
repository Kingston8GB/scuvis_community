package org.scuvis.community.dao;

import org.apache.ibatis.annotations.Mapper;
import org.scuvis.community.entity.User;

/**
 * @author Xiyao Li
 * @date 2023/06/05 15:39
 */

@Mapper
public interface UserMapper {
    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);
}
