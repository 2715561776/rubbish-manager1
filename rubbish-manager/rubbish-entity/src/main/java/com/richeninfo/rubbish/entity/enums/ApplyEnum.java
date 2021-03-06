package com.richeninfo.rubbish.entity.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/9/27.
 */
public enum ApplyEnum {

    ResidentialArea(1, "居民小区"), //免费
    BusinessArea(2, "商务区"), // 收费
    TransferStation(3, "中转站");// 已经发布

    private int code;
    private String desc;

    ApplyEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static List<EnumVo> EnumToList(){

        List<EnumVo> enums = new ArrayList<EnumVo>();
        for (FlowFormEnum s : FlowFormEnum.values())  {
            EnumVo e = new EnumVo(s.getDesc(), s.getCode());
            enums.add(e);

        }
        return enums;

    }


    public static FlowFormEnum codeToEnum(Long code){
        for (FlowFormEnum s : FlowFormEnum.values())  {
            if(code == s.getCode()){
                return s;
            }
        }
        return null;

    }

}
