package kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class getPeopleSolved {
    public static final getPeopleSolved AudioAttributesCompatParcelizer = new getPeopleSolved();

    private getPeopleSolved() {
    }

    public static String AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return "java/lang/".concat(String.valueOf(str));
    }

    public static String write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return "java/util/".concat(String.valueOf(str));
    }

    public static String RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return "java/util/function/".concat(String.valueOf(str));
    }

    public static Set<String> RemoteActionCompatParcelizer(String str, String... strArr) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        return AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static Set<String> read(String str, String... strArr) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        return AudioAttributesCompatParcelizer(write(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    private static Set<String> AudioAttributesCompatParcelizer(String str, String... strArr) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('.');
            sb.append(str2);
            linkedHashSet.add(sb.toString());
        }
        return linkedHashSet;
    }

    public static String AudioAttributesCompatParcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('.');
        sb.append(str2);
        return sb.toString();
    }

    static final class read extends MagicModuleUseCase implements getAnswerMap<String, CharSequence> {
        public static final read write = new read();

        private static CharSequence read(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            getPeopleSolved getpeoplesolved = getPeopleSolved.AudioAttributesCompatParcelizer;
            return getPeopleSolved.IconCompatParcelizer(str);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ CharSequence invoke(String str) {
            return read(str);
        }

        read() {
            super(1);
        }
    }

    public static String RemoteActionCompatParcelizer(String str, List<String> list, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        sb.append(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(list, "", null, null, 0, null, read.write, 30));
        sb.append(')');
        sb.append(IconCompatParcelizer(str2));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String IconCompatParcelizer(String str) {
        if (str.length() <= 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder("L");
        sb.append(str);
        sb.append(';');
        return sb.toString();
    }

    public static String[] read(String... strArr) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            StringBuilder sb = new StringBuilder("<init>(");
            sb.append(str);
            sb.append(")V");
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
