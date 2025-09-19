package tv.utao.x5.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

public class JsonUtil {

    public static <T> T fromJson(String json,Class<T> tClass){
        Gson gson =  new GsonBuilder()
                .setLenient()  // 允许非严格JSON
                .create();
        return gson.fromJson(json,tClass);
    }
    public static <T> T fromJson(String json, Type typeOfT){
        Gson gson =  new GsonBuilder()
                .setLenient()  // 允许非严格JSON
                .create();
        //Type type = new TypeToken<T>() {}.getType();
        return gson.fromJson(json,typeOfT);
    }

    public  static <T> String toJson(T t){
        Gson gson = new Gson();
        return gson.toJson(t);
    }
}
