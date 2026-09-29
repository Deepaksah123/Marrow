package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.CleverTapInstanceConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class getMaxStars {
    private final CleverTapInstanceConfig read;

    public getMaxStars(CleverTapInstanceConfig cleverTapInstanceConfig) {
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        this.read = cleverTapInstanceConfig;
    }

    public final void read(Context context, long j) {
        toMagicModuleMetaRepoModel.write(context, "");
        SharedPreferences.Editor editorEdit = RendererCapabilitiesFormatSupport.IconCompatParcelizer(context, "IJ").edit();
        editorEdit.putLong(RendererCapabilitiesFormatSupport.write(this.read.write(), "comms_i"), j);
        RendererCapabilitiesFormatSupport.write(editorEdit);
    }

    public final void IconCompatParcelizer(Context context, long j) {
        toMagicModuleMetaRepoModel.write(context, "");
        SharedPreferences.Editor editorEdit = RendererCapabilitiesFormatSupport.IconCompatParcelizer(context, "IJ").edit();
        editorEdit.putLong(RendererCapabilitiesFormatSupport.write(this.read.write(), "comms_j"), j);
        RendererCapabilitiesFormatSupport.write(editorEdit);
    }

    public final long IconCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        return RendererCapabilitiesFormatSupport.read(context, this.read, "comms_i", "IJ");
    }

    public final long write(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        return RendererCapabilitiesFormatSupport.read(context, this.read, "comms_j", "IJ");
    }

    public static void AudioAttributesCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        SharedPreferences.Editor editorEdit = RendererCapabilitiesFormatSupport.IconCompatParcelizer(context, "IJ").edit();
        editorEdit.clear();
        RendererCapabilitiesFormatSupport.write(editorEdit);
    }
}
