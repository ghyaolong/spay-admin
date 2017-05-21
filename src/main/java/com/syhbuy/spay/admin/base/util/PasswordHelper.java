package com.syhbuy.spay.admin.base.util;

import com.syhbuy.spay.admin.entity.AdminUser;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * Created by Administrator on 2016/10/14.
 */
public class PasswordHelper {
    private static RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
    private static String algorithmName = "md5";
    private static int hashIterations = 2;

    public static void encryptPassword(AdminUser adminUser){
        String salt=randomNumberGenerator.nextBytes().toHex();
        adminUser.setCredentialsSalt(salt);
        String nPassword = new SimpleHash(algorithmName,adminUser.getPassword(), ByteSource.Util.bytes(adminUser.getAccountName()+salt),hashIterations).toHex();
        adminUser.setPassword(nPassword);
    }

    public static void main(String[] args) {
        AdminUser au = new AdminUser();
        au.setPassword("123456");
        au.setAccountName("admin");

        encryptPassword(au);

        System.out.println(au.getAccountName()+"加密结果：[salt:"+au.getCredentialsSalt()+",password:"+au.getPassword()+"]");


    }
}
