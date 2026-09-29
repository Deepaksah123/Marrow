package kotlin;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.EnumDeserializer;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    private boolean AudioAttributesCompatParcelizer;
    private final AtomicInteger IconCompatParcelizer = new AtomicInteger(-256);
    private WorkerParameters RemoteActionCompatParcelizer;
    private Context write;

    public abstract Mp4ExtractorExternalSyntheticLambda0<RemoteActionCompatParcelizer> RemoteActionCompatParcelizer();

    public j(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.write = context;
        this.RemoteActionCompatParcelizer = workerParameters;
    }

    public final Context IconCompatParcelizer() {
        return this.write;
    }

    public final UUID AudioAttributesImplBaseParcelizer() {
        return this.RemoteActionCompatParcelizer.read();
    }

    public final e1 MediaBrowserCompatItemReceiver() {
        return this.RemoteActionCompatParcelizer.write();
    }

    public Mp4ExtractorExternalSyntheticLambda0<eb> read() {
        return EnumDeserializer.AudioAttributesCompatParcelizer(new EnumDeserializer.write() { // from class: o.m
            @Override // o.EnumDeserializer.write
            public final Object AudioAttributesCompatParcelizer(EnumDeserializer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                return j.IconCompatParcelizer(remoteActionCompatParcelizer);
            }
        });
    }

    static /* synthetic */ Object IconCompatParcelizer(EnumDeserializer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) throws Exception {
        remoteActionCompatParcelizer.IconCompatParcelizer(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
        return "default failing getForegroundInfoAsync";
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.IconCompatParcelizer.get() != -256;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.IconCompatParcelizer.compareAndSet(-256, i);
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void MediaBrowserCompatSearchResultReceiver() {
        this.AudioAttributesCompatParcelizer = true;
    }

    public final Executor AudioAttributesImplApi21Parcelizer() {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class RemoteActionCompatParcelizer {
        public static RemoteActionCompatParcelizer read() {
            return new AudioAttributesCompatParcelizer();
        }

        public static RemoteActionCompatParcelizer write() {
            return new IconCompatParcelizer();
        }

        RemoteActionCompatParcelizer() {
        }

        public static final class AudioAttributesCompatParcelizer extends RemoteActionCompatParcelizer {
            private final e1 write;

            public AudioAttributesCompatParcelizer() {
                this(e1.IconCompatParcelizer);
            }

            private AudioAttributesCompatParcelizer(e1 e1Var) {
                this.write = e1Var;
            }

            public final e1 IconCompatParcelizer() {
                return this.write;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return this.write.equals(((AudioAttributesCompatParcelizer) obj).write);
            }

            public final int hashCode() {
                return ("androidx.work.ListenableWorker$Result$Success".hashCode() * 31) + this.write.hashCode();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Success {mOutputData=");
                sb.append(this.write);
                sb.append('}');
                return sb.toString();
            }
        }

        public static final class IconCompatParcelizer extends RemoteActionCompatParcelizer {
            private final e1 read;

            public IconCompatParcelizer() {
                this(e1.IconCompatParcelizer);
            }

            private IconCompatParcelizer(e1 e1Var) {
                this.read = e1Var;
            }

            public final e1 RemoteActionCompatParcelizer() {
                return this.read;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return this.read.equals(((IconCompatParcelizer) obj).read);
            }

            public final int hashCode() {
                return ("androidx.work.ListenableWorker$Result$Failure".hashCode() * 31) + this.read.hashCode();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Failure {mOutputData=");
                sb.append(this.read);
                sb.append('}');
                return sb.toString();
            }
        }

        public static final class write extends RemoteActionCompatParcelizer {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass();
            }

            public final int hashCode() {
                return "androidx.work.ListenableWorker$Result$Retry".hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }
    }
}
