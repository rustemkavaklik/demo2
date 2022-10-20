package com.exampleerror.demo2.service;

import com.exampleerror.demo2.entity.Users;

import java.util.List;


public interface UserService {
    public List<Users> getAllUsers();               //Butun kayitlari gorecegim icin List doner, parametre istemez List<User> cunku userdan gelecek kayitlar
    public Users getUserById(int userId);           //Parametre olarak userId verip user donmesini istiyorum
    public Users addOrUpdateUser (Users users);     //Parametre olarak Users users veriyorum ve yeni bir kayit ekliyor yada var olani guncelliyorum
    public Users deleteUser (int userId);           //Parametre olarak userId veriyorum ve var olan kaydi bulup siliyorum
}
