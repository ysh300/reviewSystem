package reviewSystem.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import reviewSystem.pojo.OpusScore;

@Mapper
public interface ScoreMapper {

    @Insert("insert into opusscore(opusId, opusDesignScore, opusImplementScore, opusEffectScore, opusInnovationScore, opusComments) " +
            "VALUES (#{opusId},#{opusDesignScore},#{opusImplementScore},#{opusEffectScore},#{opusInnovationScore},#{opusComments})")
    void score(OpusScore opusScore);
}
