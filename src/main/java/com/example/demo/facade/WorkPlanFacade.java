package com.example.demo.facade;

import com.example.demo.facade.request.WorkPlanRequest;
import com.example.demo.facade.request.WorkPlanResponse;

@FunctionalInterface
public interface WorkPlanFacade {

    WorkPlanResponse executeWorkPlan(WorkPlanRequest workPlanRequest);

}
