package com.marcio.springsecuritybasicsec7.repository;

import com.marcio.springsecuritybasicsec7.model.Notice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticeRepository extends CrudRepository<Notice,Integer> {

    @Query(value = "from Notice n where CURDATE() BETWEEN noticeBeginAt AND noticeEndAt")
    List<Notice> findAllActiveNotices();
}
