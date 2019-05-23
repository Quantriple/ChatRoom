package cn.qq.netty.client;

import lombok.Data;

/**
 * Created by Administrator on 2019/5/21.
 */
@Data
public abstract class Packet {

    /*版本号*/
    private Byte version=1;

    /*命令*/
    public abstract Byte getCommnd();
}
