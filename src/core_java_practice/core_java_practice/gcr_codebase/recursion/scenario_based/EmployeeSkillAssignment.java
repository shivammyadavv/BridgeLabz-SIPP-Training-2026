package core_java_practice.core_java_practice.gcr_codebase.recursion.scenario_based;

public class EmployeeSkillAssignment {

    public static void findProjectTeams(
            int[] skillScores,
            int currentIndex,
            int targetScore,
            int currentSum,
            String currentTeam) {

        // Base Case
        if (currentIndex == skillScores.length) {

            if (currentSum == targetScore) {
                System.out.println("[" + currentTeam + "]");
            }

            return;
        }

        // Include current employee
        String updatedTeam;

        if (currentTeam.isEmpty()) {
            updatedTeam =
                    String.valueOf(skillScores[currentIndex]);
        } else {
            updatedTeam =
                    currentTeam + "," +
                            skillScores[currentIndex];
        }

        findProjectTeams(
                skillScores,
                currentIndex + 1,
                targetScore,
                currentSum + skillScores[currentIndex],
                updatedTeam);

        // Exclude current employee
        findProjectTeams(
                skillScores,
                currentIndex + 1,
                targetScore,
                currentSum,
                currentTeam);
    }

    public static void main(String[] args) {

        int[] skillScores = {2, 3, 5, 7};
        int targetScore = 10;

        findProjectTeams(
                skillScores,
                0,
                targetScore,
                0,
                "");
    }
}