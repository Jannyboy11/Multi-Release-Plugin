package com.example.multirelease;

import org.bukkit.plugin.java.JavaPlugin;

public final class MultiRelease extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(Release.RELEASE);
    }

}
