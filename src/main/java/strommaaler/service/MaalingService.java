package strommaaler.service;

import strommaaler.model.Maaling;

import java.util.List;

public interface MaalingService {
        public Maaling create(Maaling maalinger);
        public List<Maaling> list();

}
