package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/isVisible;", "Lo/isRound;", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface isVisible extends isRound {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/isVisible$read;", "Lo/isVisible;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements isVisible {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/isVisible$IconCompatParcelizer;", "Lo/isVisible;", "Lo/isVisible$read;", "p0", "<init>", "(Lo/isVisible$read;)V", "IconCompatParcelizer", "Lo/isVisible$read;", "RemoteActionCompatParcelizer", "()Lo/isVisible$read;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements isVisible {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final read write;

        public IconCompatParcelizer(read readVar) {
            this.write = readVar;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final read getWrite() {
            return this.write;
        }
    }
}
