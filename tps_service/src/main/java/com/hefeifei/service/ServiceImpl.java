package com.hefeifei.service;

import com.hefeifei.dao.TPSDao;
import com.hefeifei.vo.TPSVo;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceImpl implements MyService {
    @Autowired
    private TPSDao tpsDao;

    @Override
    public Page getList(TPSVo tpsVo) {
        Specification spec=new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder cb) {
                List<Predicate> list=new ArrayList();
                Predicate[] arr = list.toArray(new Predicate[list.size()]);
                return cb.and(arr);
            }
        };
        Page page = tpsDao.findAll(spec, PageRequest.of( 1, 2));
        return page;
    }
}
