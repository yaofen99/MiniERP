package com.robin.mapper;

import com.robin.pojo.*;
import com.robin.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class mapperTests {

    @Test
    public void EmployeeAddTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = new Employee("张三", "123456", "123456789", 0);
        mapper.addEmployee(employee);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void CustomerAddTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = new Customer("TestCustomerName");
        mapper.addCustomer(customer);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void ContractAddTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ContractMapper mapper = sqlSession.getMapper(ContractMapper.class);
        java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
        Contract contract = new Contract("testName", 1, 1, date, date,  1, 1, "testDescription");
        mapper.addContract(contract);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void ProjectAddTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ProjectMapper mapper = sqlSession.getMapper(ProjectMapper.class);
        java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
        Project project = new Project("testName", date, date,  1, 1, 1, 1, 1, "testDescription");
        mapper.addProject(project);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void ExpenseLogAddTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ExpenseLogMapper mapper = sqlSession.getMapper(ExpenseLogMapper.class);
        java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
        ExpenseLog log = new ExpenseLog(1, "test", 1, 1, "kg", 1, 1, 1, 1, "testDescription", date);
        mapper.addExpenseLog(log);
        sqlSession.commit();
        sqlSession.close();
    }


}
