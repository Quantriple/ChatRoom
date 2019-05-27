package cn.qq.netty.codec;

import cn.qq.netty.client.Packet;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;

/**
 * Created by Administrator on 2019/5/24.
 */
public class PacketCodec {

    private static final int Magic_Number = 0x12345678;

    /*加密*/
    public ByteBuf encoder(Packet packet) {
        //分配接口   通过源码阅读应该是更倾向于直接内存
        ByteBuf byteBuf = PooledByteBufAllocator.DEFAULT.buffer();
        byteBuf.writeBytes(packet.)
        return byteBuf;
    }
}
