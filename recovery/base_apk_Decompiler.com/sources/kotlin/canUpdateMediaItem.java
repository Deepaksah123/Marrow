package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\bJ#\u0010\u0006\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/canUpdateMediaItem;", "", "Lo/bufferMapProperty;", "", "p0", "p1", "RemoteActionCompatParcelizer", "(Lo/bufferMapProperty;II)I", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface canUpdateMediaItem {
    int RemoteActionCompatParcelizer(bufferMapProperty buffermapproperty, int i, int i2);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/canUpdateMediaItem$AudioAttributesCompatParcelizer;", "Lo/canUpdateMediaItem;", "<init>", "()V", "Lo/bufferMapProperty;", "", "p0", "p1", "RemoteActionCompatParcelizer", "(Lo/bufferMapProperty;II)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements canUpdateMediaItem {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        @Override // kotlin.canUpdateMediaItem
        public final int RemoteActionCompatParcelizer(bufferMapProperty buffermapproperty, int i, int i2) {
            return i;
        }

        private AudioAttributesCompatParcelizer() {
        }
    }
}
