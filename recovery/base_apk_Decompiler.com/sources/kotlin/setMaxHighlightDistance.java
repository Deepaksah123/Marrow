package kotlin;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.setNoDataTextTypeface;

/* JADX INFO: loaded from: classes4.dex */
public final class setMaxHighlightDistance {

    public static final class AudioAttributesCompatParcelizer<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(((setNoDataTextTypeface.IconCompatParcelizer) t).IconCompatParcelizer, ((setNoDataTextTypeface.IconCompatParcelizer) t2).IconCompatParcelizer);
        }
    }

    public static final class write<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(((setNoDataTextTypeface.write) t).read, ((setNoDataTextTypeface.write) t2).read);
        }
    }

    public static final boolean IconCompatParcelizer(setNoDataTextTypeface setnodatatexttypeface, Object obj) {
        toMagicModuleMetaRepoModel.write(setnodatatexttypeface, "");
        if (setnodatatexttypeface == obj) {
            return true;
        }
        if (!(obj instanceof setNoDataTextTypeface)) {
            return false;
        }
        setNoDataTextTypeface setnodatatexttypeface2 = (setNoDataTextTypeface) obj;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) setnodatatexttypeface.write, (Object) setnodatatexttypeface2.write) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setnodatatexttypeface.IconCompatParcelizer, setnodatatexttypeface2.IconCompatParcelizer) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setnodatatexttypeface.RemoteActionCompatParcelizer, setnodatatexttypeface2.RemoteActionCompatParcelizer)) {
            return false;
        }
        if (setnodatatexttypeface.AudioAttributesCompatParcelizer == null || setnodatatexttypeface2.AudioAttributesCompatParcelizer == null) {
            return true;
        }
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setnodatatexttypeface.AudioAttributesCompatParcelizer, setnodatatexttypeface2.AudioAttributesCompatParcelizer);
    }

    public static final int read(setNoDataTextTypeface setnodatatexttypeface) {
        toMagicModuleMetaRepoModel.write(setnodatatexttypeface, "");
        return (((setnodatatexttypeface.write.hashCode() * 31) + setnodatatexttypeface.IconCompatParcelizer.hashCode()) * 31) + setnodatatexttypeface.RemoteActionCompatParcelizer.hashCode();
    }

    public static final String write(setNoDataTextTypeface setnodatatexttypeface) {
        List listRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(setnodatatexttypeface, "");
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(setnodatatexttypeface.write);
        sb.append("',\n            |    columns = {");
        sb.append(write(IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) setnodatatexttypeface.IconCompatParcelizer.values(), (Comparator) new write())));
        sb.append("\n            |    foreignKeys = {");
        sb.append(write(setnodatatexttypeface.RemoteActionCompatParcelizer));
        sb.append("\n            |    indices = {");
        Set<setNoDataTextTypeface.IconCompatParcelizer> set = setnodatatexttypeface.AudioAttributesCompatParcelizer;
        if (set == null || (listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) set, (Comparator) new AudioAttributesCompatParcelizer())) == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        sb.append(write(listRemoteActionCompatParcelizer));
        sb.append("\n            |}\n        ");
        return TestGroupLSModel.RemoteActionCompatParcelizer(sb.toString(), "|");
    }

    public static final boolean write(setNoDataTextTypeface.write writeVar, Object obj) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        if (writeVar == obj) {
            return true;
        }
        if (!(obj instanceof setNoDataTextTypeface.write)) {
            return false;
        }
        setNoDataTextTypeface.write writeVar2 = (setNoDataTextTypeface.write) obj;
        if (writeVar.AudioAttributesCompatParcelizer() != writeVar2.AudioAttributesCompatParcelizer() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) writeVar.read, (Object) writeVar2.read) || writeVar.write != writeVar2.write) {
            return false;
        }
        String str = writeVar.RemoteActionCompatParcelizer;
        String str2 = writeVar2.RemoteActionCompatParcelizer;
        if (writeVar.MediaBrowserCompatItemReceiver == 1 && writeVar2.MediaBrowserCompatItemReceiver == 2 && str != null && !IconCompatParcelizer(str, writeVar2.RemoteActionCompatParcelizer)) {
            return false;
        }
        if (writeVar.MediaBrowserCompatItemReceiver != 2 || writeVar2.MediaBrowserCompatItemReceiver != 1 || str2 == null || IconCompatParcelizer(str2, str)) {
            return (writeVar.MediaBrowserCompatItemReceiver == 0 || writeVar.MediaBrowserCompatItemReceiver != writeVar2.MediaBrowserCompatItemReceiver || (str == null ? str2 == null : IconCompatParcelizer(str, str2))) && writeVar.AudioAttributesImplApi21Parcelizer == writeVar2.AudioAttributesImplApi21Parcelizer;
        }
        return false;
    }

    private static boolean IconCompatParcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) str2)) {
            return true;
        }
        if (!read(str)) {
            return false;
        }
        String strSubstring = str.substring(1, str.length() - 1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) strSubstring).toString(), (Object) str2);
    }

    private static final boolean read(String str) {
        String str2 = str;
        if (str2.length() == 0) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < str2.length()) {
            char cCharAt = str2.charAt(i);
            if (i3 == 0 && cCharAt != '(') {
                return false;
            }
            if (cCharAt == '(') {
                i2++;
            } else if (cCharAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                return false;
            }
            i++;
            i3++;
        }
        return i2 == 0;
    }

    public static final int AudioAttributesCompatParcelizer(setNoDataTextTypeface.write writeVar) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        int iHashCode = writeVar.read.hashCode();
        return (((((iHashCode * 31) + writeVar.AudioAttributesImplApi21Parcelizer) * 31) + (writeVar.write ? 1231 : 1237)) * 31) + writeVar.AudioAttributesCompatParcelizer;
    }

    public static final String IconCompatParcelizer(setNoDataTextTypeface.write writeVar) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(writeVar.read);
        sb.append("',\n            |   type = '");
        sb.append(writeVar.IconCompatParcelizer);
        sb.append("',\n            |   affinity = '");
        sb.append(writeVar.AudioAttributesImplApi21Parcelizer);
        sb.append("',\n            |   notNull = '");
        sb.append(writeVar.write);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(writeVar.AudioAttributesCompatParcelizer);
        sb.append("',\n            |   defaultValue = '");
        String str = writeVar.RemoteActionCompatParcelizer;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return TestGroupLSModel.AudioAttributesCompatParcelizer(TestGroupLSModel.RemoteActionCompatParcelizer(sb.toString(), "|"), "    ");
    }

    public static final boolean AudioAttributesCompatParcelizer(setNoDataTextTypeface.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, Object obj) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        if (audioAttributesCompatParcelizer == obj) {
            return true;
        }
        if (!(obj instanceof setNoDataTextTypeface.AudioAttributesCompatParcelizer)) {
            return false;
        }
        setNoDataTextTypeface.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = (setNoDataTextTypeface.AudioAttributesCompatParcelizer) obj;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) audioAttributesCompatParcelizer.RemoteActionCompatParcelizer, (Object) audioAttributesCompatParcelizer2.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) audioAttributesCompatParcelizer.IconCompatParcelizer, (Object) audioAttributesCompatParcelizer2.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) audioAttributesCompatParcelizer.read, (Object) audioAttributesCompatParcelizer2.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.write, audioAttributesCompatParcelizer2.write)) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer);
        }
        return false;
    }

    public static final int AudioAttributesCompatParcelizer(setNoDataTextTypeface.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        int iHashCode = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = audioAttributesCompatParcelizer.IconCompatParcelizer.hashCode();
        return (((((((iHashCode * 31) + iHashCode2) * 31) + audioAttributesCompatParcelizer.read.hashCode()) * 31) + audioAttributesCompatParcelizer.write.hashCode()) * 31) + audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.hashCode();
    }

    public static final String RemoteActionCompatParcelizer(setNoDataTextTypeface.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
        sb.append("',\n            |   onDelete = '");
        sb.append(audioAttributesCompatParcelizer.IconCompatParcelizer);
        sb.append("',\n            |   onUpdate = '");
        sb.append(audioAttributesCompatParcelizer.read);
        sb.append("',\n            |   columnNames = {");
        read(IntermediateLoginResponseBody.onPause(audioAttributesCompatParcelizer.write));
        sb.append(getShowPopup.INSTANCE);
        sb.append("\n            |   referenceColumnNames = {");
        RemoteActionCompatParcelizer(IntermediateLoginResponseBody.onPause(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer));
        sb.append(getShowPopup.INSTANCE);
        sb.append("\n            |}\n        ");
        return TestGroupLSModel.AudioAttributesCompatParcelizer(TestGroupLSModel.RemoteActionCompatParcelizer(sb.toString(), "|"), "    ");
    }

    public static final boolean write(setNoDataTextTypeface.IconCompatParcelizer iconCompatParcelizer, Object obj) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        if (iconCompatParcelizer == obj) {
            return true;
        }
        if (!(obj instanceof setNoDataTextTypeface.IconCompatParcelizer)) {
            return false;
        }
        setNoDataTextTypeface.IconCompatParcelizer iconCompatParcelizer2 = (setNoDataTextTypeface.IconCompatParcelizer) obj;
        if (iconCompatParcelizer.RemoteActionCompatParcelizer != iconCompatParcelizer2.RemoteActionCompatParcelizer || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iconCompatParcelizer.read, iconCompatParcelizer2.read) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iconCompatParcelizer.AudioAttributesCompatParcelizer, iconCompatParcelizer2.AudioAttributesCompatParcelizer)) {
            return false;
        }
        if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(iconCompatParcelizer.IconCompatParcelizer, "index_")) {
            return TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(iconCompatParcelizer2.IconCompatParcelizer, "index_");
        }
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) iconCompatParcelizer.IconCompatParcelizer, (Object) iconCompatParcelizer2.IconCompatParcelizer);
    }

    public static final int write(setNoDataTextTypeface.IconCompatParcelizer iconCompatParcelizer) {
        int iHashCode;
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(iconCompatParcelizer.IconCompatParcelizer, "index_")) {
            iHashCode = "index_".hashCode();
        } else {
            iHashCode = iconCompatParcelizer.IconCompatParcelizer.hashCode();
        }
        boolean z = iconCompatParcelizer.RemoteActionCompatParcelizer;
        return (((((iHashCode * 31) + (z ? 1 : 0)) * 31) + iconCompatParcelizer.read.hashCode()) * 31) + iconCompatParcelizer.AudioAttributesCompatParcelizer.hashCode();
    }

    public static final String RemoteActionCompatParcelizer(setNoDataTextTypeface.IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(iconCompatParcelizer.IconCompatParcelizer);
        sb.append("',\n            |   unique = '");
        sb.append(iconCompatParcelizer.RemoteActionCompatParcelizer);
        sb.append("',\n            |   columns = {");
        read(iconCompatParcelizer.read);
        sb.append(getShowPopup.INSTANCE);
        sb.append("\n            |   orders = {");
        RemoteActionCompatParcelizer(iconCompatParcelizer.AudioAttributesCompatParcelizer);
        sb.append(getShowPopup.INSTANCE);
        sb.append("\n            |}\n        ");
        return TestGroupLSModel.AudioAttributesCompatParcelizer(TestGroupLSModel.RemoteActionCompatParcelizer(sb.toString(), "|"), "    ");
    }

    private static String write(Collection<?> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        if (!collection.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(TestGroupLSModel.AudioAttributesCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(collection, ",\n", "\n", "\n", 0, null, null, 56), "    "));
            sb.append("},");
            return sb.toString();
        }
        return " }";
    }

    private static final void read(Collection<?> collection) {
        TestGroupLSModel.AudioAttributesCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(collection, ",", null, null, 0, null, null, 62), "    ");
        TestGroupLSModel.AudioAttributesCompatParcelizer("},", "    ");
    }

    private static final void RemoteActionCompatParcelizer(Collection<?> collection) {
        TestGroupLSModel.AudioAttributesCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(collection, ",", null, null, 0, null, null, 62), "    ");
        TestGroupLSModel.AudioAttributesCompatParcelizer(" }", "    ");
    }
}
