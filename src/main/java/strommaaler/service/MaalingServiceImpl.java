package strommaaler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import strommaaler.model.Maaling;
import strommaaler.repository.MaalingRepository;


import java.time.LocalDate;
import java.util.List;

@Service
//@Transactional
public class MaalingServiceImpl implements MaalingService {
    @Autowired
    MaalingRepository maalingRepository;

    @Override
    public Maaling create(Maaling maalinger) {
       // ZoneId zoneId = ZoneId.of("Europe/Paris");
       maalinger.setCreationDate(LocalDate.now());
       maalingRepository.saveAndFlush(maalinger);
       return maalinger;
    }

    @Override
    public List<Maaling> list() {
        return maalingRepository.findAll();
    }
}
