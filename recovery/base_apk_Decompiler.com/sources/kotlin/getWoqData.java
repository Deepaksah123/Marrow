package kotlin;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class getWoqData {
    private static boolean IconCompatParcelizer = true;
    private static Integer RemoteActionCompatParcelizer;
    private static Boolean read;
    private static final Object write = new Object();
    private String AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private Boolean AudioAttributesImplBaseParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private String MediaBrowserCompatItemReceiver;
    private final Future<SharedPreferences> MediaBrowserCompatMediaItem;
    private final Future<SharedPreferences> MediaBrowserCompatSearchResultReceiver;
    private final Future<SharedPreferences> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final Future<SharedPreferences> MediaDescriptionCompat;
    private String RatingCompat;
    private final Object onCommand = new Object();
    private JSONObject onAddQueueItem = null;
    private Map<String, String> onCustomAction = null;
    private boolean AudioAttributesImplApi21Parcelizer = false;
    private final SharedPreferences.OnSharedPreferenceChangeListener MediaMetadataCompat = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.getWoqData.5
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            synchronized (getWoqData.write) {
                getWoqData.this.onCustomAction();
                getWoqData.AudioAttributesCompatParcelizer();
            }
        }
    };

    static /* synthetic */ boolean AudioAttributesCompatParcelizer() {
        IconCompatParcelizer = false;
        return false;
    }

    public static String read(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("people_distinct_id", null);
    }

    public getWoqData(Future<SharedPreferences> future, Future<SharedPreferences> future2, Future<SharedPreferences> future3, Future<SharedPreferences> future4) {
        this.MediaBrowserCompatMediaItem = future;
        this.MediaDescriptionCompat = future2;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = future3;
        this.MediaBrowserCompatSearchResultReceiver = future4;
    }

    public final void AudioAttributesCompatParcelizer(JSONObject jSONObject) {
        synchronized (this.onCommand) {
            JSONObject jSONObjectRatingCompat = RatingCompat();
            Iterator<String> itKeys = jSONObjectRatingCompat.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    jSONObject.put(next, jSONObjectRatingCompat.get(next));
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final void write(JSONObject jSONObject) {
        synchronized (this.onCommand) {
            JSONObject jSONObjectRatingCompat = RatingCompat();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    jSONObjectRatingCompat.put(next, jSONObject.get(next));
                } catch (JSONException unused) {
                }
            }
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
    }

    public final Map<String, String> MediaMetadataCompat() {
        synchronized (write) {
            if (IconCompatParcelizer || this.onCustomAction == null) {
                onCustomAction();
                IconCompatParcelizer = false;
            }
        }
        return this.onCustomAction;
    }

    public final void read() {
        synchronized (write) {
            try {
                SharedPreferences.Editor editorEdit = this.MediaBrowserCompatMediaItem.get().edit();
                editorEdit.clear();
                RemoteActionCompatParcelizer(editorEdit);
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                e.getCause();
            }
        }
    }

    public final String MediaBrowserCompatItemReceiver() {
        String str;
        synchronized (this) {
            if (!this.AudioAttributesImplApi21Parcelizer) {
                MediaBrowserCompatSearchResultReceiver();
            }
            str = this.AudioAttributesCompatParcelizer;
        }
        return str;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        boolean z;
        synchronized (this) {
            if (!this.AudioAttributesImplApi21Parcelizer) {
                MediaBrowserCompatSearchResultReceiver();
            }
            z = this.MediaBrowserCompatCustomActionResultReceiver;
        }
        return z;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        String str;
        synchronized (this) {
            if (!this.AudioAttributesImplApi21Parcelizer) {
                MediaBrowserCompatSearchResultReceiver();
            }
            str = this.MediaBrowserCompatItemReceiver;
        }
        return str;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        synchronized (this) {
            if (!this.AudioAttributesImplApi21Parcelizer) {
                MediaBrowserCompatSearchResultReceiver();
            }
            if (!this.AudioAttributesImplApi26Parcelizer) {
                return null;
            }
            return this.MediaBrowserCompatItemReceiver;
        }
    }

    public final void AudioAttributesImplApi26Parcelizer(String str) {
        synchronized (this) {
            if (!this.AudioAttributesImplApi21Parcelizer) {
                MediaBrowserCompatSearchResultReceiver();
            }
            if (this.AudioAttributesCompatParcelizer != null) {
                return;
            }
            this.AudioAttributesCompatParcelizer = str;
            this.MediaBrowserCompatCustomActionResultReceiver = true;
            onAddQueueItem();
        }
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(String str) {
        synchronized (this) {
            if (!this.AudioAttributesImplApi21Parcelizer) {
                MediaBrowserCompatSearchResultReceiver();
            }
            this.MediaBrowserCompatItemReceiver = str;
            onAddQueueItem();
        }
    }

    public final void MediaBrowserCompatMediaItem() {
        synchronized (this) {
            if (!this.AudioAttributesImplApi21Parcelizer) {
                MediaBrowserCompatSearchResultReceiver();
            }
            this.AudioAttributesImplApi26Parcelizer = true;
            onAddQueueItem();
        }
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        String str;
        synchronized (this) {
            if (!this.AudioAttributesImplApi21Parcelizer) {
                MediaBrowserCompatSearchResultReceiver();
            }
            str = this.RatingCompat;
        }
        return str;
    }

    public final void RatingCompat(String str) {
        synchronized (this) {
            if (!this.AudioAttributesImplApi21Parcelizer) {
                MediaBrowserCompatSearchResultReceiver();
            }
            this.RatingCompat = str;
            onAddQueueItem();
        }
    }

    public final void IconCompatParcelizer() {
        synchronized (this) {
            try {
                SharedPreferences.Editor editorEdit = this.MediaDescriptionCompat.get().edit();
                editorEdit.clear();
                RemoteActionCompatParcelizer(editorEdit);
                onCommand();
                MediaBrowserCompatSearchResultReceiver();
            } catch (InterruptedException e) {
                throw new RuntimeException(e.getCause());
            } catch (ExecutionException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        try {
            SharedPreferences.Editor editorEdit = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.get().edit();
            editorEdit.clear();
            RemoteActionCompatParcelizer(editorEdit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e2) {
            e2.printStackTrace();
        }
    }

    public final Map<String, Long> MediaDescriptionCompat() {
        HashMap map = new HashMap();
        try {
            for (Map.Entry<String, ?> entry : this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.get().getAll().entrySet()) {
                map.put(entry.getKey(), Long.valueOf(entry.getValue().toString()));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e2) {
            e2.printStackTrace();
        }
        return map;
    }

    public final void read(String str) {
        try {
            SharedPreferences.Editor editorEdit = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.get().edit();
            editorEdit.remove(str);
            RemoteActionCompatParcelizer(editorEdit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e2) {
            e2.printStackTrace();
        }
    }

    public final boolean RemoteActionCompatParcelizer(String str) {
        boolean z;
        synchronized (this) {
            z = false;
            try {
                z = this.MediaBrowserCompatSearchResultReceiver.get().getBoolean(str, false);
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                e.getCause();
            }
        }
        return z;
    }

    public final void AudioAttributesImplBaseParcelizer(String str) {
        synchronized (this) {
            try {
                SharedPreferences.Editor editorEdit = this.MediaBrowserCompatSearchResultReceiver.get().edit();
                editorEdit.putBoolean(str, true);
                RemoteActionCompatParcelizer(editorEdit);
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                e.getCause();
            }
        }
    }

    public final boolean write(String str) {
        synchronized (this) {
            if (str == null) {
                return false;
            }
            Integer numValueOf = Integer.valueOf(str);
            try {
                if (RemoteActionCompatParcelizer == null) {
                    Integer numValueOf2 = Integer.valueOf(this.MediaBrowserCompatSearchResultReceiver.get().getInt("latest_version_code", -1));
                    RemoteActionCompatParcelizer = numValueOf2;
                    if (numValueOf2.intValue() == -1) {
                        RemoteActionCompatParcelizer = numValueOf;
                        SharedPreferences.Editor editorEdit = this.MediaBrowserCompatSearchResultReceiver.get().edit();
                        editorEdit.putInt("latest_version_code", numValueOf.intValue());
                        RemoteActionCompatParcelizer(editorEdit);
                    }
                }
                if (RemoteActionCompatParcelizer.intValue() < numValueOf.intValue()) {
                    SharedPreferences.Editor editorEdit2 = this.MediaBrowserCompatSearchResultReceiver.get().edit();
                    editorEdit2.putInt("latest_version_code", numValueOf.intValue());
                    RemoteActionCompatParcelizer(editorEdit2);
                    return true;
                }
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                e.getCause();
            }
            return false;
        }
    }

    public final boolean IconCompatParcelizer(boolean z, String str) {
        boolean zBooleanValue;
        synchronized (this) {
            if (read == null) {
                try {
                    try {
                        SharedPreferences sharedPreferences = this.MediaBrowserCompatSearchResultReceiver.get();
                        StringBuilder sb = new StringBuilder("has_launched_");
                        sb.append(str);
                        if (sharedPreferences.getBoolean(sb.toString(), false)) {
                            read = Boolean.FALSE;
                        } else {
                            Boolean boolValueOf = Boolean.valueOf(!z);
                            read = boolValueOf;
                            if (!boolValueOf.booleanValue()) {
                                MediaBrowserCompatItemReceiver(str);
                            }
                        }
                    } catch (ExecutionException unused) {
                        read = Boolean.FALSE;
                    }
                } catch (InterruptedException unused2) {
                    read = Boolean.FALSE;
                }
                zBooleanValue = read.booleanValue();
            } else {
                zBooleanValue = read.booleanValue();
            }
        }
        return zBooleanValue;
    }

    public final void MediaBrowserCompatItemReceiver(String str) {
        synchronized (this) {
            try {
                SharedPreferences.Editor editorEdit = this.MediaBrowserCompatSearchResultReceiver.get().edit();
                StringBuilder sb = new StringBuilder("has_launched_");
                sb.append(str);
                editorEdit.putBoolean(sb.toString(), true);
                RemoteActionCompatParcelizer(editorEdit);
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                e.getCause();
            }
        }
    }

    public final void AudioAttributesImplApi21Parcelizer(String str) {
        synchronized (this) {
            this.AudioAttributesImplBaseParcelizer = Boolean.TRUE;
            MediaDescriptionCompat(str);
        }
    }

    public final boolean IconCompatParcelizer(String str) {
        boolean zBooleanValue;
        synchronized (this) {
            if (this.AudioAttributesImplBaseParcelizer == null) {
                MediaBrowserCompatSearchResultReceiver(str);
                if (this.AudioAttributesImplBaseParcelizer == null) {
                    this.AudioAttributesImplBaseParcelizer = Boolean.FALSE;
                }
            }
            zBooleanValue = this.AudioAttributesImplBaseParcelizer.booleanValue();
        }
        return zBooleanValue;
    }

    private JSONObject RatingCompat() {
        if (this.onAddQueueItem == null) {
            onCommand();
        }
        return this.onAddQueueItem;
    }

    private void onCommand() {
        JSONObject jSONObject;
        try {
            try {
                try {
                    this.onAddQueueItem = new JSONObject(this.MediaDescriptionCompat.get().getString("super_properties", "{}"));
                } catch (ExecutionException e) {
                    e.getCause();
                    if (this.onAddQueueItem == null) {
                        jSONObject = new JSONObject();
                        this.onAddQueueItem = jSONObject;
                    }
                }
            } catch (InterruptedException unused) {
                if (this.onAddQueueItem == null) {
                    jSONObject = new JSONObject();
                    this.onAddQueueItem = jSONObject;
                }
            } catch (JSONException unused2) {
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                if (this.onAddQueueItem == null) {
                    jSONObject = new JSONObject();
                    this.onAddQueueItem = jSONObject;
                }
            }
        } catch (Throwable th) {
            if (this.onAddQueueItem == null) {
                this.onAddQueueItem = new JSONObject();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCustomAction() {
        this.onCustomAction = new HashMap();
        try {
            SharedPreferences sharedPreferences = this.MediaBrowserCompatMediaItem.get();
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(this.MediaMetadataCompat);
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.MediaMetadataCompat);
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                this.onCustomAction.put(entry.getKey(), entry.getValue().toString());
            }
        } catch (InterruptedException unused) {
        } catch (ExecutionException e) {
            e.getCause();
        }
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        JSONObject jSONObject = this.onAddQueueItem;
        if (jSONObject == null) {
            return;
        }
        String string = jSONObject.toString();
        try {
            SharedPreferences.Editor editorEdit = this.MediaDescriptionCompat.get().edit();
            editorEdit.putString("super_properties", string);
            RemoteActionCompatParcelizer(editorEdit);
        } catch (InterruptedException unused) {
        } catch (ExecutionException e) {
            e.getCause();
        }
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = this.MediaDescriptionCompat.get();
        } catch (InterruptedException unused) {
            sharedPreferences = null;
        } catch (ExecutionException e) {
            e.getCause();
            sharedPreferences = null;
        }
        if (sharedPreferences == null) {
            return;
        }
        this.MediaBrowserCompatItemReceiver = sharedPreferences.getString("events_distinct_id", null);
        this.AudioAttributesImplApi26Parcelizer = sharedPreferences.getBoolean("events_user_id_present", false);
        this.RatingCompat = sharedPreferences.getString("people_distinct_id", null);
        this.AudioAttributesCompatParcelizer = sharedPreferences.getString("anonymous_id", null);
        this.MediaBrowserCompatCustomActionResultReceiver = sharedPreferences.getBoolean("had_persisted_distinct_id", false);
        if (this.MediaBrowserCompatItemReceiver == null) {
            this.AudioAttributesCompatParcelizer = UUID.randomUUID().toString();
            StringBuilder sb = new StringBuilder("$device:");
            sb.append(this.AudioAttributesCompatParcelizer);
            this.MediaBrowserCompatItemReceiver = sb.toString();
            this.AudioAttributesImplApi26Parcelizer = false;
            onAddQueueItem();
        }
        this.AudioAttributesImplApi21Parcelizer = true;
    }

    private void MediaBrowserCompatSearchResultReceiver(String str) {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = this.MediaBrowserCompatSearchResultReceiver.get();
        } catch (InterruptedException unused) {
            sharedPreferences = null;
        } catch (ExecutionException e) {
            e.getCause();
            sharedPreferences = null;
        }
        if (sharedPreferences == null) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer = Boolean.valueOf(sharedPreferences.getBoolean("opt_out_".concat(String.valueOf(str)), false));
    }

    private void MediaDescriptionCompat(String str) {
        try {
            SharedPreferences.Editor editorEdit = this.MediaBrowserCompatSearchResultReceiver.get().edit();
            StringBuilder sb = new StringBuilder("opt_out_");
            sb.append(str);
            editorEdit.putBoolean(sb.toString(), this.AudioAttributesImplBaseParcelizer.booleanValue());
            RemoteActionCompatParcelizer(editorEdit);
        } catch (InterruptedException unused) {
        } catch (ExecutionException e) {
            e.getCause();
        }
    }

    protected final boolean AudioAttributesCompatParcelizer(String str) {
        try {
            SharedPreferences sharedPreferences = this.MediaBrowserCompatSearchResultReceiver.get();
            StringBuilder sb = new StringBuilder("opt_out_");
            sb.append(str);
            return sharedPreferences.contains(sb.toString());
        } catch (InterruptedException unused) {
            return false;
        } catch (ExecutionException e) {
            e.getCause();
            return false;
        }
    }

    private void onAddQueueItem() {
        try {
            SharedPreferences.Editor editorEdit = this.MediaDescriptionCompat.get().edit();
            editorEdit.putString("events_distinct_id", this.MediaBrowserCompatItemReceiver);
            editorEdit.putBoolean("events_user_id_present", this.AudioAttributesImplApi26Parcelizer);
            editorEdit.putString("people_distinct_id", this.RatingCompat);
            editorEdit.putString("anonymous_id", this.AudioAttributesCompatParcelizer);
            editorEdit.putBoolean("had_persisted_distinct_id", this.MediaBrowserCompatCustomActionResultReceiver);
            RemoteActionCompatParcelizer(editorEdit);
        } catch (InterruptedException unused) {
        } catch (ExecutionException e) {
            e.getCause();
        }
    }

    private static void RemoteActionCompatParcelizer(SharedPreferences.Editor editor) {
        editor.apply();
    }
}
