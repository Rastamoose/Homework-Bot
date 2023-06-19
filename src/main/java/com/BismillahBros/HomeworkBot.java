package com.BismillahBros;
import com.BismillahBros.Listeners.HelloListener;
import net.dv8tion.jda.api.entities.Activity;
import javax.security.auth.login.LoginException;


public class HomeworkBot {
    public static String prefix;

    public static void main(String[] args) throws LoginException {
        String token = "ODkyMDcxOTE1NjM4ODg2NDkx.YVHktg.39Xa3jyxmulbFPyBax92WmvxVK8";
        prefix = "h>";
        Activity activity = Activity.playing("Have you done your homework?");
        var builder = new Builder(token, activity, new Listener());
    }
}

