package reviewSystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reviewSystem.mapper.ScoreMapper;
import reviewSystem.pojo.OpusScore;
import reviewSystem.service.ScoreService;

@Service
public class ScoreServiceImpl implements ScoreService {
    @Autowired
    private ScoreMapper scoreMapper;
    @Override
    public void score(OpusScore opusScore) {
        scoreMapper.score(opusScore);
    }
}
