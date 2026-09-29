package kotlin;

import android.content.Context;
import com.bumptech.glide.Glide;
import kotlin.canKeepMediaPeriodHolder;

/* JADX INFO: loaded from: classes2.dex */
public final class setMetadata implements canKeepMediaPeriodHolder.write {
    @Override // o.canKeepMediaPeriodHolder.write
    public final ForwardingPlayer write(Glide glide, setRendererOffset setrendereroffset, copyWithRequestedContentPositionUs copywithrequestedcontentpositionus, Context context) {
        return new MediaParserExtractorAdapterExternalSyntheticLambda0(glide, setrendereroffset, copywithrequestedcontentpositionus, context);
    }
}
