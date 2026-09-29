package kotlin;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class StepIndex {

    public final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[getStepType.values().length];
            try {
                iArr[getStepType.BEGINNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getStepType.AFTER_DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getStepType.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            read = iArr;
        }
    }

    private static boolean read(getNotesCount getnotescount, getNotesCount getnotescount2) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(getnotescount2, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getnotescount, getnotescount2) || getnotescount2.read()) {
            return true;
        }
        String strRemoteActionCompatParcelizer = getnotescount.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, "");
        String strRemoteActionCompatParcelizer2 = getnotescount2.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer2, "");
        return RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer, strRemoteActionCompatParcelizer2);
    }

    private static boolean RemoteActionCompatParcelizer(getNotesCount getnotescount, getNotesCount getnotescount2) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(getnotescount2, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(IconCompatParcelizer(getnotescount), getnotescount2);
    }

    private static final boolean RemoteActionCompatParcelizer(String str, String str2) {
        return TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, str2) && str.charAt(str2.length()) == '.';
    }

    public static final getNotesCount IconCompatParcelizer(getNotesCount getnotescount, getNotesCount getnotescount2) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(getnotescount2, "");
        if (!read(getnotescount, getnotescount2) || getnotescount2.read()) {
            return getnotescount;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getnotescount, getnotescount2)) {
            getNotesCount getnotescount3 = getNotesCount.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescount3, "");
            return getnotescount3;
        }
        String strRemoteActionCompatParcelizer = getnotescount.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, "");
        String strSubstring = strRemoteActionCompatParcelizer.substring(getnotescount2.RemoteActionCompatParcelizer().length() + 1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return new getNotesCount(strSubstring);
    }

    private static getNotesCount IconCompatParcelizer(getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        if (getnotescount.read()) {
            return null;
        }
        return getnotescount.AudioAttributesCompatParcelizer();
    }

    public static final boolean read(String str) {
        if (str == null) {
            return false;
        }
        getStepType getsteptype = getStepType.BEGINNING;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            int i2 = RemoteActionCompatParcelizer.read[getsteptype.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                getsteptype = getStepType.MIDDLE;
            } else if (i2 != 3) {
                continue;
            } else if (cCharAt == '.') {
                getsteptype = getStepType.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                return false;
            }
        }
        return getsteptype != getStepType.AFTER_DOT;
    }

    public static final <V> V read(getNotesCount getnotescount, Map<getNotesCount, ? extends V> map) {
        Object next;
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<getNotesCount, ? extends V> entry : map.entrySet()) {
            getNotesCount key = entry.getKey();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getnotescount, key) || RemoteActionCompatParcelizer(getnotescount, key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = IconCompatParcelizer((getNotesCount) ((Map.Entry) next).getKey(), getnotescount).RemoteActionCompatParcelizer().length();
                do {
                    Object next2 = it.next();
                    int length2 = IconCompatParcelizer((getNotesCount) ((Map.Entry) next2).getKey(), getnotescount).RemoteActionCompatParcelizer().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return (V) entry2.getValue();
        }
        return null;
    }
}
