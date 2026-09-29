package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getTrackSelection implements getApplicationLabel {
    public final HlsTrackMetadataEntryVariantInfo1 AudioAttributesCompatParcelizer;
    private ConstraintLayout AudioAttributesImplApi21Parcelizer;
    private final ConstraintLayout AudioAttributesImplApi26Parcelizer;
    public final MediaParserHlsMediaChunkExtractor IconCompatParcelizer;
    private LinearLayout MediaBrowserCompatItemReceiver;
    public final MediaParserHlsMediaChunkExtractorPeekingInputReader RemoteActionCompatParcelizer;
    public final MediaParserHlsMediaChunkExtractorExternalSyntheticLambda0 read;
    public final ScrollView write;

    private getTrackSelection(ConstraintLayout constraintLayout, LinearLayout linearLayout, HlsTrackMetadataEntryVariantInfo1 hlsTrackMetadataEntryVariantInfo1, ConstraintLayout constraintLayout2, MediaParserHlsMediaChunkExtractor mediaParserHlsMediaChunkExtractor, MediaParserHlsMediaChunkExtractorPeekingInputReader mediaParserHlsMediaChunkExtractorPeekingInputReader, ScrollView scrollView, MediaParserHlsMediaChunkExtractorExternalSyntheticLambda0 mediaParserHlsMediaChunkExtractorExternalSyntheticLambda0) {
        this.AudioAttributesImplApi26Parcelizer = constraintLayout;
        this.MediaBrowserCompatItemReceiver = linearLayout;
        this.AudioAttributesCompatParcelizer = hlsTrackMetadataEntryVariantInfo1;
        this.AudioAttributesImplApi21Parcelizer = constraintLayout2;
        this.IconCompatParcelizer = mediaParserHlsMediaChunkExtractor;
        this.RemoteActionCompatParcelizer = mediaParserHlsMediaChunkExtractorPeekingInputReader;
        this.write = scrollView;
        this.read = mediaParserHlsMediaChunkExtractorExternalSyntheticLambda0;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public static getTrackSelection read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_notes_purchase_landing, viewGroup, false));
    }

    private static getTrackSelection AudioAttributesCompatParcelizer(View view) {
        int i = R.id.bottom_bar_container;
        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.bottom_bar_container);
        if (linearLayout != null) {
            i = R.id.bottomHalfLayout;
            View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.bottomHalfLayout);
            if (viewIconCompatParcelizer != null) {
                HlsTrackMetadataEntryVariantInfo1 hlsTrackMetadataEntryVariantInfo1IconCompatParcelizer = HlsTrackMetadataEntryVariantInfo1.IconCompatParcelizer(viewIconCompatParcelizer);
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.plan_purchase_allowed_bottom_bar;
                View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.plan_purchase_allowed_bottom_bar);
                if (viewIconCompatParcelizer2 != null) {
                    MediaParserHlsMediaChunkExtractor mediaParserHlsMediaChunkExtractorRemoteActionCompatParcelizer = MediaParserHlsMediaChunkExtractor.RemoteActionCompatParcelizer(viewIconCompatParcelizer2);
                    i = R.id.plan_purchase_denied_bottom_bar;
                    View viewIconCompatParcelizer3 = getApplicationIcon.IconCompatParcelizer(view, R.id.plan_purchase_denied_bottom_bar);
                    if (viewIconCompatParcelizer3 != null) {
                        MediaParserHlsMediaChunkExtractorPeekingInputReader mediaParserHlsMediaChunkExtractorPeekingInputReaderWrite = MediaParserHlsMediaChunkExtractorPeekingInputReader.write(viewIconCompatParcelizer3);
                        i = R.id.scrollable_content;
                        ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.scrollable_content);
                        if (scrollView != null) {
                            i = R.id.topHalfLayout;
                            View viewIconCompatParcelizer4 = getApplicationIcon.IconCompatParcelizer(view, R.id.topHalfLayout);
                            if (viewIconCompatParcelizer4 != null) {
                                return new getTrackSelection(constraintLayout, linearLayout, hlsTrackMetadataEntryVariantInfo1IconCompatParcelizer, constraintLayout, mediaParserHlsMediaChunkExtractorRemoteActionCompatParcelizer, mediaParserHlsMediaChunkExtractorPeekingInputReaderWrite, scrollView, MediaParserHlsMediaChunkExtractorExternalSyntheticLambda0.AudioAttributesCompatParcelizer(viewIconCompatParcelizer4));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
