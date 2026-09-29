package kotlin;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class isUnBookmarked extends setMsFixedDuration {
    private byte[] AudioAttributesCompatParcelizer;

    isUnBookmarked(byte[] bArr) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("'encoded' cannot be null");
        }
        this.AudioAttributesCompatParcelizer = bArr;
    }

    private void MediaMetadataCompat() {
        synchronized (this) {
            if (this.AudioAttributesCompatParcelizer != null) {
                getHideRunner gethiderunner = new getHideRunner(this.AudioAttributesCompatParcelizer, (byte) 0);
                try {
                    setHtmlLoadListener sethtmlloadlistenerIconCompatParcelizer = gethiderunner.IconCompatParcelizer();
                    gethiderunner.close();
                    this.RemoteActionCompatParcelizer = sethtmlloadlistenerIconCompatParcelizer.AudioAttributesCompatParcelizer();
                    this.AudioAttributesCompatParcelizer = null;
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("malformed ASN.1: ");
                    sb.append(e);
                    throw new setHideRunner(sb.toString(), e);
                }
            }
        }
    }

    private byte[] MediaBrowserCompatMediaItem() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.AudioAttributesCompatParcelizer;
        }
        return bArr;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        byte[] bArrMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        if (bArrMediaBrowserCompatMediaItem != null) {
            setminimumwidthmargin.read(z, 48, bArrMediaBrowserCompatMediaItem);
        } else {
            super.MediaBrowserCompatItemReceiver().RemoteActionCompatParcelizer(setminimumwidthmargin, z);
        }
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) throws IOException {
        byte[] bArrMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        return bArrMediaBrowserCompatMediaItem != null ? setMinimumWidthMargin.RemoteActionCompatParcelizer(z, bArrMediaBrowserCompatMediaItem.length) : super.MediaBrowserCompatItemReceiver().write(z);
    }

    @Override // kotlin.setMsFixedDuration
    public final LottieRatingBar IconCompatParcelizer(int i) {
        MediaMetadataCompat();
        return super.IconCompatParcelizer(i);
    }

    @Override // kotlin.setMsFixedDuration, kotlin.setBlinkerTexts
    public final int hashCode() {
        MediaMetadataCompat();
        return super.hashCode();
    }

    @Override // kotlin.setMsFixedDuration, java.lang.Iterable
    public final Iterator<LottieRatingBar> iterator() {
        MediaMetadataCompat();
        return super.iterator();
    }

    @Override // kotlin.setMsFixedDuration
    public final int RemoteActionCompatParcelizer() {
        MediaMetadataCompat();
        return super.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setMsFixedDuration
    final InteractivePanelTextView AudioAttributesImplBaseParcelizer() {
        return ((setMsFixedDuration) MediaBrowserCompatItemReceiver()).AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.setMsFixedDuration
    final LottieRatingBarBig AudioAttributesImplApi21Parcelizer() {
        return ((setMsFixedDuration) MediaBrowserCompatItemReceiver()).AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.setMsFixedDuration
    final setIsTablet RatingCompat() {
        return ((setMsFixedDuration) MediaBrowserCompatItemReceiver()).RatingCompat();
    }

    @Override // kotlin.setMsFixedDuration
    final ResponsiveScrollView MediaBrowserCompatSearchResultReceiver() {
        return ((setMsFixedDuration) MediaBrowserCompatItemReceiver()).MediaBrowserCompatSearchResultReceiver();
    }

    @Override // kotlin.setMsFixedDuration
    final LottieRatingBar[] MediaDescriptionCompat() {
        MediaMetadataCompat();
        return super.MediaDescriptionCompat();
    }

    @Override // kotlin.setMsFixedDuration, kotlin.setMsDelay
    final setMsDelay IconCompatParcelizer() {
        MediaMetadataCompat();
        return super.IconCompatParcelizer();
    }

    @Override // kotlin.setMsFixedDuration, kotlin.setMsDelay
    final setMsDelay MediaBrowserCompatItemReceiver() {
        MediaMetadataCompat();
        return super.MediaBrowserCompatItemReceiver();
    }
}
