package kotlin;

import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.AbstractC0251zzar;
import kotlin.AbstractC0252zzas;
import kotlin.getUvm;

/* JADX INFO: loaded from: classes4.dex */
public final class UvmEntriesBuilder extends RecyclerView.onMediaButtonEvent {
    private final getUvm.AudioAttributesCompatParcelizer IconCompatParcelizer;
    private final HlsSampleStreamWrapperExternalSyntheticLambda0 read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UvmEntriesBuilder(HlsSampleStreamWrapperExternalSyntheticLambda0 hlsSampleStreamWrapperExternalSyntheticLambda0, getUvm.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        super(hlsSampleStreamWrapperExternalSyntheticLambda0.IconCompatParcelizer());
        toMagicModuleMetaRepoModel.write(hlsSampleStreamWrapperExternalSyntheticLambda0, "");
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.read = hlsSampleStreamWrapperExternalSyntheticLambda0;
        this.IconCompatParcelizer = audioAttributesCompatParcelizer;
    }

    public final void read(AbstractC0251zzar.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        HlsSampleStreamWrapperExternalSyntheticLambda0 hlsSampleStreamWrapperExternalSyntheticLambda0 = this.read;
        hlsSampleStreamWrapperExternalSyntheticLambda0.write.setOnClickListener(new View.OnClickListener() { // from class: o.addUvmEntry
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UvmEntriesBuilder.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
        });
        hlsSampleStreamWrapperExternalSyntheticLambda0.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.getKeyProtectionType
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UvmEntriesBuilder.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
        hlsSampleStreamWrapperExternalSyntheticLambda0.IconCompatParcelizer.setVisibility(0);
        CardView cardViewIconCompatParcelizer = hlsSampleStreamWrapperExternalSyntheticLambda0.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardViewIconCompatParcelizer, "");
        cardViewIconCompatParcelizer.setVisibility(remoteActionCompatParcelizer.read() ? 0 : 8);
        hlsSampleStreamWrapperExternalSyntheticLambda0.AudioAttributesCompatParcelizer.setText(remoteActionCompatParcelizer.RemoteActionCompatParcelizer());
        hlsSampleStreamWrapperExternalSyntheticLambda0.read.setText(remoteActionCompatParcelizer.write());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(UvmEntriesBuilder uvmEntriesBuilder) {
        uvmEntriesBuilder.IconCompatParcelizer.RemoteActionCompatParcelizer(AbstractC0252zzas.AudioAttributesImplApi26Parcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(UvmEntriesBuilder uvmEntriesBuilder) {
        uvmEntriesBuilder.IconCompatParcelizer.RemoteActionCompatParcelizer(AbstractC0252zzas.AudioAttributesImplApi21Parcelizer.INSTANCE);
    }
}
