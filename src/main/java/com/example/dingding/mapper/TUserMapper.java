package com.example.dingding.mapper;

 import com.example.dingding.commons.mapper.BaseMapper;
import com.example.dingding.entity.TUser;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TUserMapper extends BaseMapper<TUser> {
    @Select("select  * from user where nickname=#{n} or phone=#{p}")
    @ResultType(User.class)
    User selectByNamePhone(@Param("n") String  n , @Param("p") String p);

    @Select("select * from user where nickname=#{n} or phone =#{n}")
    @ResultType(User.class)
    User selectByName(String n);

    @Select("select * from user where email = #{email}")
    @ResultType(User.class)
    User selectByEmail(String email);

    @Update("update user set password = #{password} where email = #{email} ")
    int findPwd(String email,String password);

    @Update("update user set password = #{password} where id = #{uid} ")
    int updatePwd(int uid, String password);

}
