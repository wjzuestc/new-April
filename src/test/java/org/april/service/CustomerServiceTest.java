package org.april.service;

import org.april.entity.Customer;
import org.april.helper.DatabaseHelper;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * @Description:
 * @Author: Jingzeng Wang
 * @Date: Created in 11:54  2017/5/30.
 */
public class CustomerServiceTest {

    private final CustomerService customerService = new CustomerService();

    @Test
    public void getCustomerList() throws Exception {
        List<Customer> customerList = customerService.getCustomerList();
        Iterator<Customer> iterator = customerList.iterator();
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            System.out.println(customer.toString());
        }
    }

    @Test
    public void getCustomer() throws Exception {
        System.out.println(customerService.getCustomer(2).toString());
    }

    @Test
    public void createCustomer() throws Exception {
        HashMap<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("name", "wang");
        fieldMap.put("phone", "15415454");
        Assert.assertTrue(customerService.createCustomer(fieldMap));
    }

    @Test
    public void updateCustomer() throws Exception {
        int id = 1;
        HashMap<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("name", "eeeee");
        Assert.assertTrue(customerService.updateCustomer(id, fieldMap));
    }

    @Test
    public void deleteCustomer() throws Exception {
        int id = 5;
        Assert.assertTrue(customerService.deleteCustomer(id));
    }

    @Test
    public void executeSqlFile() {
        DatabaseHelper.executeSqlFile("init.sql");
    }
}