package com.jingdianjichi.subject.infra.basic.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jingdianjichi.subject.infra.basic.entity.SubjectMultiple;

import java.util.List;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;

/**
 * 多选题信息表(SubjectMultiple)表服务接口
 *
 * @author makejava
 * @since 2024-03-22 10:11:05
 */
public interface SubjectMultipleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SubjectMultiple queryById(Long id);

    /**
     * 分页查询
     *
     * @param subjectMultiple 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
//    Page<SubjectMultiple> queryByPage(SubjectMultiple subjectMultiple, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param subjectMultiple 实例对象
     * @return 实例对象
     */
    SubjectMultiple insert(SubjectMultiple subjectMultiple);

    /**
     * 修改数据
     *
     * @param subjectMultiple 实例对象
     * @return 实例对象
     */
    SubjectMultiple update(SubjectMultiple subjectMultiple);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    void batchInsert(List<SubjectMultiple> subjectMultipleList);

    List<SubjectMultiple> queryByCondition(SubjectMultiple subjectMultiple);
}
