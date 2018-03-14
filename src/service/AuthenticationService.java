package service;

import domain.User;
import repository.UserRepository;

public class AuthenticationService {
    public static boolean isUserExisted(String username) {
        User user = UserRepository.findByUsername(username);
        return user != null;
    }

    public static boolean isUserCredentialValid(String username, String password) {
        User user = UserRepository.findByUsername(username);
        System.out.println("username" +user.getUsername()+ "password" +user.getPassword());
        return user != null && user.getPassword().equals(password);
    }

    // TODO: impelemt các hàm khác nếu cần (chỉ sử dụng 3 hàm chính trog repo)
}
