package com.pppp0722.vouchermanagement.controller.dto;

import com.pppp0722.vouchermanagement.voucher.model.VoucherType;
import java.util.UUID;

public record CreateVoucherRequest(VoucherType type, long amount, UUID memberId) {

}
