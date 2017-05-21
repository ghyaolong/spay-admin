package com.syhbuy.spay.admin.dao;

import com.syhbuy.spay.admin.entity.PayBankcard;

public interface PayBankcardMapper {
    int deleteByPrimaryKey(String id);

    int insert(PayBankcard record);

    int insertSelective(PayBankcard record);

    PayBankcard selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PayBankcard record);

    int updateByPrimaryKey(PayBankcard record);
}