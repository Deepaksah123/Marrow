package kotlin;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class getInstalledPackages extends RecyclerView.onMediaButtonEvent {
    private getInstalledPackages(FrameLayout frameLayout) {
        super(frameLayout);
    }

    static getInstalledPackages read(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(InvalidTypeIdException.read());
        frameLayout.setSaveEnabled(false);
        return new getInstalledPackages(frameLayout);
    }

    final FrameLayout RemoteActionCompatParcelizer() {
        return (FrameLayout) this.itemView;
    }
}
