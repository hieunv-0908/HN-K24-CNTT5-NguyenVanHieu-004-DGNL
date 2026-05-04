package re.hn_k24_cntt5_dgnl_45.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import re.hn_k24_cntt5_dgnl_45.model.KeyboardPart;
import re.hn_k24_cntt5_dgnl_45.repositoty.KeyboardPartRepository;

import java.util.List;

@Service
public class KeyboardService {
    @Autowired
    private KeyboardPartRepository keyboardPartRepository;

    public List<KeyboardPart> findAll() {
        return keyboardPartRepository.findAll();
    }

    public void delete(Long id) {
        keyboardPartRepository.deleteById(id);
    }

    public KeyboardPart findById(Long id) {
        return keyboardPartRepository.findById(id).orElse(null);
    }

    public void save(KeyboardPart keyboard) {
        keyboardPartRepository.save(keyboard);
    }
}
