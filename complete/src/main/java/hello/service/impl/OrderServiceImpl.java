package hello.service.impl;

import hello.aop.Tts2;
import hello.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jiming.liu on 2015/12/17.
 */
@Service
@Tts2(master = "master", slaves = {"s1", "s2"})
public class OrderServiceImpl implements OrderService{
    @Override
    public List<String> queryOrderByUserId(int userId) {
        return Arrays.asList("first", "second");
    }
}
