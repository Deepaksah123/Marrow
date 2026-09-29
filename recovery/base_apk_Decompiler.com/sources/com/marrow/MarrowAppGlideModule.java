package com.marrow;

import android.content.Context;
import com.bumptech.glide.Glide;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.PendingResults;
import kotlin.ThemeKtExternalSyntheticLambda3;
import kotlin.addStatusListener;
import kotlin.getFirstMediaPeriodInfo;
import kotlin.getNalUnitType;
import kotlin.getPlatform;
import kotlin.onPlaylistMetadataChanged;
import kotlin.setLessonAuthor;
import kotlin.setMaxPlaybackSpeed;
import kotlin.setSelectionFlags;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/marrow/MarrowAppGlideModule;", "Lo/getFirstMediaPeriodInfo;", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bumptech/glide/Glide;", "p1", "Lo/setSelectionFlags;", "p2", "", "IconCompatParcelizer", "(Landroid/content/Context;Lcom/bumptech/glide/Glide;Lo/setSelectionFlags;)V", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MarrowAppGlideModule extends getFirstMediaPeriodInfo {

    public interface AudioAttributesCompatParcelizer {
        ThemeKtExternalSyntheticLambda3 MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();

        getNalUnitType onPlayFromSearch();

        getPlatform onSeekTo();
    }

    @Override // kotlin.getFollowingMediaPeriodInfo, kotlin.isLastInPeriod
    public final void IconCompatParcelizer(Context p0, Glide p1, setSelectionFlags p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        Context applicationContext = p0.getApplicationContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(applicationContext, "");
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) setLessonAuthor.write(applicationContext, AudioAttributesCompatParcelizer.class);
        p2.read(setMaxPlaybackSpeed.class, InputStream.class, new onPlaylistMetadataChanged.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()));
        p2.AudioAttributesCompatParcelizer(PendingResults.class, ByteBuffer.class, new addStatusListener.IconCompatParcelizer(audioAttributesCompatParcelizer.onPlayFromSearch(), audioAttributesCompatParcelizer.onSeekTo()));
    }
}
