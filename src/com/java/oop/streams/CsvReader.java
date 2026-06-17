package com.java.oop.streams;

import java.io.*;
import java.util.List;

public class CsvReader {
     public List<Product> getProductsFormCsv() throws IOException {

         File file = new File("C:\\Users\\angas\\OneDrive\\Documents");
         BufferedReader br = new BufferedReader(new FileReader(file));
        // System.out.println(br.readLine());
         String productData = br.readLine();
         while (productData != null){
             System.out.println(productData);
             productData = br.readLine();
         }
         return null;
     }
}
