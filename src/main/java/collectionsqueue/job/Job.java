package collectionsqueue.job;

public class Job implements Comparable<Job> {
    private int priority;
    private String jobDescription;
    private boolean urgent;

    public Job(int priority, String jobDescription) {
        this.priority = priority;
        this.jobDescription = jobDescription;
        urgent = priority < 5;
    }

    public int getPriority() {
        return priority;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public boolean isUrgent() {
        return urgent;
    }

    @Override
    public int compareTo(Job o) {
        return this.priority - o.priority;
    }
}
