package kotlin;

import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.PlaybackDrmModule;
import kotlin.SettingsItem;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Lo/ResourceProviderModule;", "", "Lo/SyncModule;", "p0", "", "p1", "", "p2", "Ljava/util/concurrent/TimeUnit;", "p3", "<init>", "(Lo/SyncModule;IJLjava/util/concurrent/TimeUnit;)V", "Lo/VideoOfflineDbModel;", "Lo/PlaybackDrmModule;", "", "Lo/ActivityPresenterModule;", "", "IconCompatParcelizer", "(Lo/VideoOfflineDbModel;Lo/PlaybackDrmModule;Ljava/util/List;Z)Z", "AudioAttributesCompatParcelizer", "(J)J", "Lo/VideoAnalyticModule;", "write", "(Lo/VideoAnalyticModule;)Z", "read", "(Lo/VideoAnalyticModule;J)I", "", "RemoteActionCompatParcelizer", "(Lo/VideoAnalyticModule;)V", "Lo/SubscriptionDataModule;", "cleanupQueue", "Lo/SubscriptionDataModule;", "Lo/ResourceProviderModule$RemoteActionCompatParcelizer;", "cleanupTask", "Lo/ResourceProviderModule$RemoteActionCompatParcelizer;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "keepAliveDurationNs", "J", "maxIdleConnections", "I", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ResourceProviderModule {
    private final SubscriptionDataModule cleanupQueue;
    private final RemoteActionCompatParcelizer cleanupTask;
    private final ConcurrentLinkedQueue<VideoAnalyticModule> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    public ResourceProviderModule(SyncModule syncModule, int i, long j, TimeUnit timeUnit) {
        toMagicModuleMetaRepoModel.write(syncModule, "");
        toMagicModuleMetaRepoModel.write(timeUnit, "");
        this.maxIdleConnections = 5;
        this.keepAliveDurationNs = timeUnit.toNanos(5L);
        this.cleanupQueue = syncModule.read();
        StringBuilder sb = new StringBuilder();
        sb.append(FirebaseDataModule.AudioAttributesImplApi21Parcelizer);
        sb.append(" ConnectionPool");
        this.cleanupTask = new RemoteActionCompatParcelizer(sb.toString());
        this.connections = new ConcurrentLinkedQueue<>();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/ResourceProviderModule$RemoteActionCompatParcelizer;", "Lo/TableModule;", "", "AudioAttributesCompatParcelizer", "()J"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends TableModule {
        RemoteActionCompatParcelizer(String str) {
            super(str, false, 2, null);
        }

        @Override // kotlin.TableModule
        public final long AudioAttributesCompatParcelizer() {
            return ResourceProviderModule.this.AudioAttributesCompatParcelizer(System.nanoTime());
        }
    }

    public final boolean IconCompatParcelizer(VideoOfflineDbModel p0, PlaybackDrmModule p1, List<ActivityPresenterModule> p2, boolean p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        for (VideoAnalyticModule videoAnalyticModule : this.connections) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(videoAnalyticModule, "");
            synchronized (videoAnalyticModule) {
                if (p3) {
                    if (videoAnalyticModule.MediaBrowserCompatItemReceiver()) {
                    }
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
                if (videoAnalyticModule.read(p0, p2)) {
                    p1.AudioAttributesCompatParcelizer(videoAnalyticModule);
                    return true;
                }
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            }
        }
        return false;
    }

    public final long AudioAttributesCompatParcelizer(long p0) {
        int i = 0;
        VideoAnalyticModule videoAnalyticModule = null;
        long j = Long.MIN_VALUE;
        int i2 = 0;
        for (VideoAnalyticModule videoAnalyticModule2 : this.connections) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(videoAnalyticModule2, "");
            synchronized (videoAnalyticModule2) {
                if (read(videoAnalyticModule2, p0) > 0) {
                    i2++;
                } else {
                    i++;
                    long idleAtNs = p0 - videoAnalyticModule2.getIdleAtNs();
                    if (idleAtNs > j) {
                        videoAnalyticModule = videoAnalyticModule2;
                        j = idleAtNs;
                    }
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
            }
        }
        long j2 = this.keepAliveDurationNs;
        if (j < j2 && i <= this.maxIdleConnections) {
            if (i > 0) {
                return j2 - j;
            }
            if (i2 > 0) {
                return j2;
            }
            return -1L;
        }
        toMagicModuleMetaRepoModel.write(videoAnalyticModule);
        synchronized (videoAnalyticModule) {
            if (!videoAnalyticModule.read().isEmpty()) {
                return 0L;
            }
            if (videoAnalyticModule.getIdleAtNs() + j != p0) {
                return 0L;
            }
            videoAnalyticModule.RatingCompat();
            this.connections.remove(videoAnalyticModule);
            FirebaseDataModule.read(videoAnalyticModule.MediaBrowserCompatSearchResultReceiver());
            if (this.connections.isEmpty()) {
                this.cleanupQueue.IconCompatParcelizer();
            }
            return 0L;
        }
    }

    public final void RemoteActionCompatParcelizer(VideoAnalyticModule p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
        this.connections.add(p0);
        this.cleanupQueue.RemoteActionCompatParcelizer(this.cleanupTask, 0L);
    }

    public final boolean write(VideoAnalyticModule p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
        if (!p0.getNoNewExchanges() && this.maxIdleConnections != 0) {
            this.cleanupQueue.RemoteActionCompatParcelizer(this.cleanupTask, 0L);
            return false;
        }
        p0.RatingCompat();
        this.connections.remove(p0);
        if (!this.connections.isEmpty()) {
            return true;
        }
        this.cleanupQueue.IconCompatParcelizer();
        return true;
    }

    private final int read(VideoAnalyticModule p0, long p1) {
        boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
        List<Reference<PlaybackDrmModule>> list = p0.read();
        int i = 0;
        while (i < list.size()) {
            Reference<PlaybackDrmModule> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                toMagicModuleMetaRepoModel.read(reference, "");
                StringBuilder sb = new StringBuilder("A connection to ");
                sb.append(p0.getRoute().getAddress().getUrl());
                sb.append(" was leaked. Did you forget to close a response body?");
                String string = sb.toString();
                SettingsItem.IconCompatParcelizer iconCompatParcelizer = SettingsItem.AudioAttributesCompatParcelizer;
                SettingsItem.IconCompatParcelizer.write().AudioAttributesCompatParcelizer(string, ((PlaybackDrmModule.IconCompatParcelizer) reference).write());
                list.remove(i);
                p0.RatingCompat();
                if (list.isEmpty()) {
                    p0.AudioAttributesCompatParcelizer(p1 - this.keepAliveDurationNs);
                    return 0;
                }
            }
        }
        return list.size();
    }
}
