package com.hefeifei.dao;

import com.hefeifei.entity.TPSServer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TPSDao extends JpaRepository<TPSServer,Integer>, JpaSpecificationExecutor<TPSServer> {
}
