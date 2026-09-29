package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getStatusannotations {
    private static getRelatedLessonId RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        getRelatedLessonId getrelatedlessonidWrite = write(getrelatedlessonid, "get", false, null, 12);
        return getrelatedlessonidWrite == null ? write(getrelatedlessonid, "is", false, null, 8) : getrelatedlessonidWrite;
    }

    private static getRelatedLessonId RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid, boolean z) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        return write(getrelatedlessonid, "set", false, z ? "is" : null, 4);
    }

    private static List<getRelatedLessonId> write(getRelatedLessonId getrelatedlessonid) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        return IntermediateLoginResponseBody.read(RemoteActionCompatParcelizer(getrelatedlessonid, false), RemoteActionCompatParcelizer(getrelatedlessonid, true));
    }

    private static /* synthetic */ getRelatedLessonId write(getRelatedLessonId getrelatedlessonid, String str, boolean z, String str2, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return IconCompatParcelizer(getrelatedlessonid, str, z, str2);
    }

    private static final getRelatedLessonId IconCompatParcelizer(getRelatedLessonId getrelatedlessonid, String str, boolean z, String str2) {
        if (getrelatedlessonid.read()) {
            return null;
        }
        String strRemoteActionCompatParcelizer = getrelatedlessonid.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, "");
        if (!TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(strRemoteActionCompatParcelizer, str) || strRemoteActionCompatParcelizer.length() == str.length()) {
            return null;
        }
        char cCharAt = strRemoteActionCompatParcelizer.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(TestGroupLSModel.IconCompatParcelizer(strRemoteActionCompatParcelizer, (CharSequence) str));
            return getRelatedLessonId.RemoteActionCompatParcelizer(sb.toString());
        }
        if (!z) {
            return getrelatedlessonid;
        }
        String strRemoteActionCompatParcelizer2 = SubjectIntroSkip.RemoteActionCompatParcelizer(TestGroupLSModel.IconCompatParcelizer(strRemoteActionCompatParcelizer, (CharSequence) str));
        if (getRelatedLessonId.read(strRemoteActionCompatParcelizer2)) {
            return getRelatedLessonId.RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer2);
        }
        return null;
    }

    public static final List<getRelatedLessonId> read(getRelatedLessonId getrelatedlessonid) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        String strAudioAttributesCompatParcelizer = getrelatedlessonid.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
        if (VideoInfoMini.read(strAudioAttributesCompatParcelizer)) {
            return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(getrelatedlessonid));
        }
        if (VideoInfoMini.RemoteActionCompatParcelizer(strAudioAttributesCompatParcelizer)) {
            return write(getrelatedlessonid);
        }
        NestfgetmThumbnailUrl nestfgetmThumbnailUrl = NestfgetmThumbnailUrl.AudioAttributesCompatParcelizer;
        return NestfgetmThumbnailUrl.AudioAttributesCompatParcelizer(getrelatedlessonid);
    }
}
