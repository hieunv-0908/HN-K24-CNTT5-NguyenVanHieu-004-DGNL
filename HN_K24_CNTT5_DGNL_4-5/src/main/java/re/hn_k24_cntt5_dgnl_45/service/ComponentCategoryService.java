package re.hn_k24_cntt5_dgnl_45.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import re.hn_k24_cntt5_dgnl_45.model.ComponentCategory;
import re.hn_k24_cntt5_dgnl_45.repositoty.ComponentCategoryRepository;

import java.util.List;

@Service
public class ComponentCategoryService {
    @Autowired
    private ComponentCategoryRepository componentCategoryRepository;

    public List<ComponentCategory> findAll() {
        return componentCategoryRepository.findAll();
    }

    public void delete(Long id) {
        componentCategoryRepository.deleteById(id);
    }

    public ComponentCategory findById(Long id) {
        return componentCategoryRepository.findById(id).orElse(null);
    }

    public void save(ComponentCategory componentCategory) {
        componentCategoryRepository.save(componentCategory);
    }
}
