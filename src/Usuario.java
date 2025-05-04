/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Usuario {
    private String nickName;
    private String email;

    public Usuario(String nickName, String email) {
        this.nickName = nickName;
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Usuario: " + nickName + " | Email: " + email;
    }
}

