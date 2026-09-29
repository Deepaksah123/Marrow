package com.marrow.bgservices.sync.base;

import com.marrow.data.api.models.response.sync.SyncResult;
import kotlin.ChunkExtractorTrackOutputProvider;
import kotlin.Metadata;
import kotlin.getLastMediaChunk;
import kotlin.getNextChunkIndex;
import kotlin.getStreamPositionUsForContent;
import kotlin.maybeFinishPrepare;
import kotlin.parseLongAttr;
import kotlin.setGateway;
import kotlin.setSdkPayload;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B7\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u0010\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001b\u001a\u00020\u000b8\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001b\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%"}, d2 = {"Lcom/marrow/bgservices/sync/base/BaseSyncServicePresenter;", "T", "Lo/maybeFinishPrepare$AudioAttributesCompatParcelizer;", "", "p0", "Lo/ChunkExtractorTrackOutputProvider;", "p1", "Lo/getStreamPositionUsForContent;", "p2", "Lo/getNextChunkIndex;", "p3", "Lo/maybeFinishPrepare$IconCompatParcelizer;", "p4", "<init>", "(ILo/ChunkExtractorTrackOutputProvider;Lo/getStreamPositionUsForContent;Lo/getNextChunkIndex;Lo/maybeFinishPrepare$IconCompatParcelizer;)V", "Lcom/marrow/data/api/models/response/sync/SyncResult;", "AudioAttributesCompatParcelizer", "()Lcom/marrow/data/api/models/response/sync/SyncResult;", "", "IconCompatParcelizer", "(Lcom/marrow/data/api/models/response/sync/SyncResult;)V", "write", "()V", "RemoteActionCompatParcelizer", "I", "Lo/ChunkExtractorTrackOutputProvider;", "Lo/getStreamPositionUsForContent;", "read", "Lo/getNextChunkIndex;", "Lo/maybeFinishPrepare$IconCompatParcelizer;", "()Lo/maybeFinishPrepare$IconCompatParcelizer;", "Lo/parseLongAttr;", "crashDataProvider", "Lo/parseLongAttr;", "getCrashDataProvider", "()Lo/parseLongAttr;", "setCrashDataProvider", "(Lo/parseLongAttr;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseSyncServicePresenter<T> implements maybeFinishPrepare.AudioAttributesCompatParcelizer {
    private final getStreamPositionUsForContent AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final maybeFinishPrepare.IconCompatParcelizer read;
    private final int RemoteActionCompatParcelizer;

    @setSdkPayload
    public parseLongAttr crashDataProvider;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getNextChunkIndex write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final ChunkExtractorTrackOutputProvider<T> IconCompatParcelizer;

    public BaseSyncServicePresenter(@setGateway(IconCompatParcelizer = "_sync_what") int i, ChunkExtractorTrackOutputProvider<T> chunkExtractorTrackOutputProvider, getStreamPositionUsForContent getstreampositionusforcontent, getNextChunkIndex getnextchunkindex, maybeFinishPrepare.IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(chunkExtractorTrackOutputProvider, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(getnextchunkindex, "");
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = chunkExtractorTrackOutputProvider;
        this.AudioAttributesCompatParcelizer = getstreampositionusforcontent;
        this.write = getnextchunkindex;
        this.read = iconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    protected final maybeFinishPrepare.IconCompatParcelizer getRead() {
        return this.read;
    }

    public final parseLongAttr getCrashDataProvider() {
        parseLongAttr parselongattr = this.crashDataProvider;
        if (parselongattr != null) {
            return parselongattr;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final void setCrashDataProvider(parseLongAttr parselongattr) {
        toMagicModuleMetaRepoModel.write(parselongattr, "");
        this.crashDataProvider = parselongattr;
    }

    private SyncResult AudioAttributesCompatParcelizer() {
        getLastMediaChunk getlastmediachunk = new getLastMediaChunk(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write, new write(this));
        this.read.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        SyncResult syncResultAudioAttributesCompatParcelizer = getlastmediachunk.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(syncResultAudioAttributesCompatParcelizer, "");
        return syncResultAudioAttributesCompatParcelizer;
    }

    public static final class write implements getLastMediaChunk.AudioAttributesCompatParcelizer<T> {
        private /* synthetic */ BaseSyncServicePresenter<T> IconCompatParcelizer;

        write(BaseSyncServicePresenter<T> baseSyncServicePresenter) {
            this.IconCompatParcelizer = baseSyncServicePresenter;
        }

        @Override // o.getLastMediaChunk.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(getLastMediaChunk<T> getlastmediachunk, SyncResult syncResult) {
            toMagicModuleMetaRepoModel.write(getlastmediachunk, "");
            toMagicModuleMetaRepoModel.write(syncResult, "");
            this.IconCompatParcelizer.getRead().write(((BaseSyncServicePresenter) this.IconCompatParcelizer).RemoteActionCompatParcelizer, syncResult);
        }

        @Override // o.getLastMediaChunk.AudioAttributesCompatParcelizer
        public final void IconCompatParcelizer(Exception exc) {
            toMagicModuleMetaRepoModel.write(exc, "");
            this.IconCompatParcelizer.getCrashDataProvider().AudioAttributesCompatParcelizer(exc, "SyncException: ".concat(String.valueOf(((BaseSyncServicePresenter) this.IconCompatParcelizer).RemoteActionCompatParcelizer)));
        }
    }

    private void IconCompatParcelizer(SyncResult p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.completed) {
            this.read.IconCompatParcelizer(this.RemoteActionCompatParcelizer, p0);
        } else {
            this.read.read(this.RemoteActionCompatParcelizer, p0);
        }
    }

    @Override // o.maybeFinishPrepare.AudioAttributesCompatParcelizer
    public final void write() {
        IconCompatParcelizer(AudioAttributesCompatParcelizer());
    }
}
