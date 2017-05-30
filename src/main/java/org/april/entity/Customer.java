package org.april.entity;

/**
 * @Description: 测试实体类。实际框架中不含有  //TODO
 *                 驼峰命名与数据库 _ 命名法相对应
 * @Author: Jingzeng Wang
 * @Date: Created in 11:44  2017/5/30.
 */
public class Customer {
    private int id;
    private String name;
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
