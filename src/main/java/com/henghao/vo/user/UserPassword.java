package com.henghao.vo.user;

import lombok.Data;

/**
 * @author wzp
 * @description: APP端用户修改密码的包装类
 * @update on 2017/12/3.
 */
@Data
public class UserPassword {
    // 用户ID
    private String uid;
    // 原密码
    private String originalPassword;
    // 新密码
    private String newPassword;
    // 确认密码
    private String confirmPassword;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        UserPassword that = (UserPassword) o;

        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (originalPassword != null ? !originalPassword.equals(that.originalPassword) : that.originalPassword != null)
            return false;
        if (newPassword != null ? !newPassword.equals(that.newPassword) : that.newPassword != null) return false;
        return confirmPassword != null ? confirmPassword.equals(that.confirmPassword) : that.confirmPassword == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (originalPassword != null ? originalPassword.hashCode() : 0);
        result = 31 * result + (newPassword != null ? newPassword.hashCode() : 0);
        result = 31 * result + (confirmPassword != null ? confirmPassword.hashCode() : 0);
        return result;
    }
}
