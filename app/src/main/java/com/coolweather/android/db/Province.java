package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/11/21.
 */
//省类，表示出省的id,省的名字，省号编码；
public class Province extends DataSupport {
    private int id;
    private String proviceName;
    private int proviceCode;

    //设置和获取省的id;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id ;

    }
    //设置和获取省的名字；
    public String getProviceName(){
        return proviceName;

    }
    public void setProviceName(String proviceName){
        this.proviceName=proviceName;
    }

    //设置和获取省的编号；
    public int getProviceCode(){
        return proviceCode;
    }
    public void setProviceCode(){
        this.proviceCode=proviceCode;
    }

}
