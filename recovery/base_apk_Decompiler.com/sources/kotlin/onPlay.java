package kotlin;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import kotlin.onSkipToNext;

/* JADX INFO: loaded from: classes.dex */
public final class onPlay {
    private static final int AudioAttributesCompatParcelizer = Color.argb(230, 255, 255, 255);
    private static final int read = Color.argb(128, 27, 27, 27);

    public static /* synthetic */ void read(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        onSkipToNext.Companion companion = onSkipToNext.INSTANCE;
        onSkipToNext onskiptonextRemoteActionCompatParcelizer = onSkipToNext.Companion.RemoteActionCompatParcelizer(0, 0, onSkipToNext.Companion.AnonymousClass2.IconCompatParcelizer);
        onSkipToNext.Companion companion2 = onSkipToNext.INSTANCE;
        read(mediaBrowserCompatMediaItem, onskiptonextRemoteActionCompatParcelizer, onSkipToNext.Companion.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer, read, onSkipToNext.Companion.AnonymousClass2.IconCompatParcelizer));
    }

    public static final void read(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, onSkipToNext onskiptonext, onSkipToNext onskiptonext2) {
        onPlayFromUri onplayfromuri;
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        toMagicModuleMetaRepoModel.write(onskiptonext, "");
        toMagicModuleMetaRepoModel.write(onskiptonext2, "");
        View decorView = mediaBrowserCompatMediaItem.getWindow().getDecorView();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(decorView, "");
        getAnswerMap<Resources, Boolean> getanswermapWrite = onskiptonext.write();
        Resources resources = decorView.getResources();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(resources, "");
        boolean zBooleanValue = getanswermapWrite.invoke(resources).booleanValue();
        getAnswerMap<Resources, Boolean> getanswermapWrite2 = onskiptonext2.write();
        Resources resources2 = decorView.getResources();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(resources2, "");
        boolean zBooleanValue2 = getanswermapWrite2.invoke(resources2).booleanValue();
        if (Build.VERSION.SDK_INT >= 30) {
            onplayfromuri = new onPrepare();
        } else {
            onplayfromuri = new onPlayFromUri();
        }
        onPrepareFromUri onpreparefromuri = onplayfromuri;
        Window window = mediaBrowserCompatMediaItem.getWindow();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(window, "");
        onpreparefromuri.read(onskiptonext, onskiptonext2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = mediaBrowserCompatMediaItem.getWindow();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(window2, "");
        onpreparefromuri.read(window2);
    }
}
