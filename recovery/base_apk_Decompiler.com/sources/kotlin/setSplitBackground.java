package kotlin;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class setSplitBackground implements setTransitioning {
    @Override // kotlin.setTransitioning
    public void RemoteActionCompatParcelizer() {
    }

    @Override // kotlin.setTransitioning
    public void IconCompatParcelizer(setStackedBackground setstackedbackground, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        setstackedbackground.read(new ActionBarOverlayLayout(colorStateList, f));
        View viewWrite = setstackedbackground.write();
        viewWrite.setClipToOutline(true);
        viewWrite.setElevation(f2);
        read(setstackedbackground, f3);
    }

    @Override // kotlin.setTransitioning
    public void write(setStackedBackground setstackedbackground, float f) {
        MediaBrowserCompatCustomActionResultReceiver(setstackedbackground).IconCompatParcelizer(f);
    }

    @Override // kotlin.setTransitioning
    public void read(setStackedBackground setstackedbackground, float f) {
        MediaBrowserCompatCustomActionResultReceiver(setstackedbackground).write(f, setstackedbackground.IconCompatParcelizer(), setstackedbackground.read());
        AudioAttributesImplBaseParcelizer(setstackedbackground);
    }

    @Override // kotlin.setTransitioning
    public float AudioAttributesCompatParcelizer(setStackedBackground setstackedbackground) {
        return MediaBrowserCompatCustomActionResultReceiver(setstackedbackground).write();
    }

    @Override // kotlin.setTransitioning
    public float IconCompatParcelizer(setStackedBackground setstackedbackground) {
        return AudioAttributesImplApi26Parcelizer(setstackedbackground) * 2.0f;
    }

    @Override // kotlin.setTransitioning
    public float RemoteActionCompatParcelizer(setStackedBackground setstackedbackground) {
        return AudioAttributesImplApi26Parcelizer(setstackedbackground) * 2.0f;
    }

    @Override // kotlin.setTransitioning
    public float AudioAttributesImplApi26Parcelizer(setStackedBackground setstackedbackground) {
        return MediaBrowserCompatCustomActionResultReceiver(setstackedbackground).AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.setTransitioning
    public void RemoteActionCompatParcelizer(setStackedBackground setstackedbackground, float f) {
        setstackedbackground.write().setElevation(f);
    }

    @Override // kotlin.setTransitioning
    public float write(setStackedBackground setstackedbackground) {
        return setstackedbackground.write().getElevation();
    }

    @Override // kotlin.setTransitioning
    public void AudioAttributesImplBaseParcelizer(setStackedBackground setstackedbackground) {
        if (!setstackedbackground.IconCompatParcelizer()) {
            setstackedbackground.write(0, 0, 0, 0);
            return;
        }
        float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(setstackedbackground);
        float fAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(setstackedbackground);
        int iCeil = (int) Math.ceil(C0205setSubtitle.AudioAttributesCompatParcelizer(fAudioAttributesCompatParcelizer, fAudioAttributesImplApi26Parcelizer, setstackedbackground.read()));
        int iCeil2 = (int) Math.ceil(C0205setSubtitle.read(fAudioAttributesCompatParcelizer, fAudioAttributesImplApi26Parcelizer, setstackedbackground.read()));
        setstackedbackground.write(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // kotlin.setTransitioning
    public void AudioAttributesImplApi21Parcelizer(setStackedBackground setstackedbackground) {
        read(setstackedbackground, AudioAttributesCompatParcelizer(setstackedbackground));
    }

    @Override // kotlin.setTransitioning
    public void MediaBrowserCompatItemReceiver(setStackedBackground setstackedbackground) {
        read(setstackedbackground, AudioAttributesCompatParcelizer(setstackedbackground));
    }

    @Override // kotlin.setTransitioning
    public void AudioAttributesCompatParcelizer(setStackedBackground setstackedbackground, ColorStateList colorStateList) {
        MediaBrowserCompatCustomActionResultReceiver(setstackedbackground).RemoteActionCompatParcelizer(colorStateList);
    }

    @Override // kotlin.setTransitioning
    public ColorStateList read(setStackedBackground setstackedbackground) {
        return MediaBrowserCompatCustomActionResultReceiver(setstackedbackground).read();
    }

    private ActionBarOverlayLayout MediaBrowserCompatCustomActionResultReceiver(setStackedBackground setstackedbackground) {
        return (ActionBarOverlayLayout) setstackedbackground.RemoteActionCompatParcelizer();
    }
}
