package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class SimpleBasePlayer$$ExternalSyntheticLambda19 implements ListenerSet.Event {
    public static int IconCompatParcelizer;
    public static int RemoteActionCompatParcelizer;
    public final /* synthetic */ SimpleBasePlayer.State f$0;

    public /* synthetic */ SimpleBasePlayer$$ExternalSyntheticLambda19(SimpleBasePlayer.State state) {
        this.f$0 = state;
    }

    public static int RemoteActionCompatParcelizer() {
        int i = IconCompatParcelizer;
        int i2 = i % 9789823;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        RemoteActionCompatParcelizer = iMaxMemory;
        return iMaxMemory;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        ((Player.Listener) obj).onMetadata(this.f$0.timedMetadata);
    }
}
