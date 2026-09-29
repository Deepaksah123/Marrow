package kotlin;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class setAdTagUri extends LivePlaybackSpeedControl<AssetFileDescriptor> {
    @Override // kotlin.LivePlaybackSpeedControl
    protected final /* synthetic */ AssetFileDescriptor read(AssetManager assetManager, String str) throws IOException {
        return AudioAttributesCompatParcelizer(assetManager, str);
    }

    @Override // kotlin.LivePlaybackSpeedControl
    protected final /* synthetic */ void read(AssetFileDescriptor assetFileDescriptor) throws IOException {
        IconCompatParcelizer(assetFileDescriptor);
    }

    public setAdTagUri(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    private static AssetFileDescriptor AudioAttributesCompatParcelizer(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }

    private static void IconCompatParcelizer(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // kotlin.fromUri
    public final Class<AssetFileDescriptor> write() {
        return AssetFileDescriptor.class;
    }
}
