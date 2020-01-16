package top.xinzhang0618.producer;

import com.greatonce.core.util.MathUtil;
import java.time.Duration;
import java.time.LocalTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * OtherTest
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/1/16
 */
@SpringBootTest(classes = ProducerApplication.class)
@RunWith(SpringRunner.class)
public class OtherTest {

  @Test
  public void testOMSIntercept() {
//    testTime(LocalTime.of(6, 0), LocalTime.of(6, 0), LocalTime.of(1, 0), "拦截开始与结束时间相等");

//    testTime(LocalTime.of(6, 0), LocalTime.of(9, 0), LocalTime.of(5, 0), "拦截开始小于结束时间");
//    testTime(LocalTime.of(6, 0), LocalTime.of(9, 0), LocalTime.of(6, 0), "拦截开始小于结束时间");
//    testTime(LocalTime.of(6, 0), LocalTime.of(9, 0), LocalTime.of(7, 0), "拦截开始小于结束时间");
//    testTime(LocalTime.of(6, 0), LocalTime.of(9, 0), LocalTime.of(9, 0), "拦截开始小于结束时间");
//    testTime(LocalTime.of(6, 0), LocalTime.of(9, 0), LocalTime.of(10, 0), "拦截开始小于结束时间");

//    testTime(LocalTime.of(16, 0), LocalTime.of(9, 0), LocalTime.of(8, 30), "拦截开始大于结束时间");
//    testTime(LocalTime.of(16, 0), LocalTime.of(9, 0), LocalTime.of(9, 0), "拦截开始大于结束时间");
//    testTime(LocalTime.of(16, 0), LocalTime.of(9, 0), LocalTime.of(15, 30), "拦截开始大于结束时间");
//    testTime(LocalTime.of(16, 0), LocalTime.of(9, 0), LocalTime.of(16, 0), "拦截开始大于结束时间");
//    testTime(LocalTime.of(16, 0), LocalTime.of(9, 0), LocalTime.of(17, 30), "拦截开始大于结束时间");
  }


  public void testTime(LocalTime beginTime, LocalTime endTime, LocalTime interceptTime, String condition) {
    Message message = new Message();
//    LocalTime interceptTime = LocalTime.of(interceptLocalDateTime.getHour(), interceptLocalDateTime.getMinute());

//    LocalTime beginTime = warehouse.getInterceptBeginTime();
//    LocalTime endTime = warehouse.getInterceptEndTime();
    boolean isInterceptTimeGTEBeginTime = interceptTime.isAfter(beginTime) || interceptTime.equals(beginTime);
    if (beginTime.equals(endTime)) {
      message.setDelayMinutes(24 * 60);
    } else if (beginTime.isBefore(endTime)) {
      if (isInterceptTimeGTEBeginTime && interceptTime.isBefore(endTime)) {
        message.setDelayMinutes((int) Duration.between(interceptTime, endTime).toMinutes());
      }
    } else {
      if (isInterceptTimeGTEBeginTime) {
        long presentDelayMinutes = Duration.between(interceptTime, LocalTime.MAX).toMinutes();
        long nextDayDelayMinutes = Duration.between(LocalTime.MIN, endTime).toMinutes();
        message.setDelayMinutes((int) (presentDelayMinutes + nextDayDelayMinutes));
      } else if (interceptTime.isBefore(endTime)) {
        message.setDelayMinutes((int) Duration.between(interceptTime, endTime).toMinutes());
      }
    }
    System.out.println(
        "测: " + condition + ",开始时间: " + beginTime + ",结束时间: " + endTime + ",拦截时间: " + interceptTime + ",结果: " + message
            .getTimeInfo());
  }

  class Message {

    private Integer delayMinutes;

    public Integer getDelayMinutes() {
      return delayMinutes;
    }

    public void setDelayMinutes(Integer delayMinutes) {
      this.delayMinutes = delayMinutes;
    }

    String getTimeInfo() {
      if (this.delayMinutes != null) {
        int hour = this.delayMinutes / 60;
        int minute = this.delayMinutes - hour * 60;
        return "延迟时间为" + hour + "小时" + minute + "分钟";
      }
      return "不拦截";
    }
  }

  @Test
  public void testDuration() {
//    long l = Duration.between(LocalTime.of(6, 0), LocalTime.of(9, 0)).toMinutes();
//    System.out.println(l);
//    long d = Duration.between(LocalTime.of(9, 0), LocalTime.of(6, 0)).toMinutes();
//    System.out.println(d);

    LocalTime time = LocalTime.of(9, 0);
    LocalTime localTime = time.plusHours(8);
    System.out.println(time);
    System.out.println(localTime);
  }
}
