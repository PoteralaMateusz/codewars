package codewars_ranking_system;

public class User {
    int rank;
    int progress;

    public User() {
        this.rank = -8;
        this.progress = 0;
    }

    public void incProgress(int completeActivityLevel) {
        if ((completeActivityLevel >= -8) && (completeActivityLevel <= 8) && completeActivityLevel != 0) {
            if (completeActivityLevel == rank && rank != 8) {
                progress = progress + 3;
            } else if ((calculateLevel(completeActivityLevel) - calculateLevel(rank) == -1) && rank != 8) {
                progress = progress + 1;
            } else if ((calculateLevel(completeActivityLevel) > calculateLevel(rank)) && rank != 8) {
                progress = progress +
                        (10 * (calculateLevel(completeActivityLevel) - calculateLevel(rank)) *
                                (calculateLevel(completeActivityLevel) - calculateLevel(rank)));
            }
            rankUpCheck();
        } else {
            throw new IllegalArgumentException();
        }
    }

    private int calculateLevel(int level) {
        if (level < 0) {
            return 9 + level;
        }
        return 8 + level;
    }

    private void rankUpCheck() {
        while (progress >= 100) {
            if (rank == -1) {
                rank = rank + 2;
                progress = progress - 100;
            } else {
                if (rank != 8) {
                    rank++;
                    progress = progress - 100;
                }
            }
        }
        if (rank == 8){
            progress = 0;
        }
    }
}
