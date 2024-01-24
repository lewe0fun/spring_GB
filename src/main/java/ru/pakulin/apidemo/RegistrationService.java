package ru.pakulin.apidemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
Сервис регистрации пользователя
 */
@Service
public class RegistrationService {
    private final UserService userService;
    private final DataProcessingService dataProcessingService;

    @Autowired
    public RegistrationService(UserService userService, DataProcessingService dataProcessingService) {
        this.userService = userService;
        this.dataProcessingService = dataProcessingService;
    }

    /*
    Метод создания пользователя
     */
    public User creationUser(String name, int age, String email) {
        return userService.createUser(name, age, email);
    }

    /*
    Метод регистрации пользователя
     */
    public List<User> registrationUser(String name, int age, String email, List<User> users) {
        return dataProcessingService.regUser(name, age, email, users);
    }
}
