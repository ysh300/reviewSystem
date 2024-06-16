package reviewSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reviewSystem.pojo.OpusScore;
import reviewSystem.pojo.Result;
import reviewSystem.service.ScoreService;

@RestController
@RequestMapping
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @PostMapping("/score")
    public Result add(@RequestBody OpusScore opusScore){
        scoreService.score(opusScore);
//        返回总成绩
        return Result.success(opusScore.plusAll());
    }
}
