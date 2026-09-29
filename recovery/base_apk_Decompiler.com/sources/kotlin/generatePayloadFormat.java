package kotlin;

import com.marrow.data.models.custommodule.FilterParams;
import java.io.IOException;
import java.util.Iterator;
import kotlin.MarrowTheme;
import kotlin.ThemeKtExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class generatePayloadFormat implements MarrowTheme {
    private getStreamPositionUsForContent write;

    @setSdkPayload
    public generatePayloadFormat(getStreamPositionUsForContent getstreampositionusforcontent) {
        this.write = getstreampositionusforcontent;
    }

    @Override // kotlin.MarrowTheme
    public final C0156TypeKt AudioAttributesCompatParcelizer(MarrowTheme.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws IOException {
        ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0IconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer();
        ThemeKtExternalSyntheticLambda0.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatItemReceiver = themeKtExternalSyntheticLambda0IconCompatParcelizer.MediaBrowserCompatItemReceiver();
        int iOnRemoveQueueItem = this.write.onRemoveQueueItem();
        Iterator<String> it = themeKtExternalSyntheticLambda0IconCompatParcelizer.getUrl().MediaBrowserCompatSearchResultReceiver().iterator();
        while (true) {
            if (it.hasNext()) {
                if (parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(it.next(), FilterParams.KEY_COURSE_ID)) {
                    break;
                }
            } else {
                iconCompatParcelizerMediaBrowserCompatItemReceiver.write(themeKtExternalSyntheticLambda0IconCompatParcelizer.getUrl().AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(FilterParams.KEY_COURSE_ID, "".concat(String.valueOf(iOnRemoveQueueItem))).read());
                break;
            }
        }
        return audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iconCompatParcelizerMediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer());
    }
}
