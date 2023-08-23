package com.sharp.myoj.judge.codesandbox;

import com.sharp.myoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.sharp.myoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
