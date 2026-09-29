package kotlin;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setFloatsUniform {
    private static int RemoteActionCompatParcelizer = 8;
    private int AudioAttributesCompatParcelizer;
    private List<String> IconCompatParcelizer;
    private String MediaBrowserCompatCustomActionResultReceiver;
    private boolean read;
    private String write;

    public setFloatsUniform(boolean z, int i, String str, String str2, List<String> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.read = z;
        this.AudioAttributesCompatParcelizer = i;
        this.write = str;
        this.MediaBrowserCompatCustomActionResultReceiver = str2;
        this.IconCompatParcelizer = list;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final int IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String write() {
        return this.write;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final List<String> read() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static setFloatsUniform IconCompatParcelizer(boolean z, int i, String str, String str2, List<String> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        return new setFloatsUniform(false, i, str, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setFloatsUniform)) {
            return false;
        }
        setFloatsUniform setfloatsuniform = (setFloatsUniform) obj;
        return this.read == setfloatsuniform.read && this.AudioAttributesCompatParcelizer == setfloatsuniform.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) setfloatsuniform.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) setfloatsuniform.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, setfloatsuniform.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((((((Boolean.hashCode(this.read) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.write.hashCode()) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        boolean z = this.read;
        int i = this.AudioAttributesCompatParcelizer;
        String str = this.write;
        String str2 = this.MediaBrowserCompatCustomActionResultReceiver;
        List<String> list = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("GTNudgeRepoModel(showNudge=");
        sb.append(z);
        sb.append(", nudgeType=");
        sb.append(i);
        sb.append(", testId=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", body=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer(setdownloadingstatestoqueued, downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void AudioAttributesCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        if (this != this.IconCompatParcelizer) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 171);
            setBufferAttribute setbufferattribute = new setBufferAttribute();
            List<String> list = this.IconCompatParcelizer;
            sendSetRequirements.write(setdownloadingstatestoqueued, setbufferattribute, list).read(downloadHelper2, list);
        }
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 154);
        downloadHelper2.AudioAttributesCompatParcelizer(Integer.valueOf(this.AudioAttributesCompatParcelizer));
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 82);
        downloadHelper2.write(this.read);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 149);
        downloadHelper2.AudioAttributesCompatParcelizer(this.write);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 73);
        downloadHelper2.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    public /* synthetic */ setFloatsUniform() {
    }

    public final /* synthetic */ void IconCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            AudioAttributesCompatParcelizer(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void AudioAttributesCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i == 49) {
            if (!z) {
                this.write = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.write = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.write = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i == 69) {
            if (z) {
                this.read = ((Boolean) setdownloadingstatestoqueued.read(Boolean.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)).booleanValue();
                return;
            } else {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i == 72) {
            if (!z) {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
            try {
                this.AudioAttributesCompatParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                return;
            } catch (NumberFormatException e) {
                throw new getPercentDownloaded(e);
            }
        }
        if (i == 78) {
            if (z) {
                this.IconCompatParcelizer = (List) setdownloadingstatestoqueued.IconCompatParcelizer(new setBufferAttribute()).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                return;
            } else {
                this.IconCompatParcelizer = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i != 130) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return;
        }
        if (!z) {
            this.MediaBrowserCompatCustomActionResultReceiver = null;
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
            this.MediaBrowserCompatCustomActionResultReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
        } else {
            this.MediaBrowserCompatCustomActionResultReceiver = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
        }
    }
}
