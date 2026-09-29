package com.marrow.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.getProvider;
import kotlin.isMidrowCtrlCode;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
public final class SystemDevicePlugInReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        toMagicModuleMetaRepoModel.write(context, "");
        if ((intent != null ? intent.getAction() : null) == null) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("connected", false);
        isMidrowCtrlCode.Companion companion = isMidrowCtrlCode.INSTANCE;
        getProvider.getInstance(context).AudioAttributesCompatParcelizer(isMidrowCtrlCode.Companion.read(booleanExtra));
    }
}
