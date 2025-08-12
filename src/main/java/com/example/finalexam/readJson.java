package com.example.finalexam;

import com.google.gson.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class readJson {

    public static List<Customer> readJsonFile() throws FileNotFoundException {
        List<Customer> customers = new ArrayList<Customer>();

        Gson gson = new Gson();
        Reader reader = new FileReader("C:\\Users\\Jeremy\\Desktop\\Georgian Year - 1\\Semester 3\\Adv Java\\FinalExam\\src\\main\\java\\com\\example\\finalexam\\customers.json");
        JsonObject obj = JsonParser.parseReader(reader).getAsJsonObject();
        JsonArray customerArray = obj.getAsJsonArray("Customers");
        for (JsonElement jsonElement : customerArray) {
            Customer customer = new Gson().fromJson(jsonElement, Customer.class);
            customers.add(customer);
        }
        return customers;
    }
}
