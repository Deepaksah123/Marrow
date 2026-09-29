package kotlin;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.rewrapCtorProblem;

/* JADX INFO: loaded from: classes2.dex */
public final class isPrepared {
    private static final AudioAttributesCompatParcelizer<Object> read = new AudioAttributesCompatParcelizer<Object>() { // from class: o.isPrepared.3
        @Override // o.isPrepared.AudioAttributesCompatParcelizer
        public final void write(Object obj) {
        }
    };

    public interface AudioAttributesCompatParcelizer<T> {
        void write(T t);
    }

    public interface IconCompatParcelizer<T> {
        T write();
    }

    public interface read {
        lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList I_();
    }

    public static <T extends read> rewrapCtorProblem.IconCompatParcelizer<T> read(int i, IconCompatParcelizer<T> iconCompatParcelizer) {
        return read(new rewrapCtorProblem.read(i), iconCompatParcelizer);
    }

    public static <T> rewrapCtorProblem.IconCompatParcelizer<List<T>> read() {
        return RemoteActionCompatParcelizer();
    }

    private static <T> rewrapCtorProblem.IconCompatParcelizer<List<T>> RemoteActionCompatParcelizer() {
        return read(new rewrapCtorProblem.read(20), new IconCompatParcelizer<List<T>>() { // from class: o.isPrepared.5
            @Override // o.isPrepared.IconCompatParcelizer
            public final /* synthetic */ Object write() {
                return read();
            }

            private static List<T> read() {
                return new ArrayList();
            }
        }, new AudioAttributesCompatParcelizer<List<T>>() { // from class: o.isPrepared.1
            @Override // o.isPrepared.AudioAttributesCompatParcelizer
            public final /* synthetic */ void write(Object obj) {
                AudioAttributesCompatParcelizer((List) obj);
            }

            private static void AudioAttributesCompatParcelizer(List<T> list) {
                list.clear();
            }
        });
    }

    private static <T extends read> rewrapCtorProblem.IconCompatParcelizer<T> read(rewrapCtorProblem.IconCompatParcelizer<T> iconCompatParcelizer, IconCompatParcelizer<T> iconCompatParcelizer2) {
        return read(iconCompatParcelizer, iconCompatParcelizer2, write());
    }

    private static <T> rewrapCtorProblem.IconCompatParcelizer<T> read(rewrapCtorProblem.IconCompatParcelizer<T> iconCompatParcelizer, IconCompatParcelizer<T> iconCompatParcelizer2, AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizer) {
        return new RemoteActionCompatParcelizer(iconCompatParcelizer, iconCompatParcelizer2, audioAttributesCompatParcelizer);
    }

    private static <T> AudioAttributesCompatParcelizer<T> write() {
        return (AudioAttributesCompatParcelizer<T>) read;
    }

    static final class RemoteActionCompatParcelizer<T> implements rewrapCtorProblem.IconCompatParcelizer<T> {
        private final AudioAttributesCompatParcelizer<T> AudioAttributesCompatParcelizer;
        private final IconCompatParcelizer<T> IconCompatParcelizer;
        private final rewrapCtorProblem.IconCompatParcelizer<T> write;

        RemoteActionCompatParcelizer(rewrapCtorProblem.IconCompatParcelizer<T> iconCompatParcelizer, IconCompatParcelizer<T> iconCompatParcelizer2, AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizer) {
            this.write = iconCompatParcelizer;
            this.IconCompatParcelizer = iconCompatParcelizer2;
            this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
        }

        @Override // o.rewrapCtorProblem.IconCompatParcelizer
        public final T RemoteActionCompatParcelizer() {
            T tRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer();
            if (tRemoteActionCompatParcelizer == null) {
                tRemoteActionCompatParcelizer = this.IconCompatParcelizer.write();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Objects.toString(tRemoteActionCompatParcelizer.getClass());
                }
            }
            if (tRemoteActionCompatParcelizer instanceof read) {
                ((read) tRemoteActionCompatParcelizer).I_().IconCompatParcelizer(false);
            }
            return tRemoteActionCompatParcelizer;
        }

        @Override // o.rewrapCtorProblem.IconCompatParcelizer
        public final boolean RemoteActionCompatParcelizer(T t) {
            if (t instanceof read) {
                ((read) t).I_().IconCompatParcelizer(true);
            }
            this.AudioAttributesCompatParcelizer.write(t);
            return this.write.RemoteActionCompatParcelizer(t);
        }
    }
}
