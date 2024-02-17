package com.example.diexamples.writer;
import org.springframework.stereotype.Service;
// u can use @Primary here to make primary writer as xml instead of @Qualifier
@Service
public class XmlWriter implements IWrite{
    @Override
    public void write() {
        System.out.println("XML Writer");
    }
}
