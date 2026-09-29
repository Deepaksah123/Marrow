package kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 $2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u0016$B\u0017\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0014J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001c0\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u0014J\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010!R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010\u0016\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\f\u0010\u0010"}, d2 = {"Lo/ShapeKt;", "", "Lo/getSubscriptionExpiresOn;", "", "", "p0", "<init>", "([Ljava/lang/String;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "IconCompatParcelizer", "(Ljava/lang/String;)Ljava/lang/String;", "", "hashCode", "()I", "", "iterator", "()Ljava/util/Iterator;", "(I)Ljava/lang/String;", "", "RemoteActionCompatParcelizer", "()Ljava/util/Set;", "Lo/ShapeKt$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/ShapeKt$RemoteActionCompatParcelizer;", "", "", "read", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "(Ljava/lang/String;)Ljava/util/List;", "namesAndValues", "[Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShapeKt implements Iterable<Pair<? extends String, ? extends String>>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String[] namesAndValues;

    private ShapeKt(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public final String IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return Companion.read(this.namesAndValues, p0);
    }

    public final int IconCompatParcelizer() {
        return this.namesAndValues.length / 2;
    }

    public final String IconCompatParcelizer(int p0) {
        return this.namesAndValues[p0 << 1];
    }

    public final String AudioAttributesCompatParcelizer(int p0) {
        return this.namesAndValues[(p0 << 1) + 1];
    }

    public final Set<String> RemoteActionCompatParcelizer() {
        TreeSet treeSet = new TreeSet(TestGroupLSModel.AudioAttributesCompatParcelizer(toMagicModuleStatusUcModel.INSTANCE));
        int iIconCompatParcelizer = IconCompatParcelizer();
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            treeSet.add(IconCompatParcelizer(i));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setUnmodifiableSet, "");
        return setUnmodifiableSet;
    }

    public final List<String> AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int iIconCompatParcelizer = IconCompatParcelizer();
        ArrayList arrayList = null;
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            if (TestGroupLSModel.read(p0, IconCompatParcelizer(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(AudioAttributesCompatParcelizer(i));
            }
        }
        if (arrayList != null) {
            List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listUnmodifiableList, "");
            return listUnmodifiableList;
        }
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // java.lang.Iterable
    public final Iterator<Pair<? extends String, ? extends String>> iterator() {
        int iIconCompatParcelizer = IconCompatParcelizer();
        Pair[] pairArr = new Pair[iIconCompatParcelizer];
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            pairArr[i] = setAction.write(IconCompatParcelizer(i), AudioAttributesCompatParcelizer(i));
        }
        return r8lambda_QgM1da7JykGH9FQp_oipiZItrY.AudioAttributesCompatParcelizer(pairArr);
    }

    public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        IntermediateLoginResponseBody.read((Collection) remoteActionCompatParcelizer.IconCompatParcelizer(), (Object[]) this.namesAndValues);
        return remoteActionCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        return (p0 instanceof ShapeKt) && Arrays.equals(this.namesAndValues, ((ShapeKt) p0).namesAndValues);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iIconCompatParcelizer = IconCompatParcelizer();
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            String strIconCompatParcelizer = IconCompatParcelizer(i);
            String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i);
            sb.append(strIconCompatParcelizer);
            sb.append(": ");
            if (FirebaseDataModule.AudioAttributesCompatParcelizer(strIconCompatParcelizer)) {
                strAudioAttributesCompatParcelizer = "██";
            }
            sb.append(strAudioAttributesCompatParcelizer);
            sb.append("\n");
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    public final Map<String, List<String>> read() {
        TreeMap treeMap = new TreeMap(TestGroupLSModel.AudioAttributesCompatParcelizer(toMagicModuleStatusUcModel.INSTANCE));
        int iIconCompatParcelizer = IconCompatParcelizer();
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            String strIconCompatParcelizer = IconCompatParcelizer(i);
            Locale locale = Locale.US;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(locale, "");
            String lowerCase = strIconCompatParcelizer.toLowerCase(locale);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            ArrayList arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(AudioAttributesCompatParcelizer(i));
        }
        return treeMap;
    }

    public /* synthetic */ ShapeKt(String[] strArr, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(strArr);
    }

    public static final class RemoteActionCompatParcelizer {
        private final List<String> write = new ArrayList(20);

        public final List<String> IconCompatParcelizer() {
            return this.write;
        }

        public final RemoteActionCompatParcelizer read(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            int iIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer((CharSequence) str, ':', 1, false, 4);
            if (iIconCompatParcelizer != -1) {
                String strSubstring = str.substring(0, iIconCompatParcelizer);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
                String strSubstring2 = str.substring(iIconCompatParcelizer + 1);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring2, "");
                RemoteActionCompatParcelizer(strSubstring, strSubstring2);
                return this;
            }
            if (str.charAt(0) == ':') {
                String strSubstring3 = str.substring(1);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring3, "");
                RemoteActionCompatParcelizer("", strSubstring3);
                return this;
            }
            RemoteActionCompatParcelizer("", str);
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(String str, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            Companion companion = ShapeKt.INSTANCE;
            Companion.RemoteActionCompatParcelizer(str);
            Companion companion2 = ShapeKt.INSTANCE;
            Companion.RemoteActionCompatParcelizer(str2, str);
            RemoteActionCompatParcelizer(str, str2);
            return this;
        }

        public final RemoteActionCompatParcelizer write(ShapeKt shapeKt) {
            toMagicModuleMetaRepoModel.write(shapeKt, "");
            int iIconCompatParcelizer = shapeKt.IconCompatParcelizer();
            for (int i = 0; i < iIconCompatParcelizer; i++) {
                RemoteActionCompatParcelizer(shapeKt.IconCompatParcelizer(i), shapeKt.AudioAttributesCompatParcelizer(i));
            }
            return this;
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(String str, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.write.add(str);
            this.write.add(TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) str2).toString());
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            int i = 0;
            while (i < this.write.size()) {
                if (TestGroupLSModel.read(str, this.write.get(i), true)) {
                    this.write.remove(i);
                    this.write.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(String str, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            Companion companion = ShapeKt.INSTANCE;
            Companion.RemoteActionCompatParcelizer(str);
            Companion companion2 = ShapeKt.INSTANCE;
            Companion.RemoteActionCompatParcelizer(str2, str);
            AudioAttributesCompatParcelizer(str);
            RemoteActionCompatParcelizer(str, str2);
            return this;
        }

        public final String write(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            int size = this.write.size() - 2;
            int i = saveMagicModuleTimeline.read(size, 0, -2);
            if (i > size) {
                return null;
            }
            while (!TestGroupLSModel.read(str, this.write.get(size), true)) {
                if (size == i) {
                    return null;
                }
                size -= 2;
            }
            return this.write.get(size + 1);
        }

        public final ShapeKt AudioAttributesCompatParcelizer() {
            return new ShapeKt((String[]) this.write.toArray(new String[0]), null);
        }
    }

    @getMagicModuleMeta
    public static final ShapeKt IconCompatParcelizer(String... strArr) {
        return Companion.read(strArr);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\nJ'\u0010\f\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\f\u001a\u00020\u000e2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u000f"}, d2 = {"Lo/ShapeKt$Companion;", "", "<init>", "()V", "", "p0", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)V", "p1", "(Ljava/lang/String;Ljava/lang/String;)V", "", "read", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lo/ShapeKt;", "([Ljava/lang/String;)Lo/ShapeKt;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String read(String[] p0, String p1) {
            int length = p0.length - 2;
            int i = saveMagicModuleTimeline.read(length, 0, -2);
            if (i > length) {
                return null;
            }
            while (!TestGroupLSModel.read(p1, p0[length], true)) {
                if (length == i) {
                    return null;
                }
                length -= 2;
            }
            return p0[length + 1];
        }

        @getMagicModuleMeta
        public static ShapeKt read(String... p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (p0.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            String[] strArr = (String[]) p0.clone();
            int length = strArr.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                String str = strArr[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr[i2] = TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) str).toString();
            }
            int i3 = saveMagicModuleTimeline.read(0, strArr.length - 1, 2);
            if (i3 >= 0) {
                while (true) {
                    String str2 = strArr[i];
                    String str3 = strArr[i + 1];
                    RemoteActionCompatParcelizer(str2);
                    RemoteActionCompatParcelizer(str3, str2);
                    if (i == i3) {
                        break;
                    }
                    i += 2;
                }
            }
            return new ShapeKt(strArr, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void RemoteActionCompatParcelizer(String p0) {
            if (p0.length() <= 0) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = p0.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = p0.charAt(i);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(FirebaseDataModule.read("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), p0).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void RemoteActionCompatParcelizer(String p0, String p1) {
            int length = p0.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = p0.charAt(i);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(FirebaseDataModule.read("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), p1));
                    sb.append(FirebaseDataModule.AudioAttributesCompatParcelizer(p1) ? "" : ": ".concat(String.valueOf(p0)));
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
