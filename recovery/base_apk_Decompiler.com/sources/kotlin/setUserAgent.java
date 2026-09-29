package kotlin;

import android.os.Build;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import in.juspay.hyper.constants.LogSubCategory;
import java.io.IOException;
import kotlin.MarrowTheme;
import kotlin.ThemeKtExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class setUserAgent implements MarrowTheme {
    private String AudioAttributesCompatParcelizer = "496";
    private String IconCompatParcelizer;
    private String RemoteActionCompatParcelizer;
    private BundledChunkExtractor read;

    public setUserAgent(BundledChunkExtractor bundledChunkExtractor, String str, String str2) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.read = bundledChunkExtractor;
    }

    @Override // kotlin.MarrowTheme
    public final C0156TypeKt AudioAttributesCompatParcelizer(MarrowTheme.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws IOException {
        ThemeKtExternalSyntheticLambda0.IconCompatParcelizer IconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer().MediaBrowserCompatItemReceiver().IconCompatParcelizer("Dr-App", "marrow").IconCompatParcelizer("Dr-App-Version", this.AudioAttributesCompatParcelizer).IconCompatParcelizer("Dr-Dv-Ts", String.valueOf(System.currentTimeMillis())).IconCompatParcelizer("Dr-Dv", this.RemoteActionCompatParcelizer).IconCompatParcelizer("Dr-Dv-OSV", String.valueOf(Build.VERSION.SDK_INT)).IconCompatParcelizer("Dr-Platform", LogSubCategory.LifeCycle.ANDROID).IconCompatParcelizer(RtspHeaders.USER_AGENT, this.IconCompatParcelizer).IconCompatParcelizer("Dr-Dv-Model", Build.MODEL).IconCompatParcelizer("course-id", String.valueOf(this.read.onRemoveQueueItem()));
        String strAudioAttributesImplApi21Parcelizer = this.read.AudioAttributesImplApi21Parcelizer();
        String strAudioAttributesImplBaseParcelizer = this.read.AudioAttributesImplBaseParcelizer();
        if (!parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) strAudioAttributesImplApi21Parcelizer)) {
            IconCompatParcelizer.IconCompatParcelizer("Dr-Token", strAudioAttributesImplApi21Parcelizer);
        }
        if (!parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) strAudioAttributesImplBaseParcelizer)) {
            IconCompatParcelizer.IconCompatParcelizer("Dr-UID", strAudioAttributesImplBaseParcelizer);
        }
        return audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(IconCompatParcelizer.RemoteActionCompatParcelizer());
    }
}
