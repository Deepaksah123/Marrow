package com.marrow.di.app.data;

import android.app.Application;
import kotlin.DashMediaSourceUtcTimestampCallback;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater;
import kotlin.ServerSideAdInsertionMediaSourceExternalSyntheticLambda0;
import kotlin.ServerSideAdInsertionMediaSourceMediaPeriodImpl;
import kotlin.SingleSampleMediaPeriod1;
import kotlin.TrackGroupArray;
import kotlin.UnrecognizedInputFormatException;
import kotlin.createEmptyAdGroups;
import kotlin.getMagicModuleMeta;
import kotlin.getStreamPositionUsForContent;
import kotlin.isPositionBeforeAdGroup;
import kotlin.normalizeRoleFlags;
import kotlin.onAdPlaybackStateUpdateRequested;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000fH&¢\u0006\u0004\b\n\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\r\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0015H&¢\u0006\u0004\b\r\u0010\u0017J\u0017\u0010\n\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0018H&¢\u0006\u0004\b\n\u0010\u0019"}, d2 = {"Lcom/marrow/di/app/data/McqDataModule;", "", "<init>", "()V", "Lo/normalizeRoleFlags;", "p0", "Lo/createEmptyAdGroups;", "read", "(Lo/normalizeRoleFlags;)Lo/createEmptyAdGroups;", "Lo/TrackGroupArray;", "AudioAttributesCompatParcelizer", "(Lo/TrackGroupArray;)Lo/createEmptyAdGroups;", "Lo/UnrecognizedInputFormatException;", "RemoteActionCompatParcelizer", "(Lo/UnrecognizedInputFormatException;)Lo/createEmptyAdGroups;", "Lo/isPositionBeforeAdGroup;", "(Lo/isPositionBeforeAdGroup;)Lo/createEmptyAdGroups;", "Lo/ServerSideAdInsertionMediaSourceExternalSyntheticLambda0;", "Lo/ServerSideAdInsertionMediaSourceMediaPeriodImpl;", "write", "(Lo/ServerSideAdInsertionMediaSourceExternalSyntheticLambda0;)Lo/ServerSideAdInsertionMediaSourceMediaPeriodImpl;", "Lo/DashMediaSourceUtcTimestampCallback;", "Lo/onAdPlaybackStateUpdateRequested$IconCompatParcelizer;", "(Lo/DashMediaSourceUtcTimestampCallback;)Lo/onAdPlaybackStateUpdateRequested$IconCompatParcelizer;", "Lo/ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater;", "(Lo/ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater;)Lo/ServerSideAdInsertionMediaSourceMediaPeriodImpl;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class McqDataModule {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract ServerSideAdInsertionMediaSourceMediaPeriodImpl AudioAttributesCompatParcelizer(ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater p0);

    public abstract createEmptyAdGroups AudioAttributesCompatParcelizer(TrackGroupArray p0);

    public abstract createEmptyAdGroups AudioAttributesCompatParcelizer(isPositionBeforeAdGroup p0);

    public abstract createEmptyAdGroups RemoteActionCompatParcelizer(UnrecognizedInputFormatException p0);

    public abstract onAdPlaybackStateUpdateRequested.IconCompatParcelizer RemoteActionCompatParcelizer(DashMediaSourceUtcTimestampCallback p0);

    public abstract createEmptyAdGroups read(normalizeRoleFlags p0);

    public abstract ServerSideAdInsertionMediaSourceMediaPeriodImpl write(ServerSideAdInsertionMediaSourceExternalSyntheticLambda0 p0);

    @getMagicModuleMeta
    public static final isPositionBeforeAdGroup write(UnrecognizedInputFormatException unrecognizedInputFormatException) {
        return INSTANCE.IconCompatParcelizer(unrecognizedInputFormatException);
    }

    @getMagicModuleMeta
    public static final normalizeRoleFlags IconCompatParcelizer(Application application, getStreamPositionUsForContent getstreampositionusforcontent) {
        return INSTANCE.IconCompatParcelizer(application, getstreampositionusforcontent);
    }

    @getMagicModuleMeta
    public static final TrackGroupArray RemoteActionCompatParcelizer(SingleSampleMediaPeriod1 singleSampleMediaPeriod1, getStreamPositionUsForContent getstreampositionusforcontent) {
        return INSTANCE.AudioAttributesCompatParcelizer(singleSampleMediaPeriod1, getstreampositionusforcontent);
    }

    @getMagicModuleMeta
    public static final ServerSideAdInsertionMediaSourceExternalSyntheticLambda0 IconCompatParcelizer(ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater serverSideAdInsertionMediaSourceAdPlaybackStateUpdater) {
        return INSTANCE.write(serverSideAdInsertionMediaSourceAdPlaybackStateUpdater);
    }

    /* JADX INFO: renamed from: com.marrow.di.app.data.McqDataModule$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\r\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\r\u0010\u0015"}, d2 = {"Lcom/marrow/di/app/data/McqDataModule$IconCompatParcelizer;", "", "<init>", "()V", "Lo/ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater;", "p0", "Lo/ServerSideAdInsertionMediaSourceExternalSyntheticLambda0;", "write", "(Lo/ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater;)Lo/ServerSideAdInsertionMediaSourceExternalSyntheticLambda0;", "Landroid/app/Application;", "Lo/getStreamPositionUsForContent;", "p1", "Lo/normalizeRoleFlags;", "IconCompatParcelizer", "(Landroid/app/Application;Lo/getStreamPositionUsForContent;)Lo/normalizeRoleFlags;", "Lo/SingleSampleMediaPeriod1;", "Lo/TrackGroupArray;", "AudioAttributesCompatParcelizer", "(Lo/SingleSampleMediaPeriod1;Lo/getStreamPositionUsForContent;)Lo/TrackGroupArray;", "Lo/UnrecognizedInputFormatException;", "Lo/isPositionBeforeAdGroup;", "(Lo/UnrecognizedInputFormatException;)Lo/isPositionBeforeAdGroup;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final ServerSideAdInsertionMediaSourceExternalSyntheticLambda0 write(ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new ServerSideAdInsertionMediaSourceExternalSyntheticLambda0(p0);
        }

        @getMagicModuleMeta
        public final normalizeRoleFlags IconCompatParcelizer(Application p0, getStreamPositionUsForContent p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new normalizeRoleFlags(p0, p1);
        }

        @getMagicModuleMeta
        public final TrackGroupArray AudioAttributesCompatParcelizer(SingleSampleMediaPeriod1 p0, getStreamPositionUsForContent p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new TrackGroupArray(p0, p1);
        }

        @getMagicModuleMeta
        public final isPositionBeforeAdGroup IconCompatParcelizer(UnrecognizedInputFormatException p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new isPositionBeforeAdGroup(p0);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
