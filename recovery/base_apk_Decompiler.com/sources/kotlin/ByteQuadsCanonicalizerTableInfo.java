package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tR\"\u0010\r\u001a\u00020\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000b\u0010\u0006"}, d2 = {"Lo/ByteQuadsCanonicalizerTableInfo;", "Lo/totalCount;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/secondaryCount;", "p0", "<init>", "(Lo/secondaryCount;)V", "", "c_", "()V", "MediaDescriptionCompat", "RemoteActionCompatParcelizer", "Lo/secondaryCount;", "read", "()Lo/secondaryCount;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ByteQuadsCanonicalizerTableInfo extends _handleOddName.IconCompatParcelizer implements totalCount {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private secondaryCount read;

    public ByteQuadsCanonicalizerTableInfo(secondaryCount secondarycount) {
        this.read = secondarycount;
    }

    public final void RemoteActionCompatParcelizer(secondaryCount secondarycount) {
        this.read = secondarycount;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final secondaryCount getRead() {
        return this.read;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void c_() {
        super.c_();
        this.read.IconCompatParcelizer().read(this);
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void MediaDescriptionCompat() {
        this.read.IconCompatParcelizer().IconCompatParcelizer(this);
        super.MediaDescriptionCompat();
    }
}
