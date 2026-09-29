package com.marrow.di.app.data;

import kotlin.GTNudgeRequestModel;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.ServerSideAdInsertionMediaSourceSharedMediaPeriod;
import kotlin.SingleSampleMediaSourceFactory;
import kotlin.canReuseMediaPeriod;
import kotlin.findMatchingStreamIndex;
import kotlin.getMagicModuleMeta;
import kotlin.getMediaPeriodPositionUsWithEndOfSourceHandling;
import kotlin.getStreamPositionUsForContent;
import kotlin.getStreamPositionUsWithNotYetStartedHandling;
import kotlin.setGateway;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/marrow/di/app/data/PearlDataModule;", "", "<init>", "()V", "Lo/getMediaPeriodPositionUsWithEndOfSourceHandling;", "p0", "Lo/ServerSideAdInsertionMediaSourceSharedMediaPeriod;", "write", "(Lo/getMediaPeriodPositionUsWithEndOfSourceHandling;)Lo/ServerSideAdInsertionMediaSourceSharedMediaPeriod;", "Lo/canReuseMediaPeriod;", "read", "(Lo/canReuseMediaPeriod;)Lo/ServerSideAdInsertionMediaSourceSharedMediaPeriod;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PearlDataModule {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract ServerSideAdInsertionMediaSourceSharedMediaPeriod read(canReuseMediaPeriod p0);

    public abstract ServerSideAdInsertionMediaSourceSharedMediaPeriod write(getMediaPeriodPositionUsWithEndOfSourceHandling p0);

    @getMagicModuleMeta
    public static final ServerSideAdInsertionMediaSourceSharedMediaPeriod RemoteActionCompatParcelizer(ServerSideAdInsertionMediaSourceSharedMediaPeriod serverSideAdInsertionMediaSourceSharedMediaPeriod) {
        return INSTANCE.read(serverSideAdInsertionMediaSourceSharedMediaPeriod);
    }

    @getMagicModuleMeta
    public static final ServerSideAdInsertionMediaSourceSharedMediaPeriod IconCompatParcelizer(@setGateway(IconCompatParcelizer = "v3.1") GTNudgeRequestModel gTNudgeRequestModel, getStreamPositionUsForContent getstreampositionusforcontent) {
        return INSTANCE.RemoteActionCompatParcelizer(gTNudgeRequestModel, getstreampositionusforcontent);
    }

    /* JADX INFO: renamed from: com.marrow.di.app.data.PearlDataModule$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/marrow/di/app/data/PearlDataModule$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/ServerSideAdInsertionMediaSourceSharedMediaPeriod;", "p0", "read", "(Lo/ServerSideAdInsertionMediaSourceSharedMediaPeriod;)Lo/ServerSideAdInsertionMediaSourceSharedMediaPeriod;", "Lo/GTNudgeRequestModel;", "Lo/getStreamPositionUsForContent;", "p1", "RemoteActionCompatParcelizer", "(Lo/GTNudgeRequestModel;Lo/getStreamPositionUsForContent;)Lo/ServerSideAdInsertionMediaSourceSharedMediaPeriod;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final ServerSideAdInsertionMediaSourceSharedMediaPeriod read(ServerSideAdInsertionMediaSourceSharedMediaPeriod p0) {
            return new findMatchingStreamIndex(p0);
        }

        @getMagicModuleMeta
        public final ServerSideAdInsertionMediaSourceSharedMediaPeriod RemoteActionCompatParcelizer(@setGateway(IconCompatParcelizer = "v3.1") GTNudgeRequestModel p0, getStreamPositionUsForContent p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new getStreamPositionUsWithNotYetStartedHandling((SingleSampleMediaSourceFactory) p0.read(SingleSampleMediaSourceFactory.class), p1);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
