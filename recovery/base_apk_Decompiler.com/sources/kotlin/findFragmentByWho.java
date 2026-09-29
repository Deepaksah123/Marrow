package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n*\u00020\b2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0016\u001a\u00020\u00028\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\"\u0004\b\u0010\u0010\u0015R\"\u0010\u0012\u001a\u00020\u00048\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018\"\u0004\b\u0010\u0010\u0019"}, d2 = {"Lo/findFragmentByWho;", "Lo/getActivity;", "Lo/dump;", "p0", "", "p1", "<init>", "(Lo/dump;Z)V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "RemoteActionCompatParcelizer", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)J", "Lo/getValueHandler;", "Lo/hasHandlers;", "", "AudioAttributesCompatParcelizer", "(Lo/getValueHandler;Lo/hasHandlers;I)I", "write", "read", "Lo/dump;", "(Lo/dump;)V", "IconCompatParcelizer", "Z", "()Z", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class findFragmentByWho extends getActivity {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private dump IconCompatParcelizer;

    public findFragmentByWho(dump dumpVar, boolean z) {
        this.IconCompatParcelizer = dumpVar;
        this.write = z;
    }

    public final void AudioAttributesCompatParcelizer(dump dumpVar) {
        this.IconCompatParcelizer = dumpVar;
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.write = z;
    }

    @Override // kotlin.getActivity
    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    @Override // kotlin.getActivity
    public final long RemoteActionCompatParcelizer(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        int iIconCompatParcelizer;
        if (this.IconCompatParcelizer == dump.AudioAttributesCompatParcelizer) {
            iIconCompatParcelizer = istypeorsupertypeof.read(PropertyValueAny.AudioAttributesImplBaseParcelizer(j));
        } else {
            iIconCompatParcelizer = istypeorsupertypeof.IconCompatParcelizer(PropertyValueAny.AudioAttributesImplBaseParcelizer(j));
        }
        if (iIconCompatParcelizer < 0) {
            iIconCompatParcelizer = 0;
        }
        return PropertyValueAny.INSTANCE.AudioAttributesCompatParcelizer(iIconCompatParcelizer);
    }

    @Override // kotlin.getActivity, kotlin._initForReading
    public final int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return this.IconCompatParcelizer == dump.AudioAttributesCompatParcelizer ? hashandlers.read(i) : hashandlers.IconCompatParcelizer(i);
    }

    @Override // kotlin.getActivity, kotlin._initForReading
    public final int write(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return this.IconCompatParcelizer == dump.AudioAttributesCompatParcelizer ? hashandlers.read(i) : hashandlers.IconCompatParcelizer(i);
    }
}
