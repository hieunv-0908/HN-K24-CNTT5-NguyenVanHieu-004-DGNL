package re.hn_k24_cntt5_dgnl_45.repositoty;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import re.hn_k24_cntt5_dgnl_45.model.KeyboardPart;

@Repository
public interface KeyboardPartRepository extends JpaRepository<KeyboardPart, Long> {
}
