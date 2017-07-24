package com.zooplus.fumbliebackend.repo;

import com.zooplus.fumbliebackend.model.entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderRepositoryTest {
    @Resource
    private OrderRepository orderRepository;

    @Test
    public void shouldFindOrders() {
        List<Order> allOrders = (List<Order>) orderRepository.findAll();

        assertTrue(allOrders.size() > 0);
    }
}
