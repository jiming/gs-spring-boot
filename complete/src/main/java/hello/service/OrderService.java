package hello.service;

import java.util.List;

/**
 * Created by jiming.liu on 2015/12/17.
 */
public interface OrderService {
    List<String> queryOrderByUserId(int userId);
}
