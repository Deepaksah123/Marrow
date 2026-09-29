package kotlin;

import com.marrow.data.models.common.ApplicationData;
import com.marrow.data.models.user.LoggedUser;
import com.marrow.data.models.user.User;
import kotlin.WebvttCssStyleFontSizeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class setTargetClasses extends isRtspStartLine<WebvttCssStyleFontSizeUnit.write> implements WebvttCssStyleFontSizeUnit.RemoteActionCompatParcelizer {
    private final ApplicationData AudioAttributesCompatParcelizer;
    private final getStreamPositionUsForContent IconCompatParcelizer;
    private final getNextChunkIndex read;
    private final getSampleFormats write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public setTargetClasses(parseLongAttr parselongattr, endsWithLivePostrollPlaceHolder endswithlivepostrollplaceholder, getIds getids, getIds getids2, getNextChunkIndex getnextchunkindex, getStreamPositionUsForContent getstreampositionusforcontent, getSampleFormats getsampleformats, WebvttCssStyleFontSizeUnit.write writeVar, ApplicationData applicationData) {
        super(parselongattr, endswithlivepostrollplaceholder, getids, getids2, writeVar);
        toMagicModuleMetaRepoModel.write(parselongattr, "");
        toMagicModuleMetaRepoModel.write(endswithlivepostrollplaceholder, "");
        toMagicModuleMetaRepoModel.write(getids, "");
        toMagicModuleMetaRepoModel.write(getids2, "");
        toMagicModuleMetaRepoModel.write(getnextchunkindex, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(getsampleformats, "");
        toMagicModuleMetaRepoModel.write(writeVar, "");
        toMagicModuleMetaRepoModel.write(applicationData, "");
        this.read = getnextchunkindex;
        this.IconCompatParcelizer = getstreampositionusforcontent;
        this.write = getsampleformats;
        this.AudioAttributesCompatParcelizer = applicationData;
    }

    @Override // o.WebvttCssStyleFontSizeUnit.RemoteActionCompatParcelizer
    public final void AudioAttributesCompatParcelizer() {
        String str;
        User info;
        LoggedUser loggedUserIconCompatParcelizer = this.read.IconCompatParcelizer();
        String id = (loggedUserIconCompatParcelizer == null || (info = loggedUserIconCompatParcelizer.getInfo()) == null) ? null : info.getId();
        this.write.RemoteActionCompatParcelizer();
        if (loggedUserIconCompatParcelizer == null || (str = id) == null || str.length() == 0) {
            ((WebvttCssStyleFontSizeUnit.write) this.RemoteActionCompatParcelizer).onCustomAction();
            return;
        }
        if (!loggedUserIconCompatParcelizer.getInfo().getCollege().isUserCollegeDataAvailable()) {
            this.AudioAttributesCompatParcelizer.logFirebaseException(loggedUserIconCompatParcelizer.getInfo().getCollege().getWhichCollegeDataIsNotPresent());
            ((WebvttCssStyleFontSizeUnit.write) this.RemoteActionCompatParcelizer).onCommand();
            return;
        }
        getStreamPositionUsForContent getstreampositionusforcontent = this.IconCompatParcelizer;
        if (!getstreampositionusforcontent.AudioAttributesCompatParcelizer(getstreampositionusforcontent.onPrepareFromUri())) {
            ((WebvttCssStyleFontSizeUnit.write) this.RemoteActionCompatParcelizer).onMediaButtonEvent();
        } else {
            ((WebvttCssStyleFontSizeUnit.write) this.RemoteActionCompatParcelizer).onPlayFromMediaId();
        }
    }
}
