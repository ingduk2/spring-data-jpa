package study.datajpa.repository;

public interface NestedClosedProjections {
    //첫번쨰는 최적화.
    String getUsername();
    //두번째는 최적화 안됨.
    TeamInfo getTeam();

    interface TeamInfo{
        String getName();
    }
}
