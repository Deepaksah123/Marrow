package kotlin;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a/\u0010\n\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b\"\u001a\u0010\u000f\u001a\u00060\fj\u0002`\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u000e"}, d2 = {"", "IconCompatParcelizer", "()I", "Lo/_handleOddName;", "", "p0", "Lkotlin/Function1;", "Lo/getConfigOverride;", "", "p1", "read", "(Lo/_handleOddName;ZLo/getAnswerMap;)Lo/_handleOddName;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Lo/RemoteActionCompatParcelizer;", "Ljava/util/concurrent/atomic/AtomicInteger;", "AudioAttributesCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class withValueInstantiators {
    private static AtomicInteger IconCompatParcelizer = new AtomicInteger(0);

    public static final int IconCompatParcelizer() {
        return IconCompatParcelizer.addAndGet(1);
    }

    public static /* synthetic */ _handleOddName read$default(_handleOddName _handleoddname, boolean z, getAnswerMap getanswermap, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return read(_handleoddname, z, getanswermap);
    }

    public static final _handleOddName read(_handleOddName _handleoddname, boolean z, getAnswerMap<? super getConfigOverride, getShowPopup> getanswermap) {
        return _handleoddname.AudioAttributesCompatParcelizer(new DatatypeFeaturesDefaultHolder(z, getanswermap));
    }
}
