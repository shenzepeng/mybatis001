package mapper;

import pojo.QqMember;

import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/12/23 21:06
 * @Description: 沈泽鹏写点注释吧
 */
public interface QqMemberMapper {
    List<QqMember> findAll();
    Integer add(QqMember qqMember);
    Integer delete(Integer id);
    Integer update(QqMember qqMember);
}
