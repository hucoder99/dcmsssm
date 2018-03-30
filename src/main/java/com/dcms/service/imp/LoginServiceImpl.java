package com.dcms.service.imp;

import com.dcms.dao.StudentMapper;
import com.dcms.dao.TeacherMapper;
import com.dcms.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl  {
    @Autowired
    StudentMapper stu;
    TeacherMapper tea;
    //检查学生账号
    public boolean checkStu(String account,String pwd) {
        Student student = stu.qryByAccountAndPwd(account,pwd);
        if (null!=student){
            return true;
        }
        return false;
    }
    //检查老师账号
    public boolean checkTea(String account,String pwd) {
        return false;
    }
}
