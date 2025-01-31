package org.koreait.global.exceptions;

import org.springframework.http.HttpStatus;

public class BadRequestException extends CommonException {
    /**
     * 문구를 잘못된 요청입니다. 라고 고정, 응답코드는 400
     */
    public BadRequestException() {
        this("BadRequest");
        setErrorCode(true); // 에러 코드, 메세지 연동
    }

    public BadRequestException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}
