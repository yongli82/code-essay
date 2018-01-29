package com.code.essay.enums;

public enum RecordStatus {
    VALID(0, "Valid"),
    INVALID(1, "Invalid"),;

    int code;
    String message;

    RecordStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static RecordStatus getByCode(int code) {
        for (RecordStatus item : RecordStatus.values()) {
            if (item.getCode() == code) {
                return item;
            }
        }
        return VALID;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}