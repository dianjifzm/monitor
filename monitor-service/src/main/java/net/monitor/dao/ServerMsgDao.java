package net.monitor.dao;


import net.monitor.bean.*;

/**
 * @author gaochuanjun
 * @since 14-3-3
 */
public interface ServerMsgDao {

    int insert_server_monitor(ServerMsgBean serverMsgBean);

    int insert_iostat_monitor(IOStatMonitor ioStatMonitor);

    int insert_traffic(TrafficInfoBean trafficInfoBean);

    int insert_netstat_monitor(NetstatBean netstatBean);

    int insert_computenodestatus(ComputeNodeStatus computeNodeStatus);

}
