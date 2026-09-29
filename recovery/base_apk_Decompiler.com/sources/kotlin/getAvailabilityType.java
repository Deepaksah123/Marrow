package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getAvailabilityType {
    public static final boolean AudioAttributesCompatParcelizer(getResultTimeStamp getresulttimestamp) {
        toMagicModuleMetaRepoModel.write(getresulttimestamp, "");
        return getresulttimestamp.AudioAttributesImplBaseParcelizer().onPlay() && (getresulttimestamp instanceof extract) && AudioAttributesCompatParcelizer((extract) getresulttimestamp);
    }

    private static final boolean AudioAttributesCompatParcelizer(extract extractVar) {
        String strAudioAttributesCompatParcelizer = extractVar.RatingCompat().AudioAttributesCompatParcelizer();
        int iHashCode = strAudioAttributesCompatParcelizer.hashCode();
        if (iHashCode != -1776922004) {
            if (iHashCode == -1295482945) {
                if (strAudioAttributesCompatParcelizer.equals("equals")) {
                    return read(extractVar);
                }
                return false;
            }
            if (iHashCode != 147696667 || !strAudioAttributesCompatParcelizer.equals("hashCode")) {
                return false;
            }
        } else if (!strAudioAttributesCompatParcelizer.equals("toString")) {
            return false;
        }
        return extractVar.AudioAttributesImplApi21Parcelizer().isEmpty();
    }

    private static final boolean read(extract extractVar) {
        getNotesCount getnotescountAudioAttributesImplApi21Parcelizer;
        setStatus setstatus = (setStatus) IntermediateLoginResponseBody.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver((List) extractVar.AudioAttributesImplApi21Parcelizer());
        setQuestionCount setquestioncountRemoteActionCompatParcelizer = setstatus != null ? setstatus.RemoteActionCompatParcelizer() : null;
        QbankSubModel qbankSubModel = setquestioncountRemoteActionCompatParcelizer instanceof QbankSubModel ? (QbankSubModel) setquestioncountRemoteActionCompatParcelizer : null;
        if (qbankSubModel == null) {
            return false;
        }
        setThumbnail setthumbnailAudioAttributesCompatParcelizer = qbankSubModel.AudioAttributesCompatParcelizer();
        return (setthumbnailAudioAttributesCompatParcelizer instanceof isPaused) && (getnotescountAudioAttributesImplApi21Parcelizer = ((isPaused) setthumbnailAudioAttributesCompatParcelizer).AudioAttributesImplApi21Parcelizer()) != null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) getnotescountAudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), (Object) "java.lang.Object");
    }
}
