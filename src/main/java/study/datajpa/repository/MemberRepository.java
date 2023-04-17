package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import study.datajpa.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    // 쿼리 메소드
    List<Member> findByUsernameAndAgeGreaterThan(String username, int age);

    // 네임드 쿼리
    @Query(name = "Member.findByUsername")
    List<Member> findByUsername(@Param("username") String username);
}
