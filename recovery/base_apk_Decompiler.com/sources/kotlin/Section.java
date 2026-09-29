package kotlin;

import kotlin.setEncryptKey;

/* JADX INFO: loaded from: classes4.dex */
public final class Section {
    public static final void RemoteActionCompatParcelizer(setEncryptKey setencryptkey, getTimeStamp gettimestamp, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, getRelatedLessonId getrelatedlessonid) {
        toMagicModuleMetaRepoModel.write(setencryptkey, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        setEncryptKey.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setEncryptKey.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
    }

    public static final void read(setEncryptKey setencryptkey, getTimeStamp gettimestamp, getShouldShowEmptyPlanScreen getshouldshowemptyplanscreen, getRelatedLessonId getrelatedlessonid) {
        toMagicModuleMetaRepoModel.write(setencryptkey, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        toMagicModuleMetaRepoModel.write(getshouldshowemptyplanscreen, "");
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        String strRemoteActionCompatParcelizer = getshouldshowemptyplanscreen.IconCompatParcelizer().RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, "");
        String strAudioAttributesCompatParcelizer = getrelatedlessonid.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
        RemoteActionCompatParcelizer(setencryptkey, gettimestamp, strRemoteActionCompatParcelizer, strAudioAttributesCompatParcelizer);
    }

    private static void RemoteActionCompatParcelizer(setEncryptKey setencryptkey, getTimeStamp gettimestamp, String str, String str2) {
        toMagicModuleMetaRepoModel.write(setencryptkey, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        setEncryptKey.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setEncryptKey.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
    }
}
