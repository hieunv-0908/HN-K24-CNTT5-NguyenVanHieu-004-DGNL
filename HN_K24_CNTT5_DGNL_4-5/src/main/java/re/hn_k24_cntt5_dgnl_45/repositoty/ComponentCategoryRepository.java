package re.hn_k24_cntt5_dgnl_45.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import re.hn_k24_cntt5_dgnl_45.model.ComponentCategory;

@Repository
public interface ComponentCategoryRepository extends JpaRepository<ComponentCategory, Long> {
}
