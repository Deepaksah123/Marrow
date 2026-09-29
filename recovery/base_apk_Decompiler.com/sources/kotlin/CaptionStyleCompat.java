package kotlin;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CaptionStyleCompat extends dpToPx implements View.OnClickListener, setFinalStreamEndPositionUs {
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public CaptionStyleCompat(View view) {
        super(view);
    }

    public final Context onSkipToNext() {
        return this.itemView.getContext();
    }

    private Resources AudioAttributesCompatParcelizer() {
        return onSkipToNext().getResources();
    }

    private String write(int i) {
        return AudioAttributesCompatParcelizer().getString(R.string.bullet_string);
    }

    private String AudioAttributesCompatParcelizer(int i, Object... objArr) {
        return AudioAttributesCompatParcelizer().getString(i, objArr);
    }

    @Override // kotlin.setFinalStreamEndPositionUs
    public final String MediaBrowserCompatItemReceiver() {
        return write(R.string.bullet_string);
    }

    @Override // kotlin.setFinalStreamEndPositionUs
    public final String RemoteActionCompatParcelizer(int i, Object... objArr) {
        return AudioAttributesCompatParcelizer(i, objArr);
    }
}
