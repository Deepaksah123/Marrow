package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class buildCurrentLine extends handlePreambleAddressCode {
    public abstract void AudioAttributesCompatParcelizer(int i, String str);

    public static Intent write(int i, String str) {
        Intent intent = new Intent("TimelineUpdateReceiver");
        intent.putExtra("seconds", i);
        intent.putExtra("source", str);
        return intent;
    }

    @Override // kotlin.handlePreambleAddressCode
    public final IntentFilter AudioAttributesCompatParcelizer() {
        return new IntentFilter("TimelineUpdateReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"TimelineUpdateReceiver".equals(intent.getAction())) {
            return;
        }
        AudioAttributesCompatParcelizer(intent.getIntExtra("seconds", 0), intent.getStringExtra("source"));
    }
}
