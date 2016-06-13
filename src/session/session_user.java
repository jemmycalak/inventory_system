/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

/**
 *
 * @author Jemmy Calak
 */
public class session_user {
    private static String user_login;
    private static String level_login;
    private static String nm_login;
    
    public static String get_Id_Log(){
        return user_login;
    }
    public static void set_Id_Log(String user){
        session_user.user_login = user;
    }
    public static String get_Level(){
        return level_login;
    }
    public static void set_Level(String level){
        session_user.level_login = level;
    }
    
    public static String get_Nm(){
        return nm_login;
    }
    public static void set_Nm(String nm){
        session_user.nm_login = nm;
    }
}
