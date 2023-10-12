package controller.simple_dictionary;

import model.Dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.DictService;

import java.util.List;

@Controller
public class DictionaryController {
    @GetMapping("/home")
    public String showForm() {
        return "form";
    }
    @PostMapping("/home")
    public String display(@RequestParam ("en") String en, Model model) {
        DictService dictService = new DictService();
        String vi = "No data";
        List<Dictionary> dictionaries = dictService.findAll();
        for (Dictionary d: dictionaries) {
            if (d.getWord1().equals(en)) {
                vi = d.getWord2();
            }
        }
        model.addAttribute("en", en);
        model.addAttribute("vi", vi);
        return "form";
    }
}

