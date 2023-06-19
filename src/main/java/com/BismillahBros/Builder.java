package com.BismillahBros;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;


public class Builder {
    final private JDABuilder builder;


    public Builder(String token, Activity activity, Object listener) throws LoginException{
        builder = JDABuilder.createDefault(token);
        builder.disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE);
        builder.setBulkDeleteSplittingEnabled(false);
        builder.setCompression(Compression.NONE);
        builder.enableIntents(GatewayIntent.GUILD_MEMBERS);
        builder.setActivity(activity);
        builder.addEventListeners(listener);
        builder.build();
    }




}
