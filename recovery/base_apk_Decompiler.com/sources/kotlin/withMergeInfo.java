package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0003R\u001c\u0010\u000f\u001a\u00020\n8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lo/withMergeInfo;", "Lo/_handleOddName$IconCompatParcelizer;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "c_", "MediaDescriptionCompat", "", "AudioAttributesCompatParcelizer", "Z", "write", "()Z", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class withMergeInfo extends _handleOddName.IconCompatParcelizer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;

    public withMergeInfo() {
        write(0);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        return "<tail>";
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void c_() {
        this.IconCompatParcelizer = true;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void MediaDescriptionCompat() {
        this.IconCompatParcelizer = false;
    }
}
