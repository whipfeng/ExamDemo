package com.migu.schedule.info;

/**
 * 消耗率实体
 *
 * @author
 */
public class ConsumptionInfo implements Comparable<ConsumptionInfo> {

    public ConsumptionInfo(int taskId, int consumption) {
        this.taskId = taskId;
        this.consumption = consumption;
    }

    private int nodeId = -1;
    private int taskId;
    private int consumption;

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public int compareTo(ConsumptionInfo compare) {
        int cr = this.consumption - compare.consumption;
        if (0 == cr) {
            return this.taskId - compare.taskId;
        }
        return cr;
    }

    @Override
    public String toString() {
        return "ConsumptionInfo{" +
                "nodeId=" + nodeId +
                ", taskId=" + taskId +
                ", consumption=" + consumption +
                '}';
    }
}
