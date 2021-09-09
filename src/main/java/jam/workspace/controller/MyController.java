package jam.workspace.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {
    @GetMapping("/all-users")
    public String getAllUsers() {
        return "all-users-page";
    }

    @GetMapping("/user-page")
    public String getUser() {
        return "user-page";
    }
}