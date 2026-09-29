package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public abstract class invalidateMediaSessionPlaybackState {
    static registerCustomCommandReceiver IconCompatParcelizer() {
        return registerCustomCommandReceiver.AudioAttributesCompatParcelizer;
    }

    @setGateway(IconCompatParcelizer = "SCHEMA_VERSION")
    static int RemoteActionCompatParcelizer() {
        return TimelineQueueEditor.write;
    }

    @setGateway(IconCompatParcelizer = "SQLITE_DB_NAME")
    static String read() {
        return "com.google.android.datatransport.events";
    }

    @getPlanOldPrice
    @setGateway(IconCompatParcelizer = "PACKAGE_NAME")
    static String read(Context context) {
        return context.getPackageName();
    }
}
