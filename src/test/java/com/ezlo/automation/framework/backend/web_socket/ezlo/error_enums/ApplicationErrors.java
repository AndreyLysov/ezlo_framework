package com.ezlo.automation.framework.backend.web_socket.ezlo.error_enums;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum ApplicationErrors {

    //TODO - @OleksiiIsakov: https://jira.mios.com/browse/EQAT-3
    USER_DOESNT_HAVE_PERMISSION("user.permission.doesnothave", "User does not have permission"),
    CLOSED_FOR_ALL("user.permission.doesnothave.all", "Closed for all"),
    DEVICES_LOCKED("user.permission.doesnothave.locked", "Devices is locked"),
    CANT_EDIT_USER("user.permission.doesnothave.edit", "Failed to edit user"),
    CANT_GET_EZLOS_FOR_THIS_USER("user.permission.doesnothave.ezlo", "Failed to get ezlos for user"),
    CANT_GET_TOKEN_FOR_THIS_USER("user.permission.doesnothave.token", "Failed to get token for user"),
    UNKNOWN_PERMISSION("user.permission.unknown", "Unknown permission"),
    BAD_PASSWORD("user.login.badpassword", "Bad login or password"),
    USER_HAS_LOGGED("user.login.alreadylogged", "User has logged"),
    WRONG_CURRENT_PASSWORD("user.edit.badpassword", "Wrong current password"),
    CANT_DELETE_USER("user.edit.forbidden.delete", "Failed to delete user"),
    CANT_BLOCK_USER("user.edit.forbidden.block", "Failed to block user"),
    CANT_EDIT_EMAIL("user.edit.forbidden.email", "Failed to edit email"),
    USER_EXISTS("user.create.alreadyregistered", "User exists"),
    OWNER_CANT_BE_UNBOUND("user.ezlo.forbidden.unshare", "Owner Failed to be unbound"),
    EMAIL_IS_NOT_CONFIRMED("nma.user.notconfirmed.email", "Email is not confirmed"),
    USER_NOT_FOUND("nma.user.notfound", "User not found"),
    KEY_NOT_FOUND("nma.user.notfound.key", "Key not found"),
    EMAIL_NOT_EXISTS("nma.user.notfound.email", "Email not exists"),
    CANT_GET_HASH("nma.user.notfound.hash", "Failed to get hash"),
    USER_BLOCKED("nma.user.blocked", "User blocked"),
    USER_DELETED("nma.user.deleted", "User deleted"),
    USER_DISABLED("nma.user.disabled", "User disabled"),
    USER_NOT_LOGGED("nma.user.notlogged", "User not logged"),
    EZLO_AUTH_ERROR("nma.user.badloginorpassword", "Bad login or password"),
    DB_ERROR("nma.db.error", "DB internal error"),
    TOKEN_GENERATE_FAIL("nma.token.failed.generate", "Cannot generate token"),
    NO_TOKEN_FOUND("nma.token.notfound", "No token found"),
    TOKEN_HAS_NO_USER("nma.token.hasno.user", "Token has no user"),
    TOKEN_HAS_NO_SERIAL("nma.token.hasno.serial", "Token has no serial"),
    TOKEN_USED("nma.token.used", "Token used"),
    TOKEN_EXPIRED("nma.token.expired", "Token expired"),
    IMAGE_TOO_LARGE("nma.image.toolarge", "Image too large"),
    IMAGE_NOT_FOUND("nma.image.notfound", "Image not found"),
    EZLO_NOT_REGISTERED("nma.ezlo.notregistered", "Hub not registered"),
    EZLO_NOT_FOUND("nma.ezlo.notfound", "Hub not found"),
    EZLO_NOT_CONNECTED("nma.ezlo.notconnected", "Hub not connected"),
    EZLO_NOT_LINKED("nma.ezlo.notlinked", "Hub not linked"),
    CANT_SEND_TO_EZLO("nma.ezlo.unavailable", "Failed to send to Hub"),
    EZLO_DELETED("nma.ezlo.deleted", "Hub deleted"),
    EZLO_BECAME_ONLINE("nma.ezlo.becameonline", "Hub became online"),
    BAD_BACKEND_PASS("nma.register.badpassword", "Bad backend pass"),
    EZLO_ALREADY_REGISTERED_ON_NMA("nma.register.alreadyregistered", "Hub already registered on NMA"),
    NO_BACKUPS("nma.backup.notfound", "Hub Replica is not found"),
    ADAPTER_UNSUPPORTED("nma.adapter.unsupported", "Unsupported adapter type"),
    ADAPTER_UNAVAILABLE("nma.adapter.unavailable", "Unavailable adapter"),
    EZLO_ALREADY_REGISTERED("ezlo.register.alreadyregistered", "Hub already registered"),
    CANT_RUN_SCRIPT_AFTER_RESTORE_BACKUP("ezlo.restore.internal.startscript", "Failed to run script after restore " +
            "backup"),
    STOP_SCRIPT_RUN_ERROR("ezlo.restore.internal.stopscript", "Stop script run error"),
    WRONG_BACKUP_VERSION("ezlo.restore.unknown.version", "Wrong backup version"),
    BAD_BACKUP_DATA("ezlo.restore.bad.data", "Bad backup data"),
    NO_BACKUP_DATA_PRESENT("ezlo.no.backup.data.present", "Backup was never performed"),
    UNCOMPRESS_ERROR("ezlo.restore.bad.archive", "Uncompress Error"),
    UNPACKED_SIZE_ERROR("ezlo.restore.bad.size", "Unpacked size Error"),
    MD5_ERROR("ezlo.restore.bad.md5", "MD5 Error"),
    UNKNOWN_DATA_TYPE("ezlo.restore.bad.type", "Unknown data type"),
    NO_ENVM_SECTION_IN_BACKUP("ezlo.restore.notfound.envm", "No envm section in backup"),
    NO_ZDDX_SECTION_IN_BACKUP("ezlo.restore.notfound.zddx", "No zddx section in backup"),
    NO_ZDDXSIZE_SECTION_IN_BACKUP("ezlo.restore.notfound.size", "No zddxSize section in backup"),
    NO_HOMEID_SECTION_IN_BACKUP("ezlo.restore.notfound.homeId", "No homeId section in backup"),
    ENVM_UNCOMPRESS_ERROR("ezlo.restore.bad.envm", "ENVM Uncompress Error"),
    ZDDX_UNCOMPRESS_ERROR("ezlo.restore.bad.zddx", "ZDDX Uncompress Error"),
    STICK_WRITE_ERROR("ezlo.restore.unavailable.stick", "STICK write Error"),
    CANT_DOWNLOAD_FIRMWARE("ezlo.update.unavailable.firmware", "Failed to download firmware! Network problems!"),
    CANT_DOWNLOAD_DATA("ezlo.update.unavailable.data", "Failed to download data! Network problems!"),
    CANT_VERIFIED("ezlo.update.bad.firmware", "Failed to verified!"),
    CANT_DECRYPT("ezlo.update.bad.key", "Failed to decrypt!"),
    CANT_UNPACK("ezlo.update.bad.archive", "Failed to unpack!"),
    UPDATE_ZDDX_ERROR("ezlo.update.internal.zddx", "Update ZDDX error"),
    DEPENDENCIES_UPDATE_ERROR("ezlo.update.internal.dependencies", "Dependencies update error"),
    UPDATE_OPERATIONS_ERROR("ezlo.update.internal.operation", "Update operations error"),
    UNEXPECTED_ERROR("ezlo.update.unexpected", "Unexpected error"),
    SEND_FILE_ERROR("ezlo.logs.internal.sendfile", "Send file Error"),
    ERROR_OPENING_FILE("ezlo.logs.notfound.file", "Error opening file"),
    SET_LOGLEVEL_ERROR("ezlo.logs.internal.setlevel", "Set logLevel error"),
    SCRIPT_OPEN_ERROR("ezlo.wifi.notfound.script", "Script open error"),
    SCRIPT_ERROR("ezlo.wifi.internal.script", "Script error"),
    REMOVE_NET_ERROR("ezlo.wifi.internal.remove", "Remove net Error!"),
    ADD_NET_ERROR("ezlo.wifi.internal.add", "Add net Error!"),
    CHECK_ERROR("ezlo.wifi.internal.check", "Check Error!"),
    RESET_WIFI_ERROR("ezlo.wifi.internal.reset", "Reset Wi-Fi Error!"),
    NOT_SENT_TO_GATEWAY("ezlo.gateway.send.error", "Not sent command to gateway"),
    GATEWAY_BUSY("ezlo.adapter.busy.gateway", "Gateway busy"),
    ZWAVE_BUSY("ezlo.adapter.busy.zwave", "Zwave busy"),
    NO_DEVICE_FOUND("ezlo.device.notfound", "No device found!"),
    NO_SUBDEVICE_FOUND("ezlo.device.notfound.subdevice", "No subdevice found"),
    SUCH_NAME_ALREADY_EXISTS("ezlo.device.notunique.name", "Such name already exists!"),
    RULE_WITHOUT_CONDITION("ezlo.rules.without.condition", "Rule without condition"),
    RULE_WITHOUT_ACTION("ezlo.rules.without.action", "Rule without action"),
    RULE_IS_OVERLAPPING("ezlo.rules.overlapping", "Rule is overlapping with other rule"),
    REMOTE_PORT_FORWARDING_FAILED("ezlo.sshtunel.internal", "Remote port forwarding failed: unknown error"),
    STATIC_SERVER_UNAVAILABLE("static.token.unavailable", "Static server unavailable"),
    STATIC_SERVER_BAD_JSON("static.token.bad.json", "Static server bad json"),
    STATIC_SERVER_BAD_DATA("static.token.bad.data", "Static server bad data"),
    NMA_TEMPLATE_EXISTS("nma.template.exists", "Template already exists"),
    MEDIA_STREAM_SUBSYSTEM_FAILURE("mediastream.failure.error", "Media stream subsystem failed to execute requested " +
            "operation"),
    MEDIA_STREAM_INVALID_PAGE_ID("mediastream.invalid.page.id", "Invalid or not existing roomId parameter value " +
            "specified"),
    FFMPEG_FAILURE_ADD("ffmpeg.failure.add", "Failed to add video stream (at least some of streams were not added)"),
    FFMPEG_FAILURE_REMOVE("ffmpeg.failure.remove", "Failed to remove video stream (at least some of streams were not " +
            "removed)"),
    FFMPEG_FAILURE_CFG_LOAD("ffmpeg.failure.cfg.load", "Failed to load configuration file for video streaming"),
    FFMPEG_FAILURE_CFG_SAVE("ffmpeg.failure.cfg.save", "Failed to save configuration file for video streaming"),
    FFMPEG_FAILURE_STREAM_REGISTER("ffmpeg.failure.stream.register", "Failed to register video stream (at least some " +
            "of streams were not registered)"),
    FFMPEG_FAILURE_STREAM_RUN("ffmpeg.failure.stream.run", "Failed to start video stream process (at least some of " +
            "streams were not starred)"),
    FFMPEG_FAILURE_STREAM_STOP("ffmpeg.failure.stream.stop", "Failed to stop video stream process (at least some of " +
            "streams were not stopped)"),
    FFMPEG_FAILURE_STREAM_RESTART("ffmpeg.failure.stream.restart", "Failed to restart video stream process (at least " +
            "some of streams were not restarted)"),
    FFMPEG_FAILURE_STREAM_STATUS("ffmpeg.failure.stream.status", "At least some of streams do not work as they should"),
    CAMERA_SUBSYSTEM_INTERNAL_ERROR("camera.system.internal.error", "Internal error of camera support subsystem"),
    CAMERA_ID_OR_URL_MISSING("camera.id.or.url.missing", "neither cameraId nor cameraUrl specified in call parameters"),
    CAMERA_BAD_CAMERA_URL("camera.bad.camera.url", "Malformed camera URL"),
    CAMERA_BAD_FTP_URL("camera.bad.ftp.url", "Malformed FTP URL"),
    CAMERA_BAD_NOT_EXISTING_ID("camera.bad.id", "Bad or not existing camera ID"),
    CAMERA_ID_MISSING("camera.missing.id", "Missing cameraId parameter"),
    CAMERA_SENDER_MISSING("camera.missing.sender", "Missing sender parameter"),
    SHUTDOWN_MODE_ENTERED("ezlo.uid.shutdown.mode", "UId system is entered shutdown mode"),
    RPC_CALL_QUEUE_OVERFLOW("ezlo.rpc.call.queue.overflow", "RPC call queue reached limit"),
    SPREAD_BUS_IS_NOT_OPERATABLE("ezlo.spread.bus.was.not.initialized", "Spread bus was not initialized correctly"),
    SPREAD_BUS_ERROR("ezlo.spread.bus.internal.error", "Spread bus internal error"),
    OBJECT_NOT_FOUND("generic.object.not.found", "Object not found"),
    CONFIRMATION_EMAIL_FAILURE("nma.confirmation.email.failure", "Failed to send confirmation email"),
    EZLO_HUB_SERIAL_NUMBER_IS_INVALID("nma.invalid.ezlo.serial", "eZLO hub serial number is invalid");

    private static final Map<String, String> mMap = Collections.unmodifiableMap(initializeMapping());
    private final String errorCode;
    private final String errorMsg;

    ApplicationErrors(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    private static Map<String, String> initializeMapping() {
        Map<String, String> mMap = new HashMap<String, String>();
        for (ApplicationErrors s : ApplicationErrors.values()) {
            mMap.put(s.errorCode, s.errorMsg);
        }
        return mMap;
    }

    public String getErrorData() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
