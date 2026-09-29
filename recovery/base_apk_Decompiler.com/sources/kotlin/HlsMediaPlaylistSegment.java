package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMediaPlaylistSegment implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    private View IconCompatParcelizer;
    public final TextView RemoteActionCompatParcelizer;
    private final ConstraintLayout read;
    public final TextView write;

    private HlsMediaPlaylistSegment(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, View view) {
        this.read = constraintLayout;
        this.RemoteActionCompatParcelizer = textView;
        this.AudioAttributesCompatParcelizer = textView2;
        this.write = textView3;
        this.IconCompatParcelizer = view;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.read;
    }

    public static HlsMediaPlaylistSegment read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.view_other_modules, viewGroup, false));
    }

    private static HlsMediaPlaylistSegment RemoteActionCompatParcelizer(View view) {
        int i = R.id.tvExpiringSoonText;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvExpiringSoonText);
        if (textView != null) {
            i = R.id.tvModuleExpiryTill;
            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvModuleExpiryTill);
            if (textView2 != null) {
                i = R.id.tvSubjectModuleTitle;
                TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubjectModuleTitle);
                if (textView3 != null) {
                    i = R.id.viewSubjectDivider;
                    View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.viewSubjectDivider);
                    if (viewIconCompatParcelizer != null) {
                        return new HlsMediaPlaylistSegment((ConstraintLayout) view, textView, textView2, textView3, viewIconCompatParcelizer);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
