package kotlin;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import kotlin.AbstractC0251zzar;
import kotlin.AbstractC0252zzas;
import kotlin.getUvm;

/* JADX INFO: loaded from: classes4.dex */
public final class setKeyProtectionType extends RecyclerView.onMediaButtonEvent {
    private final createFakeTrackOutput IconCompatParcelizer;
    private final getUvm.AudioAttributesCompatParcelizer read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setKeyProtectionType(createFakeTrackOutput createfaketrackoutput, getUvm.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        super(createfaketrackoutput.IconCompatParcelizer());
        toMagicModuleMetaRepoModel.write(createfaketrackoutput, "");
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.IconCompatParcelizer = createfaketrackoutput;
        this.read = audioAttributesCompatParcelizer;
    }

    public final void write(final AbstractC0251zzar.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.getUserVerificationMethod
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setKeyProtectionType.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, audioAttributesCompatParcelizer);
            }
        });
        String string = this.itemView.getContext().getString(R.string.schema_syncing);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        if (audioAttributesCompatParcelizer.IconCompatParcelizer()) {
            string = this.itemView.getContext().getString(R.string.schema_count, Integer.valueOf(audioAttributesCompatParcelizer.read()));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        }
        this.IconCompatParcelizer.RemoteActionCompatParcelizer.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(setKeyProtectionType setkeyprotectiontype, AbstractC0251zzar.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        setkeyprotectiontype.read.RemoteActionCompatParcelizer(new AbstractC0252zzas.MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer));
    }
}
