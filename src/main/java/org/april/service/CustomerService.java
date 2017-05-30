package org.april.service;

import org.april.entity.Customer;
import org.april.helper.DatabaseHelper;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Jingzeng Wang
 * @Date: Created in 11:51  2017/5/30.
 */
public class CustomerService {

    /**
     * 获得客户列表
     *
     * @return
     */
    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
/*        List<Customer> customerList = new ArrayList<Customer>();
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                Customer customer = new Customer();
                customer.setId(rs.getInt("id"));
                customer.setName(rs.getString("name"));
                customer.setPhone(rs.getString("phone"));
                customerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseHelper.closeConnection(connection);
        }
        System.out.println(customerList);
        return customerList;*/
        return DatabaseHelper.queryEntiyList(Customer.class, sql);
    }

    public Customer getCustomer(int id) {
        String sql = "SELECT * FROM customer where id = ?";
        return DatabaseHelper.queryEntity(Customer.class, sql, id);
    }

    public boolean createCustomer(Map<String, Object> fieldMap) {
        //TODO
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    public boolean updateCustomer(int id, Map<String, Object> fieldMap) {
        //TODO
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    public boolean deleteCustomer(int id) {
        //TODO
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
