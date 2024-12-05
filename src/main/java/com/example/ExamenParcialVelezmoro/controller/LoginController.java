package com.example.ExamenParcialVelezmoro.controller;


import com.example.ExamenParcialVelezmoro.model.UsuarioModel;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
/**
 *
 * @author jnvn4
 */
@Controller
public class LoginController {

    // Redirigir la raíz a la página de login
    @GetMapping("/")
    public String redirectToLogin() {
        return "redirect:/login";  // Redirige a la página de login
    }

    // Página de login
    @GetMapping("/login")
    public String showLoginPage(Model model) {
        model.addAttribute("user", new UsuarioModel());
        return "Login/login.html"; // Devuelve la vista de login
    }

    // Procesar el login
    @PostMapping("/login")
    public String processLogin(@ModelAttribute("user") UsuarioModel user, Model model) {
        if ("admin".equals(user.getUsername()) && "admin".equals(user.getPassword())) {
            return "Menu/menu.html"; // Redirige a la vista de menú si las credenciales son correctas
        } else {
            model.addAttribute("errorMessage", "Credenciales incorrectas. Intenta de nuevo.");
            return "Login/loginFailed.html"; // Redirige a la página de error de login
        }
    }

    // Método para manejar el logout
    @PostMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();  // Invalidar sesión
        return "redirect:/login";  // Redirigir al login
    }
}
