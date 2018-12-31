package com.ezlo.automation.framework.backend.web_socket.ezlo;

import com.ezlo.automation.framework.backend.web_socket.ezlo.error_enums.*;
import com.google.gson.annotations.Expose;

import java.util.Objects;

public class ErrorData {

    @Expose
    private int code;
    @Expose
    private String data;
    @Expose
    private String message;

    private String codeMatcher;

    public int getCode() {
        return code;
    }

    public String getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public ErrorData withApplicationErrors(ApplicationErrors error){
        this.data = error.getErrorData();
        this.message = error.getErrorMsg();
        return this;
    }

    public ErrorData withInternalErrors(InternalErrors error){
        this.data = error.getErrorData();
        this.message = error.getErrorMsg();
        return this;
    }

    public ErrorData withInvalidRequestErrors(InvalidRequestErrors error){
        this.data = error.getErrorData();
        this.message = error.getErrorMsg();
        return this;
    }

    public ErrorData withMethodNotFoundErrors(MethodNotFoundErrors error){
        this.data = error.getErrorData();
        this.message = error.getErrorMsg();
        return this;
    }

    public ErrorData withInvalidParamsErrors(InvalidParamsErrors error){
        this.data = error.getErrorData();
        this.message = error.getErrorMsg();
        return this;
    }

    public ErrorData withCodes(ErrorCodes code){
        this.code = code.getErrorCode();
        return this;
    }

    public ErrorData withCodeMatcher(String s) {
        this.codeMatcher = s;
        return this;
    }

    public String getCodeMatcher() {
        return codeMatcher;
    }

    public ErrorData withCode(int code) {
        this.code = code;
        return this;
    }

    public ErrorData withData(String data) {
        this.data = data;
        return this;
    }

    public ErrorData withMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ErrorData errorData = (ErrorData) o;
        return code == errorData.code &&
                Objects.equals(data, errorData.data) &&
                Objects.equals(message, errorData.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, data, message);
    }

    @Override
    public String toString() {
        return "ErrorData{" +
                "code=" + code +
                ", data='" + data + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
