package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomer{
    private static List<Customer> list = new ArrayList<>();


    static {
        Customer customer1 = new Customer(1,"Híu",21);
        Customer customer2 = new Customer(2,"Sang",28);
        Customer customer3 = new Customer(3,"Cong",23);
        list.add(customer1);
        list.add(customer2);
        list.add(customer3);
    }

    @Override
    public List<Customer> showAll() {
        return list;
    }
}
