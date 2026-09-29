package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class isFlushingOrShutdown {
    private final SharedPreferences IconCompatParcelizer;

    public isFlushingOrShutdown(Context context, String str) {
        this.IconCompatParcelizer = context.getSharedPreferences("FirebaseHeartBeat".concat(String.valueOf(str)), 0);
    }

    final void RemoteActionCompatParcelizer() {
        synchronized (this) {
            SharedPreferences.Editor editorEdit = this.IconCompatParcelizer.edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : this.IconCompatParcelizer.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strAudioAttributesCompatParcelizer)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strAudioAttributesCompatParcelizer);
                        i++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i);
            }
            editorEdit.commit();
        }
    }

    final List<maybeThrowMediaCodecException> IconCompatParcelizer() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.IconCompatParcelizer.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(AudioAttributesCompatParcelizer(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(maybeThrowMediaCodecException.RemoteActionCompatParcelizer(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            write(System.currentTimeMillis());
        }
        return arrayList;
    }

    private String AudioAttributesCompatParcelizer(String str) {
        synchronized (this) {
            for (Map.Entry<String, ?> entry : this.IconCompatParcelizer.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Iterator it = ((Set) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        if (str.equals((String) it.next())) {
                            return entry.getKey();
                        }
                    }
                }
            }
            return null;
        }
    }

    private void read(String str, String str2) {
        synchronized (this) {
            read(str2);
            HashSet hashSet = new HashSet(this.IconCompatParcelizer.getStringSet(str, new HashSet()));
            hashSet.add(str2);
            this.IconCompatParcelizer.edit().putStringSet(str, hashSet).commit();
        }
    }

    private void read(String str) {
        synchronized (this) {
            String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(str);
            if (strAudioAttributesCompatParcelizer == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.IconCompatParcelizer.getStringSet(strAudioAttributesCompatParcelizer, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.IconCompatParcelizer.edit().remove(strAudioAttributesCompatParcelizer).commit();
            } else {
                this.IconCompatParcelizer.edit().putStringSet(strAudioAttributesCompatParcelizer, hashSet).commit();
            }
        }
    }

    final void AudioAttributesCompatParcelizer() {
        synchronized (this) {
            String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(System.currentTimeMillis());
            this.IconCompatParcelizer.edit().putString("last-used-date", strAudioAttributesCompatParcelizer).commit();
            read(strAudioAttributesCompatParcelizer);
        }
    }

    private String AudioAttributesCompatParcelizer(long j) {
        String str;
        synchronized (this) {
            str = new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return str;
    }

    final void RemoteActionCompatParcelizer(long j, String str) {
        synchronized (this) {
            String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(j);
            if (this.IconCompatParcelizer.getString("last-used-date", "").equals(strAudioAttributesCompatParcelizer)) {
                String strAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer);
                if (strAudioAttributesCompatParcelizer2 == null) {
                    return;
                }
                if (strAudioAttributesCompatParcelizer2.equals(str)) {
                    return;
                }
                read(str, strAudioAttributesCompatParcelizer);
                return;
            }
            long j2 = this.IconCompatParcelizer.getLong("fire-count", 0L);
            if (j2 + 1 == 30) {
                read();
                j2 = this.IconCompatParcelizer.getLong("fire-count", 0L);
            }
            HashSet hashSet = new HashSet(this.IconCompatParcelizer.getStringSet(str, new HashSet()));
            hashSet.add(strAudioAttributesCompatParcelizer);
            this.IconCompatParcelizer.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", strAudioAttributesCompatParcelizer).commit();
        }
    }

    private void read() {
        synchronized (this) {
            long j = this.IconCompatParcelizer.getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : this.IconCompatParcelizer.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.IconCompatParcelizer.getStringSet(key, new HashSet()));
            hashSet.remove(str);
            this.IconCompatParcelizer.edit().putStringSet(key, hashSet).putLong("fire-count", j - 1).commit();
        }
    }

    private void write(long j) {
        synchronized (this) {
            this.IconCompatParcelizer.edit().putLong("fire-global", j).commit();
        }
    }

    private boolean RemoteActionCompatParcelizer(long j, long j2) {
        boolean zEquals;
        synchronized (this) {
            zEquals = AudioAttributesCompatParcelizer(j).equals(AudioAttributesCompatParcelizer(j2));
        }
        return zEquals;
    }

    private boolean RemoteActionCompatParcelizer(String str, long j) {
        synchronized (this) {
            if (this.IconCompatParcelizer.contains(str)) {
                if (RemoteActionCompatParcelizer(this.IconCompatParcelizer.getLong(str, -1L), j)) {
                    return false;
                }
                this.IconCompatParcelizer.edit().putLong(str, j).commit();
                return true;
            }
            this.IconCompatParcelizer.edit().putLong(str, j).commit();
            return true;
        }
    }

    final boolean read(long j) {
        boolean zRemoteActionCompatParcelizer;
        synchronized (this) {
            zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer("fire-global", j);
        }
        return zRemoteActionCompatParcelizer;
    }
}
