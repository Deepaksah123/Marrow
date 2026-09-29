package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0011\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/getDefaultPropertyInclusion;", "Lo/BaseSettings;", "Lo/setViews;", "p0", "<init>", "(Lo/setViews;)V", "", "write", "()V", "read", "RemoteActionCompatParcelizer", "Lo/setViews;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDefaultPropertyInclusion implements BaseSettings {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setViews write;

    public getDefaultPropertyInclusion(setViews setviews) {
        this.write = setviews;
    }

    @Override // kotlin.BaseSettings
    public final void write() {
        this.write.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.BaseSettings
    public final void read() {
        this.write.read();
    }
}
