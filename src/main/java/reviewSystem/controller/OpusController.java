package reviewSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import reviewSystem.pojo.Opus;
import reviewSystem.pojo.PageBean;
import reviewSystem.pojo.Result;
import reviewSystem.service.OpusService;
import reviewSystem.utils.AliOSSUtils;

import java.io.IOException;

@RestController
@RequestMapping("/upload")
public class OpusController {
    @Autowired
    private OpusService opusService;
    @Autowired
    private AliOSSUtils aliOSSUtils;

//    参赛作品基本信息上传
    @PostMapping("/basic")
    public Result add(@RequestBody Opus opus){
//        上传基本信息
        opusService.upload(opus);
        return Result.success();
    }

//    参赛作品文件上传
    @PostMapping("/file")
    public Result upload(MultipartFile file) throws IOException {
//        返回文件的URL
        String url = aliOSSUtils.upload(file);
        return Result.success(url);
    }

//    分页查询
    @GetMapping("/select")
    //    RequestParam设置默认值
    public Result page(String opusName,
                   @RequestParam(defaultValue = "1") Integer page,
                   @RequestParam(defaultValue = "10") Integer pageSize){
    //        封装pageBean对象
        PageBean pageBean=opusService.page(opusName,page,pageSize);
        return Result.success(pageBean);
    }

}
