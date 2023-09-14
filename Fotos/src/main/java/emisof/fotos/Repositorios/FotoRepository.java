package emisof.fotos.Repositorios;

import emisof.fotos.Entidades.Foto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FotoRepository extends JpaRepository<Foto, Long>
{
}
