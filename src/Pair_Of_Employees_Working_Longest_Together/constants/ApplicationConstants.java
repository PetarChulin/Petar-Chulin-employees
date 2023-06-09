package Pair_Of_Employees_Working_Longest_Together.constants;

public final class ApplicationConstants {

    private ApplicationConstants() {
    }

    public static final String FILE_PATH = "./src/file.csv";

    public static final String BEST_TEAM_PATTERN = "EmployeeID: %s and EmployeeID: %s with total duration on common projects %d days.";
    public static final String NO_TEAMS_MSG = "There are no pair which have worked together on common projects.";
    public static final String HEAD_INFO_MSG = "The pair of employees who have worked together for the longest period of time:";
    public static final String LIST_INFO_MSG = "List of common projects:";
    public static final String DELIMITER = "==============================================================================";
    public static final String NULL = "NULL";
    public static final String BEST_TEAM_PROJECTS_LIST = "%d. EmployeeID: %s and EmployeeID: %s worked together on ProjectID %s for %d days";
    public static final String INVALID_LINE_FORMAT_MSG = "Error: Invalid format of data on line number %d.";
    public static final String INVALID_DATE_FROM_FORMAT_MSG = "Error: Invalid dateFrom format on line number %d.";
    public static final String INVALID_DATE_TO_FORMAT_MSG = "Error: Invalid dateTo format on line number %d.";


}
