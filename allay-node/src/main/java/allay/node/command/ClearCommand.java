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

package allay.node.command;

import allay.api.console.command.Command;
import allay.node.AllayNode;

@SuppressWarnings("unused")
public class ClearCommand extends Command<AllayNode> {

    public ClearCommand(AllayNode allayNode) {
        super(allayNode, "shutdown");
    }

    @Override
    public void execute(String[] args) {
        allayInstance.consoleManager().clear();
    }

}
