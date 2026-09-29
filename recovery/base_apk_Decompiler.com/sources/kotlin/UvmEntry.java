package kotlin;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.AbstractC0252zzas;
import kotlin.getUvm;

/* JADX INFO: loaded from: classes4.dex */
public final class UvmEntry extends RecyclerView.onMediaButtonEvent {
    private final createSampleQueue AudioAttributesCompatParcelizer;
    private final getUvm.AudioAttributesCompatParcelizer write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UvmEntry(createSampleQueue createsamplequeue, getUvm.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        super(createsamplequeue.IconCompatParcelizer());
        toMagicModuleMetaRepoModel.write(createsamplequeue, "");
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.AudioAttributesCompatParcelizer = createsamplequeue;
        this.write = audioAttributesCompatParcelizer;
    }

    public final void read() {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer().setOnClickListener(new View.OnClickListener() { // from class: o.getMatcherProtectionType
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UvmEntry.AudioAttributesCompatParcelizer(this.write);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(UvmEntry uvmEntry) {
        uvmEntry.write.RemoteActionCompatParcelizer(AbstractC0252zzas.AudioAttributesImplBaseParcelizer.INSTANCE);
    }
}
