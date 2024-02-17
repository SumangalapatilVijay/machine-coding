package com.example.diexamples.writer;
import org.springframework.stereotype.Service;
@Service
public class CsvWriter implements IWrite{
    @Override
    public void write() {
        System.out.println("Csv Writing");
    }
}
