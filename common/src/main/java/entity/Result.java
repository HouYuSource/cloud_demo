package entity;

/**
 * @author houyu
 * @createTime 2019/4/5 22:56
 */
public class Result {

    public static Result build(){
        return new Result();
    }
    public static Result success(){
        return new Result(true, Code.OK, null);
    }
    public static Result success(String message){
        return new Result(true, Code.OK, message);
    }
    public static Result success(String message, Object data){
        return new Result(true, Code.OK, message).setData(data);
    }
    public static Result error(){
        return new Result(true, Code.ERROR, null);
    }
    public static Result error(String message){
        return new Result(true, Code.ERROR, message);
    }
    public static Result error(String message, Object data){
        return new Result(true, Code.ERROR, message).setData(data);
    }


    // 是否成功
    private boolean flag;
    // 返回码
    private Integer code;
    // 返回信息
    private String message;
    // 返回数据
    private Object data;

    public Result() {
    }

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result(boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public boolean isFlag() {
        return flag;
    }

    public Result setFlag(boolean flag) {
        this.flag = flag;
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public Result setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "Result{" +
                "flag=" + flag +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }


    public class Code {

        //成功
        public static final int OK = 20000;
        //失败
        public static final int ERROR = 20001;
        //用户名或密码错误
        public static final int LOGINERROR = 20002;
        //权限不足
        public static final int ACCESSERROR = 20003;
        //远程调用失败
        public static final int REMOTEERROR = 20004;
        //重复操作
        public static final int REPERROR = 20005;

    }

}
