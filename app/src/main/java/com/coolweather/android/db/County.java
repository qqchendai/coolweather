package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/11/21.
 */

//县类的Id，县名，现前所在的市，县的天气；
public class County extends DataSupport {
   private int id;
    private String countyName;
    private int cityId;
    private  String weatherId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCountyName( ){
        return countyName;
}
     public void setCountyName(String countyName){
          this.countyName = countyName;
}
     public String getWeatherId(){
         return weatherId;
}
       public void setWeatherId(String weatherId){
         this.weatherId= weatherId;
       }

       public int getCityId(){
           return id;

       }
       public void setCityId(int cityId){
           this.cityId=cityId;
       }




}
