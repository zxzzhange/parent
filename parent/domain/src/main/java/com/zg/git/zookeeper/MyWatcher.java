package com.zg.git.zookeeper;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

/**
 * Created by macadmin on 16/11/5.
 */
public class MyWatcher implements Watcher {

    private ZooKeeper zk;

    private String hostPort;

    public MyWatcher(String hostPort){
        this.hostPort = hostPort;
    }

    public void connectionZk() throws IOException {
        zk = new ZooKeeper(hostPort, 15000, this);
    }

    @Override
    public void process(WatchedEvent watchedEvent) {
        System.out.print("return : " + watchedEvent.toString());
    }

    public ZooKeeper getZk() {
        return zk;
    }

    public void setZk(ZooKeeper zk) {
        this.zk = zk;
    }

    public String getHostPort() {
        return hostPort;
    }

    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }


    public static void main(String args[]) throws IOException, InterruptedException {
        MyWatcher myWater = new MyWatcher("127.0.0.1:2181");
        myWater.connectionZk();

        Thread.sleep(999999999);
    }

}
