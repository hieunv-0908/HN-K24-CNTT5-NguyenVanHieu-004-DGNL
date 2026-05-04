package re.hn_k24_cntt5_dgnl_45.controller.keyboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import re.hn_k24_cntt5_dgnl_45.model.KeyboardPart;
import re.hn_k24_cntt5_dgnl_45.service.ComponentCategoryService;
import re.hn_k24_cntt5_dgnl_45.service.KeyboardService;

@Controller
@RequestMapping("/keyboard")
public class KeyboardController {
    @Autowired
    private KeyboardService keyboardService;

    @Autowired
    private ComponentCategoryService componentCategoryService;

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("keyboards", keyboardService.findAll());
        return "/keyboard/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        keyboardService.delete(id);
        return "redirect:/keyboard/list";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("keyboard", new KeyboardPart());
        model.addAttribute("categories", componentCategoryService.findAll());
        return "keyboard/add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute KeyboardPart keyboard) {
        keyboardService.save(keyboard);
        return "redirect:/keyboard/list";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        KeyboardPart keyboard = keyboardService.findById(id);
        if (keyboard == null) {
            return "redirect:/keyboard/list";
        }
        model.addAttribute("keyboard", keyboard);
        model.addAttribute("categories", componentCategoryService.findAll());
        return "keyboard/edit";
    }

    @PostMapping("/edit/{id}")
    public String edit(@PathVariable Long id, @ModelAttribute KeyboardPart keyboard) {
        keyboard.setId(id);
        keyboardService.save(keyboard);
        return "redirect:/keyboard/list";
    }
}
