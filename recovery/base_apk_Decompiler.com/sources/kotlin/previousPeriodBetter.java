package kotlin;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class previousPeriodBetter {
    private newEncryptedObject AudioAttributesCompatParcelizer;
    private String IconCompatParcelizer;
    private String RemoteActionCompatParcelizer;
    private String read;

    public previousPeriodBetter(String str, String str2, String str3, newEncryptedObject newencryptedobject) {
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
        this.IconCompatParcelizer = str3;
        this.AudioAttributesCompatParcelizer = newencryptedobject;
    }

    public final String write() {
        newEncryptedObject newencryptedobject = this.AudioAttributesCompatParcelizer;
        int iIntValue = ((Number) setForHeaderData.read(onProcessedStreamChange.read(new enableTunnelingV21(newencryptedobject, this.read)), Integer.valueOf(newencryptedobject.getRead()))).intValue();
        Uri uri = Uri.parse(String.format(this.RemoteActionCompatParcelizer, Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), this.read}, 2)));
        toMagicModuleMetaRepoModel.write(uri);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        toMagicModuleMetaRepoModel.write(builderBuildUpon);
        String strWrite = buildInitializationData.AudioAttributesCompatParcelizer.write();
        newEncryptedObject newencryptedobject2 = AacUtil.AudioAttributesCompatParcelizer;
        String str = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder();
        sb.append(DefaultAudioSink.read.write());
        sb.append('/');
        sb.append(str);
        builderBuildUpon.appendQueryParameter(strWrite, sb.toString());
        return builderBuildUpon.build().toString();
    }
}
