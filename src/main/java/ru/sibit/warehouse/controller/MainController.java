package ru.sibit.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.sibit.warehouse.entity.User;
import ru.sibit.warehouse.repository.UserRepository;

@Controller
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/main")
    public String main(Model model) {
        User user = getActiveUser();
        model.addAttribute("displayName", user.getFio() == null || user.getFio().isEmpty() ? user.getUsername() : user.getFio());
        return "main";
    }

    private User getActiveUser() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
