package kotlin;

import com.marrow.data.models.custommodule.FilterParams;
import java.util.Iterator;
import kotlin.MarrowTheme;
import kotlin.ThemeKtExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class anchorTypeToTranslatePercent implements MarrowTheme {
    private final int RemoteActionCompatParcelizer;

    public anchorTypeToTranslatePercent(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // kotlin.MarrowTheme
    public final C0156TypeKt AudioAttributesCompatParcelizer(MarrowTheme.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0IconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer();
        ThemeKtExternalSyntheticLambda0.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatItemReceiver = themeKtExternalSyntheticLambda0IconCompatParcelizer.MediaBrowserCompatItemReceiver();
        Iterator<String> it = themeKtExternalSyntheticLambda0IconCompatParcelizer.getUrl().MediaBrowserCompatSearchResultReceiver().iterator();
        while (true) {
            if (it.hasNext()) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) it.next(), (Object) FilterParams.KEY_COURSE_ID)) {
                    break;
                }
            } else {
                iconCompatParcelizerMediaBrowserCompatItemReceiver.write(themeKtExternalSyntheticLambda0IconCompatParcelizer.getUrl().AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(FilterParams.KEY_COURSE_ID, String.valueOf(this.RemoteActionCompatParcelizer)).read());
                break;
            }
        }
        iconCompatParcelizerMediaBrowserCompatItemReceiver.IconCompatParcelizer("course-id", String.valueOf(this.RemoteActionCompatParcelizer));
        return audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iconCompatParcelizerMediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer());
    }
}
