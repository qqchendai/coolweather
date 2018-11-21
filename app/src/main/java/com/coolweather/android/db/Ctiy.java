package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/11/21.
 */
//市的名，骗号，Id的类；及当前市所属的省的Id;
public class Ctiy extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

     public int getId(){
         return id;
     }
     public void setId(int id){
         this.id=id;
     }
     public String getCityName(){
         return cityName;
     }
     public void setCityName(String cityName){
         this.cityName=cityName;
     }
     public int getCityCode(){
         return cityCode;
     }
     public void setCityCode(){
         this.cityCode=cityCode;
              }

    public int getProvinceId() {
        return provinceId;
    }
    public  void setProvinceId(int provinceId){
         this.provinceId= provinceId;


















































































    }
}
