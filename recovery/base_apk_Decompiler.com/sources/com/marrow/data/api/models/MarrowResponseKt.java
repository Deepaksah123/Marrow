package com.marrow.data.api.models;

import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.Data;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Res", "p0", "Lcom/marrow/data/api/models/MarrowResponse;", "createDummyResponse", "(Ljava/lang/Object;)Lcom/marrow/data/api/models/MarrowResponse;"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class MarrowResponseKt {
    public static final <Res> MarrowResponse<Res> createDummyResponse(Res res) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.code = 200;
        apiResponse.status = "success";
        apiResponse.data = new Data<>(res);
        return ResponseExtensionsKt.asMarrowResponse(apiResponse);
    }
}
