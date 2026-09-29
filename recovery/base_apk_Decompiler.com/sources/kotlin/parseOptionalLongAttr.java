package kotlin;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.marrow.TrainingApplication;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes5.dex */
public final class parseOptionalLongAttr extends SQLiteOpenHelper {
    private static parseOptionalLongAttr RemoteActionCompatParcelizer;
    private final ExecutorService AudioAttributesCompatParcelizer;
    private final Context write;

    public static parseOptionalLongAttr RemoteActionCompatParcelizer(Context context) {
        if (RemoteActionCompatParcelizer == null) {
            RemoteActionCompatParcelizer = new parseOptionalLongAttr(context);
        }
        return RemoteActionCompatParcelizer;
    }

    private parseOptionalLongAttr(Context context) {
        super(context, "training.db", (SQLiteDatabase.CursorFactory) null, 120);
        this.AudioAttributesCompatParcelizer = Executors.newFixedThreadPool(5);
        this.write = context;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        TrainingApplication.read().AudioAttributesImplBaseParcelizer().IconCompatParcelizer(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws Throwable {
        parseOptionalStringAttr parseoptionalstringattrAudioAttributesImplBaseParcelizer = TrainingApplication.read().AudioAttributesImplBaseParcelizer();
        if (i < 65) {
            parseoptionalstringattrAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(sQLiteDatabase);
            return;
        }
        if (i < 66) {
            parseOptionalStringAttr.MediaBrowserCompatMediaItem(sQLiteDatabase);
        }
        if (i < 67) {
            parseOptionalStringAttr.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(sQLiteDatabase);
        }
        if (i < 68) {
            parseOptionalStringAttr.onCommand(sQLiteDatabase);
        }
        if (i < 69) {
            parseOptionalStringAttr.MediaBrowserCompatCustomActionResultReceiver();
        }
        if (i < 70) {
            parseOptionalStringAttr.handleMediaPlayPauseIfPendingOnHandler(sQLiteDatabase);
        }
        if (i < 71) {
            parseOptionalStringAttr.onAddQueueItem(sQLiteDatabase);
        }
        if (i < 72) {
            parseOptionalStringAttr.onCustomAction(sQLiteDatabase);
        }
        if (i < 73) {
            parseOptionalStringAttr.onPlayFromMediaId(sQLiteDatabase);
        }
        if (i < 75) {
            parseOptionalStringAttr.onPlay(sQLiteDatabase);
        }
        if (i < 76) {
            parseOptionalStringAttr.onFastForward(sQLiteDatabase);
        }
        if (i < 77) {
            parseOptionalStringAttr.onMediaButtonEvent(sQLiteDatabase);
        }
        if (i < 78) {
            parseOptionalStringAttr.onPause(sQLiteDatabase);
        }
        if (i < 79) {
            parseOptionalStringAttr.onPrepareFromSearch(sQLiteDatabase);
        }
        if (i < 80) {
            parseOptionalStringAttr.onPlayFromUri(sQLiteDatabase);
        }
        if (i < 81) {
            parseOptionalStringAttr.onPrepareFromMediaId(sQLiteDatabase);
        }
        if (i < 82) {
            parseOptionalStringAttr.onPrepare(sQLiteDatabase);
        }
        if (i < 83) {
            parseOptionalStringAttr.onPlayFromSearch(sQLiteDatabase);
        }
        if (i < 86) {
            parseOptionalStringAttr.onRemoveQueueItemAt(sQLiteDatabase);
        }
        if (i < 87) {
            parseOptionalStringAttr.onRewind(sQLiteDatabase);
        }
        if (i < 88) {
            parseOptionalStringAttr.onSeekTo(sQLiteDatabase);
        }
        if (i < 89) {
            parseOptionalStringAttr.onRemoveQueueItem(sQLiteDatabase);
        }
        if (i < 90) {
            parseOptionalStringAttr.onPrepareFromUri(sQLiteDatabase);
        }
        if (i < 95) {
            parseOptionalStringAttr.onSetShuffleMode(sQLiteDatabase);
        }
        if (i < 96) {
            parseOptionalStringAttr.onSetCaptioningEnabled(sQLiteDatabase);
        }
        if (i < 97) {
            parseOptionalStringAttr.onSetRating(sQLiteDatabase);
        }
        if (i < 98) {
            parseOptionalStringAttr.onSetPlaybackSpeed(sQLiteDatabase);
        }
        if (i < 99) {
            parseOptionalStringAttr.onSetRepeatMode(sQLiteDatabase);
        }
        if (i < 100) {
            parseOptionalStringAttr.onSkipToQueueItem(sQLiteDatabase);
        }
        if (i < 101) {
            parseOptionalStringAttr.read(sQLiteDatabase);
        }
        if (i < 102) {
            parseOptionalStringAttr.RemoteActionCompatParcelizer(sQLiteDatabase);
        }
        if (i < 108) {
            parseOptionalStringAttr.write(sQLiteDatabase);
        }
        if (i < 110) {
            parseOptionalStringAttr.AudioAttributesImplApi26Parcelizer(sQLiteDatabase);
        }
        if (i < 111) {
            parseOptionalStringAttr.AudioAttributesImplApi21Parcelizer(sQLiteDatabase);
        }
        if (i < 112) {
            parseOptionalStringAttr.MediaBrowserCompatItemReceiver(sQLiteDatabase);
        }
        if (i < 113) {
            parseOptionalStringAttr.MediaBrowserCompatCustomActionResultReceiver(sQLiteDatabase);
        }
        if (i < 115) {
            parseOptionalStringAttr.AudioAttributesImplBaseParcelizer(sQLiteDatabase);
        }
        if (i < 116) {
            parseOptionalStringAttr.RatingCompat(sQLiteDatabase);
        }
        if (i < 117) {
            parseOptionalStringAttr.MediaDescriptionCompat(sQLiteDatabase);
        }
        if (i < 119) {
            parseOptionalStringAttr.MediaMetadataCompat(sQLiteDatabase);
        }
        if (i < 120) {
            parseOptionalStringAttr.MediaBrowserCompatSearchResultReceiver(sQLiteDatabase);
        }
    }
}
