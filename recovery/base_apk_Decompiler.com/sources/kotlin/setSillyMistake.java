package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class setSillyMistake {
    public static final String RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        if (!read(getrelatedlessonid)) {
            String strAudioAttributesCompatParcelizer = getrelatedlessonid.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
            return strAudioAttributesCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder();
        String strAudioAttributesCompatParcelizer2 = getrelatedlessonid.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer2, "");
        sb.append("`".concat(String.valueOf(strAudioAttributesCompatParcelizer2)));
        sb.append('`');
        return sb.toString();
    }

    private static final boolean read(getRelatedLessonId getrelatedlessonid) {
        String strAudioAttributesCompatParcelizer = getrelatedlessonid.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
        if (setParentMcqId.RemoteActionCompatParcelizer.contains(strAudioAttributesCompatParcelizer)) {
            return true;
        }
        String str = strAudioAttributesCompatParcelizer;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                return true;
            }
        }
        return false;
    }

    public static final String IconCompatParcelizer(getSlidesCount getslidescount) {
        toMagicModuleMetaRepoModel.write(getslidescount, "");
        List<getRelatedLessonId> listWrite = getslidescount.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listWrite, "");
        return IconCompatParcelizer(listWrite);
    }

    public static final String IconCompatParcelizer(List<getRelatedLessonId> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        StringBuilder sb = new StringBuilder();
        for (getRelatedLessonId getrelatedlessonid : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(RemoteActionCompatParcelizer(getrelatedlessonid));
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    public static final String write(String str, String str2, String str3, String str4, String str5) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        if (!TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, str2) || !TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str3, str4)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        String strSubstring2 = str3.substring(str4.length());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(str5);
        sb.append(strSubstring);
        String string = sb.toString();
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strSubstring, (Object) strSubstring2)) {
            return string;
        }
        if (!read(strSubstring, strSubstring2)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append('!');
        return sb2.toString();
    }

    public static final boolean read(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) TestGroupLSModel.read(str2, "?", "", false))) {
            return true;
        }
        if (TestGroupLSModel.AudioAttributesImplApi21Parcelizer(str2, "?")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('?');
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) sb.toString(), (Object) str2)) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(str);
        sb2.append(")?");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) sb2.toString(), (Object) str2);
    }
}
