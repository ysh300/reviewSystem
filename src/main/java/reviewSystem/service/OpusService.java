package reviewSystem.service;

import reviewSystem.pojo.Opus;
import reviewSystem.pojo.PageBean;

public interface OpusService {
    void upload(Opus opus);

    PageBean page(String opusName, Integer page, Integer pageSize);
}
