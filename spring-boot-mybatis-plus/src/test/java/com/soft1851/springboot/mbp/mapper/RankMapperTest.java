package com.soft1851.springboot.mbp.mapper;

import com.soft1851.springboot.mbp.entity.Rank;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/16
 */
@SpringBootTest
class RankMapperTest {

    @Resource
    private RankMapper rankMapper;

    @Test
    void testSelectAll() {
        List<Rank> ranks = rankMapper.selectList(null);
        ranks.forEach(System.out::println);
    }
}