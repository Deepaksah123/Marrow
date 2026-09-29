package kotlin;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.dataprovider.video.playbackconfig.remote.models.LicenseLevelRsModel;
import com.marrow.data.dataprovider.video.playbackconfig.remote.models.PlaybackConfigRootResponseBody;
import com.marrow.data.dataprovider.video.playbackconfig.remote.models.PlaybackConfigRsModel;
import com.marrow.data.dataprovider.video.playbackconfig.remote.models.ResolutionConfigRsModel;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseUrlExclusionListExternalSyntheticLambda0 {
    public static final getPrimaryStreamIndex write(PlaybackConfigRootResponseBody playbackConfigRootResponseBody) {
        toMagicModuleMetaRepoModel.write(playbackConfigRootResponseBody, "");
        return new getPrimaryStreamIndex(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new getGroupedAdaptationSetIndices[]{write(playbackConfigRootResponseBody.getFinalData().getOnline(), cloneAndClear.AudioAttributesCompatParcelizer), write(playbackConfigRootResponseBody.getFinalData().getOffline(), cloneAndClear.IconCompatParcelizer)}));
    }

    private static getGroupedAdaptationSetIndices write(LicenseLevelRsModel licenseLevelRsModel, cloneAndClear cloneandclear) {
        toMagicModuleMetaRepoModel.write(licenseLevelRsModel, "");
        toMagicModuleMetaRepoModel.write(cloneandclear, "");
        ResolutionConfigRsModel l1 = licenseLevelRsModel.getL1();
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1913257505);
        if (objRemoteActionCompatParcelizer == null) {
            objRemoteActionCompatParcelizer = startForeground.read((char) (View.resolveSize(0, 0) + 61116), 11734 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 23, 205535924, false, "AudioAttributesCompatParcelizer", null);
        }
        buildPrimaryAndEmbeddedTrackGroupInfos buildprimaryandembeddedtrackgroupinfosAudioAttributesCompatParcelizer$7cf75f07 = AudioAttributesCompatParcelizer$7cf75f07(l1, (Enum) ((Field) objRemoteActionCompatParcelizer).get(null));
        ResolutionConfigRsModel l3 = licenseLevelRsModel.getL3();
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(854908010);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) (View.combineMeasuredStates(0, 0) + 61116), (ViewConfiguration.getEdgeSlop() >> 16) + 11734, 23 - TextUtils.getOffsetBefore("", 0), 1287461119, false, "write", null);
        }
        return new getGroupedAdaptationSetIndices(cloneandclear, IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new buildPrimaryAndEmbeddedTrackGroupInfos[]{buildprimaryandembeddedtrackgroupinfosAudioAttributesCompatParcelizer$7cf75f07, AudioAttributesCompatParcelizer$7cf75f07(l3, (Enum) ((Field) objRemoteActionCompatParcelizer2).get(null))}));
    }

    private static buildPrimaryAndEmbeddedTrackGroupInfos AudioAttributesCompatParcelizer$7cf75f07(ResolutionConfigRsModel resolutionConfigRsModel, Enum r4) {
        toMagicModuleMetaRepoModel.write(resolutionConfigRsModel, "");
        toMagicModuleMetaRepoModel.write(r4, "");
        getClosedCaptionTrackFormats getclosedcaptiontrackformatsWrite = write(resolutionConfigRsModel.getHd(), getChunkEndTimeUs.RemoteActionCompatParcelizer);
        return new buildPrimaryAndEmbeddedTrackGroupInfos(r4, IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new getClosedCaptionTrackFormats[]{write(resolutionConfigRsModel.getLow(), getChunkEndTimeUs.write), write(resolutionConfigRsModel.getMedium(), getChunkEndTimeUs.read), getclosedcaptiontrackformatsWrite}));
    }

    private static getClosedCaptionTrackFormats write(PlaybackConfigRsModel playbackConfigRsModel, getChunkEndTimeUs getchunkendtimeus) {
        toMagicModuleMetaRepoModel.write(playbackConfigRsModel, "");
        toMagicModuleMetaRepoModel.write(getchunkendtimeus, "");
        return new getClosedCaptionTrackFormats(getchunkendtimeus, playbackConfigRsModel.isPersistent(), playbackConfigRsModel.getPlaybackAllowed(), playbackConfigRsModel.getErrorMsg());
    }
}
