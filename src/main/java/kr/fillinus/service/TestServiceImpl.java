package kr.fillinus.service;

import kr.fillinus.model.dao.TestMapper;
import kr.fillinus.model.dto.test;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService{

    private final TestMapper testMapper;

    @Override
    public List<test> getAllDataList() {
        return testMapper.getAllDataList();
    }

}
