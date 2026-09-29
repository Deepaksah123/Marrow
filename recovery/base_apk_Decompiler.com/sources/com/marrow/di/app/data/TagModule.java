package com.marrow.di.app.data;

import kotlin.ChunkSampleStreamReleaseCallback;
import kotlin.GTNudgeRequestModel;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.SpannedDataExternalSyntheticLambda0;
import kotlin.getMagicModuleMeta;
import kotlin.getPreferredQueueSize;
import kotlin.onChunkLoadCompleted;
import kotlin.onChunkLoadError;
import kotlin.selectEmbeddedTrack;
import kotlin.setGateway;
import kotlin.shouldCancelLoad;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH&¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/marrow/di/app/data/TagModule;", "", "<init>", "()V", "Lo/selectEmbeddedTrack;", "p0", "Lo/ChunkSampleStreamReleaseCallback;", "write", "(Lo/selectEmbeddedTrack;)Lo/ChunkSampleStreamReleaseCallback;", "Lo/onChunkLoadError;", "Lo/getPreferredQueueSize;", "(Lo/onChunkLoadError;)Lo/getPreferredQueueSize;", "Lo/shouldCancelLoad;", "Lo/onChunkLoadCompleted;", "IconCompatParcelizer", "(Lo/shouldCancelLoad;)Lo/onChunkLoadCompleted;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TagModule {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract onChunkLoadCompleted IconCompatParcelizer(shouldCancelLoad p0);

    public abstract ChunkSampleStreamReleaseCallback write(selectEmbeddedTrack p0);

    public abstract getPreferredQueueSize write(onChunkLoadError p0);

    @getMagicModuleMeta
    public static final SpannedDataExternalSyntheticLambda0 IconCompatParcelizer(@setGateway(IconCompatParcelizer = "v3.1") GTNudgeRequestModel gTNudgeRequestModel) {
        return INSTANCE.AudioAttributesCompatParcelizer(gTNudgeRequestModel);
    }

    /* JADX INFO: renamed from: com.marrow.di.app.data.TagModule$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/di/app/data/TagModule$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/GTNudgeRequestModel;", "p0", "Lo/SpannedDataExternalSyntheticLambda0;", "AudioAttributesCompatParcelizer", "(Lo/GTNudgeRequestModel;)Lo/SpannedDataExternalSyntheticLambda0;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final SpannedDataExternalSyntheticLambda0 AudioAttributesCompatParcelizer(@setGateway(IconCompatParcelizer = "v3.1") GTNudgeRequestModel p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Object obj = p0.read((Class<Object>) SpannedDataExternalSyntheticLambda0.class);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, "");
            return (SpannedDataExternalSyntheticLambda0) obj;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
