package chap4.item20;

import java.util.Set;

class Person {
    private String name;
    private Set<Job> jobs;

    protected enum Job {
        SINGER,
        SONG_WRITER,
    }

    public Person(String name, Set<Job> jobs) {
        this.name = name;
        this.jobs = jobs;
    }

    public String getName() {
        return name;
    }

    public String getJobs() {
        return jobs.toString();
    }
}
