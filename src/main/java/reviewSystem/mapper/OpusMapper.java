package reviewSystem.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import reviewSystem.pojo.Opus;

import java.util.List;

@Mapper
public interface OpusMapper {

    @Insert("insert into opus(opusName, opusType, opusCourse, opusSchool, opusParticipantNames, phoneNum) " +
            "values (#{opusName},#{opusType},#{opusCourse},#{opusSchool},#{opusParticipantNames},#{phoneNum})")
    void upload(Opus opus);

    List<Opus> list(String opusName);

}
