package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lo/getOldPosition;", "", "", "p0", "<init>", "(I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "IconCompatParcelizer", "I", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getOldPosition {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    public getOldPosition(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    public final boolean equals(Object p0) {
        return (p0 instanceof getOldPosition) && this.AudioAttributesCompatParcelizer == ((getOldPosition) p0).AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
