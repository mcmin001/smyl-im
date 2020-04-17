package cn.buptleida.niohdl.core;

/**
 *接收数据的调度封装
 * 把一份或者多份IOArgs组合成一份Packet
 */
public interface ReceiveDispatcher {

    void start();

    void stop();

    interface ReceivePacketCallback{
        void onReceivePacketCompleted(ReceivePacket packet);
    }
}
