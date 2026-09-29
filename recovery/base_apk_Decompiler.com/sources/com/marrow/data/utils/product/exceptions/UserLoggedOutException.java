package com.marrow.data.utils.product.exceptions;

import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00072\u00060\u0001j\u0002`\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/marrow/data/utils/product/exceptions/UserLoggedOutException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "Companion", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserLoggedOutException extends Exception {
    public static final String ERROR_LOGIN_TO_CONTINUE_MSG = "Re-Login to continue";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserLoggedOutException(String str) {
        super(str);
        toMagicModuleMetaRepoModel.write(str, "");
    }
}
