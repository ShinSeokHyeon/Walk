package com.demo.walk.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SmsStatus {

    START, // 산책시작 발송
    END // 산책종료 발송

}
