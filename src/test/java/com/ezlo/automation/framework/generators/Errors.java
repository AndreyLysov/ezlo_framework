package com.ezlo.automation.framework.generators;

import com.ezlo.automation.framework.backend.web_socket.ezlo.error_enums.*;
import com.ezlo.automation.framework.backend.web_socket.ezlo.ErrorData;

public class Errors {

    public static final ErrorData USER_DOESNT_HAVE_PERMISSION = new ErrorData()
            .withApplicationErrors(ApplicationErrors.USER_DOESNT_HAVE_PERMISSION)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CLOSED_FOR_ALL = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CLOSED_FOR_ALL)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData DEVICES_LOCKED = new ErrorData()
            .withApplicationErrors(ApplicationErrors.DEVICES_LOCKED)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CANT_EDIT_USER = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CANT_EDIT_USER)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CANT_GET_EZLOS_FOR_THIS_USER = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CANT_GET_EZLOS_FOR_THIS_USER)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CANT_GET_TOKEN_FOR_THIS_USER = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CANT_GET_TOKEN_FOR_THIS_USER)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData UNKNOWN_PERMISSION = new ErrorData()
            .withApplicationErrors(ApplicationErrors.UNKNOWN_PERMISSION)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData BAD_PASSWORD = new ErrorData()
            .withApplicationErrors(ApplicationErrors.BAD_PASSWORD)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData USER_HAS_LOGGED = new ErrorData()
            .withApplicationErrors(ApplicationErrors.USER_HAS_LOGGED)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData WRONG_CURRENT_PASSWORD = new ErrorData()
            .withApplicationErrors(ApplicationErrors.WRONG_CURRENT_PASSWORD)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CANT_DELETE_USER = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CANT_DELETE_USER)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CANT_BLOCK_USER = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CANT_BLOCK_USER)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CANT_EDIT_EMAIL = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CANT_EDIT_EMAIL)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData USER_EXISTS = new ErrorData()
            .withApplicationErrors(ApplicationErrors.USER_EXISTS)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData OWNER_CANT_BE_UNBOUND = new ErrorData()
            .withApplicationErrors(ApplicationErrors.OWNER_CANT_BE_UNBOUND)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData EMAIL_IS_NOT_CONFIRMED = new ErrorData()
            .withApplicationErrors(ApplicationErrors.EMAIL_IS_NOT_CONFIRMED)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData USER_NOT_FOUND = new ErrorData()
            .withApplicationErrors(ApplicationErrors.USER_NOT_FOUND)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData KEY_NOT_FOUND = new ErrorData()
            .withApplicationErrors(ApplicationErrors.KEY_NOT_FOUND)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData EMAIL_NOT_EXISTS = new ErrorData()
            .withApplicationErrors(ApplicationErrors.EMAIL_NOT_EXISTS)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CANT_GET_HASH = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CANT_GET_HASH)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData USER_BLOCKED = new ErrorData()
            .withApplicationErrors(ApplicationErrors.USER_BLOCKED)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData USER_DELETED = new ErrorData()
            .withApplicationErrors(ApplicationErrors.USER_DELETED)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData USER_DISABLED = new ErrorData()
            .withApplicationErrors(ApplicationErrors.USER_DISABLED)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData USER_NOT_LOGGED = new ErrorData()
            .withApplicationErrors(ApplicationErrors.USER_NOT_LOGGED)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData EZLO_AUTH_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.EZLO_AUTH_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData DB_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.DB_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData TOKEN_GENERATE_FAIL = new ErrorData()
            .withApplicationErrors(ApplicationErrors.TOKEN_GENERATE_FAIL)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData NO_TOKEN_FOUND = new ErrorData()
            .withApplicationErrors(ApplicationErrors.NO_TOKEN_FOUND)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData TOKEN_HAS_NO_USER = new ErrorData()
            .withApplicationErrors(ApplicationErrors.TOKEN_HAS_NO_USER)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData TOKEN_HAS_NO_SERIAL = new ErrorData()
            .withApplicationErrors(ApplicationErrors.TOKEN_HAS_NO_SERIAL)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData TOKEN_USED = new ErrorData()
            .withApplicationErrors(ApplicationErrors.TOKEN_USED)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData TOKEN_EXPIRED = new ErrorData()
            .withApplicationErrors(ApplicationErrors.TOKEN_EXPIRED)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData IMAGE_TOO_LARGE = new ErrorData()
            .withApplicationErrors(ApplicationErrors.IMAGE_TOO_LARGE)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData IMAGE_NOT_FOUND = new ErrorData()
            .withApplicationErrors(ApplicationErrors.IMAGE_NOT_FOUND)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData EZLO_NOT_REGISTERED = new ErrorData()
            .withApplicationErrors(ApplicationErrors.EZLO_NOT_REGISTERED)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData EZLO_NOT_FOUND = new ErrorData()
            .withApplicationErrors(ApplicationErrors.EZLO_NOT_FOUND)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData EZLO_NOT_CONNECTED = new ErrorData()
            .withApplicationErrors(ApplicationErrors.EZLO_NOT_CONNECTED)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData EZLO_NOT_LINKED = new ErrorData()
            .withApplicationErrors(ApplicationErrors.EZLO_NOT_LINKED)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CANT_SEND_TO_EZLO = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CANT_SEND_TO_EZLO)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData EZLO_DELETED = new ErrorData()
            .withApplicationErrors(ApplicationErrors.EZLO_DELETED)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData EZLO_BECAME_ONLINE = new ErrorData()
            .withApplicationErrors(ApplicationErrors.EZLO_BECAME_ONLINE)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData BAD_BACKEND_PASS = new ErrorData()
            .withApplicationErrors(ApplicationErrors.BAD_BACKEND_PASS)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData EZLO_ALREADY_REGISTERED_ON_NMA = new ErrorData()
            .withApplicationErrors(ApplicationErrors.EZLO_ALREADY_REGISTERED_ON_NMA)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData NO_BACKUPS = new ErrorData()
            .withApplicationErrors(ApplicationErrors.NO_BACKUPS)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData ADAPTER_UNSUPPORTED = new ErrorData()
            .withApplicationErrors(ApplicationErrors.ADAPTER_UNSUPPORTED)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData ADAPTER_UNAVAILABLE = new ErrorData()
            .withApplicationErrors(ApplicationErrors.ADAPTER_UNAVAILABLE)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData EZLO_ALREADY_REGISTERED = new ErrorData()
            .withApplicationErrors(ApplicationErrors.EZLO_ALREADY_REGISTERED)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CANT_RUN_SCRIPT_AFTER_RESTORE_BACKUP = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CANT_RUN_SCRIPT_AFTER_RESTORE_BACKUP)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData STOP_SCRIPT_RUN_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.STOP_SCRIPT_RUN_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData WRONG_BACKUP_VERSION = new ErrorData()
            .withApplicationErrors(ApplicationErrors.WRONG_BACKUP_VERSION)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData BAD_BACKUP_DATA = new ErrorData()
            .withApplicationErrors(ApplicationErrors.BAD_BACKUP_DATA)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData NO_BACKUP_DATA_PRESENT = new ErrorData()
            .withApplicationErrors(ApplicationErrors.NO_BACKUP_DATA_PRESENT)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData UNCOMPRESS_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.UNCOMPRESS_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData UNPACKED_SIZE_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.UNPACKED_SIZE_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData MD5_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.MD5_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData UNKNOWN_DATA_TYPE = new ErrorData()
            .withApplicationErrors(ApplicationErrors.UNKNOWN_DATA_TYPE)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData NO_ENVM_SECTION_IN_BACKUP = new ErrorData()
            .withApplicationErrors(ApplicationErrors.NO_ENVM_SECTION_IN_BACKUP)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData NO_ZDDX_SECTION_IN_BACKUP = new ErrorData()
            .withApplicationErrors(ApplicationErrors.NO_ZDDX_SECTION_IN_BACKUP)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData NO_ZDDXSIZE_SECTION_IN_BACKUP = new ErrorData()
            .withApplicationErrors(ApplicationErrors.NO_ZDDXSIZE_SECTION_IN_BACKUP)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData NO_HOMEID_SECTION_IN_BACKUP = new ErrorData()
            .withApplicationErrors(ApplicationErrors.NO_HOMEID_SECTION_IN_BACKUP)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData ENVM_UNCOMPRESS_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.ENVM_UNCOMPRESS_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData ZDDX_UNCOMPRESS_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.ZDDX_UNCOMPRESS_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData STICK_WRITE_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.STICK_WRITE_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CANT_DOWNLOAD_FIRMWARE = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CANT_DOWNLOAD_FIRMWARE)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CANT_DOWNLOAD_DATA = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CANT_DOWNLOAD_DATA)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CANT_VERIFIED = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CANT_VERIFIED)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CANT_DECRYPT = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CANT_DECRYPT)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CANT_UNPACK = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CANT_UNPACK)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData UPDATE_ZDDX_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.UPDATE_ZDDX_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData DEPENDENCIES_UPDATE_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.DEPENDENCIES_UPDATE_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData UPDATE_OPERATIONS_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.UPDATE_OPERATIONS_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData UNEXPECTED_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.UNEXPECTED_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData SEND_FILE_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.SEND_FILE_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData ERROR_OPENING_FILE = new ErrorData()
            .withApplicationErrors(ApplicationErrors.ERROR_OPENING_FILE)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData SET_LOGLEVEL_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.SET_LOGLEVEL_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData SCRIPT_OPEN_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.SCRIPT_OPEN_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData SCRIPT_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.SCRIPT_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData REMOVE_NET_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.REMOVE_NET_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData ADD_NET_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.ADD_NET_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CHECK_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CHECK_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData RESET_WIFI_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.RESET_WIFI_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData NOT_SENT_TO_GATEWAY = new ErrorData()
            .withApplicationErrors(ApplicationErrors.NOT_SENT_TO_GATEWAY)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData GATEWAY_BUSY = new ErrorData()
            .withApplicationErrors(ApplicationErrors.GATEWAY_BUSY)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData ZWAVE_BUSY = new ErrorData()
            .withApplicationErrors(ApplicationErrors.ZWAVE_BUSY)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData NO_DEVICE_FOUND = new ErrorData()
            .withApplicationErrors(ApplicationErrors.NO_DEVICE_FOUND)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData NO_SUBDEVICE_FOUND = new ErrorData()
            .withApplicationErrors(ApplicationErrors.NO_SUBDEVICE_FOUND)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData SUCH_NAME_ALREADY_EXISTS = new ErrorData()
            .withApplicationErrors(ApplicationErrors.SUCH_NAME_ALREADY_EXISTS)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData RULE_WITHOUT_CONDITION = new ErrorData()
            .withApplicationErrors(ApplicationErrors.RULE_WITHOUT_CONDITION)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData RULE_WITHOUT_ACTION = new ErrorData()
            .withApplicationErrors(ApplicationErrors.RULE_WITHOUT_ACTION)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData RULE_IS_OVERLAPPING = new ErrorData()
            .withApplicationErrors(ApplicationErrors.RULE_IS_OVERLAPPING)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData REMOTE_PORT_FORWARDING_FAILED = new ErrorData()
            .withApplicationErrors(ApplicationErrors.REMOTE_PORT_FORWARDING_FAILED)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData STATIC_SERVER_UNAVAILABLE = new ErrorData()
            .withApplicationErrors(ApplicationErrors.STATIC_SERVER_UNAVAILABLE)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData STATIC_SERVER_BAD_JSON = new ErrorData()
            .withApplicationErrors(ApplicationErrors.STATIC_SERVER_BAD_JSON)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData STATIC_SERVER_BAD_DATA = new ErrorData()
            .withApplicationErrors(ApplicationErrors.STATIC_SERVER_BAD_DATA)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData NMA_TEMPLATE_EXISTS = new ErrorData()
            .withApplicationErrors(ApplicationErrors.NMA_TEMPLATE_EXISTS)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData MEDIA_STREAM_SUBSYSTEM_FAILURE = new ErrorData()
            .withApplicationErrors(ApplicationErrors.MEDIA_STREAM_SUBSYSTEM_FAILURE)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData MEDIA_STREAM_INVALID_PAGE_ID = new ErrorData()
            .withApplicationErrors(ApplicationErrors.MEDIA_STREAM_INVALID_PAGE_ID)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData FFMPEG_FAILURE_ADD = new ErrorData()
            .withApplicationErrors(ApplicationErrors.FFMPEG_FAILURE_ADD)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData FFMPEG_FAILURE_REMOVE = new ErrorData()
            .withApplicationErrors(ApplicationErrors.FFMPEG_FAILURE_REMOVE)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData FFMPEG_FAILURE_CFG_LOAD = new ErrorData()
            .withApplicationErrors(ApplicationErrors.FFMPEG_FAILURE_CFG_LOAD)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData FFMPEG_FAILURE_CFG_SAVE = new ErrorData()
            .withApplicationErrors(ApplicationErrors.FFMPEG_FAILURE_CFG_SAVE)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData FFMPEG_FAILURE_STREAM_REGISTER = new ErrorData()
            .withApplicationErrors(ApplicationErrors.FFMPEG_FAILURE_STREAM_REGISTER)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData FFMPEG_FAILURE_STREAM_RUN = new ErrorData()
            .withApplicationErrors(ApplicationErrors.FFMPEG_FAILURE_STREAM_RUN)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData FFMPEG_FAILURE_STREAM_STOP = new ErrorData()
            .withApplicationErrors(ApplicationErrors.FFMPEG_FAILURE_STREAM_STOP)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData FFMPEG_FAILURE_STREAM_RESTART = new ErrorData()
            .withApplicationErrors(ApplicationErrors.FFMPEG_FAILURE_STREAM_RESTART)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData FFMPEG_FAILURE_STREAM_STATUS = new ErrorData()
            .withApplicationErrors(ApplicationErrors.FFMPEG_FAILURE_STREAM_STATUS)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CAMERA_SUBSYSTEM_INTERNAL_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CAMERA_SUBSYSTEM_INTERNAL_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CAMERA_ID_OR_URL_MISSING = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CAMERA_ID_OR_URL_MISSING)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CAMERA_BAD_CAMERA_URL = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CAMERA_BAD_CAMERA_URL)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CAMERA_BAD_FTP_URL = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CAMERA_BAD_FTP_URL)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CAMERA_BAD_NOT_EXISTING_ID = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CAMERA_BAD_NOT_EXISTING_ID)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CAMERA_ID_MISSING = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CAMERA_ID_MISSING)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CAMERA_SENDER_MISSING = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CAMERA_SENDER_MISSING)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData SHUTDOWN_MODE_ENTERED = new ErrorData()
            .withApplicationErrors(ApplicationErrors.SHUTDOWN_MODE_ENTERED)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData RPC_CALL_QUEUE_OVERFLOW = new ErrorData()
            .withApplicationErrors(ApplicationErrors.RPC_CALL_QUEUE_OVERFLOW)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData SPREAD_BUS_IS_NOT_OPERATABLE = new ErrorData()
            .withApplicationErrors(ApplicationErrors.SPREAD_BUS_IS_NOT_OPERATABLE)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData SPREAD_BUS_ERROR = new ErrorData()
            .withApplicationErrors(ApplicationErrors.SPREAD_BUS_ERROR)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData OBJECT_NOT_FOUND = new ErrorData()
            .withApplicationErrors(ApplicationErrors.OBJECT_NOT_FOUND)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData CONFIRMATION_EMAIL_FAILURE = new ErrorData()
            .withApplicationErrors(ApplicationErrors.CONFIRMATION_EMAIL_FAILURE)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData EZLO_HUB_SERIAL_NUMBER_IS_INVALID = new ErrorData()
            .withApplicationErrors(ApplicationErrors.EZLO_HUB_SERIAL_NUMBER_IS_INVALID)
            .withCodes(ErrorCodes.APPLICATION_ERROR);

    public static final ErrorData BAD_USER_DATA = new ErrorData()
            .withInternalErrors(InternalErrors.BAD_USER_DATA)
            .withCodes(ErrorCodes.INTERNAL_ERROR);

    public static final ErrorData TOKEN_CREATION_ERROR = new ErrorData()
            .withInternalErrors(InternalErrors.TOKEN_CREATION_ERROR)
            .withCodes(ErrorCodes.INTERNAL_ERROR);

    public static final ErrorData KEY_GENERATION_ERROR = new ErrorData()
            .withInternalErrors(InternalErrors.KEY_GENERATION_ERROR)
            .withCodes(ErrorCodes.INTERNAL_ERROR);

    public static final ErrorData COMPRESS_ERROR = new ErrorData()
            .withInternalErrors(InternalErrors.COMPRESS_ERROR)
            .withCodes(ErrorCodes.INTERNAL_ERROR);

    public static final ErrorData DATA_SAVE_ERROR = new ErrorData()
            .withInternalErrors(InternalErrors.DATA_SAVE_ERROR)
            .withCodes(ErrorCodes.INTERNAL_ERROR);

    public static final ErrorData MAIL_SENDING_ERROR = new ErrorData()
            .withInternalErrors(InternalErrors.MAIL_SENDING_ERROR)
            .withCodes(ErrorCodes.INTERNAL_ERROR);

    public static final ErrorData INTERNAL_OPERATION_ERROR = new ErrorData()
            .withInternalErrors(InternalErrors.INTERNAL_OPERATION_ERROR)
            .withCodes(ErrorCodes.INTERNAL_ERROR);

    public static final ErrorData INTERNAL_UNHANDLED_EXCEPTION_ERROR = new ErrorData()
            .withInternalErrors(InternalErrors.INTERNAL_UNHANDLED_EXCEPTION_ERROR)
            .withCodes(ErrorCodes.INTERNAL_ERROR);

    public static final ErrorData LENGTHY_ASYNC_OPERATION_ERROR = new ErrorData()
            .withInternalErrors(InternalErrors.LENGTHY_ASYNC_OPERATION_ERROR)
            .withCodes(ErrorCodes.INTERNAL_ERROR);

    public static final ErrorData UNCANCELANBLE_OPERATION_IS_IN_PROGRESS = new ErrorData()
            .withInternalErrors(InternalErrors.UNCANCELANBLE_OPERATION_IS_IN_PROGRESS)
            .withCodes(ErrorCodes.INTERNAL_ERROR);

    public static final ErrorData BAD_REQUEST_HASH_NOT_EXISTS = new ErrorData()
            .withInvalidRequestErrors(InvalidRequestErrors.BAD_REQUEST_HASH_NOT_EXISTS)
            .withCodes(ErrorCodes.INVALID_REQUEST);

    public static final ErrorData BAD_PARAMS = new ErrorData()
            .withInvalidRequestErrors(InvalidRequestErrors.BAD_PARAMS)
            .withCodes(ErrorCodes.INVALID_REQUEST);

    public static final ErrorData UNEXPECTED_REQUEST = new ErrorData()
            .withInvalidRequestErrors(InvalidRequestErrors.UNEXPECTED_REQUEST)
            .withCodes(ErrorCodes.INVALID_REQUEST);

    public static final ErrorData UNKNOWN_METHOD = new ErrorData()
            .withMethodNotFoundErrors(MethodNotFoundErrors.UNKNOWN_METHOD)
            .withCodes(ErrorCodes.INVALID_REQUEST);

    public static final ErrorData SERIAL_TOO_SHORT = new ErrorData()
            .withInvalidParamsErrors(InvalidParamsErrors.SERIAL_TOO_SHORT)
            .withCodes(ErrorCodes.INVALID_PARAMS);

    public static final ErrorData PASSWORD_IS_TOO_SHORT = new ErrorData()
            .withInvalidParamsErrors(InvalidParamsErrors.PASSWORD_IS_TOO_SHORT)
            .withCodes(ErrorCodes.INVALID_PARAMS);

    public static final ErrorData KEY_IS_EMPTY = new ErrorData()
            .withInvalidParamsErrors(InvalidParamsErrors.KEY_IS_EMPTY)
            .withCodes(ErrorCodes.INVALID_PARAMS);

    public static final ErrorData TOKEN_EMPTY = new ErrorData()
            .withInvalidParamsErrors(InvalidParamsErrors.TOKEN_EMPTY)
            .withCodes(ErrorCodes.INVALID_PARAMS);

    public static final ErrorData HASH_IS_EMPTY = new ErrorData()
            .withInvalidParamsErrors(InvalidParamsErrors.HASH_IS_EMPTY)
            .withCodes(ErrorCodes.INVALID_PARAMS);

    public static final ErrorData ID_IS_EMPTY = new ErrorData()
            .withInvalidParamsErrors(InvalidParamsErrors.ID_IS_EMPTY)
            .withCodes(ErrorCodes.INVALID_PARAMS);

    public static final ErrorData PARENT_ID_IS_EMPTY = new ErrorData()
            .withInvalidParamsErrors(InvalidParamsErrors.PARENT_ID_IS_EMPTY)
            .withCodes(ErrorCodes.INVALID_PARAMS);

    public static final ErrorData MESSAGE_HAS_EMPTY_METHOD = new ErrorData()
            .withInvalidParamsErrors(InvalidParamsErrors.MESSAGE_HAS_EMPTY_METHOD)
            .withCodes(ErrorCodes.INVALID_PARAMS);

    public static final ErrorData WRONG_UNIT_AVAILABLE_UNITS = new ErrorData()
            .withInvalidParamsErrors(InvalidParamsErrors.WRONG_UNIT_AVAILABLE_UNITS)
            .withCodes(ErrorCodes.INVALID_PARAMS);

    public static final ErrorData UNKNOWN_CONDITION_FILTER = new ErrorData()
            .withInvalidParamsErrors(InvalidParamsErrors.UNKNOWN_CONDITION_FILTER)
            .withCodes(ErrorCodes.INVALID_PARAMS);

    public static final ErrorData WRONG_PARAMS = new ErrorData()
            .withInvalidParamsErrors(InvalidParamsErrors.WRONG_PARAMS)
            .withCodes(ErrorCodes.INVALID_PARAMS);

    public static final ErrorData EMPTY_FIELD = new ErrorData()
            .withInvalidParamsErrors(InvalidParamsErrors.EMPTY_FIELD)
            .withCodes(ErrorCodes.INVALID_PARAMS);
}
