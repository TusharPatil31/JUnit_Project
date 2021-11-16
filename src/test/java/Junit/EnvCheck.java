package Junit;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

public class EnvCheck implements ExecutionCondition {

	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		// TODO Auto-generated method stub
		
		String ExpEnv = "DEV";
		String ActEnv = "DEV";
		
		if(ExpEnv.equals(ActEnv))
		{
			return ConditionEvaluationResult.enabled("The Env value are matched");
		}
		
		
		return ConditionEvaluationResult.disabled("The Env value are not matched");
	}
	

}
