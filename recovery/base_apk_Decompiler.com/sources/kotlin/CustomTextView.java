package kotlin;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u001f\u0010\u0014\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\tR\u0016\u0010\u0019\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018"}, d2 = {"Lo/CustomTextView;", "", "<init>", "()V", "br_", "()Lo/CustomTextView;", "bn_", "", "bo_", "()J", "p0", "IconCompatParcelizer", "(J)Lo/CustomTextView;", "", "bp_", "()Z", "", "bq_", "Ljava/util/concurrent/TimeUnit;", "p1", "read", "(JLjava/util/concurrent/TimeUnit;)Lo/CustomTextView;", "MediaBrowserCompatCustomActionResultReceiver", "write", "J", "AudioAttributesCompatParcelizer", "Z", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class CustomTextView {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private long IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private long AudioAttributesCompatParcelizer;
    public static final CustomTextView IconCompatParcelizer = new IconCompatParcelizer();

    public CustomTextView read(long p0, TimeUnit p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        if (p0 < 0) {
            throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(p0)).toString());
        }
        this.IconCompatParcelizer = p1.toNanos(p0);
        return this;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: bp_, reason: from getter */
    public boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public long bo_() {
        if (!this.RemoteActionCompatParcelizer) {
            throw new IllegalStateException("No deadline".toString());
        }
        return this.AudioAttributesCompatParcelizer;
    }

    public CustomTextView IconCompatParcelizer(long p0) {
        this.RemoteActionCompatParcelizer = true;
        this.AudioAttributesCompatParcelizer = p0;
        return this;
    }

    public CustomTextView bn_() {
        this.IconCompatParcelizer = 0L;
        return this;
    }

    public CustomTextView br_() {
        this.RemoteActionCompatParcelizer = false;
        return this;
    }

    public void bq_() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public static final class IconCompatParcelizer extends CustomTextView {
        @Override // kotlin.CustomTextView
        public final void bq_() {
        }

        IconCompatParcelizer() {
        }

        @Override // kotlin.CustomTextView
        public final CustomTextView read(long j, TimeUnit timeUnit) {
            toMagicModuleMetaRepoModel.write(timeUnit, "");
            return this;
        }

        @Override // kotlin.CustomTextView
        public final CustomTextView IconCompatParcelizer(long j) {
            return this;
        }
    }
}
