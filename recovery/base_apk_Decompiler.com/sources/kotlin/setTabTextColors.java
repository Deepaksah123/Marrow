package kotlin;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class setTabTextColors implements _addFields {
    public static int IconCompatParcelizer;
    public static int RemoteActionCompatParcelizer;
    private /* synthetic */ setScrollPosition AudioAttributesCompatParcelizer;

    public /* synthetic */ setTabTextColors(setScrollPosition setscrollposition) {
        this.AudioAttributesCompatParcelizer = setscrollposition;
    }

    public static int RemoteActionCompatParcelizer() {
        int i = IconCompatParcelizer;
        int i2 = i % 5106140;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        int mode = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getMode();
        RemoteActionCompatParcelizer = mode;
        return mode;
    }

    @Override // kotlin._addFields
    public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
        setScrollPosition.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, str, bundle);
    }
}
