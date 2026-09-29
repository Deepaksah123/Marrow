package kotlin;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import kotlin.AbstractC0251zzar;
import kotlin.AbstractC0252zzas;
import kotlin.getUvm;

/* JADX INFO: loaded from: classes4.dex */
public final class setMatcherProtectionType extends RecyclerView.onMediaButtonEvent {
    private final createTrackGroupArrayWithDrmInfo IconCompatParcelizer;
    private final getUvm.AudioAttributesCompatParcelizer write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setMatcherProtectionType(createTrackGroupArrayWithDrmInfo createtrackgrouparraywithdrminfo, getUvm.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        super(createtrackgrouparraywithdrminfo.IconCompatParcelizer());
        toMagicModuleMetaRepoModel.write(createtrackgrouparraywithdrminfo, "");
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.IconCompatParcelizer = createtrackgrouparraywithdrminfo;
        this.write = audioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(final AbstractC0251zzar.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        String string;
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatItemReceiver, "");
        this.IconCompatParcelizer.read.setOnClickListener(new View.OnClickListener() { // from class: o.zzam
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setMatcherProtectionType.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, mediaBrowserCompatItemReceiver);
            }
        });
        TextView textView = this.IconCompatParcelizer.IconCompatParcelizer;
        if (mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer() == 1) {
            string = this.itemView.getContext().getString(R.string.suggestion_continue_solving);
        } else {
            string = this.itemView.getContext().getString(R.string.suggestion_solve_next);
        }
        textView.setText(string);
        this.IconCompatParcelizer.read.setVisibility(0);
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer.setText(mediaBrowserCompatItemReceiver.read());
        if (mediaBrowserCompatItemReceiver.write() > 0) {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer.setVisibility(0);
            this.IconCompatParcelizer.RemoteActionCompatParcelizer.setMax(mediaBrowserCompatItemReceiver.IconCompatParcelizer());
            this.IconCompatParcelizer.RemoteActionCompatParcelizer.setProgress(mediaBrowserCompatItemReceiver.write());
            return;
        }
        this.IconCompatParcelizer.RemoteActionCompatParcelizer.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(setMatcherProtectionType setmatcherprotectiontype, AbstractC0251zzar.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        setmatcherprotectiontype.write.RemoteActionCompatParcelizer(new AbstractC0252zzas.MediaDescriptionCompat(mediaBrowserCompatItemReceiver));
    }
}
