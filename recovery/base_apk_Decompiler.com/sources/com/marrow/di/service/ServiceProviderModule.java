package com.marrow.di.service;

import android.app.NotificationManager;
import android.app.Service;
import com.marrow.data.api.models.response.user.SyncUserResponse;
import com.marrow.data.models.plan.Subscription;
import kotlin.ChunkExtractor;
import kotlin.ChunkExtractorTrackOutputProvider;
import kotlin.ChunkSampleStreamEmbeddedSampleStream;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.discardUpstream;
import kotlin.discardUpstreamMediaChunksFromIndex;
import kotlin.haveReadFromMediaChunk;
import kotlin.maybeFinishPrepare;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0005\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u0005\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/marrow/di/service/ServiceProviderModule;", "", "<init>", "()V", "Lo/discardUpstream;", "p0", "Lo/ChunkExtractorTrackOutputProvider;", "Lcom/marrow/data/api/models/response/user/SyncUserResponse;", "write", "(Lo/discardUpstream;)Lo/ChunkExtractorTrackOutputProvider;", "Lo/ChunkSampleStreamEmbeddedSampleStream;", "Lcom/marrow/data/models/plan/Subscription;", "read", "(Lo/ChunkSampleStreamEmbeddedSampleStream;)Lo/ChunkExtractorTrackOutputProvider;", "Lo/ChunkExtractor;", "IconCompatParcelizer", "(Lo/ChunkSampleStreamEmbeddedSampleStream;)Lo/ChunkExtractor;", "Lo/haveReadFromMediaChunk;", "Lo/discardUpstreamMediaChunksFromIndex;", "AudioAttributesCompatParcelizer", "(Lo/haveReadFromMediaChunk;)Lo/discardUpstreamMediaChunksFromIndex;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ServiceProviderModule {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract discardUpstreamMediaChunksFromIndex AudioAttributesCompatParcelizer(haveReadFromMediaChunk p0);

    public abstract ChunkExtractor<Subscription> IconCompatParcelizer(ChunkSampleStreamEmbeddedSampleStream p0);

    public abstract ChunkExtractorTrackOutputProvider<Subscription> read(ChunkSampleStreamEmbeddedSampleStream p0);

    public abstract ChunkExtractorTrackOutputProvider<SyncUserResponse> write(discardUpstream p0);

    /* JADX INFO: renamed from: com.marrow.di.service.ServiceProviderModule$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/marrow/di/service/ServiceProviderModule$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/app/Service;", "p0", "Lo/maybeFinishPrepare$IconCompatParcelizer;", "write", "(Landroid/app/Service;)Lo/maybeFinishPrepare$IconCompatParcelizer;", "Landroid/app/NotificationManager;", "read", "(Landroid/app/Service;)Landroid/app/NotificationManager;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final maybeFinishPrepare.IconCompatParcelizer write(Service p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return (maybeFinishPrepare.IconCompatParcelizer) p0;
        }

        public final NotificationManager read(Service p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Object systemService = p0.getSystemService("notification");
            toMagicModuleMetaRepoModel.read(systemService, "");
            return (NotificationManager) systemService;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
