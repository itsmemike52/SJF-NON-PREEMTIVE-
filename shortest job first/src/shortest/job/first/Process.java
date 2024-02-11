/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortest.job.first;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Process {
    private String name;
    private int burstTime;
    private int arrivalTime;

    public Process(String name, int burstTime, int arrivalTime) {
        this.name = name;
        this.burstTime = burstTime;
        this.arrivalTime = arrivalTime;
    }
    public String getProcess() {
        return name;
    }

    public int getTimeBurst() {
        return burstTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }
}
