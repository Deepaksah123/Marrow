package kotlin;

import com.marrow.data.api.models.ResponseExtensionsKt;
import com.marrow.data.api.models.response.ApiResponse;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class withSkippedAd implements getSubjectTitle {
    @Override // kotlin.getSubjectTitle
    public final Object apply(Object obj) {
        return ResponseExtensionsKt.asMarrowResponse((ApiResponse) obj);
    }
}
