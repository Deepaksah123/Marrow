package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import com.google.android.exoplayer2.C;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.CStreamType;
import kotlin.CVideoChangeFrameRateStrategy;
import kotlin.CVolumeFlags;
import kotlin._findExplicitStringFactoryMethod;
import kotlin.b;
import kotlin.createRenderers;
import kotlin.forceDisableMediaCodecAsynchronousQueueing;
import kotlin.getChildPeriodUidFromConcatenatedUid;
import kotlin.hasPrevious;
import kotlin.n;
import kotlin.seekToDefaultPositionInternal;
import kotlin.seekToNextWindow;
import kotlin.setAudioFocusState;
import kotlin.wrapAsJsonMappingException;

/* JADX INFO: loaded from: classes2.dex */
public final class ForceStopRunnable implements Runnable {
    private static final long read;
    private final forceDisableMediaCodecAsynchronousQueueing AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer = 0;
    private final Context RemoteActionCompatParcelizer;
    private final hasPrevious write;

    static {
        n.write("ForceStopRunnable");
        read = TimeUnit.DAYS.toMillis(3650L);
    }

    public ForceStopRunnable(Context context, hasPrevious hasprevious) {
        this.RemoteActionCompatParcelizer = context.getApplicationContext();
        this.write = hasprevious;
        this.AudioAttributesCompatParcelizer = hasprevious.write();
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        try {
            if (IconCompatParcelizer()) {
                while (true) {
                    try {
                        seekToDefaultPositionInternal.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
                        n.write();
                        try {
                            RemoteActionCompatParcelizer();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e) {
                            int i = this.IconCompatParcelizer + 1;
                            this.IconCompatParcelizer = i;
                            if (i >= 3) {
                                if (_findExplicitStringFactoryMethod.read(this.RemoteActionCompatParcelizer)) {
                                    str = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.";
                                } else {
                                    str = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                }
                                n.write();
                                IllegalStateException illegalStateException = new IllegalStateException(str, e);
                                wrapAsJsonMappingException<Throwable> wrapasjsonmappingexceptionWrite = this.write.AudioAttributesCompatParcelizer().write();
                                if (wrapasjsonmappingexceptionWrite != null) {
                                    n.write();
                                    wrapasjsonmappingexceptionWrite.AudioAttributesCompatParcelizer(illegalStateException);
                                } else {
                                    throw illegalStateException;
                                }
                            } else {
                                n.write();
                                RemoteActionCompatParcelizer(((long) this.IconCompatParcelizer) * 300);
                            }
                        }
                    } catch (SQLiteException e2) {
                        n.write();
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                        wrapAsJsonMappingException<Throwable> wrapasjsonmappingexceptionWrite2 = this.write.AudioAttributesCompatParcelizer().write();
                        if (wrapasjsonmappingexceptionWrite2 != null) {
                            wrapasjsonmappingexceptionWrite2.AudioAttributesCompatParcelizer(illegalStateException2);
                        } else {
                            throw illegalStateException2;
                        }
                    }
                }
            }
        } finally {
            this.write.AudioAttributesImplApi21Parcelizer();
        }
    }

    private boolean read() {
        try {
            PendingIntent pendingIntent = read(this.RemoteActionCompatParcelizer, Build.VERSION.SDK_INT >= 31 ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (pendingIntent != null) {
                    pendingIntent.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.RemoteActionCompatParcelizer.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long jWrite = this.AudioAttributesCompatParcelizer.write();
                    for (int i = 0; i < historicalProcessExitReasons.size(); i++) {
                        ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(i);
                        if (applicationExitInfo.getReason() == 10 && applicationExitInfo.getTimestamp() >= jWrite) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntent == null) {
                IconCompatParcelizer(this.RemoteActionCompatParcelizer);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException unused) {
            n.write();
            return true;
        }
    }

    private void RemoteActionCompatParcelizer() {
        boolean zWrite = write();
        if (AudioAttributesCompatParcelizer()) {
            n.write();
            this.write.MediaBrowserCompatSearchResultReceiver();
            this.write.write().AudioAttributesCompatParcelizer();
        } else if (read()) {
            n.write();
            this.write.MediaBrowserCompatSearchResultReceiver();
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.write.AudioAttributesCompatParcelizer().getAudioAttributesCompatParcelizer().read());
        } else if (zWrite) {
            n.write();
            setAudioFocusState.write(this.write.AudioAttributesCompatParcelizer(), this.write.AudioAttributesImplApi26Parcelizer(), this.write.RemoteActionCompatParcelizer());
        }
    }

    private boolean write() {
        boolean zAudioAttributesCompatParcelizer = seekToNextWindow.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.write.AudioAttributesImplApi26Parcelizer());
        WorkDatabase workDatabaseAudioAttributesImplApi26Parcelizer = this.write.AudioAttributesImplApi26Parcelizer();
        CVolumeFlags cVolumeFlagsOnMediaButtonEvent = workDatabaseAudioAttributesImplApi26Parcelizer.onMediaButtonEvent();
        CStreamType cStreamTypeOnPlayFromMediaId = workDatabaseAudioAttributesImplApi26Parcelizer.onPlayFromMediaId();
        workDatabaseAudioAttributesImplApi26Parcelizer.read();
        try {
            List<CVideoChangeFrameRateStrategy> listIconCompatParcelizer = cVolumeFlagsOnMediaButtonEvent.IconCompatParcelizer();
            boolean z = (listIconCompatParcelizer == null || listIconCompatParcelizer.isEmpty()) ? false : true;
            if (z) {
                for (CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy : listIconCompatParcelizer) {
                    cVolumeFlagsOnMediaButtonEvent.RemoteActionCompatParcelizer(getChildPeriodUidFromConcatenatedUid.write.AudioAttributesCompatParcelizer, cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer);
                    cVolumeFlagsOnMediaButtonEvent.AudioAttributesCompatParcelizer(cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer, -512);
                    cVolumeFlagsOnMediaButtonEvent.AudioAttributesCompatParcelizer(cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer, -1L);
                }
            }
            cStreamTypeOnPlayFromMediaId.read();
            workDatabaseAudioAttributesImplApi26Parcelizer.onCustomAction();
            return z || zAudioAttributesCompatParcelizer;
        } finally {
            workDatabaseAudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer();
        }
    }

    private boolean AudioAttributesCompatParcelizer() {
        return this.write.write().read();
    }

    private boolean IconCompatParcelizer() {
        b bVarAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer();
        if (TextUtils.isEmpty(bVarAudioAttributesCompatParcelizer.getMediaDescriptionCompat())) {
            n.write();
            return true;
        }
        boolean zAudioAttributesCompatParcelizer = createRenderers.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, bVarAudioAttributesCompatParcelizer);
        n.write();
        return zAudioAttributesCompatParcelizer;
    }

    private static void RemoteActionCompatParcelizer(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    private static PendingIntent read(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, write(context), i);
    }

    private static Intent write(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    static void IconCompatParcelizer(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntent = read(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : C.BUFFER_FLAG_FIRST_SAMPLE);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = read;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis + j, pendingIntent);
        }
    }

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        static {
            n.write("ForceStopRunnable$Rcvr");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            n.write();
            ForceStopRunnable.IconCompatParcelizer(context);
        }
    }
}
