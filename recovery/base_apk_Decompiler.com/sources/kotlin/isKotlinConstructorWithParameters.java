package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public abstract class isKotlinConstructorWithParameters<Key, Value> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/isKotlinConstructorWithParameters$IconCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum IconCompatParcelizer {
        LAUNCH_INITIAL_REFRESH,
        SKIP_INITIAL_REFRESH
    }

    public abstract Object IconCompatParcelizer();

    public static Object RemoteActionCompatParcelizer() {
        return IconCompatParcelizer.LAUNCH_INITIAL_REFRESH;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lo/isKotlinConstructorWithParameters$write;", "", "<init>", "()V", "RemoteActionCompatParcelizer", "read", "Lo/isKotlinConstructorWithParameters$write$RemoteActionCompatParcelizer;", "Lo/isKotlinConstructorWithParameters$write$read;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class write {
        private write() {
        }

        public static final class RemoteActionCompatParcelizer extends write {
            private final Throwable AudioAttributesCompatParcelizer;

            public final Throwable read() {
                return this.AudioAttributesCompatParcelizer;
            }
        }

        public static final class read extends write {
            private final boolean AudioAttributesCompatParcelizer;

            public final boolean RemoteActionCompatParcelizer() {
                return this.AudioAttributesCompatParcelizer;
            }
        }
    }
}
