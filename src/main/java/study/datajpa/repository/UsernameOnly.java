package study.datajpa.repository;

import org.springframework.beans.factory.annotation.Value;

public interface UsernameOnly {

    //없으면 close Projection

    //open projection
    //다 가져옴 그 후 application 에서 처리.
    @Value("#{target.username + ' ' + target.age}")
    String getUsername();
}
