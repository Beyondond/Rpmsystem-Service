package cn.com.dhc.rpmsystem.common;

/**
 * @author zss
 * @date 2019-08-05
 */
public class CommonConstant  {


    /**
     * 数据状态常量
     */
    public enum DataStatus implements EnumInterface {
        EXIST(1, "存在"),
        DELETE(0, "删除");

        Integer value;
        String desc;

        DataStatus(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        @Override
        public Integer getValue() {
            return value;
        }

        @Override
        public String getDesc() {
            return desc;
        }
    }


}
