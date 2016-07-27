package org.thl.service;

/**
 * @author: ${TaoHanLin}  Date: 2016/7/21 0021 Time: 18:12
 */
public interface IRedisService {

    void setValue(String key, String val);

    String getValue(String key);
}
