package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\t8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\"\u0004\b\n\u0010\f"}, d2 = {"Lo/handleWeirdNativeValue;", "Lkotlin/Function1;", "", "", "<init>", "()V", "p0", "read", "(Z)V", "Lo/handleMissingInstantiator;", "RemoteActionCompatParcelizer", "Lo/handleMissingInstantiator;", "(Lo/handleMissingInstantiator;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class handleWeirdNativeValue implements getAnswerMap<Boolean, getShowPopup> {
    private handleMissingInstantiator RemoteActionCompatParcelizer;

    @Override // kotlin.getAnswerMap
    public final /* synthetic */ getShowPopup invoke(Boolean bool) {
        read(bool.booleanValue());
        return getShowPopup.INSTANCE;
    }

    public final void RemoteActionCompatParcelizer(handleMissingInstantiator handlemissinginstantiator) {
        this.RemoteActionCompatParcelizer = handlemissinginstantiator;
    }

    public final void read(boolean p0) {
        handleMissingInstantiator handlemissinginstantiator = this.RemoteActionCompatParcelizer;
        if (handlemissinginstantiator != null) {
            handlemissinginstantiator.IconCompatParcelizer(p0);
        }
    }
}
