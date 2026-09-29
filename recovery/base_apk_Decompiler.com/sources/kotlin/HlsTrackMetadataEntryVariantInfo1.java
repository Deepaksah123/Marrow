package kotlin;

import android.view.View;
import android.widget.LinearLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsTrackMetadataEntryVariantInfo1 implements getApplicationLabel {
    public final MediaParserHlsMediaChunkExtractor1 AudioAttributesCompatParcelizer;
    private getSampleAndTrimBuffer IconCompatParcelizer;
    private LinearLayout RemoteActionCompatParcelizer;
    private final LinearLayout read;

    private HlsTrackMetadataEntryVariantInfo1(LinearLayout linearLayout, getSampleAndTrimBuffer getsampleandtrimbuffer, MediaParserHlsMediaChunkExtractor1 mediaParserHlsMediaChunkExtractor1, LinearLayout linearLayout2) {
        this.read = linearLayout;
        this.IconCompatParcelizer = getsampleandtrimbuffer;
        this.AudioAttributesCompatParcelizer = mediaParserHlsMediaChunkExtractor1;
        this.RemoteActionCompatParcelizer = linearLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.read;
    }

    public static HlsTrackMetadataEntryVariantInfo1 IconCompatParcelizer(View view) {
        int i = R.id.description_section;
        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.description_section);
        if (viewIconCompatParcelizer != null) {
            getSampleAndTrimBuffer getsampleandtrimbufferIconCompatParcelizer = getSampleAndTrimBuffer.IconCompatParcelizer(viewIconCompatParcelizer);
            View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.gallery_section);
            if (viewIconCompatParcelizer2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new HlsTrackMetadataEntryVariantInfo1(linearLayout, getsampleandtrimbufferIconCompatParcelizer, MediaParserHlsMediaChunkExtractor1.RemoteActionCompatParcelizer(viewIconCompatParcelizer2), linearLayout);
            }
            i = R.id.gallery_section;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
