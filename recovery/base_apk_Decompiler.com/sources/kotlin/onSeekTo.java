package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001e"}, d2 = {"Lo/onSeekTo;", "", "Ljava/util/concurrent/Executor;", "p0", "Lkotlin/Function0;", "", "p1", "<init>", "(Ljava/util/concurrent/Executor;Lo/getCreatedOnDateMs;)V", "write", "()V", "RemoteActionCompatParcelizer", "Ljava/util/concurrent/Executor;", "", "AudioAttributesCompatParcelizer", "()Z", "Ljava/lang/Object;", "", "read", "Ljava/util/List;", "IconCompatParcelizer", "Lo/getCreatedOnDateMs;", "Z", "AudioAttributesImplBaseParcelizer", "Ljava/lang/Runnable;", "AudioAttributesImplApi26Parcelizer", "Ljava/lang/Runnable;", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "", "I", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class onSeekTo {
    private final Object AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final Runnable MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi21Parcelizer;
    private final Executor RemoteActionCompatParcelizer;
    private final List<getCreatedOnDateMs<getShowPopup>> read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private boolean AudioAttributesImplBaseParcelizer;

    public onSeekTo(Executor executor, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(executor, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.RemoteActionCompatParcelizer = executor;
        this.IconCompatParcelizer = getcreatedondatems;
        this.AudioAttributesCompatParcelizer = new Object();
        this.read = new ArrayList();
        this.MediaBrowserCompatItemReceiver = new Runnable() { // from class: o.onRemoveQueueItem
            @Override // java.lang.Runnable
            public final void run() {
                onSeekTo.RemoteActionCompatParcelizer(this.read);
            }
        };
    }

    public final boolean AudioAttributesCompatParcelizer() {
        boolean z;
        synchronized (this.AudioAttributesCompatParcelizer) {
            z = this.AudioAttributesImplApi21Parcelizer;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(onSeekTo onseekto) {
        toMagicModuleMetaRepoModel.write(onseekto, "");
        synchronized (onseekto.AudioAttributesCompatParcelizer) {
            onseekto.AudioAttributesImplBaseParcelizer = false;
            int i = onseekto.MediaBrowserCompatCustomActionResultReceiver;
            if (!onseekto.AudioAttributesImplApi21Parcelizer) {
                onseekto.IconCompatParcelizer.invoke();
                onseekto.write();
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final void write() {
        synchronized (this.AudioAttributesCompatParcelizer) {
            this.AudioAttributesImplApi21Parcelizer = true;
            Iterator<T> it = this.read.iterator();
            while (it.hasNext()) {
                ((getCreatedOnDateMs) it.next()).invoke();
            }
            this.read.clear();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }
}
