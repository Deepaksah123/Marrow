package kotlin;

import com.marrow.data.api.models.MarrowError;
import com.marrow.data.api.models.response.common.KycResponseBody;

/* JADX INFO: loaded from: classes5.dex */
public final class withIsServerSideInserted {
    private static final MarrowError<KycResponseBody> write = new MarrowError<>(new RuntimeException("No logged user id found"));
    private static final MarrowError<KycResponseBody> IconCompatParcelizer = new MarrowError<>(new RuntimeException("Image Base64 is null"));
}
