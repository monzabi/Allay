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

package allay.api.network.util;

import io.netty5.channel.*;
import io.netty5.channel.epoll.Epoll;
import io.netty5.channel.epoll.EpollHandler;
import io.netty5.channel.epoll.EpollServerSocketChannel;
import io.netty5.channel.epoll.EpollSocketChannel;
import io.netty5.channel.nio.NioHandler;
import io.netty5.channel.socket.nio.NioServerSocketChannel;
import io.netty5.channel.socket.nio.NioSocketChannel;
import lombok.experimental.UtilityClass;

@UtilityClass
public class NettyUtil {

    public static IoHandlerFactory getFactory() {
        return Epoll.isAvailable() ? EpollHandler.newFactory() : NioHandler.newFactory();
    }

    public static ServerChannelFactory<? extends ServerChannel> getServerChannelFactory() {
        return Epoll.isAvailable() ? EpollServerSocketChannel::new : NioServerSocketChannel::new;
    }

    public static ChannelFactory<? extends Channel> getSocketChannelFactory() {
        return Epoll.isAvailable() ? EpollSocketChannel::new : NioSocketChannel::new;
    }

}
