package ru.pakulin.apidemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
/*
Контроллер регистрации пользователя
 */
@Controller
@RequestMapping("/reg")
public class RegistrationController {
    private final RegistrationService registrationService;

    @Autowired
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @RequestMapping(
            method = RequestMethod.POST)
    public ResponseEntity<List<User>> regUser(@RequestParam String name, @RequestParam int age, @RequestParam String email, @RequestBody List<User> users) {
        registrationService.creationUser(name, age, email);

        return new ResponseEntity<>(registrationService.registrationUser(name, age, email, users), HttpStatus.CREATED);
    }
}
