package HW13.task1;

import java.util.Scanner;

public class Main {
    static boolean registration(String login, String password, String confirmPassword)
            throws WrongLoginException,WrongPasswordException{
        if(login.length()>=20 || login.isEmpty()){
            throw new WrongLoginException("Неверная длина логина");
        }
        if(login.contains(" ")){
            throw new WrongLoginException("Логин содержит пробел!");
        }
        if(password.length() >= 20 ){
            throw new WrongPasswordException("Неверная длина пароля");
        }
        if(!password.matches(".*\\d.*")){
            throw new WrongPasswordException("Пароль должен содержать цифры!");
        }
        if(password.contains(" ")){
            throw new WrongPasswordException("Пароль не должен содержать пробел!");
        }
        if(!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли не совпадают!");
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String login;
        String password;
        String confirmPassword;
        System.out.println("Введите логин:");
        login = in.nextLine();
        System.out.println("Введите пароль:");
        password = in.nextLine();
        System.out.println("подтвердите пароль:");
        confirmPassword = in.nextLine();
        try {
            boolean registration = registration(login,password,confirmPassword);
                System.out.println("Регистрация прошла успешно!" + registration);
        }
        catch (WrongLoginException | WrongPasswordException e){
            System.err.println(e.getMessage());
        }
    }
}
