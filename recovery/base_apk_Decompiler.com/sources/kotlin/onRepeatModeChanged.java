package kotlin;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import kotlin.ThemeKtExternalSyntheticLambda0;
import kotlin.fromUri;
import kotlin.toDownloadInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class onRepeatModeChanged implements fromUri<InputStream>, MarrowVideoDownloadException {
    private volatile toDownloadInfo AudioAttributesCompatParcelizer;
    private final setMaxPlaybackSpeed AudioAttributesImplApi26Parcelizer;
    private fromUri.AudioAttributesCompatParcelizer<? super InputStream> IconCompatParcelizer;
    private final toDownloadInfo.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
    private ActivityAdapterModule read;
    private InputStream write;

    public onRepeatModeChanged(toDownloadInfo.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, setMaxPlaybackSpeed setmaxplaybackspeed) {
        this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = setmaxplaybackspeed;
    }

    @Override // kotlin.fromUri
    public final void write(setSampleRate setsamplerate, fromUri.AudioAttributesCompatParcelizer<? super InputStream> audioAttributesCompatParcelizer) {
        ThemeKtExternalSyntheticLambda0.IconCompatParcelizer IconCompatParcelizer = new ThemeKtExternalSyntheticLambda0.IconCompatParcelizer().IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.read());
        for (Map.Entry<String, String> entry : this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer().entrySet()) {
            IconCompatParcelizer.IconCompatParcelizer(entry.getKey(), entry.getValue());
        }
        ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0RemoteActionCompatParcelizer = IconCompatParcelizer.RemoteActionCompatParcelizer();
        this.IconCompatParcelizer = audioAttributesCompatParcelizer;
        this.AudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(themeKtExternalSyntheticLambda0RemoteActionCompatParcelizer);
        dolbyVisionStringToProfile.read(this.AudioAttributesCompatParcelizer, this);
    }

    @Override // kotlin.MarrowVideoDownloadException
    public final void read(toDownloadInfo todownloadinfo, IOException iOException) {
        this.IconCompatParcelizer.IconCompatParcelizer(iOException);
    }

    @Override // kotlin.MarrowVideoDownloadException
    public final void read(toDownloadInfo todownloadinfo, C0156TypeKt c0156TypeKt) {
        this.read = c0156TypeKt.getBody();
        if (c0156TypeKt.AudioAttributesImplApi21Parcelizer()) {
            InputStream inputStreamIconCompatParcelizer = getMediaSourceHolderUid.IconCompatParcelizer(this.read.IconCompatParcelizer(), ((ActivityAdapterModule) moveMediaSource.AudioAttributesCompatParcelizer(this.read)).read());
            this.write = inputStreamIconCompatParcelizer;
            this.IconCompatParcelizer.write(inputStreamIconCompatParcelizer);
            return;
        }
        this.IconCompatParcelizer.IconCompatParcelizer(new onSurfaceSizeChanged(c0156TypeKt.getMessage(), c0156TypeKt.getCode()));
    }

    @Override // kotlin.fromUri
    public final void read() {
        try {
            InputStream inputStream = this.write;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        ActivityAdapterModule activityAdapterModule = this.read;
        if (activityAdapterModule != null) {
            activityAdapterModule.close();
        }
        this.IconCompatParcelizer = null;
    }

    @Override // kotlin.fromUri
    public final void AudioAttributesCompatParcelizer() {
        toDownloadInfo todownloadinfo = this.AudioAttributesCompatParcelizer;
        if (todownloadinfo != null) {
            todownloadinfo.RemoteActionCompatParcelizer();
        }
    }

    @Override // kotlin.fromUri
    public final Class<InputStream> write() {
        return InputStream.class;
    }

    @Override // kotlin.fromUri
    public final onTracksChanged IconCompatParcelizer() {
        return onTracksChanged.REMOTE;
    }
}
