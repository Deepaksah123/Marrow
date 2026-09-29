package kotlin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class getProvider {
    private static getProvider AudioAttributesCompatParcelizer;
    private static final Object read = new Object();
    private final Context IconCompatParcelizer;
    private final Handler write;
    private final HashMap<BroadcastReceiver, ArrayList<AudioAttributesCompatParcelizer>> AudioAttributesImplBaseParcelizer = new HashMap<>();
    private final HashMap<String, ArrayList<AudioAttributesCompatParcelizer>> RemoteActionCompatParcelizer = new HashMap<>();
    private final ArrayList<IconCompatParcelizer> MediaBrowserCompatCustomActionResultReceiver = new ArrayList<>();

    static final class AudioAttributesCompatParcelizer {
        final BroadcastReceiver AudioAttributesCompatParcelizer;
        final IntentFilter IconCompatParcelizer;
        boolean RemoteActionCompatParcelizer;
        boolean read;

        AudioAttributesCompatParcelizer(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.IconCompatParcelizer = intentFilter;
            this.AudioAttributesCompatParcelizer = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(" filter=");
            sb.append(this.IconCompatParcelizer);
            if (this.RemoteActionCompatParcelizer) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    static final class IconCompatParcelizer {
        final ArrayList<AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer;
        final Intent RemoteActionCompatParcelizer;

        IconCompatParcelizer(Intent intent, ArrayList<AudioAttributesCompatParcelizer> arrayList) {
            this.RemoteActionCompatParcelizer = intent;
            this.AudioAttributesCompatParcelizer = arrayList;
        }
    }

    public static getProvider getInstance(Context context) {
        getProvider getprovider;
        synchronized (read) {
            if (AudioAttributesCompatParcelizer == null) {
                AudioAttributesCompatParcelizer = new getProvider(context.getApplicationContext());
            }
            getprovider = AudioAttributesCompatParcelizer;
        }
        return getprovider;
    }

    private getProvider(Context context) {
        this.IconCompatParcelizer = context;
        this.write = new Handler(context.getMainLooper()) { // from class: o.getProvider.5
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what == 1) {
                    getProvider.this.write();
                } else {
                    super.handleMessage(message);
                }
            }
        };
    }

    public final void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(intentFilter, broadcastReceiver);
            ArrayList<AudioAttributesCompatParcelizer> arrayList = this.AudioAttributesImplBaseParcelizer.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.AudioAttributesImplBaseParcelizer.put(broadcastReceiver, arrayList);
            }
            arrayList.add(audioAttributesCompatParcelizer);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<AudioAttributesCompatParcelizer> arrayList2 = this.RemoteActionCompatParcelizer.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.RemoteActionCompatParcelizer.put(action, arrayList2);
                }
                arrayList2.add(audioAttributesCompatParcelizer);
            }
        }
    }

    public final void IconCompatParcelizer(BroadcastReceiver broadcastReceiver) {
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            ArrayList<AudioAttributesCompatParcelizer> arrayListRemove = this.AudioAttributesImplBaseParcelizer.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = arrayListRemove.get(size);
                audioAttributesCompatParcelizer.RemoteActionCompatParcelizer = true;
                for (int i = 0; i < audioAttributesCompatParcelizer.IconCompatParcelizer.countActions(); i++) {
                    String action = audioAttributesCompatParcelizer.IconCompatParcelizer.getAction(i);
                    ArrayList<AudioAttributesCompatParcelizer> arrayList = this.RemoteActionCompatParcelizer.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = arrayList.get(size2);
                            if (audioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer == broadcastReceiver) {
                                audioAttributesCompatParcelizer2.RemoteActionCompatParcelizer = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.RemoteActionCompatParcelizer.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final boolean AudioAttributesCompatParcelizer(Intent intent) {
        int i;
        String str;
        ArrayList arrayList;
        ArrayList<AudioAttributesCompatParcelizer> arrayList2;
        String str2;
        boolean z;
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.IconCompatParcelizer.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z2 = true;
            boolean z3 = (intent.getFlags() & 8) != 0;
            if (z3) {
                Objects.toString(intent);
            }
            ArrayList<AudioAttributesCompatParcelizer> arrayList3 = this.RemoteActionCompatParcelizer.get(intent.getAction());
            if (arrayList3 != null) {
                if (z3) {
                    Objects.toString(arrayList3);
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = arrayList3.get(i2);
                    if (z3) {
                        Objects.toString(audioAttributesCompatParcelizer.IconCompatParcelizer);
                    }
                    if (audioAttributesCompatParcelizer.read) {
                        i = i2;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = strResolveTypeIfNeeded;
                        arrayList = arrayList4;
                        z = z2;
                    } else {
                        IntentFilter intentFilter = audioAttributesCompatParcelizer.IconCompatParcelizer;
                        String str3 = action;
                        String str4 = strResolveTypeIfNeeded;
                        i = i2;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = strResolveTypeIfNeeded;
                        z = z2;
                        int iMatch = intentFilter.match(str3, str4, scheme, data, categories, "LocalBroadcastManager");
                        if (iMatch >= 0) {
                            if (z3) {
                                Integer.toHexString(iMatch);
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(audioAttributesCompatParcelizer);
                            audioAttributesCompatParcelizer.read = z;
                            i2 = i + 1;
                            z2 = z;
                            action = str;
                            arrayList3 = arrayList2;
                            strResolveTypeIfNeeded = str2;
                        } else if (z3) {
                        }
                    }
                    arrayList4 = arrayList;
                    i2 = i + 1;
                    z2 = z;
                    action = str;
                    arrayList3 = arrayList2;
                    strResolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                boolean z4 = z2;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((AudioAttributesCompatParcelizer) arrayList5.get(i3)).read = false;
                    }
                    this.MediaBrowserCompatCustomActionResultReceiver.add(new IconCompatParcelizer(intent, arrayList5));
                    if (!this.write.hasMessages(z4 ? 1 : 0)) {
                        this.write.sendEmptyMessage(z4 ? 1 : 0);
                    }
                    return z4;
                }
            }
            return false;
        }
    }

    final void write() {
        int size;
        IconCompatParcelizer[] iconCompatParcelizerArr;
        while (true) {
            synchronized (this.AudioAttributesImplBaseParcelizer) {
                size = this.MediaBrowserCompatCustomActionResultReceiver.size();
                if (size <= 0) {
                    return;
                }
                iconCompatParcelizerArr = new IconCompatParcelizer[size];
                this.MediaBrowserCompatCustomActionResultReceiver.toArray(iconCompatParcelizerArr);
                this.MediaBrowserCompatCustomActionResultReceiver.clear();
            }
            for (int i = 0; i < size; i++) {
                IconCompatParcelizer iconCompatParcelizer = iconCompatParcelizerArr[i];
                int size2 = iconCompatParcelizer.AudioAttributesCompatParcelizer.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer.get(i2);
                    if (!audioAttributesCompatParcelizer.RemoteActionCompatParcelizer) {
                        audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.onReceive(this.IconCompatParcelizer, iconCompatParcelizer.RemoteActionCompatParcelizer);
                    }
                }
            }
        }
    }
}
