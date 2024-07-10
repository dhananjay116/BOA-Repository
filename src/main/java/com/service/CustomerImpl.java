package com.service;

import com.boa.model.CustomerModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CustomerImpl implements CustomerService {
    @Override
    public ArrayList<CustomerModel> printCustomerDetails() {
        ArrayList<CustomerModel> arrayList = getCustomerData();
        ArrayList<CustomerModel> filterdData = (ArrayList<CustomerModel>) arrayList.stream().filter(customerModel -> customerModel.getCustomerID() == 417840).collect(Collectors.toList());
        System.out.println("Filtered data :" +filterdData);
        return arrayList;
    }

    private ArrayList<CustomerModel> getCustomerData() {
        CustomerModel[] customerModels = new CustomerModel[5];
        ArrayList<CustomerModel> al = new ArrayList();
        CustomerModel model = new CustomerModel(417840, "Dhananjay Singh", "Palavakkam Chennai");
        al.add(model);

        CustomerModel model2 = new CustomerModel(417842, "Suresh", "Chennai");
        al.add(model2);

        CustomerModel model3 = new CustomerModel(417843, "TestData", "BOA");
        al.add(model3);

        al.addAll(Arrays.asList(arrayOfCustomers));
        return al;
    }

    private static CustomerModel[] arrayOfCustomers = {
            new CustomerModel(100, "Jeff Bezos", "USA"),
            new CustomerModel(200, "Bill Gates", "INDIA"),
            new CustomerModel(301, "Mark Zuckerberg", "UK")
    };
}
