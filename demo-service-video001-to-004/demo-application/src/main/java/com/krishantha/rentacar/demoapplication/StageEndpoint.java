package com.krishantha.rentacar.demoapplication;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id="stage")
public class StageEndpoint {

    Map<String,Stage> stages=new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String,Stage> getAllStages(){
        return stages;
    }

    @ReadOperation
    public Stage getStage(@Selector String name){
        return stages.get(name);
    }

    @WriteOperation
    public void setValue(@Selector String name,Stage stage){

        stages.put(name,stage);
    }





    static class Stage{
        String value;

        public Stage(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
