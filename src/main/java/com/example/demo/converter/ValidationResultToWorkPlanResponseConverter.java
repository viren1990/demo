package com.example.demo.converter;

import com.example.demo.facade.request.WorkPlanResponse;
import com.example.demo.validator.ValidationResult;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import static com.example.demo.facade.request.WorkPlanResponse.WorkPlanResponseStatus.FAILURE;
import static com.example.demo.facade.request.WorkPlanResponse.WorkPlanResponseStatus.SUCCESS;

@Component
public class ValidationResultToWorkPlanResponseConverter implements Converter<ValidationResult, WorkPlanResponse> {

    @Override
    public WorkPlanResponse convert(ValidationResult validationResult) {
        final WorkPlanResponse response = new WorkPlanResponse();
        response.setStatus(validationResult.hasErrors() ? FAILURE : SUCCESS);
        return response;
    }
}
