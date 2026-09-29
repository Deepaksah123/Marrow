package kotlin;

import com.marrow.data.models.ResponseError;
import com.marrow.data.utils.product.exceptions.ResponseErrorException;

/* JADX INFO: loaded from: classes5.dex */
public final class createDashChunkSource {
    public static final getClosedCaptionTrackFormats IconCompatParcelizer(getClosedCaptionTrackFormats getclosedcaptiontrackformats) {
        toMagicModuleMetaRepoModel.write(getclosedcaptiontrackformats, "");
        if (getclosedcaptiontrackformats.getIconCompatParcelizer()) {
            return getclosedcaptiontrackformats;
        }
        String audioAttributesCompatParcelizer = getclosedcaptiontrackformats.getAudioAttributesCompatParcelizer();
        if (audioAttributesCompatParcelizer == null) {
            audioAttributesCompatParcelizer = "The video is unavailable for playback - Kindly check again later";
        }
        throw new ResponseErrorException(new ResponseError(1800, audioAttributesCompatParcelizer, false, 4, null));
    }
}
