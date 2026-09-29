package com.marrow.di.fragment;

import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.SimpleExoPlayer;
import kotlin.ExoplayerCuesDecoder;
import kotlin.Metadata;
import kotlin.getCurrentEventTimeUs;
import kotlin.getLineAnchor;
import kotlin.getSaveProfileModel;
import kotlin.setAllowVideoMixedMimeTypeAdaptiveness$IconCompatParcelizer;
import kotlin.setLine;
import kotlin.setRcToken;
import kotlin.setWindowColor;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00172\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0019J\u0015\u0010\u0012\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/marrow/di/fragment/FragmentPresenterModule;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "p0", "Lo/getLineAnchor$write;", "RemoteActionCompatParcelizer", "(Landroidx/fragment/app/Fragment;)Lo/getLineAnchor$write;", "Lo/setLine;", "Lo/getLineAnchor$AudioAttributesCompatParcelizer;", "read", "(Lo/setLine;)Lo/getLineAnchor$AudioAttributesCompatParcelizer;", "Lo/setWindowColor$IconCompatParcelizer;", "IconCompatParcelizer", "(Landroidx/fragment/app/Fragment;)Lo/setWindowColor$IconCompatParcelizer;", "Lo/ExoplayerCuesDecoder;", "Lo/setWindowColor$AudioAttributesCompatParcelizer;", "AudioAttributesCompatParcelizer", "(Lo/ExoplayerCuesDecoder;)Lo/setWindowColor$AudioAttributesCompatParcelizer;", "Lo/getSaveProfileModel$write;", "write", "(Landroidx/fragment/app/Fragment;)Lo/getSaveProfileModel$write;", "Lo/setRcToken;", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "(Landroidx/fragment/app/Fragment;)Lo/setRcToken;", "Lo/setAllowVideoMixedMimeTypeAdaptiveness$IconCompatParcelizer;", "(Landroidx/fragment/app/Fragment;)Lo/setAllowVideoMixedMimeTypeAdaptiveness$IconCompatParcelizer;", "Lo/getCurrentEventTimeUs;", "Lo/getSaveProfileModel$IconCompatParcelizer;", "AudioAttributesCompatParcelizer$5c3f6e8c", "(Lo/getCurrentEventTimeUs;)Lo/getSaveProfileModel$IconCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FragmentPresenterModule {
    public static final FragmentPresenterModule INSTANCE = new FragmentPresenterModule();

    private FragmentPresenterModule() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final getLineAnchor.write RemoteActionCompatParcelizer(Fragment p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (getLineAnchor.write) p0;
    }

    public final getLineAnchor.AudioAttributesCompatParcelizer read(setLine p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final setWindowColor.IconCompatParcelizer IconCompatParcelizer(Fragment p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (setWindowColor.IconCompatParcelizer) p0;
    }

    public final setWindowColor.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(ExoplayerCuesDecoder p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final getSaveProfileModel.write write(Fragment p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (getSaveProfileModel.write) p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final setRcToken<SimpleExoPlayer, Object> read(Fragment p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (setRcToken) p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final setAllowVideoMixedMimeTypeAdaptiveness$IconCompatParcelizer AudioAttributesCompatParcelizer(Fragment p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (setAllowVideoMixedMimeTypeAdaptiveness$IconCompatParcelizer) p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final getSaveProfileModel.IconCompatParcelizer AudioAttributesCompatParcelizer$5c3f6e8c(getCurrentEventTimeUs p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (getSaveProfileModel.IconCompatParcelizer) p0;
    }
}
