package com.marrow.di.app.data;

import kotlin.ChunkExtractorFactory;
import kotlin.ChunkHolder;
import kotlin.ChunkSampleStream;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;
import kotlin.getPlanOldPrice;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/di/app/data/SubscriptionDataModule;", "", "<init>", "()V", "Lo/ChunkSampleStream;", "p0", "Lo/ChunkHolder$read;", "AudioAttributesCompatParcelizer", "(Lo/ChunkSampleStream;)Lo/ChunkHolder$read;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SubscriptionDataModule {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @getPlanOldPrice
    public abstract ChunkHolder.read AudioAttributesCompatParcelizer(ChunkSampleStream p0);

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final ChunkHolder RemoteActionCompatParcelizer(ChunkHolder.read readVar) {
        return INSTANCE.write(readVar);
    }

    /* JADX INFO: renamed from: com.marrow.di.app.data.SubscriptionDataModule$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/di/app/data/SubscriptionDataModule$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/ChunkHolder$read;", "p0", "Lo/ChunkHolder;", "write", "(Lo/ChunkHolder$read;)Lo/ChunkHolder;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final ChunkHolder write(ChunkHolder.read p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new ChunkExtractorFactory(p0);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
