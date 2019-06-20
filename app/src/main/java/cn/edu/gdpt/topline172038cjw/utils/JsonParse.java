package cn.edu.gdpt.topline172038cjw.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import cn.edu.gdpt.topline172038cjw.bean.NewsBean;

public class JsonParse {
    private  static  JsonParse  instance;
    private JsonParse() {

    }
    public static JsonParse getInstance(){
        if (instance==null){
            instance=new JsonParse();
        }
        return  instance;
    }
    public List<NewsBean> getAdList(String json){
        Gson gson=new Gson();
        Type listType=new TypeToken<List<NewsBean>>(){}.getType();
        List<NewsBean> alList=gson.fromJson(json,listType);
        return  alList;

    }

}
