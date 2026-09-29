package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class postDelayed {
    private final String RemoteActionCompatParcelizer;

    public postDelayed(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer = str;
    }

    public final String read(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str2, "");
        String str3 = str;
        if (str3 != null && str3.length() != 0) {
            try {
                CustomModuleQuotaModelKt customModuleQuotaModelKt = CustomModuleQuotaModelKt.read;
                FilterParamsCreator filterParamsCreator = FilterParamsCreator.RemoteActionCompatParcelizer;
                String str4 = this.RemoteActionCompatParcelizer;
                StringBuilder sb = new StringBuilder();
                sb.append(str4);
                sb.append("_android");
                return CustomModuleQuotaModelKt.RemoteActionCompatParcelizer(filterParamsCreator, sb.toString(), str);
            } catch (Exception unused) {
            }
        }
        return str2;
    }
}
