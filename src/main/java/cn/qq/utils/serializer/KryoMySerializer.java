package cn.qq.utils.serializer;

/**
 * Created by Administrator on 2019/5/21.
 */
public class KryoSerializer implements Serializer {

    @Override
    public byte getSerializerAlgorithm() {
        return 0;
    }

    @Override
    public byte[] serialize(Object object) {
        return new byte[0];
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        return null;
    }
}
