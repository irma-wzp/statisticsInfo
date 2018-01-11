package com.henghao.util;

import java.lang.reflect.Field;
import java.util.List;

public class ObjectUtil {

    public static Object updateNew(Object oldEntity, Object newEntity) throws Exception {
        Field[] oFields = oldEntity.getClass().getDeclaredFields();
        Field[] nFields = newEntity.getClass().getDeclaredFields();
        for (int i = 0; i < oFields.length; i++) {
            Field of = oFields[i];
            Field nf = nFields[i];

            of.setAccessible(true);
            nf.setAccessible(true);
            if ((of.equals(nf)) && (nf.get(newEntity) != null)) {
                of.set(oldEntity, nf.get(newEntity));
            }
            oFields[i] = of;
        }
        return oldEntity;
    }


    /**
     * 判断对象为空
     *
     * @param obj 对象名
     * @return 是否为空
     */
    @SuppressWarnings("rawtypes")
    public static boolean isEmpty(Object obj) {
        if (obj == null) {
            return true;
        }
        if ((obj instanceof List)) {
            return ((List) obj).size() == 0;
        }
        if ((obj instanceof String)) {
            return ((String) obj).trim().equals("");
        }
        return false;
    }

    /**
     * 判断对象不为空
     *
     * @param obj 对象名
     * @return 是否不为空
     */
    public static boolean isNotEmpty(Object obj) {
        return !isEmpty(obj);
    }

    /**
     * 判断对象属性是否为空
     * @param obj 对象
     * @return boolean 只有所有属性全部不为空并且全部不等于空字符串时，才返回false
     */
    public static boolean propertyIsNull(Object obj) {
        // 如果obj为空，则默认属性也为空
        if (obj == null)
            return true;
        // 利用反射机制，判断对象的属性是否为空，或者空字符串
        for(Field f : obj.getClass().getDeclaredFields()){
            f.setAccessible(true);
            try {
                if(f.get(obj) == null || "".equals(f.get(obj))){
                   // 有一个为空或空字符串，则返回true
                    return true;
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        // 全部不为空，返回false
        return false;
    }
}
