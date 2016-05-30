package com.mcplugindev.freedombot.commands;

// FreedomBot
import com.mcplugindev.freedombot.*;
import static com.mcplugindev.freedombot.FreedomBot.server;
import me.totalfreedom.totalfreedommod.util.FUtil;

// Misc
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Command_cleanup implements CommandExecutor {

    private FreedomBot plugin;

    public Command_cleanup(FreedomBot plugin) {
        FreedomBot.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {

        if (TotalFreedom5_Getter.getInstance().getAdminList().isAdmin(sender)) {
        FUtil.bcastMsg(ChatColor.YELLOW + "FreedomBot >>" + ChatColor.RED + "Atempting to start major server cleanup, expect lag!!");
            server.dispatchCommand(sender, "opall -c");
            server.dispatchCommand(sender, "rd");
            server.dispatchCommand(sender, "setl");
            server.dispatchCommand(sender, "purgeall");
            server.dispatchCommand(sender, "banlist purge");
            server.dispatchCommand(sender, "glist purge");
            server.dispatchCommand(sender, "tfm reload");
            server.dispatchCommand(sender, "saconfig clean");
            server.dispatchCommand(sender, "nc");
        return true;
    }
        return true;

    }

}
