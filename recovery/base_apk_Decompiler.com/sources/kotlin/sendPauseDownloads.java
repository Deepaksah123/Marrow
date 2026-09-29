package kotlin;

import com.marrow.data.api.models.response.plan.Coupon;
import com.marrow.data.api.models.response.plan.OrderDetails;
import com.marrow.data.api.models.response.plan.PlanBUpgradeData;
import com.marrow.data.api.models.response.plan.PlanDetails;
import com.marrow.data.api.models.response.plan.RenewBanner;
import com.marrow.data.api.models.response.plan.RenewEligible;
import com.marrow.data.api.models.response.plan.SdkPayload;
import com.marrow.data.api.models.response.plan.SdkPayloadData;
import com.marrow.data.api.models.response.plan.UpgradeCardContent;
import com.marrow.data.api.models.response.plan.UpgradePlanResponseV2;
import com.marrow.data.api.models.response.user.UserConfig;
import com.marrow.data.api.models.response.video.ConfigMinPlayback;
import com.marrow.data.api.models.response.video.PlaybackSettings;
import com.marrow.data.models.common.Editor;
import com.marrow.data.models.user.Country;
import com.marrow2.data.magic_module.remote.model.MagicModuleMetaLSModel;
import com.marrow2.data.magic_module.remote.model.MagicModuleStatusUcModel;
import com.marrow2.data.pref.repo.model.PlanBUpgradeLSModel;
import com.marrow2.data.pref.repo.model.UpgradeContentRepoModel;
import com.marrow2.data.pref.repo.model.UpgradePlanRepoModel;
import com.marrow2.data.pref.repo.model.UserConfigResponse;
import kotlin.buildCacheKey;

/* JADX INFO: loaded from: classes3.dex */
public final class sendPauseDownloads implements isAfterLast {
    private static final sendAddDownload AudioAttributesCompatParcelizer = new sendAddDownload();
    private static final sendRemoveAllDownloads read = new sendRemoveAllDownloads();

    @Override // kotlin.isAfterLast
    public final <T> isBeforeFirst<T> write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) {
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter.class) {
                return new StyledPlayerControlViewAudioTrackSelectionAdapterExternalSyntheticLambda0(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == MagicModuleStatusUcModel.class) {
                return new createDataSourceForRemovingDownload(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused2) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == UpgradePlanRepoModel.class) {
                return new getCacheFile(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused3) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == Country.class) {
                return new PlayerEmsgHandlerPlayerEmsgCallback(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused4) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == MagicModuleMetaLSModel.class) {
                return new onCacheIgnored(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused5) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == Editor.class) {
                return new dequeueSample(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused6) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == setFloatsUniform.class) {
                return new setBuffer(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused7) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == PlanBUpgradeData.class) {
                return new getNextIndex(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused8) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == RenewBanner.class) {
                return new createShuffledList(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused9) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == isFullyVisible.class) {
                return new StyledPlayerControlView1(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused10) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == StyledPlayerControlViewSettingViewHolder.class) {
                return new getSelectedText(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused11) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == ConfigMinPlayback.class) {
                return new constrainSeekPosition(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused12) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == UserConfig.class) {
                return new SinglePeriodTimeline(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused13) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == com.marrow.data.dataprovider.magic_module.usecase.model.MagicModuleStatusUcModel.class) {
                return new setAdPlaybackStates(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused14) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == RenewEligible.class) {
                return new SilenceMediaSource(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused15) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == Coupon.class) {
                return new ShuffleOrderDefaultShuffleOrder(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused16) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == UpgradePlanResponseV2.class) {
                return new getAudioPositionUs(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused17) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == PlanBUpgradeLSModel.class) {
                return new createCacheEntry(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused18) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == PlaybackSettings.class) {
                return new SingleSampleMediaPeriod(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused19) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == hideImmediately.class) {
                return new onBindViewHolderAtZeroPosition(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused20) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == buildCacheKey.IconCompatParcelizer.RemoteActionCompatParcelizer.class) {
                return new isFullyUnlocked(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused21) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == UserConfigResponse.class) {
                return new createLookup(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused22) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == SdkPayloadData.class) {
                return new getAudioByteCount(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused23) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == ExperimentalBandwidthMeterExternalSyntheticLambda0.class) {
                return new calculateBitrateEstimate(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused24) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == updateTrackLists.class) {
                return new lambdaonBindViewHolderAtZeroPosition0comgoogleandroidexoplayer2uiStyledPlayerControlViewAudioTrackSelectionAdapter(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused25) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == StyledPlayerControlViewExternalSyntheticLambda0.class) {
                return new StyledPlayerControlViewExternalSyntheticLambda2(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused26) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == notifyOnVisibilityChange.class) {
                return new StyledPlayerControlViewExternalSyntheticLambda1(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused27) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == onFullScreenModeChanged.class) {
                return new onTrackSelection(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused28) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == UpgradeCardContent.class) {
                return new SilenceMediaSourceFactory(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused29) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == ExponentialWeightedAverageStatistic.class) {
                return new PercentileTimeToFirstByteEstimatorFixedSizeLinkedHashMap(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused30) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == PlanDetails.class) {
                return new getPreviousIndex(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused31) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == buildCacheKey.IconCompatParcelizer.class) {
                return new isFullyLocked(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused32) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == OrderDetails.class) {
                return new ShuffleOrderUnshuffledShuffleOrder(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused33) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0.class) {
                return new StyledPlayerControlViewComponentListener(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused34) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == SdkPayload.class) {
                return new SilenceMediaSource1(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused35) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == com.marrow.data.dataprovider.magic_module.local.model.MagicModuleMetaLSModel.class) {
                return new lambdasetAdPlaybackStates0comgoogleandroidexoplayer2sourceadsServerSideAdInsertionMediaSource(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused36) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == buildCacheKey.class) {
                return new getSpans(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused37) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == UpgradeContentRepoModel.class) {
                return new SimpleCacheSpan(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
        } catch (NoClassDefFoundError unused38) {
        }
        try {
            if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == updateSelectedIndex.class) {
                return new StyledPlayerControlViewOnFullScreenModeChangedListener(setdownloadingstatestoqueued, AudioAttributesCompatParcelizer, read);
            }
            return null;
        } catch (NoClassDefFoundError unused39) {
            return null;
        }
    }
}
