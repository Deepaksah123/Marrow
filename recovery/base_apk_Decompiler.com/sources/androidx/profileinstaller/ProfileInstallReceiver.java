package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import kotlin.ObjectIdWriter;
import kotlin.getValueClassBoxConverter;
import kotlin.getValueClassReturnType;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                getValueClassBoxConverter.RemoteActionCompatParcelizer(context, new ObjectIdWriter(), new AudioAttributesCompatParcelizer());
                return;
            }
            if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        getValueClassBoxConverter.read(context, new ObjectIdWriter(), new AudioAttributesCompatParcelizer());
                        return;
                    } else {
                        if ("DELETE_SKIP_FILE".equals(string)) {
                            getValueClassBoxConverter.write(context, new ObjectIdWriter(), new AudioAttributesCompatParcelizer());
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                read(new AudioAttributesCompatParcelizer());
                return;
            }
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();
            if ("DROP_SHADER_CACHE".equals(string2)) {
                getValueClassReturnType.AudioAttributesCompatParcelizer(context, audioAttributesCompatParcelizer);
            } else {
                audioAttributesCompatParcelizer.IconCompatParcelizer(16, null);
            }
        }
    }

    private static void read(getValueClassBoxConverter.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        Process.sendSignal(Process.myPid(), 10);
        remoteActionCompatParcelizer.IconCompatParcelizer(12, null);
    }

    public class AudioAttributesCompatParcelizer implements getValueClassBoxConverter.RemoteActionCompatParcelizer {
        AudioAttributesCompatParcelizer() {
        }

        @Override // o.getValueClassBoxConverter.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer(int i, Object obj) {
            getValueClassBoxConverter.IconCompatParcelizer.RemoteActionCompatParcelizer(i, obj);
        }

        @Override // o.getValueClassBoxConverter.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(int i, Object obj) {
            getValueClassBoxConverter.IconCompatParcelizer.IconCompatParcelizer(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }
    }
}
