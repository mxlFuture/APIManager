package cn.crap.schedule;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Ehsan
 * @date 2018/10/5 15:42
 */
public class TaskUtil {

    /** 取消定时获取开源信息 start fork 等数量统计 */
    /*private static ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 6, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());

    public static void execute(AbstractTask task){
        executor.execute(task);
    }*/
}
