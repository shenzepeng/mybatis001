package pojo;

import lombok.Data;

/**
 * @Auther: szp
 * @Date: 2019/12/23 21:05
 * @Description: 沈泽鹏写点注释吧
 */
@Data
public class QqMember {
    /**
     * 主键id
     */
    private Integer id;
    /**
     * qq号
     */
    private String qqNumber;
    /**
     * 密码
     */
    private String password;
    /**
     * 头像
     */
    private String imgUrl;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 性别
     */
    private String sex;

}
