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

package allay.plugin.server.bukkit;

import allay.plugin.server.ServerInstance;
import org.bukkit.plugin.java.JavaPlugin;

public class AllayBukkit extends JavaPlugin implements ServerInstance {

    @Override
    public void onEnable() {
        // plugin load
    }

    @Override
    public void onDisable() {
        // plugin unload
    }

}
