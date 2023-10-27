package com.vjrszcode.movies.core.entities.enums;

public enum MovieStatus {
    PENDING(1),
    WATCHED(2);

    private final int status;

    MovieStatus(int status) {
        this.status = status;
    }

    public int getCode() {
        return status;
    }

    public static MovieStatus valueOf(int code){
        for(MovieStatus value: MovieStatus.values()) {
            if(value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus Code");
    }
}
