package com.example.demo.facade.request;

import lombok.Data;

@Data
public class WorkPlanResponse {

    private WorkPlanResponseStatus status;

    public enum WorkPlanResponseStatus{SUCCESS , FAILURE}
}
