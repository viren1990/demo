package com.example.demo.facade;

import com.example.demo.facade.request.WorkPlanRequest;
import com.example.demo.facade.request.WorkPlanResponse;
import com.example.demo.validator.ValidationResult;
import com.example.demo.validator.ValidationType;
import com.example.demo.validator.facade.ValidationFacadeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class WorkPlanFacadeImpl implements WorkPlanFacade {

    @Autowired
    private ValidationFacadeFactory validationFacadeFactory;

    @Autowired
    private Converter<ValidationResult, WorkPlanResponse> validationResultToWorkPlanResponseConverter;

    @Override
    public WorkPlanResponse executeWorkPlan(WorkPlanRequest workPlanRequest) {
        final ValidationResult validationResult = validationFacadeFactory.getValidationFacade(ValidationType.fromString(workPlanRequest.getCurrentStep())).validate(null, null);
        return validationResultToWorkPlanResponseConverter.convert(validationResult);
    }
}
