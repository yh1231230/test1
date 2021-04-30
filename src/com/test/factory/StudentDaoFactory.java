package com.test.factory;

import com.test.dao.BaseDao;
import com.test.dao.OtherStudentDao;

public class StudentDaoFactory {
    public static BaseDao getStudentDao(){
        return new OtherStudentDao();
    }
}
