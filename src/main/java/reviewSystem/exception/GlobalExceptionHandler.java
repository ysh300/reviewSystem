package reviewSystem.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import reviewSystem.pojo.Result;

//全局异常处理器
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)//指定捕获异常类型，所有异常
    public Result ex(Exception e) {
//        输出异常堆栈信息
        e.printStackTrace();
        return Result.error("对不起，操作失败");
    }


}
