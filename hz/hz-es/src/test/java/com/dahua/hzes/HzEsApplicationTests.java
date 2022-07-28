package com.dahua.hzes;

import com.dahua.hzes.dao.User;
import com.dahua.hzes.repository.UserRepository;
import org.elasticsearch.index.Index;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HzEsApplicationTests {

    @Autowired
    UserRepository userRepository;

//    @Test
//    public void test(){
//        User user = new User();
//        user.setId(4);
//        user.setAge();
//        UserRepository.index(User);
//    }
//
//
//    @Test
//    void contextLoads() {
//        //给索引保存一个文档
//        Article article = new Article();
//        article.setId(1);
//        article.setTitle("asdf");
//        article.setAuthor();
//        article.setContent();
//        //构建一个索引功能
//        Index index = new Index.Builder(article).index("asdfdf").type("dsfas").build();
//        try {
//            jestClient.execute(index);
//        }
//    }

}
