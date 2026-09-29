package kotlin;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.HomeLessonIndexV2;
import kotlin.getSchemaTitle;
import kotlin.setActiveRecallQbankId;
import kotlin.setPeopleSolved;
import kotlin.toHomeLessonIndex;

/* JADX INFO: loaded from: classes4.dex */
public final class getCompletedARQBankCount {
    private static final setStepType AudioAttributesCompatParcelizer;
    public static final getCompletedARQBankCount IconCompatParcelizer = new getCompletedARQBankCount();

    private getCompletedARQBankCount() {
    }

    static {
        setStepType setsteptype = setStepType.read();
        toHomeLessonIndex.AudioAttributesCompatParcelizer(setsteptype);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setsteptype, "");
        AudioAttributesCompatParcelizer = setsteptype;
    }

    public static setStepType read() {
        return AudioAttributesCompatParcelizer;
    }

    @getMagicModuleMeta
    public static final Pair<incrementCorrect, setActiveRecallQbankId.RemoteActionCompatParcelizer> RemoteActionCompatParcelizer(String[] strArr, String[] strArr2) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        toMagicModuleMetaRepoModel.write(strArr2, "");
        byte[] bArr = getLastAttemptedTime.read(strArr);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bArr, "");
        return AudioAttributesCompatParcelizer(bArr, strArr2);
    }

    @getMagicModuleMeta
    private static Pair<incrementCorrect, setActiveRecallQbankId.RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer(byte[] bArr, String[] strArr) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair<>(read(byteArrayInputStream, strArr), setActiveRecallQbankId.RemoteActionCompatParcelizer.write(byteArrayInputStream, AudioAttributesCompatParcelizer));
    }

    @getMagicModuleMeta
    public static final Pair<incrementCorrect, setActiveRecallQbankId.RatingCompat> read(String[] strArr, String[] strArr2) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        toMagicModuleMetaRepoModel.write(strArr2, "");
        byte[] bArr = getLastAttemptedTime.read(strArr);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bArr, "");
        return write(bArr, strArr2);
    }

    @getMagicModuleMeta
    private static Pair<incrementCorrect, setActiveRecallQbankId.RatingCompat> write(byte[] bArr, String[] strArr) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair<>(read(byteArrayInputStream, strArr), setActiveRecallQbankId.RatingCompat.AudioAttributesCompatParcelizer(byteArrayInputStream, AudioAttributesCompatParcelizer));
    }

    @getMagicModuleMeta
    public static final Pair<incrementCorrect, setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer> IconCompatParcelizer(String[] strArr, String[] strArr2) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        toMagicModuleMetaRepoModel.write(strArr2, "");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(getLastAttemptedTime.read(strArr));
        return new Pair<>(read(byteArrayInputStream, strArr2), setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(byteArrayInputStream, AudioAttributesCompatParcelizer));
    }

    private static incrementCorrect read(InputStream inputStream, String[] strArr) throws IOException {
        toHomeLessonIndex.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = toHomeLessonIndex.RemoteActionCompatParcelizer.write(inputStream, AudioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(remoteActionCompatParcelizerWrite, "");
        return new incrementCorrect(remoteActionCompatParcelizerWrite, strArr);
    }

    public static getSchemaTitle.IconCompatParcelizer AudioAttributesCompatParcelizer(setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, setRatingCount setratingcount, setTagActive settagactive) {
        String string;
        toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        HomeLessonIndexV2.IconCompatParcelizer<setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer, toHomeLessonIndex.IconCompatParcelizer> iconCompatParcelizer = toHomeLessonIndex.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizer, "");
        toHomeLessonIndex.IconCompatParcelizer iconCompatParcelizer2 = (toHomeLessonIndex.IconCompatParcelizer) setTagLabel.read(audioAttributesImplApi26Parcelizer, iconCompatParcelizer);
        int iAudioAttributesImplBaseParcelizer = (iconCompatParcelizer2 == null || !iconCompatParcelizer2.AudioAttributesImplBaseParcelizer()) ? audioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer() : iconCompatParcelizer2.IconCompatParcelizer();
        if (iconCompatParcelizer2 != null && iconCompatParcelizer2.write()) {
            string = setratingcount.AudioAttributesCompatParcelizer(iconCompatParcelizer2.AudioAttributesCompatParcelizer());
        } else {
            List listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(setTagExpiryMs.RemoteActionCompatParcelizer(audioAttributesImplApi26Parcelizer, settagactive));
            List<setActiveRecallQbankId.handleMediaPlayPauseIfPendingOnHandler> listMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = audioAttributesImplApi26Parcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, "");
            List<setActiveRecallQbankId.handleMediaPlayPauseIfPendingOnHandler> list = listMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            for (setActiveRecallQbankId.handleMediaPlayPauseIfPendingOnHandler handlemediaplaypauseifpendingonhandler : list) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(handlemediaplaypauseifpendingonhandler, "");
                arrayList.add(setTagExpiryMs.write(handlemediaplaypauseifpendingonhandler, settagactive));
            }
            List listAudioAttributesCompatParcelizer2 = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) listAudioAttributesCompatParcelizer, (Iterable) arrayList);
            ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesCompatParcelizer2, 10));
            Iterator it = listAudioAttributesCompatParcelizer2.iterator();
            while (it.hasNext()) {
                String str = read((setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) it.next(), setratingcount);
                if (str == null) {
                    return null;
                }
                arrayList2.add(str);
            }
            ArrayList arrayList3 = arrayList2;
            String str2 = read(setTagExpiryMs.write(audioAttributesImplApi26Parcelizer, settagactive), setratingcount);
            if (str2 == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(arrayList3, "", "(", ")", 0, null, null, 56));
            sb.append(str2);
            string = sb.toString();
        }
        return new getSchemaTitle.IconCompatParcelizer(setratingcount.AudioAttributesCompatParcelizer(iAudioAttributesImplBaseParcelizer), string);
    }

    public static getSchemaTitle.IconCompatParcelizer AudioAttributesCompatParcelizer(setActiveRecallQbankId.write writeVar, setRatingCount setratingcount, setTagActive settagactive) {
        String strAudioAttributesCompatParcelizer;
        String strRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(writeVar, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        HomeLessonIndexV2.IconCompatParcelizer<setActiveRecallQbankId.write, toHomeLessonIndex.IconCompatParcelizer> iconCompatParcelizer = toHomeLessonIndex.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizer, "");
        toHomeLessonIndex.IconCompatParcelizer iconCompatParcelizer2 = (toHomeLessonIndex.IconCompatParcelizer) setTagLabel.read(writeVar, iconCompatParcelizer);
        if (iconCompatParcelizer2 != null && iconCompatParcelizer2.AudioAttributesImplBaseParcelizer()) {
            strAudioAttributesCompatParcelizer = setratingcount.AudioAttributesCompatParcelizer(iconCompatParcelizer2.IconCompatParcelizer());
        } else {
            strAudioAttributesCompatParcelizer = "<init>";
        }
        if (iconCompatParcelizer2 != null && iconCompatParcelizer2.write()) {
            strRemoteActionCompatParcelizer = setratingcount.AudioAttributesCompatParcelizer(iconCompatParcelizer2.AudioAttributesCompatParcelizer());
        } else {
            List<setActiveRecallQbankId.handleMediaPlayPauseIfPendingOnHandler> listWrite = writeVar.write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listWrite, "");
            List<setActiveRecallQbankId.handleMediaPlayPauseIfPendingOnHandler> list = listWrite;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            for (setActiveRecallQbankId.handleMediaPlayPauseIfPendingOnHandler handlemediaplaypauseifpendingonhandler : list) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(handlemediaplaypauseifpendingonhandler, "");
                String str = read(setTagExpiryMs.write(handlemediaplaypauseifpendingonhandler, settagactive), setratingcount);
                if (str == null) {
                    return null;
                }
                arrayList.add(str);
            }
            strRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(arrayList, "", "(", ")V", 0, null, null, 56);
        }
        return new getSchemaTitle.IconCompatParcelizer(strAudioAttributesCompatParcelizer, strRemoteActionCompatParcelizer);
    }

    public static getSchemaTitle.write IconCompatParcelizer(setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, setRatingCount setratingcount, setTagActive settagactive, boolean z) {
        String strAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        toMagicModuleMetaRepoModel.write(settagactive, "");
        HomeLessonIndexV2.IconCompatParcelizer<setActiveRecallQbankId.MediaBrowserCompatMediaItem, toHomeLessonIndex.AudioAttributesCompatParcelizer> iconCompatParcelizer = toHomeLessonIndex.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizer, "");
        toHomeLessonIndex.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (toHomeLessonIndex.AudioAttributesCompatParcelizer) setTagLabel.read(mediaBrowserCompatMediaItem, iconCompatParcelizer);
        if (audioAttributesCompatParcelizer == null) {
            return null;
        }
        toHomeLessonIndex.read readVarWrite = audioAttributesCompatParcelizer.MediaDescriptionCompat() ? audioAttributesCompatParcelizer.write() : null;
        if (readVarWrite == null && z) {
            return null;
        }
        int iMediaBrowserCompatItemReceiver = (readVarWrite == null || !readVarWrite.AudioAttributesImplBaseParcelizer()) ? mediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver() : readVarWrite.IconCompatParcelizer();
        if (readVarWrite == null || !readVarWrite.write()) {
            strAudioAttributesCompatParcelizer = read(setTagExpiryMs.write(mediaBrowserCompatMediaItem, settagactive), setratingcount);
            if (strAudioAttributesCompatParcelizer == null) {
                return null;
            }
        } else {
            strAudioAttributesCompatParcelizer = setratingcount.AudioAttributesCompatParcelizer(readVarWrite.AudioAttributesCompatParcelizer());
        }
        return new getSchemaTitle.write(setratingcount.AudioAttributesCompatParcelizer(iMediaBrowserCompatItemReceiver), strAudioAttributesCompatParcelizer);
    }

    private static String read(setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, setRatingCount setratingcount) {
        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onMediaButtonEvent()) {
            return getHighYieldId.RemoteActionCompatParcelizer(setratingcount.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplBaseParcelizer()));
        }
        return null;
    }

    @getMagicModuleMeta
    public static final boolean IconCompatParcelizer(setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        McqSchemaGroupInfo mcqSchemaGroupInfo = McqSchemaGroupInfo.write;
        setPeopleSolved.read readVarAudioAttributesCompatParcelizer = McqSchemaGroupInfo.AudioAttributesCompatParcelizer();
        Object objIconCompatParcelizer = mediaBrowserCompatMediaItem.IconCompatParcelizer(toHomeLessonIndex.IconCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objIconCompatParcelizer, "");
        Boolean boolIconCompatParcelizer = readVarAudioAttributesCompatParcelizer.IconCompatParcelizer(((Number) objIconCompatParcelizer).intValue());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer, "");
        return boolIconCompatParcelizer.booleanValue();
    }
}
