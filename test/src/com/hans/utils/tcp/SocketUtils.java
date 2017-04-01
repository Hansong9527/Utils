package com.hans.utils.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

//import com.navinfo.tsp.core.data.ResultCode;

/**
 * Socket工具类
 * @author gem
 *
 */
public class SocketUtils {
	
	private static Log logger = LogFactory.getLog(SocketUtils.class);
	
	public static void tcpSend(String tcpServerIP, int tcpServerPort, String msg){
		OutputStream os = null;
		Socket s = null;
		try
        {
			s = new Socket(InetAddress.getByName(tcpServerIP), tcpServerPort);
			
			s.setTcpNoDelay(true);
			s.setKeepAlive(true);
			s.setReuseAddress(true);
			s.setReceiveBufferSize(1024* 1024 * 64);
			
			os = s.getOutputStream();
            os.write(msg.getBytes());
            os.flush();
        } catch (Exception e){
        	logger.debug("TCP Client发送信息时出错", e);
        } finally {
        	try {
        		if(null != os)
        			os.close();
			} catch (IOException e) {
			}
        	try {
        		if(null != s)
        			s.close();
			} catch (IOException e) {
			}
        }
	}

}
