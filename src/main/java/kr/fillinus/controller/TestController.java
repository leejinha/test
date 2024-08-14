package kr.fillinus.controller;

import kr.fillinus.model.dto.test;
import kr.fillinus.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TestController {

    private final TestService testService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/test")
    public List<test> test() {
        return testService.getAllDataList();
    }

}
