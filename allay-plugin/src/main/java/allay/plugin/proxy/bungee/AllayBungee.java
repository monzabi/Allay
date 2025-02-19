/**
 * Copyright 2024 https://github.com/VertrauterDavid/Allay
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package allay.plugin.proxy.bungee;

import allay.plugin.proxy.ProxyInstance;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Plugin;

import java.util.UUID;

public class AllayBungee extends Plugin implements ProxyInstance {

    @Override
    public void onEnable() {
        // plugin load
    }

    @Override
    public void onDisable() {
        // plugin unload
    }

    @Override
    public void message(UUID uuid, String message) {
        player(uuid).sendMessage(new TextComponent(message));
    }

    @Override
    public void title(UUID uuid, String title, String subTitle, int fadeIn, int stay, int fadeOut) {
        player(uuid).sendTitle(getProxy().createTitle().title(new TextComponent(title)).subTitle(new TextComponent(subTitle)).stay(stay).fadeIn(fadeIn).fadeOut(fadeOut));
    }

    @Override
    public void actionbar(UUID uuid, String message) {
        player(uuid).sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(message));
    }

    @Override
    public void connect(UUID uuid, String serviceName) {
        player(uuid).connect(getProxy().getServerInfo(serviceName));
    }

    public ProxiedPlayer player(UUID uuid) {
        return getProxy().getPlayer(uuid);
    }

}
