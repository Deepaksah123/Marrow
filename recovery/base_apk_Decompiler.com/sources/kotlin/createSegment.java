package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class createSegment implements getApplicationLabel {
    public final Button AudioAttributesCompatParcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final CheckBox IconCompatParcelizer;
    private final ScrollView MediaBrowserCompatItemReceiver;
    public final TextView RemoteActionCompatParcelizer;
    public final TextView read;
    public final TextView write;

    private createSegment(ScrollView scrollView, Button button, CheckBox checkBox, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.MediaBrowserCompatItemReceiver = scrollView;
        this.AudioAttributesCompatParcelizer = button;
        this.IconCompatParcelizer = checkBox;
        this.RemoteActionCompatParcelizer = textView;
        this.write = textView2;
        this.read = textView3;
        this.AudioAttributesImplBaseParcelizer = textView4;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ScrollView IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public static createSegment RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.dialog_soft_block, viewGroup, false));
    }

    private static createSegment RemoteActionCompatParcelizer(View view) {
        int i = R.id.btnSoftBlockAgree;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnSoftBlockAgree);
        if (button != null) {
            i = R.id.cbSoftBlockGuidelines;
            CheckBox checkBox = (CheckBox) getApplicationIcon.IconCompatParcelizer(view, R.id.cbSoftBlockGuidelines);
            if (checkBox != null) {
                i = R.id.tvSoftBlockBody;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSoftBlockBody);
                if (textView != null) {
                    i = R.id.tvSoftBlockHeading;
                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSoftBlockHeading);
                    if (textView2 != null) {
                        i = R.id.tvSoftBlockLegalTeam;
                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSoftBlockLegalTeam);
                        if (textView3 != null) {
                            i = R.id.tvSoftBlockNote;
                            TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSoftBlockNote);
                            if (textView4 != null) {
                                return new createSegment((ScrollView) view, button, checkBox, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
