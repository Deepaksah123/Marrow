package kotlin;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
final class ExoPlayerBuilderExternalSyntheticLambda13 extends isAnnotationBundle implements allocReadIOBuffer {
    private final InputAccessor IconCompatParcelizer;
    private final write RemoteActionCompatParcelizer;
    private final Drawable write;

    public final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[tryToResolveUnresolved.values().length];
            iArr[tryToResolveUnresolved.write.ordinal()] = 1;
            iArr[tryToResolveUnresolved.RemoteActionCompatParcelizer.ordinal()] = 2;
            IconCompatParcelizer = iArr;
        }
    }

    public ExoPlayerBuilderExternalSyntheticLambda13(Drawable drawable) {
        toMagicModuleMetaRepoModel.write(drawable, "");
        this.write = drawable;
        this.IconCompatParcelizer = available.RemoteActionCompatParcelizer$default(0, null, 2, null);
        this.RemoteActionCompatParcelizer = new write();
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int RemoteActionCompatParcelizer() {
        return ((Number) this.IconCompatParcelizer.getRemoteActionCompatParcelizer()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(int i) {
        this.IconCompatParcelizer.write(Integer.valueOf(i));
    }

    public static final class write implements Drawable.Callback {
        write() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            toMagicModuleMetaRepoModel.write(drawable, "");
            ExoPlayerBuilderExternalSyntheticLambda13 exoPlayerBuilderExternalSyntheticLambda13 = ExoPlayerBuilderExternalSyntheticLambda13.this;
            exoPlayerBuilderExternalSyntheticLambda13.read(exoPlayerBuilderExternalSyntheticLambda13.RemoteActionCompatParcelizer() + 1);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            toMagicModuleMetaRepoModel.write(drawable, "");
            toMagicModuleMetaRepoModel.write(runnable, "");
            ExoPlayerBuilderExternalSyntheticLambda11.write().postAtTime(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            toMagicModuleMetaRepoModel.write(drawable, "");
            toMagicModuleMetaRepoModel.write(runnable, "");
            ExoPlayerBuilderExternalSyntheticLambda11.write().removeCallbacks(runnable);
        }
    }

    @Override // kotlin.isAnnotationBundle
    /* JADX INFO: renamed from: read */
    public final long getRead() {
        return allocCharBuffer.IconCompatParcelizer(this.write.getIntrinsicWidth(), this.write.getIntrinsicHeight());
    }

    @Override // kotlin.allocReadIOBuffer
    public final void o_() {
        this.write.setCallback(this.RemoteActionCompatParcelizer);
        this.write.setVisible(true, true);
        Object obj = this.write;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // kotlin.allocReadIOBuffer
    public final void IconCompatParcelizer() {
        Object obj = this.write;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.write.setVisible(false, false);
        this.write.setCallback(null);
    }

    @Override // kotlin.allocReadIOBuffer
    public final void AudioAttributesCompatParcelizer() {
        IconCompatParcelizer();
    }

    @Override // kotlin.isAnnotationBundle
    public final boolean read(float f) {
        this.write.setAlpha(getQues.write(getOnline.RemoteActionCompatParcelizer(f * 255.0f), 0, 255));
        return true;
    }

    @Override // kotlin.isAnnotationBundle
    public final boolean write(switchAndReturnNext switchandreturnnext) {
        this.write.setColorFilter(switchandreturnnext == null ? null : releaseCharBuffer.RemoteActionCompatParcelizer(switchandreturnnext));
        return true;
    }

    @Override // kotlin.isAnnotationBundle
    public final boolean RemoteActionCompatParcelizer(tryToResolveUnresolved trytoresolveunresolved) {
        toMagicModuleMetaRepoModel.write(trytoresolveunresolved, "");
        Drawable drawable = this.write;
        int i = AudioAttributesCompatParcelizer.IconCompatParcelizer[trytoresolveunresolved.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new RenewEligibleCreator();
        }
        return drawable.setLayoutDirection(i2);
    }

    @Override // kotlin.isAnnotationBundle
    public final void read(findSetterInfo findsetterinfo) {
        toMagicModuleMetaRepoModel.write(findsetterinfo, "");
        JsonParserDelegate jsonParserDelegateIconCompatParcelizer = findsetterinfo.getIconCompatParcelizer().IconCompatParcelizer();
        RemoteActionCompatParcelizer();
        this.write.setBounds(0, 0, getOnline.RemoteActionCompatParcelizer(calloc.AudioAttributesCompatParcelizer(findsetterinfo.MediaBrowserCompatCustomActionResultReceiver())), getOnline.RemoteActionCompatParcelizer(calloc.RemoteActionCompatParcelizer(findsetterinfo.MediaBrowserCompatCustomActionResultReceiver())));
        try {
            jsonParserDelegateIconCompatParcelizer.IconCompatParcelizer();
            this.write.draw(balloc.RemoteActionCompatParcelizer(jsonParserDelegateIconCompatParcelizer));
        } finally {
            jsonParserDelegateIconCompatParcelizer.AudioAttributesCompatParcelizer();
        }
    }
}
