package com.marrow.di.app.data;

import kotlin.DefaultDashChunkSourceRepresentationHolder;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.embeddedClosedCaptionTrack;
import kotlin.getLastAvailableSegmentNum;
import kotlin.getMagicModuleMeta;
import kotlin.getStreamPositionUsForContent;
import kotlin.newSampleStreamArray;
import kotlin.selectNewStreams;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateSelectedBaseUrl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/di/app/data/BookmarkedTimelineDataModule;", "", "<init>", "()V", "Lo/selectNewStreams;", "p0", "Lo/newSampleStreamArray;", "write", "(Lo/selectNewStreams;)Lo/newSampleStreamArray;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BookmarkedTimelineDataModule {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract newSampleStreamArray write(selectNewStreams p0);

    @getMagicModuleMeta
    public static final newSampleStreamArray.IconCompatParcelizer IconCompatParcelizer(updateSelectedBaseUrl updateselectedbaseurl, getStreamPositionUsForContent getstreampositionusforcontent, DefaultDashChunkSourceRepresentationHolder defaultDashChunkSourceRepresentationHolder, getLastAvailableSegmentNum getlastavailablesegmentnum) {
        return INSTANCE.AudioAttributesCompatParcelizer(updateselectedbaseurl, getstreampositionusforcontent, defaultDashChunkSourceRepresentationHolder, getlastavailablesegmentnum);
    }

    /* JADX INFO: renamed from: com.marrow.di.app.data.BookmarkedTimelineDataModule$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/marrow/di/app/data/BookmarkedTimelineDataModule$IconCompatParcelizer;", "", "<init>", "()V", "Lo/updateSelectedBaseUrl;", "p0", "Lo/getStreamPositionUsForContent;", "p1", "Lo/DefaultDashChunkSourceRepresentationHolder;", "p2", "Lo/getLastAvailableSegmentNum;", "p3", "Lo/newSampleStreamArray$IconCompatParcelizer;", "AudioAttributesCompatParcelizer", "(Lo/updateSelectedBaseUrl;Lo/getStreamPositionUsForContent;Lo/DefaultDashChunkSourceRepresentationHolder;Lo/getLastAvailableSegmentNum;)Lo/newSampleStreamArray$IconCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final newSampleStreamArray.IconCompatParcelizer AudioAttributesCompatParcelizer(updateSelectedBaseUrl p0, getStreamPositionUsForContent p1, DefaultDashChunkSourceRepresentationHolder p2, getLastAvailableSegmentNum p3) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            return new embeddedClosedCaptionTrack(p0, p1, p2, p3);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
