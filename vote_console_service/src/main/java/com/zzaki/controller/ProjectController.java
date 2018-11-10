package com.zzaki.controller;

import com.zzaki.model.request.ProjectReq;
import com.zzaki.service.ProjectService;
import com.zzaki.util.ReturnCodeAndMsgEnum;
import com.zzaki.util.ReturnValue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Zzaki
 * @Description:
 * @Date: Created on 2018/11/6
 * @Company: DeepWise
 */
@RestController
@Slf4j
@RequestMapping("/vote/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "/addProject",method = RequestMethod.POST)
    public ReturnValue<String> addProject(@RequestBody ProjectReq projectReq){
        try{
            int result = projectService.addProject(projectReq);
            if (result >0){
                return new ReturnValue<>(ReturnCodeAndMsgEnum.SUCCESS,null);
            }else {
                return new ReturnValue<>(ReturnCodeAndMsgEnum.CALLER_PARAM_ILLEGAL,null);
            }
        }catch (Exception e){
            return new ReturnValue<>(ReturnCodeAndMsgEnum.DATABASE_EXCEPTION,e.getMessage());
        }
    }

    @RequestMapping(value = "/deleteProject",method = RequestMethod.POST)
    public ReturnValue<String> deleteProject(@RequestParam("projectId")Integer projectId){
        try{
            int result = projectService.deleteProject(projectId);
            if (result >0){
                return new ReturnValue<>(ReturnCodeAndMsgEnum.SUCCESS,null);
            }else {
                return new ReturnValue<>(ReturnCodeAndMsgEnum.NO_RECORD_CHANGE,null);
            }
        }catch (Exception e){
            return new ReturnValue<>(ReturnCodeAndMsgEnum.DATABASE_EXCEPTION,e.getMessage());
        }
    }

    @RequestMapping(value = "/updateProject",method = RequestMethod.POST)
    public ReturnValue<String> updateProject(@RequestBody ProjectReq projectReq){
        try{
            int result = projectService.updateProject(projectReq);
            if (result >0){
                return new ReturnValue<>(ReturnCodeAndMsgEnum.SUCCESS,null);
            }else {
                return new ReturnValue<>(ReturnCodeAndMsgEnum.NO_RECORD_CHANGE,null);
            }
        }catch (Exception e){
            return new ReturnValue<>(ReturnCodeAndMsgEnum.DATABASE_EXCEPTION,e.getMessage());
        }
    }



}
