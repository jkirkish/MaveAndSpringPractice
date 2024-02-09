package com.coderscampus.Assignment11.web;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Assignment11.service.FileService;

@RestController
public class FileController {

    @Autowired
    private FileService fileService;

    @GetMapping("") // this comes back to the browser as localhost:8080
    public List<String> readLines() throws IOException {
        return fileService.readFile("test.txt");
    }

    @GetMapping("/read-lines")
    public List<String> readLinesHere() throws IOException {
        return fileService.readFile("test.txt");
    }

    @GetMapping("/hello-world") // this comes back to the browser as localhost:8080
    public String helloWorld() throws IOException {
        return "Hello World!";
    }

    @PostMapping("/hello-world")
    public String helloWorldPost() {
        return "Okay cool, you just posted some data!";
    }
}
