package ru.pakulin.apidemo;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void notifyUser(User user) {
        System.out.println("A new user has been created: " + user.getName());
    }
    public void notifyUserReg(User user) {
        System.out.println("A new user has been registered: " + user.getName());
    }
}
