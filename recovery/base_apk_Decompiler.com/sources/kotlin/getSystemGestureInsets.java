package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/getSystemGestureInsets;", "Lo/isRound;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface getSystemGestureInsets extends isRound {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getSystemGestureInsets$AudioAttributesCompatParcelizer;", "Lo/getSystemGestureInsets;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements getSystemGestureInsets {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/getSystemGestureInsets$IconCompatParcelizer;", "Lo/getSystemGestureInsets;", "Lo/getSystemGestureInsets$AudioAttributesCompatParcelizer;", "p0", "<init>", "(Lo/getSystemGestureInsets$AudioAttributesCompatParcelizer;)V", "RemoteActionCompatParcelizer", "Lo/getSystemGestureInsets$AudioAttributesCompatParcelizer;", "IconCompatParcelizer", "()Lo/getSystemGestureInsets$AudioAttributesCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements getSystemGestureInsets {

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final AudioAttributesCompatParcelizer IconCompatParcelizer;

        public IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.IconCompatParcelizer = audioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final AudioAttributesCompatParcelizer getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/getSystemGestureInsets$write;", "Lo/getSystemGestureInsets;", "Lo/getSystemGestureInsets$AudioAttributesCompatParcelizer;", "p0", "<init>", "(Lo/getSystemGestureInsets$AudioAttributesCompatParcelizer;)V", "read", "Lo/getSystemGestureInsets$AudioAttributesCompatParcelizer;", "write", "()Lo/getSystemGestureInsets$AudioAttributesCompatParcelizer;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements getSystemGestureInsets {

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;

        public write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final AudioAttributesCompatParcelizer getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }
}
