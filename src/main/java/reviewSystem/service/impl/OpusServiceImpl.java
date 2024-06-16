package reviewSystem.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reviewSystem.mapper.OpusMapper;
import reviewSystem.pojo.Opus;
import reviewSystem.pojo.PageBean;
import reviewSystem.service.OpusService;

@Service
public class OpusServiceImpl implements OpusService {
    @Autowired
    private OpusMapper opusMapper;
    @Override
    public void upload(Opus opus) {
        opusMapper.upload(opus);

    }

    @Override
    public PageBean page(String opusName, Integer page, Integer pageSize) {
        //        设置分页参数
        PageHelper.startPage(page,pageSize);
//        执行查询
        Page<Opus> list =(Page<Opus>) opusMapper.list(opusName);
//        封装对象并返回结果
        return new PageBean(list.getTotal(),list.getResult());
    }
}
