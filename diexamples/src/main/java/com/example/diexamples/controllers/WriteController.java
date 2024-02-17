package com.example.diexamples.controllers;

import com.example.diexamples.writer.IWrite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/write")
public class WriteController {
    private final IWrite iWrite;
    @Autowired
    
    public WriteController(@Qualifier("xmlWriter") IWrite iWrite) {
        this.iWrite = iWrite;
    }
    @GetMapping
    public void write() {
        iWrite.write();
    }
}
