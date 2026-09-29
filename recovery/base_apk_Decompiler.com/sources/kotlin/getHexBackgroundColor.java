package kotlin;

import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;

/* JADX INFO: loaded from: classes4.dex */
public final class getHexBackgroundColor extends RecyclerView.onMediaButtonEvent {
    private final processLoadedPlaylist RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getHexBackgroundColor(processLoadedPlaylist processloadedplaylist) {
        super(processloadedplaylist.IconCompatParcelizer());
        toMagicModuleMetaRepoModel.write(processloadedplaylist, "");
        this.RemoteActionCompatParcelizer = processloadedplaylist;
    }

    public final void RemoteActionCompatParcelizer() {
        this.RemoteActionCompatParcelizer.write.setText(R.string.label_previous_year_test);
    }
}
