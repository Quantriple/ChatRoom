package cn.qq.netty.client;

import lombok.Data;

/**
 * Created by Administrator on 2019/5/23.
 * 定义请求包 1魔数(4b) int  2版本(1b) byte 3序列化算法(1b) byte 4 指令(1b) byte 5 数据长度(4b) int 6数据 int.length
 */
@Data
public class LoginRequestPack extends Packet {

    private Integer id;
    private String name;
    private String passwrod;


    @Override
    public Byte getVersion() {
        return super.getVersion();
    }

    @Override
    public Byte getCommnd() {
        return Comand.LOGIN_REQUEST;
    }


}
