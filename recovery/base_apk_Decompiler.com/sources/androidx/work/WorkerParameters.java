package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.CurrentQuery;
import kotlin.e1;
import kotlin.getNextWindowIndex;
import kotlin.onUpgrade;
import kotlin.s;
import kotlin.setEnableDecoderFallback;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {
    private Executor AudioAttributesCompatParcelizer;
    private s AudioAttributesImplApi21Parcelizer;
    private RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private Set<String> AudioAttributesImplBaseParcelizer;
    private e1 IconCompatParcelizer;
    private setEnableDecoderFallback MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private getNextWindowIndex MediaBrowserCompatSearchResultReceiver;
    private CurrentQuery MediaMetadataCompat;
    private int RemoteActionCompatParcelizer;
    private onUpgrade read;
    private UUID write;

    /* JADX INFO: loaded from: classes2.dex */
    public static class RemoteActionCompatParcelizer {
        public Network write;
        public List<String> RemoteActionCompatParcelizer = Collections.emptyList();
        public List<Uri> AudioAttributesCompatParcelizer = Collections.emptyList();
    }

    public WorkerParameters(UUID uuid, e1 e1Var, Collection<String> collection, RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i, int i2, Executor executor, CurrentQuery currentQuery, setEnableDecoderFallback setenabledecoderfallback, getNextWindowIndex getnextwindowindex, s sVar, onUpgrade onupgrade) {
        this.write = uuid;
        this.IconCompatParcelizer = e1Var;
        this.AudioAttributesImplBaseParcelizer = new HashSet(collection);
        this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = i;
        this.RemoteActionCompatParcelizer = i2;
        this.AudioAttributesCompatParcelizer = executor;
        this.MediaMetadataCompat = currentQuery;
        this.MediaBrowserCompatCustomActionResultReceiver = setenabledecoderfallback;
        this.MediaBrowserCompatSearchResultReceiver = getnextwindowindex;
        this.AudioAttributesImplApi21Parcelizer = sVar;
        this.read = onupgrade;
    }

    public final UUID read() {
        return this.write;
    }

    public final e1 write() {
        return this.IconCompatParcelizer;
    }

    public final Executor AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final CurrentQuery IconCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    public final onUpgrade RemoteActionCompatParcelizer() {
        return this.read;
    }
}
