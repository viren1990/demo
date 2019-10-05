package com.example.demo.resource;

import com.example.demo.facade.WorkPlanFacade;
import com.example.demo.facade.request.WorkPlanRequest;
import com.example.demo.facade.request.WorkPlanResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoResource {

    @Autowired
    private WorkPlanFacade workPlanFacade;

    @GetMapping("/")
    public String testResource(){
        final WorkPlanRequest request = new WorkPlanRequest();
        request.setCurrentStep("insurance");

        final WorkPlanResponse response =  workPlanFacade.executeWorkPlan(request);
        return response.getStatus().toString();
    }

}
