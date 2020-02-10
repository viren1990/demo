package com.example.demo.facade;

import com.example.demo.facade.request.WorkPlanRequest;
import com.example.demo.facade.request.WorkPlanResponse;
import com.example.demo.validator.ValidationResult;
import com.example.demo.validator.ValidationType;
import com.example.demo.validator.ValidatorContext;
import com.example.demo.validator.facade.ValidationFacade;
import com.example.demo.validator.facade.ValidationFacadeFactory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class WorkPlanFacadeImpl implements WorkPlanFacade {

    private ValidationFacadeFactory validationFacadeFactory;

    private Converter<ValidationResult, WorkPlanResponse> validationResultToWorkPlanResponseConverter;

    public WorkPlanFacadeImpl(final ValidationFacadeFactory validationFacadeFactory, Converter validationResultToWorkPlanResponseConverter) {
        this.validationFacadeFactory = validationFacadeFactory;
        this.validationResultToWorkPlanResponseConverter = validationResultToWorkPlanResponseConverter;
    }

    @Override
    public WorkPlanResponse executeWorkPlan(WorkPlanRequest workPlanRequest) {

        // work plan system API to fetch all steps to execute

        List<String> steps = List.of("Insurance", "Physician");

        final ValidatorContext context = new ValidatorContext();

        // populate it with data , received from request.

        // collect validation facade instances for above steps

        List<ValidationFacade> facades = steps.stream()
                .map(step -> validationFacadeFactory.getValidationFacade(ValidationType.fromString(step)))
                .collect(Collectors.toList());

        // execute them in a loop
        for (ValidationFacade facade : facades) {

            final ValidationResult result = facade.validate(context);
            if (result.hasErrors()) {

                // create WorkPlanResponse instance from result and return it.
                return this.validationResultToWorkPlanResponseConverter.convert(result);

            }

        }
        throw new RuntimeException("Unidentified shit happened");
    }

}
