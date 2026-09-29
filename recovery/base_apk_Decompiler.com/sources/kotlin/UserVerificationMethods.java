package kotlin;

import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import kotlin.AbstractC0251zzar;
import kotlin.AbstractC0252zzas;
import kotlin.getUvm;

/* JADX INFO: loaded from: classes4.dex */
public final class UserVerificationMethods extends RecyclerView.onMediaButtonEvent {
    private final buildTracksFromSampleStreams IconCompatParcelizer;
    private final getUvm.AudioAttributesCompatParcelizer write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserVerificationMethods(buildTracksFromSampleStreams buildtracksfromsamplestreams, getUvm.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        super(buildtracksfromsamplestreams.IconCompatParcelizer());
        toMagicModuleMetaRepoModel.write(buildtracksfromsamplestreams, "");
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.IconCompatParcelizer = buildtracksfromsamplestreams;
        this.write = audioAttributesCompatParcelizer;
    }

    public final void read(AbstractC0251zzar.IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        this.IconCompatParcelizer.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.UvmEntries
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserVerificationMethods.IconCompatParcelizer(this.IconCompatParcelizer);
            }
        });
        this.IconCompatParcelizer.write.setOnClickListener(new View.OnClickListener() { // from class: o.getUvmEntryList
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserVerificationMethods.read(this.write);
            }
        });
        CardView cardView = this.IconCompatParcelizer.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
        cardView.setVisibility(iconCompatParcelizer.RemoteActionCompatParcelizer() ? 0 : 8);
        CardView cardView2 = this.IconCompatParcelizer.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView2, "");
        cardView2.setVisibility(iconCompatParcelizer.read() ? 0 : 8);
        this.IconCompatParcelizer.read.setText(this.itemView.getContext().getResources().getQuantityString(R.plurals.qbank_plural_bookmark_count, iconCompatParcelizer.write(), Integer.valueOf(iconCompatParcelizer.write())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(UserVerificationMethods userVerificationMethods) {
        userVerificationMethods.write.RemoteActionCompatParcelizer(AbstractC0252zzas.IconCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(UserVerificationMethods userVerificationMethods) {
        userVerificationMethods.write.RemoteActionCompatParcelizer(AbstractC0252zzas.AudioAttributesCompatParcelizer.INSTANCE);
    }
}
