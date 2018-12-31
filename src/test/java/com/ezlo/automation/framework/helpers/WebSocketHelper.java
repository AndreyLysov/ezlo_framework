package com.ezlo.automation.framework.helpers;

import org.apache.log4j.Logger;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.CountDownLatch;

import static com.ezlo.automation.framework.common_baby.Constants.getProperties;
import static java.lang.String.format;

public class WebSocketHelper extends WebSocketClient {

    private static URI str;
    protected Logger log = Logger.getLogger(this.getClass().getSimpleName());
    private String response;
    private CountDownLatch messageLatch = new CountDownLatch(1);

    static {
        try {
            str = new URI(format("wss://%s:%s", getProperties().getProperty("nmaUri"), getProperties().getProperty("nmaWebSocketPort")));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    WebSocketHelper() {
        super(str, new Draft_6455());
    }

    public String getResponse() {
        return response;
    }

    @Override
    public void onMessage(String message) {
        messageLatch.countDown();
        response = message;
    }

    @Override
    public void onOpen(ServerHandshake handshake) {
        messageLatch.countDown();
        log.info("Opened connection");
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        messageLatch.countDown();
        log.info("Closed connection");
    }

    @Override
    public void onError(Exception ex) {
        ex.printStackTrace();
    }

    @Override
    public void connect() {
        super.connect();
        try {
            messageLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void send(String text) {
        super.send(text);
        messageLatch = new CountDownLatch(1);
        try {
            messageLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() {
        super.close();
        messageLatch = new CountDownLatch(1);
        try {
            messageLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}