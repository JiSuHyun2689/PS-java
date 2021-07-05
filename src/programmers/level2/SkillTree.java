package programmers.level2;

class L2_SKillTree {
	public int solution(String skill, String[] skill_trees) {
		int answer = 0;

		for (int i = 0; i < skill_trees.length; i++) {
			int target = 0;
			for (int j = 0; j < skill_trees[i].length(); j++) {

				if (skill.indexOf(skill_trees[i].charAt(j)) != -1 && target == skill.indexOf(skill_trees[i].charAt(j)))
					target++;
				else if (skill.indexOf(skill_trees[i].charAt(j)) != -1
						&& target != skill.indexOf(skill_trees[i].charAt(j)))
					break;

				if (j == skill_trees[i].length() - 1)
					answer++;

			}
		}
		return answer;
	}
}


/*
 * import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        
        Iterator<String> it = skillTrees.iterator();

        while (it.hasNext()) {
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
                it.remove();
            }
        }
        answer = skillTrees.size();
        return answer;
    }
}
 * */
 