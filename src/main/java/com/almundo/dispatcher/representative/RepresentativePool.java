package com.almundo.dispatcher.representative;

import java.util.Arrays;
import java.util.ArrayList;

import java.util.concurrent.ThreadPoolExecutor;

public class RepresentativePool {
    
    private AbsRepresentative[] resourcePool;
    private ArrayList<Operator> operatorPool;
    private ArrayList<Supervisor> supervisorPool;
    private ArrayList<Director> directorPool;


    public RepresentativePool(AbsRepresentative[] resourcePool)
    {
        this.resourcePool = resourcePool;

        for(AbsRepresentative res:resourcePool)
        {
            if(res instanceof Director) {
                if(directorPool == null) {
                    directorPool = new ArrayList<Director>();
                }
                directorPool.add((Director)res);
            }
            else if(res instanceof Supervisor) {
                if(supervisorPool == null) {
                    supervisorPool = new ArrayList<Supervisor>();
                }
                supervisorPool.add((Supervisor)res);
            }
            else {
                if(operatorPool == null) {
                    operatorPool = new ArrayList<Operator>();
                }
                operatorPool.add((Operator)res);
            }

            
        }
    }

    public AbsRepresentative[] getResourcePool()
    {
        return this.resourcePool;
    }
}
