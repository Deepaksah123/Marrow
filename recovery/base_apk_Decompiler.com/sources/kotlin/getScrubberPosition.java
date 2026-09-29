package kotlin;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.SOURCE)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002B\u0000"}, d2 = {"Lo/getScrubberPosition;", "", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public @interface getScrubberPosition {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.write;

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/getScrubberPosition$RemoteActionCompatParcelizer;", "", "<init>", "()V", "", "p0", "read", "(I)I"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        public static int read(int p0) {
            if (p0 == 1) {
                return 1;
            }
            if (p0 != 2) {
                return p0 != 3 ? 0 : 3;
            }
            return 2;
        }

        private RemoteActionCompatParcelizer() {
        }
    }

    /* JADX INFO: renamed from: o.getScrubberPosition$write, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class Companion {
        static final /* synthetic */ Companion write = new Companion();

        private Companion() {
        }
    }
}
