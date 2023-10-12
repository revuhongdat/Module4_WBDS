package controller.convert_money;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @GetMapping("/home")
    public String showForm() {
        return "form";
    }
    @PostMapping("/home")
    public String display(@RequestParam ("usd") float usd, @RequestParam ("tigia") float tigia, Model model) {
        float vnd = usd * tigia;
        model.addAttribute("vnd", vnd);
        model.addAttribute("usd", usd);
        model.addAttribute("tigia", tigia);
      return "form";
    }
}
