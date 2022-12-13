package com.example.MyBookShopApp.data;

import com.example.MyBookShopApp.data.struct.test.TestEntity;
import org.springframework.stereotype.Repository;

@Repository
public class TestEntityDao extends AbstractHibernateDao<TestEntity>{
    public TestEntityDao(){
        super();
        setClazz(TestEntity.class);
    }
}
