package com.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Validates the task name, assignee name,
 * task start date, task due date.
 *
 * @author Ajith venkadesh
 * @version 1.0
 */
public class Validator {
    /**
     * Validates the task name.
     *
     * @param name Name of the task.
     * @return validated name.
     */
    public Boolean validateName(final String name) {
        final String regularExpression = "^[a-zA-Z\\s]{1,30}";
        final Pattern stringPattern = Pattern.compile(regularExpression);
        final Matcher nameMatcher = stringPattern.matcher(name);

        return nameMatcher.matches();
    }

    /**
     * Validates the id of the assignee.
     *
     * @param id Id of the assignee.
     * @return Validated id.
     */
    public Boolean validateAssigneeId(final int id) {
        final String assigneeId = String.valueOf(id);
        final String regularExpression = "[0-9]+";
        final Pattern stringPattern = Pattern.compile(regularExpression);
        final Matcher idMatcher = stringPattern.matcher(assigneeId);

        return idMatcher.matches();
    }

    /**
     * Validates the role of assignee.
     *
     * @param role Role of the task.
     * @return validated name.
     */
    public Boolean validateRole(final String role) {
        final String regularExpression = "^[a-zA-Z\\s]{1,30}";
        final Pattern stringPattern = Pattern.compile(regularExpression);
        final Matcher roleMatcher = stringPattern.matcher(role);

        return roleMatcher.matches();
    }

    /**
     * Validates the id of the task.
     *
     * @param id Id of the assignee.
     * @return Validated id.
     */
    public boolean validateTaskId(final int id) {
        final String taskId = String.valueOf(id);
        final String regularExpression = "[0-9]+";
        final Pattern stringPattern = Pattern.compile(regularExpression);
        final Matcher nameMatcher = stringPattern.matcher(taskId);

        return nameMatcher.matches();
    }
}
