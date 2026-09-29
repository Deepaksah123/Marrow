package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.marrow.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.ChapterFrame1;
import kotlin.ChapterTocFrame1;
import kotlin.Id3DecoderId3Header;
import kotlin.decodeCommentFrame;
import kotlin.decodeGeobFrame;
import kotlin.decodeTextInformationFrame;
import kotlin.decodeUrlLinkFrame;
import kotlin.fillEncryptionData;
import kotlin.getCharset;
import kotlin.getSubFrame;
import kotlin.getSubFrameCount;
import kotlin.hasSamples;
import kotlin.indexOfTerminator;
import kotlin.schemeToCryptoMode;
import kotlin.setReadingSampleState;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseRemoteConfig {
    private final Executor AudioAttributesCompatParcelizer;
    private final decodeCommentFrame AudioAttributesImplApi21Parcelizer;
    private final decodeTextInformationFrame AudioAttributesImplApi26Parcelizer;
    private final FirebaseApp AudioAttributesImplBaseParcelizer;
    private final indexOfTerminator IconCompatParcelizer;
    private final schemeToCryptoMode MediaBrowserCompatCustomActionResultReceiver;
    private final hasSamples MediaBrowserCompatItemReceiver;
    private final getCharset MediaBrowserCompatSearchResultReceiver;
    private final decodeUrlLinkFrame MediaMetadataCompat;
    private final decodeCommentFrame RemoteActionCompatParcelizer;
    private final Context read;
    private final decodeCommentFrame write;

    public static FirebaseRemoteConfig AudioAttributesCompatParcelizer() {
        return IconCompatParcelizer(FirebaseApp.write());
    }

    private static FirebaseRemoteConfig IconCompatParcelizer(FirebaseApp firebaseApp) {
        return ((ChapterTocFrame1) firebaseApp.AudioAttributesCompatParcelizer(ChapterTocFrame1.class)).RemoteActionCompatParcelizer();
    }

    public FirebaseRemoteConfig(Context context, FirebaseApp firebaseApp, hasSamples hassamples, schemeToCryptoMode schemetocryptomode, Executor executor, decodeCommentFrame decodecommentframe, decodeCommentFrame decodecommentframe2, decodeCommentFrame decodecommentframe3, decodeTextInformationFrame decodetextinformationframe, getCharset getcharset, decodeUrlLinkFrame decodeurllinkframe, indexOfTerminator indexofterminator) {
        this.read = context;
        this.AudioAttributesImplBaseParcelizer = firebaseApp;
        this.MediaBrowserCompatItemReceiver = hassamples;
        this.MediaBrowserCompatCustomActionResultReceiver = schemetocryptomode;
        this.AudioAttributesCompatParcelizer = executor;
        this.AudioAttributesImplApi21Parcelizer = decodecommentframe;
        this.RemoteActionCompatParcelizer = decodecommentframe2;
        this.write = decodecommentframe3;
        this.AudioAttributesImplApi26Parcelizer = decodetextinformationframe;
        this.MediaBrowserCompatSearchResultReceiver = getcharset;
        this.MediaMetadataCompat = decodeurllinkframe;
        this.IconCompatParcelizer = indexofterminator;
    }

    public final Task<Boolean> RemoteActionCompatParcelizer() {
        return MediaBrowserCompatMediaItem().onSuccessTask(this.AudioAttributesCompatParcelizer, new SuccessContinuation() { // from class: o.IcyDecoder
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.read.AudioAttributesImplApi26Parcelizer();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: merged with bridge method [inline-methods] */
    public Task<Boolean> AudioAttributesImplApi26Parcelizer() {
        final Task<decodeGeobFrame> task = this.AudioAttributesImplApi21Parcelizer.read();
        final Task<decodeGeobFrame> task2 = this.RemoteActionCompatParcelizer.read();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{task, task2}).continueWithTask(this.AudioAttributesCompatParcelizer, new Continuation() { // from class: o.parseAit
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return this.IconCompatParcelizer.write(task, task2);
            }
        });
    }

    public final /* synthetic */ Task write(Task task, Task task2) throws Exception {
        boolean zIsSuccessful = task.isSuccessful();
        Boolean bool = Boolean.FALSE;
        if (!zIsSuccessful || task.getResult() == null) {
            return Tasks.forResult(bool);
        }
        decodeGeobFrame decodegeobframe = (decodeGeobFrame) task.getResult();
        if (task2.isSuccessful() && !write(decodegeobframe, (decodeGeobFrame) task2.getResult())) {
            return Tasks.forResult(bool);
        }
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(decodegeobframe).continueWith(this.AudioAttributesCompatParcelizer, new Continuation() { // from class: o.fromPictureBlock
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return Boolean.valueOf(this.read.RemoteActionCompatParcelizer((Task<decodeGeobFrame>) task3));
            }
        });
    }

    private Task<Void> MediaBrowserCompatMediaItem() {
        return this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer().onSuccessTask(setReadingSampleState.AudioAttributesCompatParcelizer(), new SuccessContinuation() { // from class: o.BinaryFrame1
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Tasks.forResult(null);
            }
        });
    }

    public final Task<Void> read(long j) {
        return this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(j).onSuccessTask(setReadingSampleState.AudioAttributesCompatParcelizer(), new SuccessContinuation() { // from class: o.decodeToString
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Tasks.forResult(null);
            }
        });
    }

    public final String write(String str) {
        return this.MediaBrowserCompatSearchResultReceiver.write(str);
    }

    public final boolean AudioAttributesCompatParcelizer(String str) {
        return this.MediaBrowserCompatSearchResultReceiver.read(str);
    }

    public final long RemoteActionCompatParcelizer(String str) {
        return this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(str);
    }

    public final Map<String, getSubFrameCount> MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver.write();
    }

    public final getSubFrame AudioAttributesImplBaseParcelizer() {
        return this.MediaMetadataCompat.write();
    }

    public final Task<Void> write(final ChapterFrame1 chapterFrame1) {
        return Tasks.call(this.AudioAttributesCompatParcelizer, new Callable() { // from class: o.VorbisComment1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.RemoteActionCompatParcelizer.IconCompatParcelizer(chapterFrame1);
            }
        });
    }

    public final /* synthetic */ Void IconCompatParcelizer(ChapterFrame1 chapterFrame1) throws Exception {
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(chapterFrame1);
        return null;
    }

    public final Task<Void> AudioAttributesImplApi21Parcelizer() {
        return read(Id3DecoderId3Header.RemoteActionCompatParcelizer(this.read, R.xml.remote_config_defaults));
    }

    public final void MediaBrowserCompatItemReceiver() {
        this.RemoteActionCompatParcelizer.read();
        this.write.read();
        this.AudioAttributesImplApi21Parcelizer.read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean RemoteActionCompatParcelizer(Task<decodeGeobFrame> task) {
        if (!task.isSuccessful()) {
            return false;
        }
        this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer();
        if (task.getResult() == null) {
            return true;
        }
        write(task.getResult().read());
        return true;
    }

    private Task<Void> read(Map<String, String> map) {
        try {
            return this.write.RemoteActionCompatParcelizer(decodeGeobFrame.write().RemoteActionCompatParcelizer(map).write()).onSuccessTask(setReadingSampleState.AudioAttributesCompatParcelizer(), new SuccessContinuation() { // from class: o.PictureFrame1
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    return Tasks.forResult(null);
                }
            });
        } catch (JSONException unused) {
            return Tasks.forResult(null);
        }
    }

    private void write(JSONArray jSONArray) {
        if (this.MediaBrowserCompatCustomActionResultReceiver != null) {
            try {
                this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(read(jSONArray));
            } catch (fillEncryptionData | JSONException unused) {
            }
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        this.IconCompatParcelizer.read(z);
    }

    private static List<Map<String, String>> read(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    private static boolean write(decodeGeobFrame decodegeobframe, decodeGeobFrame decodegeobframe2) {
        return decodegeobframe2 == null || !decodegeobframe.AudioAttributesCompatParcelizer().equals(decodegeobframe2.AudioAttributesCompatParcelizer());
    }
}
