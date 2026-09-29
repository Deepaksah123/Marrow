package kotlin;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.marrow.R;
import kotlin.AbstractC0251zzar;
import kotlin.AbstractC0252zzas;
import kotlin.getUvm;

/* JADX INFO: loaded from: classes4.dex */
public final class setUserVerificationMethod extends RecyclerView.onMediaButtonEvent {
    private final hasValidSampleQueueIndex IconCompatParcelizer;
    private final getUvm.AudioAttributesCompatParcelizer read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setUserVerificationMethod(hasValidSampleQueueIndex hasvalidsamplequeueindex, getUvm.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        super(hasvalidsamplequeueindex.IconCompatParcelizer());
        toMagicModuleMetaRepoModel.write(hasvalidsamplequeueindex, "");
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.IconCompatParcelizer = hasvalidsamplequeueindex;
        this.read = audioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(setUserVerificationMethod setuserverificationmethod, AbstractC0251zzar.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        setuserverificationmethod.read.RemoteActionCompatParcelizer(new AbstractC0252zzas.MediaBrowserCompatItemReceiver(mediaBrowserCompatCustomActionResultReceiver.read(), mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer()));
    }

    public final void read(final AbstractC0251zzar.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatCustomActionResultReceiver, "");
        this.IconCompatParcelizer.write.setOnClickListener(new View.OnClickListener() { // from class: o.UvmEntryBuilder
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setUserVerificationMethod.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, mediaBrowserCompatCustomActionResultReceiver);
            }
        });
        this.IconCompatParcelizer.MediaBrowserCompatItemReceiver.setText(mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer());
        ShapeableImageView shapeableImageView = this.IconCompatParcelizer.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(shapeableImageView, "");
        CmcdHeadersFactoryCmcdSessionBuilder.read(shapeableImageView, mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(), false);
        this.IconCompatParcelizer.RemoteActionCompatParcelizer.setMax(mediaBrowserCompatCustomActionResultReceiver.write());
        this.IconCompatParcelizer.RemoteActionCompatParcelizer.setProgress(mediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer());
        int iAudioAttributesCompatParcelizer = mediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer();
        int iWrite = mediaBrowserCompatCustomActionResultReceiver.write();
        String string = this.itemView.getContext().getString(R.string.qbank_modules);
        StringBuilder sb = new StringBuilder();
        sb.append(iAudioAttributesCompatParcelizer);
        sb.append("/");
        sb.append(iWrite);
        sb.append(" ");
        sb.append(string);
        String string2 = sb.toString();
        ImageView imageView = this.IconCompatParcelizer.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        imageView.setVisibility(mediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer() == mediaBrowserCompatCustomActionResultReceiver.write() ? 0 : 8);
        this.IconCompatParcelizer.IconCompatParcelizer.setText(string2);
    }
}
