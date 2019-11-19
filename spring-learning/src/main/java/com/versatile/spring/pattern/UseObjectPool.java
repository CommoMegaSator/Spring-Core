//Creates Pool of Objects

package com.versatile.spring.pattern;

import java.util.List;

class PooledObject{}

public class UseObjectPool {
    private List<PooledObject> free;
    private List<PooledObject> used;

    UseObjectPool(){}

    public PooledObject getPooledObject(){
        if (free.isEmpty()){
            PooledObject pooledObject = new PooledObject();
            free.add(pooledObject);
            return pooledObject;
        }else {
            PooledObject pooledObject = new PooledObject();
            used.add(pooledObject);
            free.remove(pooledObject);
            return pooledObject;
        }
    }

    public void releasePooledObject(PooledObject pooledObject){
        used.remove(pooledObject);
        free.add(pooledObject);
    }

    public static void useObjectPool(){
        try {
            UseObjectPool objectPool = new UseObjectPool();
            PooledObject pooledObject = objectPool.getPooledObject();
            objectPool.releasePooledObject(pooledObject);
            System.out.println("Using Pool Object");
        }catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
