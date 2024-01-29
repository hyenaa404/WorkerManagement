/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class WorkerList {
    private List<Worker> workerList = new ArrayList<>();

    public List<Worker> getWorkerList() {
        return workerList;
    }

    public void setWorkerList(List<Worker> workerList) {
        this.workerList = workerList;
    }
    
    
    public boolean addList(Worker wk) {
        for (Worker worker : workerList) {
            if (worker.getId().equalsIgnoreCase(wk.getId())) {
                return false;
            }
        }
        workerList.add(wk);
        return true;
    }
    
    public Worker searchList(String id){
        for (Worker worker : workerList){
            if (worker.getId().equalsIgnoreCase(id)) {
                return worker;
            }
        }
        return null;
    }
    
    public int getIndex(String id){
        for (int i = 0; i < workerList.size(); i++) {
            Worker worker = workerList.get(i);
            if (worker.getId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }
    public void removeWorker(Worker wk){
         Iterator<Worker> iterator = workerList.iterator();
        for (Worker worker : workerList){
            if (worker.getId().equalsIgnoreCase(wk.getId())) {
                iterator.remove();
            }
        }
    }
    
    public void displayInf(){
        boolean isAdjusted = false;
        System.out.printf("%-10s | %-20s | %-10s | %-10s | %-20s\n\n", "ID", "NAME", "SALARY", "STATUS", "DATE ADJUSTED" );
        for (Worker worker : workerList){
            if (worker.getLog().getDateAdjust() != null ){
                isAdjusted = true;
                worker.toString();
            }
        }
            if (!isAdjusted){
                System.out.println("Empty List!");
            }
    }
    
}
