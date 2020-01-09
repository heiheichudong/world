package com.gess.world.bean

data class VersionBean(
    val code: Int,
    val `data`: Data,
    val key: Any,
    val msg: String
)

data class Data(
    val envVar: EnvVar,
    val ishard: Int,
    val loginVideo: Any,
    val path: String,
    val updateMsg: String,
    val version: String,
    val versionCode: Int
)

data class EnvVar(
    val APP_DOWN_URL_ANDROID: String,
    val DEFAULT_CONTACT_MESSAGE: String,
    val DEFAULT_CS_UID: String,
    val DEFAULT_PHONE_REGIST_MAX: String,
    val LIVE_FREE_WATCH_TIME: String,
    val MOMENT_SHARE_PATH: String,
    val ORDINARY_MEMBER_MAX_APPLY_CASH: String,
    val ORDINARY_MEMBER_MAX_APPLY_CASH_DAY: String,
    val ORDINARY_MEMBER_MIN_APPLY_CASH: String,
    val PUBLICKEY: String,
    val PUSH_SERVER_HOST: String,
    val SYS_MIN_DEPOSIT: String,
    val SYS_VIDEO_FREE_WATCH_TIME: String,
    val SYS_VIDEO_MAX_FREE_WATCH_TIME: String
)