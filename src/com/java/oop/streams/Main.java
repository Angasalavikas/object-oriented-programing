package com.java.oop.streams;

import java.io.IOException;

public class Main {
    static void main() throws IOException {
        CsvReader csvReader = new CsvReader();
        csvReader.getProductsFormCsv();
    }
}
