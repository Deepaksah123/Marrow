package kotlin;

import com.google.android.exoplayer2.BuildConfig;
import com.marrow.data.models.ResponseError;
import com.marrow.data.utils.product.exceptions.ResponseErrorException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class newPlayerTrackEmsgHandler {
    private static final Map<String, String> write = VideoTimelineResponseBody.write(new Pair(BuildConfig.LIBRARY_PACKAGE_NAME, "exo2"), new Pair("com.marrow.data.utils.product.exceptions.ResponseErrorException", "RespEx"));

    public static final String IconCompatParcelizer(Throwable th) {
        toMagicModuleMetaRepoModel.write(th, "");
        String message = th.getMessage();
        if (message == null) {
            return "";
        }
        for (Map.Entry<String, String> entry : write.entrySet()) {
            message = TestGroupLSModel.read(message, entry.getKey(), entry.getValue(), false);
        }
        return message;
    }

    public static final int AudioAttributesCompatParcelizer(ResponseErrorException responseErrorException) {
        Integer numAudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.write(responseErrorException, "");
        ResponseError error = responseErrorException.getError();
        newPrevYearTestContainer newprevyeartestcontainer = newYearNameItem.read(new newYearNameItem("VID(\\d{1,6})", copyYearItem.IGNORE_CASE), error.getErrorMessage());
        return (newprevyeartestcontainer == null || (numAudioAttributesImplApi26Parcelizer = TestGroupLSModel.AudioAttributesImplApi26Parcelizer(newprevyeartestcontainer.write().get(1))) == null) ? error.getErrorCode() : numAudioAttributesImplApi26Parcelizer.intValue();
    }
}
