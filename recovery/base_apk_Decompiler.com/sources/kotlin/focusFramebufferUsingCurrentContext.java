package kotlin;

import com.marrow2.data.user.remote.model.CollegeDetails;
import com.marrow2.data.user.remote.model.SaveProfileRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class focusFramebufferUsingCurrentContext {
    public static final SaveProfileRequestBody RemoteActionCompatParcelizer(getLocaleLanguageTagV21 getlocalelanguagetagv21) {
        toMagicModuleMetaRepoModel.write(getlocalelanguagetagv21, "");
        CollegeDetails collegeDetails = new CollegeDetails(getlocalelanguagetagv21.onCustomAction(), getlocalelanguagetagv21.IconCompatParcelizer(), getlocalelanguagetagv21.write(), getlocalelanguagetagv21.read(), getlocalelanguagetagv21.onPlayFromMediaId(), getlocalelanguagetagv21.onPause(), getlocalelanguagetagv21.AudioAttributesImplApi26Parcelizer(), getlocalelanguagetagv21.onPlay(), getlocalelanguagetagv21.MediaMetadataCompat());
        getNormalizedCoordinateBounds getnormalizedcoordinateboundsWrite = write(getlocalelanguagetagv21.onMediaButtonEvent());
        String strRemoteActionCompatParcelizer = getnormalizedcoordinateboundsWrite.RemoteActionCompatParcelizer();
        String str = getnormalizedcoordinateboundsWrite.read();
        int iRemoteActionCompatParcelizer = getlocalelanguagetagv21.RemoteActionCompatParcelizer();
        String strHandleMediaPlayPauseIfPendingOnHandler = getlocalelanguagetagv21.handleMediaPlayPauseIfPendingOnHandler();
        String strOnCommand = getlocalelanguagetagv21.onCommand();
        return new SaveProfileRequestBody(null, strRemoteActionCompatParcelizer, str, collegeDetails, String.valueOf(iRemoteActionCompatParcelizer), null, getlocalelanguagetagv21.onAddQueueItem(), strHandleMediaPlayPauseIfPendingOnHandler, strOnCommand);
    }

    private static final getNormalizedCoordinateBounds write(String str) {
        int length = TestGroupLSModel.read((CharSequence) str, " ", 0, false, 6);
        if (length == -1) {
            length = str.length();
        }
        String string = str.subSequence(0, length).toString();
        String string2 = TestGroupLSModel.AudioAttributesImplApi21Parcelizer((CharSequence) str.subSequence(length, str.length()).toString()).toString();
        if (string2.length() == 0) {
            string2 = ".";
        }
        return new getNormalizedCoordinateBounds(string, string2);
    }
}
