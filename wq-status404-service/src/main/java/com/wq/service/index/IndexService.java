package com.wq.service.index;
import com.wq.model.index.IndexModel;
public class IndexService {
    public IndexModel getName(){
        IndexModel indexModel=new IndexModel();
        indexModel.setAge(345);
        return indexModel;
    }
}
