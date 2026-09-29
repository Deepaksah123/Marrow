package kotlin;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class setAdsConfiguration extends LivePlaybackSpeedControl<InputStream> {
    @Override // kotlin.LivePlaybackSpeedControl
    protected final /* synthetic */ InputStream read(AssetManager assetManager, String str) throws IOException {
        return IconCompatParcelizer(assetManager, str);
    }

    @Override // kotlin.LivePlaybackSpeedControl
    protected final /* synthetic */ void read(InputStream inputStream) throws IOException {
        write(inputStream);
    }

    public setAdsConfiguration(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    private static InputStream IconCompatParcelizer(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }

    private static void write(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // kotlin.fromUri
    public final Class<InputStream> write() {
        return InputStream.class;
    }
}
