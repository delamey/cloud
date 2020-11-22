package delamey.service.impl;


import delamey.service.DeptService;
import org.springframework.stereotype.Service;
import springcloud.entities.Dept;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by ZeroV on 2018/11/6.
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Override
    public boolean add(Dept dept) {
        return true;
    }

    @Override
    public Dept get(Long id) {
        return new Dept();
    }

    @Override
    public List<Dept> list() {
        List<Dept> deptList=new ArrayList<>();
        Dept dept=new Dept();
        dept.setDeptno(100L);
        dept.setDname("delamey");
        deptList.add(dept);
        return deptList;
    }

}
