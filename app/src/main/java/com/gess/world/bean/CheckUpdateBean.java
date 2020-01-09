package com.gess.world.bean;

import java.io.Serializable;

/**
 * Created by shangdongzhou on 2017/11/20.
 */

public class CheckUpdateBean implements Serializable {


    /**
     * updateMsg : 最新发布
     * ishard : 0
     * version : 1.0
     * path : null
     * envVar : {"DEFAULT_CONTACT_MESSAGE;//"短信内容","DEFAULT_PHONE_REGIST_MAX;//"10"}
     * loginVideo : null
     */

    public static int FORCE_UPDATE = 1;
    public static int NO_FORCE_UPDATE = 0;

    private String updateMsg;
    private int ishard;
    private String version;
    private String path;
    private EnvVarBean envVar;
    private String loginVideo;
    private int versionCode;

    public String getUpdateMsg() {
        return updateMsg;
    }

    public void setUpdateMsg(String updateMsg) {
        this.updateMsg = updateMsg;
    }

    public int getIshard() {
        return ishard;
    }

    public void setIshard(int ishard) {
        this.ishard = ishard;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public EnvVarBean getEnvVar() {
        return envVar;
    }

    public void setEnvVar(EnvVarBean envVar) {
        this.envVar = envVar;
    }

    public String getLoginVideo() {
        return loginVideo;
    }

    public void setLoginVideo(String loginVideo) {
        this.loginVideo = loginVideo;
    }

    public static class EnvVarBean {
        /**
         * DEFAULT_CONTACT_MESSAGE : 短信内容
         * DEFAULT_PHONE_REGIST_MAX : 10
         */


        private String ORDINARY_MEMBER_MIN_APPLY_CASH;
        private String ORDINARY_MEMBER_MAX_APPLY_CASH_DAY;//单日最多提现额
        private String SHARE_H5_ADDR;
        private String PUBLICKEY;                       //;// "",//公钥
        private String SYS_VIDEO_FREE_WATCH_TIME;       // "0.10",//视频试看百分比
        private String MOMENT_SHARE_PATH;               // API.HTML5_MIMI + detail/",//帖子分享链接
        private String PUSH_SERVER_HOST;                // "http://113.209.195.29:8888",//推送地址
        private String DEFAULT_CONTACT_MESSAGE;         // "您的好友xxx,今天正式加入了看天下，并邀请您也来加入看天下的大家庭，下载地址http://url.cn/5LKIyBM",//短信邀请信息
        private String DEFAULT_CS_UID;                  // "39f4298e59de41868bd73d15e41813a7",//客服Id
        private String DEFAULT_PHONE_REGIST_MAX;            // "10",//手机最多注册次数
        private String ORDINARY_MEMBER_MAX_APPLY_CASH;      // "1100.00",//单次最多提现额
        private String SYS_VIDEO_MAX_FREE_WATCH_TIME;   // "5",//视频最多试看时间
        private String SYS_MIN_DEPOSIT;                 // "0.07"//最小充值
        private String LIVE_FREE_WATCH_TIME;            //直播试看时间

        public String getLIVE_FREE_WATCH_TIME() {
            return LIVE_FREE_WATCH_TIME;
        }

        public void setLIVE_FREE_WATCH_TIME(String LIVE_FREE_WATCH_TIME) {
            this.LIVE_FREE_WATCH_TIME = LIVE_FREE_WATCH_TIME;
        }

        public String getORDINARY_MEMBER_MIN_APPLY_CASH() {
            return ORDINARY_MEMBER_MIN_APPLY_CASH;
        }

        public void setORDINARY_MEMBER_MIN_APPLY_CASH(String ORDINARY_MEMBER_MIN_APPLY_CASH) {
            this.ORDINARY_MEMBER_MIN_APPLY_CASH = ORDINARY_MEMBER_MIN_APPLY_CASH;
        }

        public String getSHARE_H5_ADDR() {
            return SHARE_H5_ADDR;
        }

        public void setSHARE_H5_ADDR(String SHARE_H5_ADDR) {
            this.SHARE_H5_ADDR = SHARE_H5_ADDR;
        }

        public String getPUBLICKEY() {
            return PUBLICKEY;
        }

        public void setPUBLICKEY(String PUBLICKEY) {
            this.PUBLICKEY = PUBLICKEY;
        }

        public String getSYS_VIDEO_FREE_WATCH_TIME() {
            return SYS_VIDEO_FREE_WATCH_TIME;
        }

        public void setSYS_VIDEO_FREE_WATCH_TIME(String SYS_VIDEO_FREE_WATCH_TIME) {
            this.SYS_VIDEO_FREE_WATCH_TIME = SYS_VIDEO_FREE_WATCH_TIME;
        }

        public String getMOMENT_SHARE_PATH() {
            return MOMENT_SHARE_PATH;
        }

        public void setMOMENT_SHARE_PATH(String MOMENT_SHARE_PATH) {
            this.MOMENT_SHARE_PATH = MOMENT_SHARE_PATH;
        }

        public String getPUSH_SERVER_HOST() {
            return PUSH_SERVER_HOST;
        }

        public void setPUSH_SERVER_HOST(String PUSH_SERVER_HOST) {
            this.PUSH_SERVER_HOST = PUSH_SERVER_HOST;
        }

        public String getDEFAULT_CONTACT_MESSAGE() {
            return DEFAULT_CONTACT_MESSAGE;
        }

        public void setDEFAULT_CONTACT_MESSAGE(String DEFAULT_CONTACT_MESSAGE) {
            this.DEFAULT_CONTACT_MESSAGE = DEFAULT_CONTACT_MESSAGE;
        }

        public String getDEFAULT_CS_UID() {
            return DEFAULT_CS_UID;
        }

        public void setDEFAULT_CS_UID(String DEFAULT_CS_UID) {
            this.DEFAULT_CS_UID = DEFAULT_CS_UID;
        }

        public String getDEFAULT_PHONE_REGIST_MAX() {
            return DEFAULT_PHONE_REGIST_MAX;
        }

        public void setDEFAULT_PHONE_REGIST_MAX(String DEFAULT_PHONE_REGIST_MAX) {
            this.DEFAULT_PHONE_REGIST_MAX = DEFAULT_PHONE_REGIST_MAX;
        }

        public String getORDINARY_MEMBER_MAX_APPLY_CASH() {
            return ORDINARY_MEMBER_MAX_APPLY_CASH;
        }

        public void setORDINARY_MEMBER_MAX_APPLY_CASH(String ORDINARY_MEMBER_MAX_APPLY_CASH) {
            this.ORDINARY_MEMBER_MAX_APPLY_CASH = ORDINARY_MEMBER_MAX_APPLY_CASH;
        }

        public String getSYS_VIDEO_MAX_FREE_WATCH_TIME() {
            return SYS_VIDEO_MAX_FREE_WATCH_TIME;
        }

        public void setSYS_VIDEO_MAX_FREE_WATCH_TIME(String SYS_VIDEO_MAX_FREE_WATCH_TIME) {
            this.SYS_VIDEO_MAX_FREE_WATCH_TIME = SYS_VIDEO_MAX_FREE_WATCH_TIME;
        }

        public String getSYS_MIN_DEPOSIT() {
            return SYS_MIN_DEPOSIT;
        }

        public void setSYS_MIN_DEPOSIT(String SYS_MIN_DEPOSIT) {
            this.SYS_MIN_DEPOSIT = SYS_MIN_DEPOSIT;
        }

        public String getORDINARY_MEMBER_MAX_APPLY_CASH_DAY() {
            return ORDINARY_MEMBER_MAX_APPLY_CASH_DAY;
        }

        public void setORDINARY_MEMBER_MAX_APPLY_CASH_DAY(String ORDINARY_MEMBER_MAX_APPLY_CASH_DAY) {
            this.ORDINARY_MEMBER_MAX_APPLY_CASH_DAY = ORDINARY_MEMBER_MAX_APPLY_CASH_DAY;
        }
    }

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }
}
