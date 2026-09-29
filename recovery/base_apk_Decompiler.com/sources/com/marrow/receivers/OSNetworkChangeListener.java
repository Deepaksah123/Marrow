package com.marrow.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.getProvider;
import kotlin.isServiceSwitchCommand;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
public final class OSNetworkChangeListener extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        toMagicModuleMetaRepoModel.write(context, "");
        getProvider getprovider = getProvider.getInstance(context);
        isServiceSwitchCommand.Companion companion = isServiceSwitchCommand.INSTANCE;
        getprovider.AudioAttributesCompatParcelizer(isServiceSwitchCommand.Companion.AudioAttributesCompatParcelizer());
    }
}
