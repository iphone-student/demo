package com.dahua.hzes.repository;

import com.dahua.hzes.dao.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface UserRepository extends ElasticsearchRepository<User,Integer> {

    public List<User> findByName(String name);

}
