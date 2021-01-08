package endTermHomeWork.homework7.problem.problem6;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch(){
        startTime=new Date();
    }
    public  void start(){
        startTime=new Date();
    }
    public void end(){
        endTime=new Date();
    }
    public long getElapseTime(){
        return endTime.getTime()-startTime.getTime();
    }

    public Date getStartTime(){
        return startTime;
    }
    public Date getEndTime(){
        return endTime;
    }

}
