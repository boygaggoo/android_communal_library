package com.qdong.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table MQTT_CHAT_ENTITY.
 */
public class MqttChatEntity {

    private Long id;
    private int mode;
    /** Not-null value. */
    private String sessionid;
    /** Not-null value. */
    private String come;
    /** Not-null value. */
    private String to;
    private String v_code;
    private String v_msg;
    /** Not-null value. */
    private String timestamp;
    private String platform;
    private String message;
    private boolean isread;
    private Long gossipid;
    private String gossip;
    private int chattype;
    private String imagepath;
    private String base64image;

    public MqttChatEntity() {
    }

    public MqttChatEntity(Long id) {
        this.id = id;
    }

    public MqttChatEntity(Long id, int mode, String sessionid, String come, String to, String v_code, String v_msg, String timestamp, String platform, String message, boolean isread, Long gossipid, String gossip, int chattype, String imagepath, String base64image) {
        this.id = id;
        this.mode = mode;
        this.sessionid = sessionid;
        this.come = come;
        this.to = to;
        this.v_code = v_code;
        this.v_msg = v_msg;
        this.timestamp = timestamp;
        this.platform = platform;
        this.message = message;
        this.isread = isread;
        this.gossipid = gossipid;
        this.gossip = gossip;
        this.chattype = chattype;
        this.imagepath = imagepath;
        this.base64image = base64image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    /** Not-null value. */
    public String getSessionid() {
        return sessionid;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    /** Not-null value. */
    public String getCome() {
        return come;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setCome(String come) {
        this.come = come;
    }

    /** Not-null value. */
    public String getTo() {
        return to;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setTo(String to) {
        this.to = to;
    }

    public String getV_code() {
        return v_code;
    }

    public void setV_code(String v_code) {
        this.v_code = v_code;
    }

    public String getV_msg() {
        return v_msg;
    }

    public void setV_msg(String v_msg) {
        this.v_msg = v_msg;
    }

    /** Not-null value. */
    public String getTimestamp() {
        return timestamp;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getIsread() {
        return isread;
    }

    public void setIsread(boolean isread) {
        this.isread = isread;
    }

    public Long getGossipid() {
        return gossipid;
    }

    public void setGossipid(Long gossipid) {
        this.gossipid = gossipid;
    }

    public String getGossip() {
        return gossip;
    }

    public void setGossip(String gossip) {
        this.gossip = gossip;
    }

    public int getChattype() {
        return chattype;
    }

    public void setChattype(int chattype) {
        this.chattype = chattype;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public String getBase64image() {
        return base64image;
    }

    public void setBase64image(String base64image) {
        this.base64image = base64image;
    }

}
