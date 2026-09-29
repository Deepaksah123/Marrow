package com.marrow.data.dataprovider.magic_module.usecase;

import com.marrow.data.dataprovider.magic_module.repo.MagicModuleRepository;
import kotlin.BundledChunkExtractor;
import kotlin.ChunkHolder;
import kotlin.getSubmittedOn;
import kotlin.getTestId;
import kotlin.withLastAdRemoved;

/* JADX INFO: loaded from: classes5.dex */
public final class MagicModuleUseCaseImpl_Factory implements getSubmittedOn<MagicModuleUseCaseImpl> {
    private final getTestId<withLastAdRemoved> courseConfigRepositoryProvider;
    private final getTestId<MagicModuleRepository> magicModuleRepositoryProvider;
    private final getTestId<BundledChunkExtractor> preferenceDataProvider;
    private final getTestId<ChunkHolder> subscriptionRepositoryProvider;

    private MagicModuleUseCaseImpl_Factory(getTestId<MagicModuleRepository> gettestid, getTestId<ChunkHolder> gettestid2, getTestId<withLastAdRemoved> gettestid3, getTestId<BundledChunkExtractor> gettestid4) {
        this.magicModuleRepositoryProvider = gettestid;
        this.subscriptionRepositoryProvider = gettestid2;
        this.courseConfigRepositoryProvider = gettestid3;
        this.preferenceDataProvider = gettestid4;
    }

    @Override // kotlin.setDescriptionList
    public final MagicModuleUseCaseImpl get() {
        return newInstance(this.magicModuleRepositoryProvider.get(), this.subscriptionRepositoryProvider.get(), this.courseConfigRepositoryProvider.get(), this.preferenceDataProvider.get());
    }

    public static MagicModuleUseCaseImpl_Factory create(getTestId<MagicModuleRepository> gettestid, getTestId<ChunkHolder> gettestid2, getTestId<withLastAdRemoved> gettestid3, getTestId<BundledChunkExtractor> gettestid4) {
        return new MagicModuleUseCaseImpl_Factory(gettestid, gettestid2, gettestid3, gettestid4);
    }

    public static MagicModuleUseCaseImpl newInstance(MagicModuleRepository magicModuleRepository, ChunkHolder chunkHolder, withLastAdRemoved withlastadremoved, BundledChunkExtractor bundledChunkExtractor) {
        return new MagicModuleUseCaseImpl(magicModuleRepository, chunkHolder, withlastadremoved, bundledChunkExtractor);
    }
}
