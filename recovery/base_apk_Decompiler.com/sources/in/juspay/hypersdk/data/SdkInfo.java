package in.juspay.hypersdk.data;

/* JADX INFO: loaded from: classes4.dex */
public final class SdkInfo {
    private final boolean sdkDebuggable;
    private final String sdkName;
    private final String sdkVersion;
    private final boolean usesLocalAssets;

    public SdkInfo(String str, String str2, boolean z, boolean z2) {
        this.sdkName = str;
        this.sdkVersion = str2;
        this.sdkDebuggable = z;
        this.usesLocalAssets = z2;
    }

    public final String getSdkName() {
        return this.sdkName;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final boolean isSdkDebuggable() {
        return this.sdkDebuggable;
    }

    public final boolean usesLocalAssets() {
        return this.usesLocalAssets;
    }
}
