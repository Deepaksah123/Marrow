package kotlin;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.io.File;
import java.util.Iterator;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B+\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0019J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u001aR\u0011\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001c\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!"}, d2 = {"Lo/lambdasetPlaylistMetadata15;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/content/Context;", "p0", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "p1", "", "p2", "Lo/RendererWakeupListener;", "p3", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ljava/lang/String;Lo/RendererWakeupListener;)V", "Landroid/database/sqlite/SQLiteDatabase;", "", "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "write", "(Ljava/lang/String;)Ljava/lang/String;", "AudioAttributesCompatParcelizer", "", "IconCompatParcelizer", "()Z", "()V", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V", "Landroid/content/Context;", "RemoteActionCompatParcelizer", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "read", "Lo/RendererWakeupListener;", "Ljava/io/File;", "Ljava/io/File;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdasetPlaylistMetadata15 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Context IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final File RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final CleverTapInstanceConfig write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final RendererWakeupListener AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lambdasetPlaylistMetadata15(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, RendererWakeupListener rendererWakeupListener) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 5);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        toMagicModuleMetaRepoModel.write(rendererWakeupListener, "");
        this.IconCompatParcelizer = context;
        this.write = cleverTapInstanceConfig;
        this.AudioAttributesCompatParcelizer = rendererWakeupListener;
        this.RemoteActionCompatParcelizer = context.getDatabasePath(str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer.read();
        IconCompatParcelizer(p0, lambdaseekTo10.RemoteActionCompatParcelizer);
        IconCompatParcelizer(p0, lambdaseekTo10.AudioAttributesImplApi21Parcelizer);
        IconCompatParcelizer(p0, lambdaseekTo10.read);
        IconCompatParcelizer(p0, lambdaseekTo10.MediaBrowserCompatCustomActionResultReceiver);
        IconCompatParcelizer(p0, lambdaseekTo10.AudioAttributesCompatParcelizer);
        IconCompatParcelizer(p0, lambdaseekTo10.IconCompatParcelizer);
        IconCompatParcelizer(p0, lambdaseekTo10.AudioAttributesImplBaseParcelizer);
        IconCompatParcelizer(p0, lambdaseekTo10.write);
        IconCompatParcelizer(p0, lambdaseekTo10.MediaMetadataCompat);
        IconCompatParcelizer(p0, lambdaseekTo10.onAddQueueItem);
        IconCompatParcelizer(p0, lambdaseekTo10.onCustomAction);
        IconCompatParcelizer(p0, lambdaseekTo10.handleMediaPlayPauseIfPendingOnHandler);
        IconCompatParcelizer(p0, lambdaseekTo10.MediaBrowserCompatMediaItem);
        IconCompatParcelizer(p0, lambdaseekTo10.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase p0, int p1, int p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer.read();
        if (p1 == 1) {
            IconCompatParcelizer(p0, lambdaseekTo10.MediaBrowserCompatSearchResultReceiver);
            IconCompatParcelizer(p0, lambdaseekTo10.AudioAttributesImplApi26Parcelizer);
            IconCompatParcelizer(p0, lambdaseekTo10.MediaDescriptionCompat);
            IconCompatParcelizer(p0, lambdaseekTo10.AudioAttributesCompatParcelizer);
            IconCompatParcelizer(p0, lambdaseekTo10.IconCompatParcelizer);
            IconCompatParcelizer(p0, lambdaseekTo10.AudioAttributesImplBaseParcelizer);
            IconCompatParcelizer(p0, lambdaseekTo10.write);
            IconCompatParcelizer(p0, lambdaseekTo10.onCustomAction);
            IconCompatParcelizer(p0, lambdaseekTo10.handleMediaPlayPauseIfPendingOnHandler);
            IconCompatParcelizer(p0, lambdaseekTo10.MediaBrowserCompatMediaItem);
            IconCompatParcelizer(p0, lambdaseekTo10.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            write(p0);
        } else if (p1 == 2) {
            IconCompatParcelizer(p0, lambdaseekTo10.MediaDescriptionCompat);
            IconCompatParcelizer(p0, lambdaseekTo10.write);
            IconCompatParcelizer(p0, lambdaseekTo10.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            write(p0);
        } else if (p1 == 3) {
            write(p0);
        }
        if (p1 < 5) {
            IconCompatParcelizer(p0, lambdaseekTo10.AudioAttributesImplApi21Parcelizer);
        }
    }

    private final String write(String p0) {
        String strConcat = "deviceId:".concat(String.valueOf(p0));
        String strConcat2 = "fallbackId:".concat(String.valueOf(p0));
        String strWrite = RendererCapabilitiesFormatSupport.write(this.IconCompatParcelizer, strConcat, (String) null);
        if (strWrite != null) {
            return strWrite;
        }
        if (this.write.MediaBrowserCompatSearchResultReceiver()) {
            String strWrite2 = RendererCapabilitiesFormatSupport.write(this.IconCompatParcelizer, strConcat, (String) null);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite2, "");
            return strWrite2;
        }
        String strWrite3 = RendererCapabilitiesFormatSupport.write(this.IconCompatParcelizer, strConcat2, "");
        toMagicModuleMetaRepoModel.write((Object) strWrite3);
        return strWrite3;
    }

    private final void write(SQLiteDatabase p0) {
        IconCompatParcelizer(p0, lambdaseekTo10.MediaBrowserCompatItemReceiver);
        String strWrite = this.write.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
        String strWrite2 = write(strWrite);
        StringBuilder sb = new StringBuilder("SELECT _id, data FROM ");
        sb.append(lambdasetDeviceVolume23.MediaBrowserCompatItemReceiver.getAudioAttributesCompatParcelizer());
        sb.append(';');
        Cursor cursorRawQuery = p0.rawQuery(sb.toString(), null);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cursorRawQuery, "");
        Cursor cursor = cursorRawQuery;
        try {
            if (cursorRawQuery.moveToFirst()) {
                String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("_id"));
                String string2 = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("data"));
                toMagicModuleMetaRepoModel.write((Object) string2);
                String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(string2);
                StringBuilder sb2 = new StringBuilder("INSERT INTO temp_");
                sb2.append(lambdasetDeviceVolume23.MediaBrowserCompatItemReceiver.getAudioAttributesCompatParcelizer());
                sb2.append(" (_id, deviceID, data)\n                                 VALUES ('");
                sb2.append(string);
                sb2.append("', '");
                sb2.append(strWrite2);
                sb2.append("', '");
                sb2.append(strAudioAttributesCompatParcelizer);
                sb2.append("');");
                IconCompatParcelizer(p0, sb2.toString());
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
            IconCompatParcelizer(p0, lambdaseekTo10.RatingCompat);
            IconCompatParcelizer(p0, lambdaseekTo10.onCommand);
        } finally {
        }
    }

    private final String AudioAttributesCompatParcelizer(String p0) {
        try {
            JSONObject jSONObject = new JSONObject(p0);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objValueOf = jSONObject.get(next);
                if ((objValueOf instanceof String) && TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver((String) objValueOf, "$D_")) {
                    objValueOf = Long.valueOf(Long.parseLong(TestGroupLSModel.IconCompatParcelizer((String) objValueOf, (CharSequence) "$D_")));
                    jSONObject.put(next, ((Number) objValueOf).longValue());
                }
                if (objValueOf instanceof JSONObject) {
                    if (!((JSONObject) objValueOf).has("$set")) {
                        if (((JSONObject) objValueOf).has("$add")) {
                            jSONObject.put(next, ((JSONObject) objValueOf).getJSONArray("$add"));
                        }
                    } else {
                        jSONObject.put(next, ((JSONObject) objValueOf).getJSONArray("$set"));
                    }
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            RendererWakeupListener.onAddQueueItem();
            return p0;
        }
    }

    public final boolean IconCompatParcelizer() {
        return !this.RemoteActionCompatParcelizer.exists() || Math.max(this.RemoteActionCompatParcelizer.getUsableSpace(), 20971520L) >= this.RemoteActionCompatParcelizer.length();
    }

    public final void write() {
        close();
        if (this.RemoteActionCompatParcelizer.delete()) {
            return;
        }
        RendererWakeupListener.handleMediaPlayPauseIfPendingOnHandler();
    }

    private final void IconCompatParcelizer(SQLiteDatabase p0, String p1) {
        SQLiteStatement sQLiteStatementCompileStatement = p0.compileStatement(p1);
        this.AudioAttributesCompatParcelizer.read();
        sQLiteStatementCompileStatement.execute();
    }
}
