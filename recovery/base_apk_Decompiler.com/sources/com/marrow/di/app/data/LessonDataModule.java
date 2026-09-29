package com.marrow.di.app.data;

import kotlin.AdsLoader;
import kotlin.AdsMediaSourceAdLoadException;
import kotlin.AdsMediaSourceAdLoadExceptionType;
import kotlin.AdsMediaSourceAdMediaSourceHolder;
import kotlin.AdsMediaSourceAdPrepareListener;
import kotlin.AdsMediaSourceAdPrepareListenerExternalSyntheticLambda1;
import kotlin.AdsMediaSourceExternalSyntheticLambda0;
import kotlin.GTNudgeRequestModel;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.ServerSideAdInsertionMediaSource;
import kotlin.appendSpan;
import kotlin.correctMediaLoadDataPositionMs;
import kotlin.createForAllAds;
import kotlin.getMagicModuleMeta;
import kotlin.getMediaPeriodEndPositionUs;
import kotlin.getMediaPeriodForEvent;
import kotlin.getStreamPositionUsForContent;
import kotlin.handleSourceInfoRefresh;
import kotlin.hasMediaSource;
import kotlin.initializeWithMediaSource;
import kotlin.lambdaonAdPlaybackState0comgoogleandroidexoplayer2sourceadsAdsMediaSourceComponentListener;
import kotlin.onAdClicked;
import kotlin.onAdLoadError;
import kotlin.onAdPlaybackState;
import kotlin.onAdTapped;
import kotlin.onDashManifestPublishTimeExpired;
import kotlin.releaseLastUsedMediaPeriod;
import kotlin.resolveUtcTimingElement;
import kotlin.setGateway;
import kotlin.setSupportedContentTypes;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0011H&¢\u0006\u0004\b\u000f\u0010\u0013J\u0017\u0010\u0007\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0014H&¢\u0006\u0004\b\u0007\u0010\u0016J\u0017\u0010\u000f\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0017H&¢\u0006\u0004\b\u000f\u0010\u0019J\u0017\u0010\u000b\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001aH&¢\u0006\u0004\b\u000b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001dH&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0007\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020!H&¢\u0006\u0004\b\u0007\u0010#"}, d2 = {"Lcom/marrow/di/app/data/LessonDataModule;", "", "<init>", "()V", "Lo/onDashManifestPublishTimeExpired;", "p0", "Lo/resolveUtcTimingElement;", "write", "(Lo/onDashManifestPublishTimeExpired;)Lo/resolveUtcTimingElement;", "Lo/AdsLoader;", "Lo/setSupportedContentTypes;", "RemoteActionCompatParcelizer", "(Lo/AdsLoader;)Lo/setSupportedContentTypes;", "Lo/releaseLastUsedMediaPeriod;", "Lo/getMediaPeriodEndPositionUs;", "IconCompatParcelizer", "(Lo/releaseLastUsedMediaPeriod;)Lo/getMediaPeriodEndPositionUs;", "Lo/AdsMediaSourceExternalSyntheticLambda0;", "Lo/AdsMediaSourceAdLoadException$write;", "(Lo/AdsMediaSourceExternalSyntheticLambda0;)Lo/AdsMediaSourceAdLoadException$write;", "Lo/createForAllAds;", "Lo/AdsMediaSourceAdLoadException$RemoteActionCompatParcelizer;", "(Lo/createForAllAds;)Lo/AdsMediaSourceAdLoadException$RemoteActionCompatParcelizer;", "Lo/AdsMediaSourceAdLoadExceptionType;", "Lo/AdsMediaSourceAdLoadException$IconCompatParcelizer;", "(Lo/AdsMediaSourceAdLoadExceptionType;)Lo/AdsMediaSourceAdLoadException$IconCompatParcelizer;", "Lo/correctMediaLoadDataPositionMs;", "Lo/getMediaPeriodForEvent;", "(Lo/correctMediaLoadDataPositionMs;)Lo/getMediaPeriodForEvent;", "Lo/AdsMediaSourceAdPrepareListenerExternalSyntheticLambda1;", "Lo/AdsMediaSourceAdPrepareListener;", "read", "(Lo/AdsMediaSourceAdPrepareListenerExternalSyntheticLambda1;)Lo/AdsMediaSourceAdPrepareListener;", "Lo/lambdaonAdPlaybackState0comgoogleandroidexoplayer2sourceadsAdsMediaSourceComponentListener;", "Lo/ServerSideAdInsertionMediaSource;", "(Lo/lambdaonAdPlaybackState0comgoogleandroidexoplayer2sourceadsAdsMediaSourceComponentListener;)Lo/ServerSideAdInsertionMediaSource;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LessonDataModule {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract AdsMediaSourceAdLoadException.IconCompatParcelizer IconCompatParcelizer(AdsMediaSourceAdLoadExceptionType p0);

    public abstract AdsMediaSourceAdLoadException.write IconCompatParcelizer(AdsMediaSourceExternalSyntheticLambda0 p0);

    public abstract getMediaPeriodEndPositionUs IconCompatParcelizer(releaseLastUsedMediaPeriod p0);

    public abstract getMediaPeriodForEvent RemoteActionCompatParcelizer(correctMediaLoadDataPositionMs p0);

    public abstract setSupportedContentTypes RemoteActionCompatParcelizer(AdsLoader p0);

    public abstract AdsMediaSourceAdPrepareListener read(AdsMediaSourceAdPrepareListenerExternalSyntheticLambda1 p0);

    public abstract AdsMediaSourceAdLoadException.RemoteActionCompatParcelizer write(createForAllAds p0);

    public abstract ServerSideAdInsertionMediaSource write(lambdaonAdPlaybackState0comgoogleandroidexoplayer2sourceadsAdsMediaSourceComponentListener p0);

    public abstract resolveUtcTimingElement write(onDashManifestPublishTimeExpired p0);

    @getMagicModuleMeta
    public static final onAdClicked AudioAttributesCompatParcelizer(appendSpan appendspan) {
        return INSTANCE.IconCompatParcelizer(appendspan);
    }

    @getMagicModuleMeta
    public static final hasMediaSource IconCompatParcelizer(onDashManifestPublishTimeExpired ondashmanifestpublishtimeexpired, getStreamPositionUsForContent getstreampositionusforcontent) {
        return INSTANCE.RemoteActionCompatParcelizer(ondashmanifestpublishtimeexpired, getstreampositionusforcontent);
    }

    @getMagicModuleMeta
    public static final onAdPlaybackState write(setSupportedContentTypes setsupportedcontenttypes, onAdClicked onadclicked) {
        return INSTANCE.read(setsupportedcontenttypes, onadclicked);
    }

    @getMagicModuleMeta
    public static final initializeWithMediaSource IconCompatParcelizer(onDashManifestPublishTimeExpired ondashmanifestpublishtimeexpired) {
        return INSTANCE.write(ondashmanifestpublishtimeexpired);
    }

    @getMagicModuleMeta
    public static final appendSpan RemoteActionCompatParcelizer(@setGateway(IconCompatParcelizer = "v3.1") GTNudgeRequestModel gTNudgeRequestModel) {
        return INSTANCE.AudioAttributesCompatParcelizer(gTNudgeRequestModel);
    }

    /* JADX INFO: renamed from: com.marrow.di.app.data.LessonDataModule$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/marrow/di/app/data/LessonDataModule$IconCompatParcelizer;", "", "<init>", "()V", "Lo/onDashManifestPublishTimeExpired;", "p0", "Lo/getStreamPositionUsForContent;", "p1", "Lo/hasMediaSource;", "RemoteActionCompatParcelizer", "(Lo/onDashManifestPublishTimeExpired;Lo/getStreamPositionUsForContent;)Lo/hasMediaSource;", "Lo/initializeWithMediaSource;", "write", "(Lo/onDashManifestPublishTimeExpired;)Lo/initializeWithMediaSource;", "Lo/appendSpan;", "Lo/onAdClicked;", "IconCompatParcelizer", "(Lo/appendSpan;)Lo/onAdClicked;", "Lo/setSupportedContentTypes;", "Lo/onAdPlaybackState;", "read", "(Lo/setSupportedContentTypes;Lo/onAdClicked;)Lo/onAdPlaybackState;", "Lo/GTNudgeRequestModel;", "AudioAttributesCompatParcelizer", "(Lo/GTNudgeRequestModel;)Lo/appendSpan;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final hasMediaSource RemoteActionCompatParcelizer(onDashManifestPublishTimeExpired p0, getStreamPositionUsForContent p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new handleSourceInfoRefresh(p0, p1);
        }

        @getMagicModuleMeta
        public final initializeWithMediaSource write(onDashManifestPublishTimeExpired p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new AdsMediaSourceAdMediaSourceHolder(p0);
        }

        @getMagicModuleMeta
        public final onAdClicked IconCompatParcelizer(appendSpan p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new onAdLoadError(p0);
        }

        @getMagicModuleMeta
        public final onAdPlaybackState read(setSupportedContentTypes p0, onAdClicked p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new onAdTapped(p0, p1);
        }

        @getMagicModuleMeta
        public final appendSpan AudioAttributesCompatParcelizer(@setGateway(IconCompatParcelizer = "v3.1") GTNudgeRequestModel p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Object obj = p0.read((Class<Object>) appendSpan.class);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, "");
            return (appendSpan) obj;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
