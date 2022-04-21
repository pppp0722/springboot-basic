package com.pppp0722.vouchermanagement.entity.voucher;

import com.pppp0722.vouchermanagement.entity.voucher.Voucher;
import com.pppp0722.vouchermanagement.entity.voucher.VoucherType;
import java.util.UUID;

public class PercentDiscountVoucher implements Voucher {

    private final UUID voucherId;
    private final long amount;
    private final VoucherType voucherType = VoucherType.PERCENT_DISCOUNT;

    public PercentDiscountVoucher(UUID voucherId, long amount) {
        this.voucherId = voucherId;
        this.amount = amount;
    }

    @Override
    public UUID getVoucherId() {
        return voucherId;
    }

    @Override
    public long getAmount() {
        return amount;
    }

    @Override
    public VoucherType getType() {
        return voucherType;
    }
}
