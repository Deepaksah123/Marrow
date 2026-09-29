package kotlin;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class getBookmarkId extends getOption7AnsweredCount<Character> {
    public getBookmarkId(char c) {
        super(Character.valueOf(c));
    }

    @Override // kotlin.getMagicLine
    public final /* synthetic */ getLink AudioAttributesCompatParcelizer(getTopSection gettopsection) {
        return write(gettopsection);
    }

    private static getHref write(getTopSection gettopsection) {
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        getHref gethrefAudioAttributesImplBaseParcelizer = gettopsection.write().AudioAttributesImplBaseParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefAudioAttributesImplBaseParcelizer, "");
        return gethrefAudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.getMagicLine
    public final String toString() {
        char cCharValue = AudioAttributesCompatParcelizer().charValue();
        String str = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(cCharValue), IconCompatParcelizer(AudioAttributesCompatParcelizer().charValue())}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }

    private static String IconCompatParcelizer(char c) {
        if (c == '\b') {
            return "\\b";
        }
        if (c == '\t') {
            return "\\t";
        }
        if (c == '\n') {
            return "\\n";
        }
        if (c == '\f') {
            return "\\f";
        }
        if (c == '\r') {
            return "\\r";
        }
        return RemoteActionCompatParcelizer(c) ? String.valueOf(c) : "?";
    }

    private static boolean RemoteActionCompatParcelizer(char c) {
        byte type = (byte) Character.getType(c);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }
}
