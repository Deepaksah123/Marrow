package kotlin;

import kotlin.Metadata;
import kotlin.getTentativeEndTimestampMs;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002"}, d2 = {"Lo/isTestDiscarded;", "", "read", "IconCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface isTestDiscarded {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.IconCompatParcelizer;

    public interface IconCompatParcelizer extends isTestDiscarded {
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/isTestDiscarded$RemoteActionCompatParcelizer;", "Lo/isTestDiscarded$IconCompatParcelizer;", "<init>", "()V", "Lo/isTestDiscarded$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;", "read", "()J", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements IconCompatParcelizer {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
        }

        public static long read() {
            isTestCompleted istestcompleted = isTestCompleted.INSTANCE;
            return isTestCompleted.read();
        }

        public final String toString() {
            return isTestCompleted.INSTANCE.toString();
        }

        /* JADX INFO: renamed from: o.isTestDiscarded$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer, reason: collision with other inner class name */
        @submitMagicModule
        public static final class C0118RemoteActionCompatParcelizer implements getTentativeEndTimestampMs {
            private final long AudioAttributesCompatParcelizer;

            public static long IconCompatParcelizer(long j) {
                return j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public int compareTo(getTentativeEndTimestampMs gettentativeendtimestampms) {
                return getTentativeEndTimestampMs.read.AudioAttributesCompatParcelizer(this, gettentativeendtimestampms);
            }

            @Override // kotlin.getTentativeEndTimestampMs
            public final long read(getTentativeEndTimestampMs gettentativeendtimestampms) {
                toMagicModuleMetaRepoModel.write(gettentativeendtimestampms, "");
                return write(this.AudioAttributesCompatParcelizer, gettentativeendtimestampms);
            }

            private static long write(long j, getTentativeEndTimestampMs gettentativeendtimestampms) {
                toMagicModuleMetaRepoModel.write(gettentativeendtimestampms, "");
                if (!(gettentativeendtimestampms instanceof C0118RemoteActionCompatParcelizer)) {
                    StringBuilder sb = new StringBuilder("Subtracting or comparing time marks from different time sources is not possible: ");
                    sb.append((Object) read(j));
                    sb.append(" and ");
                    sb.append(gettentativeendtimestampms);
                    throw new IllegalArgumentException(sb.toString());
                }
                return write(j, ((C0118RemoteActionCompatParcelizer) gettentativeendtimestampms).read());
            }

            public static final long write(long j, long j2) {
                isTestCompleted istestcompleted = isTestCompleted.INSTANCE;
                return isTestCompleted.AudioAttributesCompatParcelizer(j, j2);
            }

            private static boolean IconCompatParcelizer(long j, Object obj) {
                return (obj instanceof C0118RemoteActionCompatParcelizer) && j == ((C0118RemoteActionCompatParcelizer) obj).read();
            }

            private static int write(long j) {
                return Long.hashCode(j);
            }

            private static String read(long j) {
                StringBuilder sb = new StringBuilder("ValueTimeMark(reading=");
                sb.append(j);
                sb.append(')');
                return sb.toString();
            }

            public final boolean equals(Object obj) {
                return IconCompatParcelizer(this.AudioAttributesCompatParcelizer, obj);
            }

            public final int hashCode() {
                return write(this.AudioAttributesCompatParcelizer);
            }

            public final String toString() {
                return read(this.AudioAttributesCompatParcelizer);
            }

            private /* synthetic */ long read() {
                return this.AudioAttributesCompatParcelizer;
            }
        }
    }

    /* JADX INFO: renamed from: o.isTestDiscarded$read, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion IconCompatParcelizer = new Companion();

        private Companion() {
        }
    }
}
