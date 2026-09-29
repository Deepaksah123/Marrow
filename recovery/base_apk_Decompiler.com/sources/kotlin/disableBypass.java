package kotlin;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
final class disableBypass {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final Executor MediaBrowserCompatCustomActionResultReceiver;
    private final SharedPreferences read;
    private ArrayDeque<String> RemoteActionCompatParcelizer = new ArrayDeque<>();
    private boolean write = false;

    private disableBypass(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.read = sharedPreferences;
        this.AudioAttributesCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompatCustomActionResultReceiver = executor;
    }

    static disableBypass read(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        disableBypass disablebypass = new disableBypass(sharedPreferences, str, str2, executor);
        disablebypass.write();
        return disablebypass;
    }

    private void write() {
        synchronized (this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer.clear();
            String string = this.read.getString(this.AudioAttributesCompatParcelizer, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.IconCompatParcelizer)) {
                String[] strArrSplit = string.split(this.IconCompatParcelizer, -1);
                int length = strArrSplit.length;
                for (String str : strArrSplit) {
                    if (!TextUtils.isEmpty(str)) {
                        this.RemoteActionCompatParcelizer.add(str);
                    }
                }
            }
        }
    }

    private boolean read(boolean z) {
        if (z) {
            IconCompatParcelizer();
        }
        return z;
    }

    private void IconCompatParcelizer() {
        this.MediaBrowserCompatCustomActionResultReceiver.execute(new Runnable() { // from class: o.codecNeedsSosFlushWorkaround
            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer() {
        synchronized (this.RemoteActionCompatParcelizer) {
            this.read.edit().putString(this.AudioAttributesCompatParcelizer, read()).commit();
        }
    }

    private String read() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.IconCompatParcelizer);
        }
        return sb.toString();
    }

    public final boolean RemoteActionCompatParcelizer(Object obj) {
        boolean z;
        synchronized (this.RemoteActionCompatParcelizer) {
            z = read(this.RemoteActionCompatParcelizer.remove(obj));
        }
        return z;
    }

    public final String RemoteActionCompatParcelizer() {
        String strPeek;
        synchronized (this.RemoteActionCompatParcelizer) {
            strPeek = this.RemoteActionCompatParcelizer.peek();
        }
        return strPeek;
    }
}
