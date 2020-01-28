package com.versatile.spring.pattern.structural;

import java.util.HashMap;
import java.util.Map;

class WeightUser{
    private String lastname;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}

public class FlyWeight {
    Map<String, WeightUser> map = new HashMap<>();

    public void useFlyWeight(){
        WeightUser weightUser = getWeightUser("Vivcharyk");
        WeightUser weightUser1 = getWeightUser("Vivcharyk");
        System.out.println("Both objects are equals: " + weightUser.equals(weightUser1));
    }

    private WeightUser getWeightUser(String lastname){
        WeightUser weightUser = map.get(lastname);
        if(weightUser == null){
            weightUser = new WeightUser();
            weightUser.setLastname(lastname);
            map.put(lastname, weightUser);
        }
            return weightUser;
    }
}
