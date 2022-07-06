package sprint.test.repository;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import sprint.test.domain.Info;


@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(value = false)
public class InfoRepositoryTest {
    @Autowired
    InfoRepository infoRepository;

    @Test
    @Transactional
    public void testInfo() throws Exception{
        Info info = new Info();
        info.setName("hello world");

        Long saveId = infoRepository.save(info);
        Info findInfo = infoRepository.find(saveId);

        Assertions.assertThat(findInfo.getId()).isEqualTo(info.getId());
        Assertions.assertThat(findInfo.getName()).isEqualTo(info.getName());

    }
}
