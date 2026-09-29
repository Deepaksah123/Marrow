package kotlin;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class dpToPx extends RecyclerView.onMediaButtonEvent {
    private boolean read;

    public dpToPx(View view) {
        super(view);
        this.read = false;
        view.setTag(this);
    }
}
