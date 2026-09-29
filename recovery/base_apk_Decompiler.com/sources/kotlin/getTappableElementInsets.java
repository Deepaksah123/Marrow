package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/getTappableElementInsets;", "Lo/isRound;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface getTappableElementInsets extends isRound {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getTappableElementInsets$RemoteActionCompatParcelizer;", "Lo/getTappableElementInsets;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements getTappableElementInsets {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/getTappableElementInsets$AudioAttributesCompatParcelizer;", "Lo/getTappableElementInsets;", "Lo/getTappableElementInsets$RemoteActionCompatParcelizer;", "p0", "<init>", "(Lo/getTappableElementInsets$RemoteActionCompatParcelizer;)V", "IconCompatParcelizer", "Lo/getTappableElementInsets$RemoteActionCompatParcelizer;", "read", "()Lo/getTappableElementInsets$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements getTappableElementInsets {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final RemoteActionCompatParcelizer RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final RemoteActionCompatParcelizer getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }
}
