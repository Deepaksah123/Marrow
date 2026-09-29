package com.marrow.di.app.data.video;

import kotlin.MediaChunkIterator1;
import kotlin.Metadata;
import kotlin.getDataSpec;
import kotlin.getMagicModuleMeta;
import kotlin.newInitializationChunk;
import kotlin.newMediaChunk;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/marrow/di/app/data/video/VideoCacheModule;", "", "<init>", "()V", "Lo/newMediaChunk;", "p0", "Lo/newInitializationChunk;", "p1", "Lo/getDataSpec;", "AudioAttributesCompatParcelizer", "(Lo/newMediaChunk;Lo/newInitializationChunk;)Lo/getDataSpec;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VideoCacheModule {
    public static final VideoCacheModule INSTANCE = new VideoCacheModule();

    private VideoCacheModule() {
    }

    @getMagicModuleMeta
    public static final getDataSpec AudioAttributesCompatParcelizer(newMediaChunk p0, newInitializationChunk p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new MediaChunkIterator1(p0, p1);
    }
}
