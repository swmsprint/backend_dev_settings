package sprint.test.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sprint.test.domain.Info;
import sprint.test.repository.InfoRepository;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class InfoService {

    private final InfoRepository infoRepository;

    @Transactional
    public Long join(Info info){
        infoRepository.save(info);
        return info.getId();
    }
}

