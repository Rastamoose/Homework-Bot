package com.BismillahBros;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;

public class Listener extends ListenerAdapter {
    private static GuildMessageReceivedEvent event;

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String messageSent = event.getMessage().getContentRaw();
        if (messageSent.equalsIgnoreCase("Hello")) {
            event.getMessage().delete().queue();
            event.getChannel().sendMessage("Hi").queue();

        }
    }

}