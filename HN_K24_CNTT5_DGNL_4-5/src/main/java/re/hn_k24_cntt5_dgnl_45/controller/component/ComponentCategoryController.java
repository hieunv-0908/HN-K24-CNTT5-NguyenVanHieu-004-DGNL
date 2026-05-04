package re.hn_k24_cntt5_dgnl_45.controller.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import re.hn_k24_cntt5_dgnl_45.model.ComponentCategory;
import re.hn_k24_cntt5_dgnl_45.service.ComponentCategoryService;

@Controller
@RequestMapping("/component-category")
public class ComponentCategoryController {
    @Autowired
    private ComponentCategoryService componentCategoryService;

        @RequestMapping("/list")
        public String list(Model model) {
            model.addAttribute("componentCategories", componentCategoryService.findAll());
            return "component-category/list";
        }

        @GetMapping("/add")
        public String addForm(Model model) {
            model.addAttribute("componentCategory", new ComponentCategory());
            return "component-category/add";
        }

        @PostMapping("/add")
        public String add(@ModelAttribute ComponentCategory componentCategory) {
            componentCategoryService.save(componentCategory);
            return "redirect:/component-category/list";
        }

        @GetMapping("/edit/{id}")
        public String editForm(@PathVariable Long id, Model model) {
            ComponentCategory componentCategory = componentCategoryService.findById(id);
            if (componentCategory == null) {
                return "redirect:/component-category/list";
            }
            model.addAttribute("componentCategory", componentCategory);
            return "component-category/edit";
        }

        @PostMapping("/edit/{id}")
        public String edit(@PathVariable Long id, @ModelAttribute ComponentCategory componentCategory) {
            componentCategory.setId(id);
            componentCategoryService.save(componentCategory);
            return "redirect:/component-category/list";
        }

        @GetMapping("/delete/{id}")
        public String delete(@PathVariable Long id) {
            componentCategoryService.delete(id);
            return "redirect:/component-category/list";
        }
}
