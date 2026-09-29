package kotlin;

import android.view.View;
import kotlin.Cea608Decoder;
import kotlin.invokeUpdateOutputInternal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class repositionVerticalCue<P extends Cea608Decoder<?, ?>> extends CaptionStyleCompat implements invokeUpdateOutputInternal {
    private P IconCompatParcelizer;

    protected View MediaBrowserCompatItemReceiver(int i) {
        return null;
    }

    public repositionVerticalCue(View view, P p) {
        super(view);
        this.IconCompatParcelizer = p;
    }

    @Override // kotlin.invokeUpdateOutputInternal
    public final void IconCompatParcelizer(final int i) {
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.createFromCaptionStyle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AudioAttributesCompatParcelizer(int i) {
        P p = this.IconCompatParcelizer;
        if (p != null) {
            p.RemoteActionCompatParcelizer(i);
        }
    }

    @Override // kotlin.invokeUpdateOutputInternal
    public final void write(int i, final invokeUpdateOutputInternal.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        View viewMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(i);
        if (viewMediaBrowserCompatItemReceiver == null) {
            return;
        }
        viewMediaBrowserCompatItemReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.AspectRatioFrameLayoutResizeMode
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                repositionVerticalCue.RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
            }
        });
    }

    static /* synthetic */ void RemoteActionCompatParcelizer(invokeUpdateOutputInternal.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        }
    }
}
