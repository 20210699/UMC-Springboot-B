package umc.study.apiPayload.exception.handler;

import umc.study.apiPayload.code.BaseErrorCode;
import umc.study.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {

    // Service에서 해당 핸들러를 만들면 GeneralException을 만듦
    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}