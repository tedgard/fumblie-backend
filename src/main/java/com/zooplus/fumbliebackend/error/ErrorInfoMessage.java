package com.zooplus.fumbliebackend.error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorInfoMessage {

    private ErrorCode errorCode;
    private String url;
    private String exception;
}
