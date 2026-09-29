package com.marrow.di.app.data;

import android.app.Application;
import kotlin.InitializationChunk;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MediaChunkIterator;
import kotlin.MediaParserChunkExtractor;
import kotlin.Metadata;
import kotlin.maybeExpandData;
import kotlin.parseDuration;
import kotlin.setGateway;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/di/app/data/VideoAnalyticModule;", "", "<init>", "()V", "Lo/MediaParserChunkExtractor;", "p0", "Lo/maybeExpandData;", "write", "(Lo/MediaParserChunkExtractor;)Lo/maybeExpandData;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class VideoAnalyticModule {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract maybeExpandData write(MediaParserChunkExtractor p0);

    /* JADX INFO: renamed from: com.marrow.di.app.data.VideoAnalyticModule$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/marrow/di/app/data/VideoAnalyticModule$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Landroid/app/Application;", "p0", "", "IconCompatParcelizer", "(Landroid/app/Application;)Ljava/lang/String;", "Lo/MediaChunkIterator;", "Lo/InitializationChunk;", "read", "(Lo/MediaChunkIterator;)Lo/InitializationChunk;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @setGateway(IconCompatParcelizer = "device_id")
        public final String IconCompatParcelizer(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String strAudioAttributesCompatParcelizer = parseDuration.AudioAttributesCompatParcelizer(p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
            return strAudioAttributesCompatParcelizer;
        }

        public final InitializationChunk read(MediaChunkIterator p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return p0;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
