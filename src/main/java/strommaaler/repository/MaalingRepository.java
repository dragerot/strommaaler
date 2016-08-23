package strommaaler.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import strommaaler.model.Maaling;

@Repository
public interface MaalingRepository extends JpaRepository<Maaling, Long>
{
    //public List<BaatPlass> findall();
}
