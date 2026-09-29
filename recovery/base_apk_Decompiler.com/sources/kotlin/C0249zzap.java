package kotlin;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.AbstractC0251zzar;
import kotlin.AbstractC0252zzas;
import kotlin.getUvm;

/* JADX INFO: renamed from: o.zzap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0249zzap extends RecyclerView.onMediaButtonEvent {
    private final getTrackTypeScore IconCompatParcelizer;
    private final getUvm.AudioAttributesCompatParcelizer write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0249zzap(getTrackTypeScore gettracktypescore, getUvm.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        super(gettracktypescore.IconCompatParcelizer());
        toMagicModuleMetaRepoModel.write(gettracktypescore, "");
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.IconCompatParcelizer = gettracktypescore;
        this.write = audioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(AbstractC0251zzar.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
        toMagicModuleMetaRepoModel.write(audioAttributesImplBaseParcelizer, "");
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.zzao
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0249zzap.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(audioAttributesImplBaseParcelizer.read(), Boolean.TRUE)) {
            this.IconCompatParcelizer.read.setText(audioAttributesImplBaseParcelizer.write());
            this.IconCompatParcelizer.read.setVisibility(0);
            this.IconCompatParcelizer.IconCompatParcelizer.setVisibility(0);
        } else {
            this.IconCompatParcelizer.read.setVisibility(4);
            this.IconCompatParcelizer.IconCompatParcelizer.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(C0249zzap c0249zzap) {
        c0249zzap.write.RemoteActionCompatParcelizer(AbstractC0252zzas.RatingCompat.INSTANCE);
    }
}
