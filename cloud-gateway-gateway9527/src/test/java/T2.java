import java.time.ZonedDateTime;

/**
 * @author xu
 * @date 2023/8/10
 */
public class T2 {

    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); //默认时区
        System.out.println(zbj);
        //2023-08-10T15:54:59.305+08:00[Asia/Shanghai]
    }
}
