package kotlin;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\t\u0010\u000bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012"}, d2 = {"Lo/ResultReceiver;", "", "<init>", "()V", "Lo/PlaybackStateCompatCustomAction;", "p0", "", "IconCompatParcelizer", "(Lo/PlaybackStateCompatCustomAction;)V", "AudioAttributesCompatParcelizer", "Landroid/content/Context;", "(Landroid/content/Context;)V", "read", "()Landroid/content/Context;", "RemoteActionCompatParcelizer", "Landroid/content/Context;", "write", "", "Ljava/util/Set;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ResultReceiver {
    private final Set<PlaybackStateCompatCustomAction> AudioAttributesCompatParcelizer = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private volatile Context write;

    /* JADX INFO: renamed from: read, reason: from getter */
    public final Context getWrite() {
        return this.write;
    }

    public final void IconCompatParcelizer(PlaybackStateCompatCustomAction p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Context context = this.write;
        if (context != null) {
            p0.write(context);
        }
        this.AudioAttributesCompatParcelizer.add(p0);
    }

    public final void AudioAttributesCompatParcelizer(PlaybackStateCompatCustomAction p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer.remove(p0);
    }

    public final void AudioAttributesCompatParcelizer(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.write = p0;
        Iterator<PlaybackStateCompatCustomAction> it = this.AudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            it.next().write(p0);
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        this.write = null;
    }
}
