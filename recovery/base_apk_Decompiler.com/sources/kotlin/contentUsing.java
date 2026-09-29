package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000eR+\u0010\b\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00108W@WX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u000f\u0010\u0013R\u001e\u0010\n\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00148V@WX\u0096\u000e¢\u0006\u0006\"\u0004\b\b\u0010\u0015"}, d2 = {"Lo/contentUsing;", "Lo/ConfigFeature;", "<init>", "()V", "Lkotlin/Function0;", "Lo/includeFilterInstance;", "p0", "", "read", "(Lo/getCreatedOnDateMs;)V", "write", "Lo/getCreatedOnDateMs;", "IconCompatParcelizer", "Lo/InputAccessor;", "Lo/InputAccessor;", "RemoteActionCompatParcelizer", "", "AudioAttributesCompatParcelizer", "()Z", "(Z)V", "Lo/handleSecondaryContextualization;", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class contentUsing implements ConfigFeature {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final InputAccessor read = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private InputAccessor<includeFilterInstance> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private getCreatedOnDateMs<includeFilterInstance> IconCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ConfigFeature
    public final boolean AudioAttributesCompatParcelizer() {
        return ((Boolean) this.read.getRemoteActionCompatParcelizer()).booleanValue();
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.read.write(Boolean.valueOf(z));
    }

    public final void read(int i) {
        findCoercion.INSTANCE.AudioAttributesCompatParcelizer().write(handleSecondaryContextualization.IconCompatParcelizer(i));
    }

    public final void read(getCreatedOnDateMs<includeFilterInstance> p0) {
        if (this.RemoteActionCompatParcelizer == null) {
            this.IconCompatParcelizer = p0;
        }
    }
}
