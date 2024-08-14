package kr.fillinus.model.dao;

import kr.fillinus.model.dto.test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TestMapper {

    List<test> getAllDataList();

}
