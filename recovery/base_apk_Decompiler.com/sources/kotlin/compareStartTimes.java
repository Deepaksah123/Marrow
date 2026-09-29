package kotlin;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.DownloadRequest;
import kotlin.getRetryDelayMillis;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class compareStartTimes<T> implements setNotMetRequirements<T> {
    private final int AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private final int[] AudioAttributesImplApi26Parcelizer;
    private final getRequirements AudioAttributesImplBaseParcelizer;
    private final DownloadManagerExternalSyntheticLambda0 IconCompatParcelizer;
    private final notifyWaitingForRequirementsChanged<?> MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final int MediaBrowserCompatMediaItem;
    private final Object[] MediaBrowserCompatSearchResultReceiver;
    private final removeAllDownloads MediaDescriptionCompat;
    private final int MediaMetadataCompat;
    private final DownloadManagerInternalHandler RatingCompat;
    private final int handleMediaPlayPauseIfPendingOnHandler;
    private final DownloadManagerTask<?, ?> onAddQueueItem;
    private final boolean onCommand;
    private final boolean onCustomAction;
    private final int[] write;
    private static final int[] read = new int[0];
    private static final Unsafe RemoteActionCompatParcelizer = DownloadProgress.write();

    private static boolean IconCompatParcelizer(int i) {
        return (i & 268435456) != 0;
    }

    private static int MediaBrowserCompatCustomActionResultReceiver(int i) {
        return (i & 267386880) >>> 20;
    }

    private static long read(int i) {
        return i & 1048575;
    }

    private compareStartTimes(int[] iArr, Object[] objArr, int i, int i2, DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0, boolean z, boolean z2, int[] iArr2, int i3, int i4, DownloadManagerInternalHandler downloadManagerInternalHandler, getRequirements getrequirements, DownloadManagerTask<?, ?> downloadManagerTask, notifyWaitingForRequirementsChanged<?> notifywaitingforrequirementschanged, removeAllDownloads removealldownloads) {
        this.write = iArr;
        this.MediaBrowserCompatSearchResultReceiver = objArr;
        this.MediaMetadataCompat = i;
        this.MediaBrowserCompatMediaItem = i2;
        this.MediaBrowserCompatItemReceiver = downloadManagerExternalSyntheticLambda0 instanceof updateWaitingForRequirements;
        this.onCommand = z;
        this.AudioAttributesImplApi21Parcelizer = notifywaitingforrequirementschanged != null && notifywaitingforrequirementschanged.read(downloadManagerExternalSyntheticLambda0);
        this.onCustomAction = z2;
        this.AudioAttributesImplApi26Parcelizer = iArr2;
        this.AudioAttributesCompatParcelizer = i3;
        this.handleMediaPlayPauseIfPendingOnHandler = i4;
        this.RatingCompat = downloadManagerInternalHandler;
        this.AudioAttributesImplBaseParcelizer = getrequirements;
        this.onAddQueueItem = downloadManagerTask;
        this.MediaBrowserCompatCustomActionResultReceiver = notifywaitingforrequirementschanged;
        this.IconCompatParcelizer = downloadManagerExternalSyntheticLambda0;
        this.MediaDescriptionCompat = removealldownloads;
    }

    static <T> compareStartTimes<T> read(DownloadManager1 downloadManager1, DownloadManagerInternalHandler downloadManagerInternalHandler, getRequirements getrequirements, DownloadManagerTask<?, ?> downloadManagerTask, notifyWaitingForRequirementsChanged<?> notifywaitingforrequirementschanged, removeAllDownloads removealldownloads) {
        if (downloadManager1 instanceof syncRemovingDownload) {
            return AudioAttributesCompatParcelizer((syncRemovingDownload) downloadManager1, downloadManagerInternalHandler, getrequirements, downloadManagerTask, notifywaitingforrequirementschanged, removealldownloads);
        }
        return AudioAttributesCompatParcelizer((syncTasks) downloadManager1, downloadManagerInternalHandler, getrequirements, downloadManagerTask, notifywaitingforrequirementschanged, removealldownloads);
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x035d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> kotlin.compareStartTimes<T> AudioAttributesCompatParcelizer(kotlin.syncRemovingDownload r32, kotlin.DownloadManagerInternalHandler r33, kotlin.getRequirements r34, kotlin.DownloadManagerTask<?, ?> r35, kotlin.notifyWaitingForRequirementsChanged<?> r36, kotlin.removeAllDownloads r37) {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.compareStartTimes.AudioAttributesCompatParcelizer(o.syncRemovingDownload, o.DownloadManagerInternalHandler, o.getRequirements, o.DownloadManagerTask, o.notifyWaitingForRequirementsChanged, o.removeAllDownloads):o.compareStartTimes");
    }

    private static Field AudioAttributesCompatParcelizer(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sb = new StringBuilder("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(cls.getName());
            sb.append(" not found. Known fields are ");
            sb.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sb.toString());
        }
    }

    private static <T> compareStartTimes<T> AudioAttributesCompatParcelizer(syncTasks synctasks, DownloadManagerInternalHandler downloadManagerInternalHandler, getRequirements getrequirements, DownloadManagerTask<?, ?> downloadManagerTask, notifyWaitingForRequirementsChanged<?> notifywaitingforrequirementschanged, removeAllDownloads removealldownloads) {
        int i;
        int i2;
        int i3;
        boolean z = synctasks.write() == onRemoveTaskStopped.PROTO3;
        handleMainMessage[] handlemainmessageArrIconCompatParcelizer = synctasks.IconCompatParcelizer();
        if (handlemainmessageArrIconCompatParcelizer.length == 0) {
            i = 0;
            i2 = 0;
        } else {
            i = handlemainmessageArrIconCompatParcelizer[0].read();
            i2 = handlemainmessageArrIconCompatParcelizer[handlemainmessageArrIconCompatParcelizer.length - 1].read();
        }
        int length = handlemainmessageArrIconCompatParcelizer.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length << 1];
        int i4 = 0;
        int i5 = 0;
        for (handleMainMessage handlemainmessage : handlemainmessageArrIconCompatParcelizer) {
            if (handlemainmessage.AudioAttributesImplApi26Parcelizer() == setDownloadsPaused.MAP) {
                i4++;
            } else if (handlemainmessage.AudioAttributesImplApi26Parcelizer().write() >= 18 && handlemainmessage.AudioAttributesImplApi26Parcelizer().write() <= 49) {
                i5++;
            }
        }
        int[] iArr2 = i4 > 0 ? new int[i4] : null;
        int[] iArr3 = i5 > 0 ? new int[i5] : null;
        int[] iArrRemoteActionCompatParcelizer = synctasks.RemoteActionCompatParcelizer();
        if (iArrRemoteActionCompatParcelizer == null) {
            iArrRemoteActionCompatParcelizer = read;
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i6 < handlemainmessageArrIconCompatParcelizer.length) {
            handleMainMessage handlemainmessage2 = handlemainmessageArrIconCompatParcelizer[i6];
            int i11 = handlemainmessage2.read();
            RemoteActionCompatParcelizer(handlemainmessage2, iArr, i7, objArr);
            if (i8 < iArrRemoteActionCompatParcelizer.length && iArrRemoteActionCompatParcelizer[i8] == i11) {
                iArrRemoteActionCompatParcelizer[i8] = i7;
                i8++;
            }
            if (handlemainmessage2.AudioAttributesImplApi26Parcelizer() == setDownloadsPaused.MAP) {
                iArr2[i9] = i7;
                i9++;
            } else {
                if (handlemainmessage2.AudioAttributesImplApi26Parcelizer().write() >= 18 && handlemainmessage2.AudioAttributesImplApi26Parcelizer().write() <= 49) {
                    i3 = i7;
                    iArr3[i10] = (int) DownloadProgress.read(handlemainmessage2.IconCompatParcelizer());
                    i10++;
                }
                i6++;
                i7 = i3 + 3;
            }
            i3 = i7;
            i6++;
            i7 = i3 + 3;
        }
        if (iArr2 == null) {
            iArr2 = read;
        }
        if (iArr3 == null) {
            iArr3 = read;
        }
        int[] iArr4 = new int[iArrRemoteActionCompatParcelizer.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrRemoteActionCompatParcelizer, 0, iArr4, 0, iArrRemoteActionCompatParcelizer.length);
        System.arraycopy(iArr2, 0, iArr4, iArrRemoteActionCompatParcelizer.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrRemoteActionCompatParcelizer.length + iArr2.length, iArr3.length);
        return new compareStartTimes<>(iArr, objArr, i, i2, synctasks.AudioAttributesCompatParcelizer(), z, true, iArr4, iArrRemoteActionCompatParcelizer.length, iArrRemoteActionCompatParcelizer.length + iArr2.length, downloadManagerInternalHandler, getrequirements, downloadManagerTask, notifywaitingforrequirementschanged, removealldownloads);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void RemoteActionCompatParcelizer(kotlin.handleMainMessage r7, int[] r8, int r9, java.lang.Object[] r10) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.compareStartTimes.RemoteActionCompatParcelizer(o.handleMainMessage, int[], int, java.lang.Object[]):void");
    }

    @Override // kotlin.setNotMetRequirements
    public final T read() {
        return (T) this.RatingCompat.write(this.IconCompatParcelizer);
    }

    @Override // kotlin.setNotMetRequirements
    public final boolean RemoteActionCompatParcelizer(T t, T t2) {
        int length = this.write.length;
        for (int i = 0; i < length; i += 3) {
            if (!IconCompatParcelizer(t, t2, i)) {
                return false;
            }
        }
        if (!this.onAddQueueItem.AudioAttributesCompatParcelizer(t).equals(this.onAddQueueItem.AudioAttributesCompatParcelizer(t2))) {
            return false;
        }
        if (this.AudioAttributesImplApi21Parcelizer) {
            return this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(t).equals(this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(t2));
        }
        return true;
    }

    private boolean IconCompatParcelizer(T t, T t2, int i) {
        int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(i);
        long j = read(iAudioAttributesImplApi26Parcelizer);
        switch (MediaBrowserCompatCustomActionResultReceiver(iAudioAttributesImplApi26Parcelizer)) {
            case 0:
                if (!read(t, t2, i) || Double.doubleToLongBits(DownloadProgress.AudioAttributesImplApi26Parcelizer(t, j)) != Double.doubleToLongBits(DownloadProgress.AudioAttributesImplApi26Parcelizer(t2, j))) {
                }
                break;
            case 1:
                if (!read(t, t2, i) || Float.floatToIntBits(DownloadProgress.AudioAttributesImplBaseParcelizer(t, j)) != Float.floatToIntBits(DownloadProgress.AudioAttributesImplBaseParcelizer(t2, j))) {
                }
                break;
            case 2:
                if (!read(t, t2, i) || DownloadProgress.MediaBrowserCompatItemReceiver(t, j) != DownloadProgress.MediaBrowserCompatItemReceiver(t2, j)) {
                }
                break;
            case 3:
                if (!read(t, t2, i) || DownloadProgress.MediaBrowserCompatItemReceiver(t, j) != DownloadProgress.MediaBrowserCompatItemReceiver(t2, j)) {
                }
                break;
            case 4:
                if (!read(t, t2, i) || DownloadProgress.AudioAttributesImplApi21Parcelizer(t, j) != DownloadProgress.AudioAttributesImplApi21Parcelizer(t2, j)) {
                }
                break;
            case 5:
                if (!read(t, t2, i) || DownloadProgress.MediaBrowserCompatItemReceiver(t, j) != DownloadProgress.MediaBrowserCompatItemReceiver(t2, j)) {
                }
                break;
            case 6:
                if (!read(t, t2, i) || DownloadProgress.AudioAttributesImplApi21Parcelizer(t, j) != DownloadProgress.AudioAttributesImplApi21Parcelizer(t2, j)) {
                }
                break;
            case 7:
                if (!read(t, t2, i) || DownloadProgress.IconCompatParcelizer(t, j) != DownloadProgress.IconCompatParcelizer(t2, j)) {
                }
                break;
            case 8:
                if (!read(t, t2, i) || !DownloadManagerListener.IconCompatParcelizer(DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j), DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t2, j))) {
                }
                break;
            case 9:
                if (!read(t, t2, i) || !DownloadManagerListener.IconCompatParcelizer(DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j), DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t2, j))) {
                }
                break;
            case 10:
                if (!read(t, t2, i) || !DownloadManagerListener.IconCompatParcelizer(DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j), DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t2, j))) {
                }
                break;
            case 11:
                if (!read(t, t2, i) || DownloadProgress.AudioAttributesImplApi21Parcelizer(t, j) != DownloadProgress.AudioAttributesImplApi21Parcelizer(t2, j)) {
                }
                break;
            case 12:
                if (!read(t, t2, i) || DownloadProgress.AudioAttributesImplApi21Parcelizer(t, j) != DownloadProgress.AudioAttributesImplApi21Parcelizer(t2, j)) {
                }
                break;
            case 13:
                if (!read(t, t2, i) || DownloadProgress.AudioAttributesImplApi21Parcelizer(t, j) != DownloadProgress.AudioAttributesImplApi21Parcelizer(t2, j)) {
                }
                break;
            case 14:
                if (!read(t, t2, i) || DownloadProgress.MediaBrowserCompatItemReceiver(t, j) != DownloadProgress.MediaBrowserCompatItemReceiver(t2, j)) {
                }
                break;
            case 15:
                if (!read(t, t2, i) || DownloadProgress.AudioAttributesImplApi21Parcelizer(t, j) != DownloadProgress.AudioAttributesImplApi21Parcelizer(t2, j)) {
                }
                break;
            case 16:
                if (!read(t, t2, i) || DownloadProgress.MediaBrowserCompatItemReceiver(t, j) != DownloadProgress.MediaBrowserCompatItemReceiver(t2, j)) {
                }
                break;
            case 17:
                if (!read(t, t2, i) || !DownloadManagerListener.IconCompatParcelizer(DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j), DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t2, j))) {
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!AudioAttributesCompatParcelizer(t, t2, i) || !DownloadManagerListener.IconCompatParcelizer(DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j), DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t2, j))) {
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01c0  */
    @Override // kotlin.setNotMetRequirements
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int IconCompatParcelizer(T r8) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.compareStartTimes.IconCompatParcelizer(java.lang.Object):int");
    }

    @Override // kotlin.setNotMetRequirements
    public final void AudioAttributesCompatParcelizer(T t, T t2) {
        read(t);
        for (int i = 0; i < this.write.length; i += 3) {
            AudioAttributesImplApi21Parcelizer(t, t2, i);
        }
        DownloadManagerListener.AudioAttributesCompatParcelizer(this.onAddQueueItem, t, t2);
        if (this.AudioAttributesImplApi21Parcelizer) {
            DownloadManagerListener.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, t, t2);
        }
    }

    private void AudioAttributesImplApi21Parcelizer(T t, T t2, int i) {
        int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(i);
        long j = read(iAudioAttributesImplApi26Parcelizer);
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
        switch (MediaBrowserCompatCustomActionResultReceiver(iAudioAttributesImplApi26Parcelizer)) {
            case 0:
                if (write((Object) t2, i)) {
                    DownloadProgress.write(t, j, DownloadProgress.AudioAttributesImplApi26Parcelizer(t2, j));
                    RemoteActionCompatParcelizer((Object) t, i);
                }
                break;
            case 1:
                if (write((Object) t2, i)) {
                    DownloadProgress.RemoteActionCompatParcelizer(t, j, DownloadProgress.AudioAttributesImplBaseParcelizer(t2, j));
                    RemoteActionCompatParcelizer((Object) t, i);
                }
                break;
            case 2:
                if (write((Object) t2, i)) {
                    DownloadProgress.write((Object) t, j, DownloadProgress.MediaBrowserCompatItemReceiver(t2, j));
                    RemoteActionCompatParcelizer((Object) t, i);
                }
                break;
            case 3:
                if (write((Object) t2, i)) {
                    DownloadProgress.write((Object) t, j, DownloadProgress.MediaBrowserCompatItemReceiver(t2, j));
                    RemoteActionCompatParcelizer((Object) t, i);
                }
                break;
            case 4:
                if (write((Object) t2, i)) {
                    DownloadProgress.write((Object) t, j, DownloadProgress.AudioAttributesImplApi21Parcelizer(t2, j));
                    RemoteActionCompatParcelizer((Object) t, i);
                }
                break;
            case 5:
                if (write((Object) t2, i)) {
                    DownloadProgress.write((Object) t, j, DownloadProgress.MediaBrowserCompatItemReceiver(t2, j));
                    RemoteActionCompatParcelizer((Object) t, i);
                }
                break;
            case 6:
                if (write((Object) t2, i)) {
                    DownloadProgress.write((Object) t, j, DownloadProgress.AudioAttributesImplApi21Parcelizer(t2, j));
                    RemoteActionCompatParcelizer((Object) t, i);
                }
                break;
            case 7:
                if (write((Object) t2, i)) {
                    DownloadProgress.AudioAttributesCompatParcelizer(t, j, DownloadProgress.IconCompatParcelizer(t2, j));
                    RemoteActionCompatParcelizer((Object) t, i);
                }
                break;
            case 8:
                if (write((Object) t2, i)) {
                    DownloadProgress.write(t, j, DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t2, j));
                    RemoteActionCompatParcelizer((Object) t, i);
                }
                break;
            case 9:
                RemoteActionCompatParcelizer(t, t2, i);
                break;
            case 10:
                if (write((Object) t2, i)) {
                    DownloadProgress.write(t, j, DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t2, j));
                    RemoteActionCompatParcelizer((Object) t, i);
                }
                break;
            case 11:
                if (write((Object) t2, i)) {
                    DownloadProgress.write((Object) t, j, DownloadProgress.AudioAttributesImplApi21Parcelizer(t2, j));
                    RemoteActionCompatParcelizer((Object) t, i);
                }
                break;
            case 12:
                if (write((Object) t2, i)) {
                    DownloadProgress.write((Object) t, j, DownloadProgress.AudioAttributesImplApi21Parcelizer(t2, j));
                    RemoteActionCompatParcelizer((Object) t, i);
                }
                break;
            case 13:
                if (write((Object) t2, i)) {
                    DownloadProgress.write((Object) t, j, DownloadProgress.AudioAttributesImplApi21Parcelizer(t2, j));
                    RemoteActionCompatParcelizer((Object) t, i);
                }
                break;
            case 14:
                if (write((Object) t2, i)) {
                    DownloadProgress.write((Object) t, j, DownloadProgress.MediaBrowserCompatItemReceiver(t2, j));
                    RemoteActionCompatParcelizer((Object) t, i);
                }
                break;
            case 15:
                if (write((Object) t2, i)) {
                    DownloadProgress.write((Object) t, j, DownloadProgress.AudioAttributesImplApi21Parcelizer(t2, j));
                    RemoteActionCompatParcelizer((Object) t, i);
                }
                break;
            case 16:
                if (write((Object) t2, i)) {
                    DownloadProgress.write((Object) t, j, DownloadProgress.MediaBrowserCompatItemReceiver(t2, j));
                    RemoteActionCompatParcelizer((Object) t, i);
                }
                break;
            case 17:
                RemoteActionCompatParcelizer(t, t2, i);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(t, t2, j);
                break;
            case 50:
                DownloadManagerListener.AudioAttributesCompatParcelizer(this.MediaDescriptionCompat, t, t2, j);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (write(t2, iRemoteActionCompatParcelizer, i)) {
                    DownloadProgress.write(t, j, DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t2, j));
                    read(t, iRemoteActionCompatParcelizer, i);
                }
                break;
            case 60:
                write(t, t2, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (write(t2, iRemoteActionCompatParcelizer, i)) {
                    DownloadProgress.write(t, j, DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t2, j));
                    read(t, iRemoteActionCompatParcelizer, i);
                }
                break;
            case 68:
                write(t, t2, i);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void RemoteActionCompatParcelizer(T t, T t2, int i) {
        if (write((Object) t2, i)) {
            long j = read(AudioAttributesImplApi26Parcelizer(i));
            Unsafe unsafe = RemoteActionCompatParcelizer;
            Object object = unsafe.getObject(t2, j);
            if (object == null) {
                StringBuilder sb = new StringBuilder("Source subfield ");
                sb.append(RemoteActionCompatParcelizer(i));
                sb.append(" is present but null: ");
                sb.append(t2);
                throw new IllegalStateException(sb.toString());
            }
            setNotMetRequirements setnotmetrequirementsAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i);
            if (!write((Object) t, i)) {
                if (!AudioAttributesImplApi26Parcelizer(object)) {
                    unsafe.putObject(t, j, object);
                } else {
                    Object obj = setnotmetrequirementsAudioAttributesCompatParcelizer.read();
                    setnotmetrequirementsAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(obj, object);
                    unsafe.putObject(t, j, obj);
                }
                RemoteActionCompatParcelizer((Object) t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, j);
            if (!AudioAttributesImplApi26Parcelizer(object2)) {
                Object obj2 = setnotmetrequirementsAudioAttributesCompatParcelizer.read();
                setnotmetrequirementsAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(obj2, object2);
                unsafe.putObject(t, j, obj2);
                object2 = obj2;
            }
            setnotmetrequirementsAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void write(T t, T t2, int i) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
        if (write(t2, iRemoteActionCompatParcelizer, i)) {
            long j = read(AudioAttributesImplApi26Parcelizer(i));
            Unsafe unsafe = RemoteActionCompatParcelizer;
            Object object = unsafe.getObject(t2, j);
            if (object == null) {
                StringBuilder sb = new StringBuilder("Source subfield ");
                sb.append(RemoteActionCompatParcelizer(i));
                sb.append(" is present but null: ");
                sb.append(t2);
                throw new IllegalStateException(sb.toString());
            }
            setNotMetRequirements setnotmetrequirementsAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i);
            if (!write(t, iRemoteActionCompatParcelizer, i)) {
                if (!AudioAttributesImplApi26Parcelizer(object)) {
                    unsafe.putObject(t, j, object);
                } else {
                    Object obj = setnotmetrequirementsAudioAttributesCompatParcelizer.read();
                    setnotmetrequirementsAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(obj, object);
                    unsafe.putObject(t, j, obj);
                }
                read(t, iRemoteActionCompatParcelizer, i);
                return;
            }
            Object object2 = unsafe.getObject(t, j);
            if (!AudioAttributesImplApi26Parcelizer(object2)) {
                Object obj2 = setnotmetrequirementsAudioAttributesCompatParcelizer.read();
                setnotmetrequirementsAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(obj2, object2);
                unsafe.putObject(t, j, obj2);
                object2 = obj2;
            }
            setnotmetrequirementsAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(object2, object);
        }
    }

    @Override // kotlin.setNotMetRequirements
    public final int AudioAttributesCompatParcelizer(T t) {
        return this.onCommand ? MediaBrowserCompatItemReceiver(t) : AudioAttributesImplBaseParcelizer(t);
    }

    private int AudioAttributesImplBaseParcelizer(T t) {
        int i;
        int i2;
        int iWrite;
        int iWrite2;
        int iMediaBrowserCompatSearchResultReceiver;
        int iMediaMetadataCompat;
        Unsafe unsafe = RemoteActionCompatParcelizer;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < this.write.length) {
            int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(i5);
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i5);
            int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(iAudioAttributesImplApi26Parcelizer);
            if (iMediaBrowserCompatCustomActionResultReceiver <= 17) {
                i = this.write[i5 + 2];
                int i8 = i & i3;
                i2 = 1 << (i >>> 20);
                if (i8 != i4) {
                    i7 = unsafe.getInt(t, i8);
                    i4 = i8;
                }
            } else {
                i = (!this.onCustomAction || iMediaBrowserCompatCustomActionResultReceiver < setDownloadsPaused.DOUBLE_LIST_PACKED.write() || iMediaBrowserCompatCustomActionResultReceiver > setDownloadsPaused.SINT64_LIST_PACKED.write()) ? 0 : this.write[i5 + 2] & i3;
                i2 = 0;
            }
            long j = read(iAudioAttributesImplApi26Parcelizer);
            switch (iMediaBrowserCompatCustomActionResultReceiver) {
                case 0:
                    if ((i7 & i2) != 0) {
                        iWrite = DownloadManager.write(iRemoteActionCompatParcelizer);
                        i6 += iWrite;
                    }
                    break;
                case 1:
                    if ((i7 & i2) != 0) {
                        iWrite = DownloadManager.AudioAttributesImplBaseParcelizer(iRemoteActionCompatParcelizer);
                        i6 += iWrite;
                    }
                    break;
                case 2:
                    if ((i7 & i2) != 0) {
                        iWrite = DownloadManager.read(iRemoteActionCompatParcelizer, unsafe.getLong(t, j));
                        i6 += iWrite;
                    }
                    break;
                case 3:
                    if ((i7 & i2) != 0) {
                        iWrite = DownloadManager.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, unsafe.getLong(t, j));
                        i6 += iWrite;
                    }
                    break;
                case 4:
                    if ((i7 & i2) != 0) {
                        iWrite = DownloadManager.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, unsafe.getInt(t, j));
                        i6 += iWrite;
                    }
                    break;
                case 5:
                    if ((i7 & i2) != 0) {
                        iWrite = DownloadManager.read(iRemoteActionCompatParcelizer);
                        i6 += iWrite;
                    }
                    break;
                case 6:
                    if ((i7 & i2) != 0) {
                        iWrite = DownloadManager.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer);
                        i6 += iWrite;
                    }
                    break;
                case 7:
                    if ((i7 & i2) != 0) {
                        iWrite = DownloadManager.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer);
                        i6 += iWrite;
                    }
                    break;
                case 8:
                    if ((i7 & i2) != 0) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof DownloadIndex) {
                            iWrite = DownloadManager.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, (DownloadIndex) object);
                        } else {
                            iWrite = DownloadManager.IconCompatParcelizer(iRemoteActionCompatParcelizer, (String) object);
                        }
                        i6 += iWrite;
                    }
                    break;
                case 9:
                    if ((i7 & i2) != 0) {
                        iWrite = DownloadManagerListener.IconCompatParcelizer(iRemoteActionCompatParcelizer, unsafe.getObject(t, j), AudioAttributesCompatParcelizer(i5));
                        i6 += iWrite;
                    }
                    break;
                case 10:
                    if ((i7 & i2) != 0) {
                        iWrite = DownloadManager.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, (DownloadIndex) unsafe.getObject(t, j));
                        i6 += iWrite;
                    }
                    break;
                case 11:
                    if ((i7 & i2) != 0) {
                        iWrite = DownloadManager.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, unsafe.getInt(t, j));
                        i6 += iWrite;
                    }
                    break;
                case 12:
                    if ((i7 & i2) != 0) {
                        iWrite = DownloadManager.IconCompatParcelizer(iRemoteActionCompatParcelizer, unsafe.getInt(t, j));
                        i6 += iWrite;
                    }
                    break;
                case 13:
                    if ((i7 & i2) != 0) {
                        iWrite = DownloadManager.AudioAttributesImplApi21Parcelizer(iRemoteActionCompatParcelizer);
                        i6 += iWrite;
                    }
                    break;
                case 14:
                    if ((i7 & i2) != 0) {
                        iWrite = DownloadManager.MediaBrowserCompatItemReceiver(iRemoteActionCompatParcelizer);
                        i6 += iWrite;
                    }
                    break;
                case 15:
                    if ((i7 & i2) != 0) {
                        iWrite = DownloadManager.write(iRemoteActionCompatParcelizer, unsafe.getInt(t, j));
                        i6 += iWrite;
                    }
                    break;
                case 16:
                    if ((i7 & i2) != 0) {
                        iWrite = DownloadManager.IconCompatParcelizer(iRemoteActionCompatParcelizer, unsafe.getLong(t, j));
                        i6 += iWrite;
                    }
                    break;
                case 17:
                    if ((i7 & i2) != 0) {
                        iWrite = DownloadManager.IconCompatParcelizer(iRemoteActionCompatParcelizer, (DownloadManagerExternalSyntheticLambda0) unsafe.getObject(t, j), AudioAttributesCompatParcelizer(i5));
                        i6 += iWrite;
                    }
                    break;
                case 18:
                    iWrite = DownloadManagerListener.IconCompatParcelizer(iRemoteActionCompatParcelizer, (List<?>) unsafe.getObject(t, j));
                    i6 += iWrite;
                    break;
                case 19:
                    iWrite = DownloadManagerListener.read(iRemoteActionCompatParcelizer, (List) unsafe.getObject(t, j));
                    i6 += iWrite;
                    break;
                case 20:
                    iWrite = DownloadManagerListener.AudioAttributesImplApi26Parcelizer(iRemoteActionCompatParcelizer, (List) unsafe.getObject(t, j));
                    i6 += iWrite;
                    break;
                case 21:
                    iWrite = DownloadManagerListener.RatingCompat(iRemoteActionCompatParcelizer, (List) unsafe.getObject(t, j));
                    i6 += iWrite;
                    break;
                case 22:
                    iWrite = DownloadManagerListener.MediaBrowserCompatItemReceiver(iRemoteActionCompatParcelizer, (List) unsafe.getObject(t, j));
                    i6 += iWrite;
                    break;
                case 23:
                    iWrite = DownloadManagerListener.IconCompatParcelizer(iRemoteActionCompatParcelizer, (List<?>) unsafe.getObject(t, j));
                    i6 += iWrite;
                    break;
                case 24:
                    iWrite = DownloadManagerListener.read(iRemoteActionCompatParcelizer, (List) unsafe.getObject(t, j));
                    i6 += iWrite;
                    break;
                case 25:
                    iWrite = DownloadManagerListener.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, (List) unsafe.getObject(t, j));
                    i6 += iWrite;
                    break;
                case 26:
                    iWrite = DownloadManagerListener.AudioAttributesImplBaseParcelizer(iRemoteActionCompatParcelizer, (List) unsafe.getObject(t, j));
                    i6 += iWrite;
                    break;
                case 27:
                    iWrite = DownloadManagerListener.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, (List<?>) unsafe.getObject(t, j), AudioAttributesCompatParcelizer(i5));
                    i6 += iWrite;
                    break;
                case 28:
                    iWrite = DownloadManagerListener.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, (List) unsafe.getObject(t, j));
                    i6 += iWrite;
                    break;
                case 29:
                    iWrite = DownloadManagerListener.MediaBrowserCompatMediaItem(iRemoteActionCompatParcelizer, (List) unsafe.getObject(t, j));
                    i6 += iWrite;
                    break;
                case 30:
                    iWrite = DownloadManagerListener.write(iRemoteActionCompatParcelizer, (List) unsafe.getObject(t, j));
                    i6 += iWrite;
                    break;
                case 31:
                    iWrite = DownloadManagerListener.read(iRemoteActionCompatParcelizer, (List) unsafe.getObject(t, j));
                    i6 += iWrite;
                    break;
                case 32:
                    iWrite = DownloadManagerListener.IconCompatParcelizer(iRemoteActionCompatParcelizer, (List<?>) unsafe.getObject(t, j));
                    i6 += iWrite;
                    break;
                case 33:
                    iWrite = DownloadManagerListener.AudioAttributesImplApi21Parcelizer(iRemoteActionCompatParcelizer, (List) unsafe.getObject(t, j));
                    i6 += iWrite;
                    break;
                case 34:
                    iWrite = DownloadManagerListener.MediaBrowserCompatCustomActionResultReceiver(iRemoteActionCompatParcelizer, (List) unsafe.getObject(t, j));
                    i6 += iWrite;
                    break;
                case 35:
                    iWrite2 = DownloadManagerListener.write((List) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iWrite2 + iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat;
                        i6 += iWrite;
                    }
                    break;
                case 36:
                    iWrite2 = DownloadManagerListener.AudioAttributesCompatParcelizer((List<?>) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iWrite2 + iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat;
                        i6 += iWrite;
                    }
                    break;
                case 37:
                    iWrite2 = DownloadManagerListener.AudioAttributesImplBaseParcelizer((List) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iWrite2 + iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat;
                        i6 += iWrite;
                    }
                    break;
                case 38:
                    iWrite2 = DownloadManagerListener.AudioAttributesImplApi21Parcelizer((List) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iWrite2 + iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat;
                        i6 += iWrite;
                    }
                    break;
                case 39:
                    iWrite2 = DownloadManagerListener.IconCompatParcelizer((List) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iWrite2 + iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat;
                        i6 += iWrite;
                    }
                    break;
                case 40:
                    iWrite2 = DownloadManagerListener.write((List) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iWrite2 + iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat;
                        i6 += iWrite;
                    }
                    break;
                case 41:
                    iWrite2 = DownloadManagerListener.AudioAttributesCompatParcelizer((List<?>) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iWrite2 + iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat;
                        i6 += iWrite;
                    }
                    break;
                case 42:
                    iWrite2 = DownloadManagerListener.RemoteActionCompatParcelizer((List<?>) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iWrite2 + iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat;
                        i6 += iWrite;
                    }
                    break;
                case 43:
                    iWrite2 = DownloadManagerListener.MediaBrowserCompatCustomActionResultReceiver((List) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iWrite2 + iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat;
                        i6 += iWrite;
                    }
                    break;
                case 44:
                    iWrite2 = DownloadManagerListener.read((List) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iWrite2 + iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat;
                        i6 += iWrite;
                    }
                    break;
                case 45:
                    iWrite2 = DownloadManagerListener.AudioAttributesCompatParcelizer((List<?>) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iWrite2 + iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat;
                        i6 += iWrite;
                    }
                    break;
                case 46:
                    iWrite2 = DownloadManagerListener.write((List) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iWrite2 + iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat;
                        i6 += iWrite;
                    }
                    break;
                case 47:
                    iWrite2 = DownloadManagerListener.AudioAttributesImplApi26Parcelizer((List) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iWrite2 + iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat;
                        i6 += iWrite;
                    }
                    break;
                case 48:
                    iWrite2 = DownloadManagerListener.MediaBrowserCompatItemReceiver((List) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iWrite2 + iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat;
                        i6 += iWrite;
                    }
                    break;
                case 49:
                    iWrite = DownloadManagerListener.write(iRemoteActionCompatParcelizer, (List) unsafe.getObject(t, j), AudioAttributesCompatParcelizer(i5));
                    i6 += iWrite;
                    break;
                case 50:
                    iWrite = this.MediaDescriptionCompat.IconCompatParcelizer(iRemoteActionCompatParcelizer, unsafe.getObject(t, j), write(i5));
                    i6 += iWrite;
                    break;
                case 51:
                    if (write(t, iRemoteActionCompatParcelizer, i5)) {
                        iWrite = DownloadManager.write(iRemoteActionCompatParcelizer);
                        i6 += iWrite;
                    }
                    break;
                case 52:
                    if (write(t, iRemoteActionCompatParcelizer, i5)) {
                        iWrite = DownloadManager.AudioAttributesImplBaseParcelizer(iRemoteActionCompatParcelizer);
                        i6 += iWrite;
                    }
                    break;
                case 53:
                    if (write(t, iRemoteActionCompatParcelizer, i5)) {
                        iWrite = DownloadManager.read(iRemoteActionCompatParcelizer, MediaBrowserCompatSearchResultReceiver(t, j));
                        i6 += iWrite;
                    }
                    break;
                case 54:
                    if (write(t, iRemoteActionCompatParcelizer, i5)) {
                        iWrite = DownloadManager.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, MediaBrowserCompatSearchResultReceiver(t, j));
                        i6 += iWrite;
                    }
                    break;
                case 55:
                    if (write(t, iRemoteActionCompatParcelizer, i5)) {
                        iWrite = DownloadManager.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, AudioAttributesImplBaseParcelizer(t, j));
                        i6 += iWrite;
                    }
                    break;
                case 56:
                    if (write(t, iRemoteActionCompatParcelizer, i5)) {
                        iWrite = DownloadManager.read(iRemoteActionCompatParcelizer);
                        i6 += iWrite;
                    }
                    break;
                case 57:
                    if (write(t, iRemoteActionCompatParcelizer, i5)) {
                        iWrite = DownloadManager.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer);
                        i6 += iWrite;
                    }
                    break;
                case 58:
                    if (write(t, iRemoteActionCompatParcelizer, i5)) {
                        iWrite = DownloadManager.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer);
                        i6 += iWrite;
                    }
                    break;
                case 59:
                    if (write(t, iRemoteActionCompatParcelizer, i5)) {
                        Object object2 = unsafe.getObject(t, j);
                        if (object2 instanceof DownloadIndex) {
                            iWrite = DownloadManager.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, (DownloadIndex) object2);
                        } else {
                            iWrite = DownloadManager.IconCompatParcelizer(iRemoteActionCompatParcelizer, (String) object2);
                        }
                        i6 += iWrite;
                    }
                    break;
                case 60:
                    if (write(t, iRemoteActionCompatParcelizer, i5)) {
                        iWrite = DownloadManagerListener.IconCompatParcelizer(iRemoteActionCompatParcelizer, unsafe.getObject(t, j), AudioAttributesCompatParcelizer(i5));
                        i6 += iWrite;
                    }
                    break;
                case 61:
                    if (write(t, iRemoteActionCompatParcelizer, i5)) {
                        iWrite = DownloadManager.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, (DownloadIndex) unsafe.getObject(t, j));
                        i6 += iWrite;
                    }
                    break;
                case 62:
                    if (write(t, iRemoteActionCompatParcelizer, i5)) {
                        iWrite = DownloadManager.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, AudioAttributesImplBaseParcelizer(t, j));
                        i6 += iWrite;
                    }
                    break;
                case 63:
                    if (write(t, iRemoteActionCompatParcelizer, i5)) {
                        iWrite = DownloadManager.IconCompatParcelizer(iRemoteActionCompatParcelizer, AudioAttributesImplBaseParcelizer(t, j));
                        i6 += iWrite;
                    }
                    break;
                case 64:
                    if (write(t, iRemoteActionCompatParcelizer, i5)) {
                        iWrite = DownloadManager.AudioAttributesImplApi21Parcelizer(iRemoteActionCompatParcelizer);
                        i6 += iWrite;
                    }
                    break;
                case 65:
                    if (write(t, iRemoteActionCompatParcelizer, i5)) {
                        iWrite = DownloadManager.MediaBrowserCompatItemReceiver(iRemoteActionCompatParcelizer);
                        i6 += iWrite;
                    }
                    break;
                case 66:
                    if (write(t, iRemoteActionCompatParcelizer, i5)) {
                        iWrite = DownloadManager.write(iRemoteActionCompatParcelizer, AudioAttributesImplBaseParcelizer(t, j));
                        i6 += iWrite;
                    }
                    break;
                case 67:
                    if (write(t, iRemoteActionCompatParcelizer, i5)) {
                        iWrite = DownloadManager.IconCompatParcelizer(iRemoteActionCompatParcelizer, MediaBrowserCompatSearchResultReceiver(t, j));
                        i6 += iWrite;
                    }
                    break;
                case 68:
                    if (write(t, iRemoteActionCompatParcelizer, i5)) {
                        iWrite = DownloadManager.IconCompatParcelizer(iRemoteActionCompatParcelizer, (DownloadManagerExternalSyntheticLambda0) unsafe.getObject(t, j), AudioAttributesCompatParcelizer(i5));
                        i6 += iWrite;
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        int i9 = i6 + read(this.onAddQueueItem, t);
        return this.AudioAttributesImplApi21Parcelizer ? i9 + this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(t).IconCompatParcelizer() : i9;
    }

    private int MediaBrowserCompatItemReceiver(T t) {
        int iWrite;
        int iWrite2;
        int iMediaBrowserCompatSearchResultReceiver;
        int iMediaMetadataCompat;
        Unsafe unsafe = RemoteActionCompatParcelizer;
        int i = 0;
        for (int i2 = 0; i2 < this.write.length; i2 += 3) {
            int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(i2);
            int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(iAudioAttributesImplApi26Parcelizer);
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i2);
            long j = read(iAudioAttributesImplApi26Parcelizer);
            int i3 = (iMediaBrowserCompatCustomActionResultReceiver < setDownloadsPaused.DOUBLE_LIST_PACKED.write() || iMediaBrowserCompatCustomActionResultReceiver > setDownloadsPaused.SINT64_LIST_PACKED.write()) ? 0 : this.write[i2 + 2] & 1048575;
            switch (iMediaBrowserCompatCustomActionResultReceiver) {
                case 0:
                    if (write((Object) t, i2)) {
                        iWrite = DownloadManager.write(iRemoteActionCompatParcelizer);
                        i += iWrite;
                    }
                    break;
                case 1:
                    if (write((Object) t, i2)) {
                        iWrite = DownloadManager.AudioAttributesImplBaseParcelizer(iRemoteActionCompatParcelizer);
                        i += iWrite;
                    }
                    break;
                case 2:
                    if (write((Object) t, i2)) {
                        iWrite = DownloadManager.read(iRemoteActionCompatParcelizer, DownloadProgress.MediaBrowserCompatItemReceiver(t, j));
                        i += iWrite;
                    }
                    break;
                case 3:
                    if (write((Object) t, i2)) {
                        iWrite = DownloadManager.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, DownloadProgress.MediaBrowserCompatItemReceiver(t, j));
                        i += iWrite;
                    }
                    break;
                case 4:
                    if (write((Object) t, i2)) {
                        iWrite = DownloadManager.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, DownloadProgress.AudioAttributesImplApi21Parcelizer(t, j));
                        i += iWrite;
                    }
                    break;
                case 5:
                    if (write((Object) t, i2)) {
                        iWrite = DownloadManager.read(iRemoteActionCompatParcelizer);
                        i += iWrite;
                    }
                    break;
                case 6:
                    if (write((Object) t, i2)) {
                        iWrite = DownloadManager.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer);
                        i += iWrite;
                    }
                    break;
                case 7:
                    if (write((Object) t, i2)) {
                        iWrite = DownloadManager.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer);
                        i += iWrite;
                    }
                    break;
                case 8:
                    if (write((Object) t, i2)) {
                        Object objMediaBrowserCompatCustomActionResultReceiver = DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j);
                        if (objMediaBrowserCompatCustomActionResultReceiver instanceof DownloadIndex) {
                            iWrite = DownloadManager.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, (DownloadIndex) objMediaBrowserCompatCustomActionResultReceiver);
                        } else {
                            iWrite = DownloadManager.IconCompatParcelizer(iRemoteActionCompatParcelizer, (String) objMediaBrowserCompatCustomActionResultReceiver);
                        }
                        i += iWrite;
                    }
                    break;
                case 9:
                    if (write((Object) t, i2)) {
                        iWrite = DownloadManagerListener.IconCompatParcelizer(iRemoteActionCompatParcelizer, DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j), AudioAttributesCompatParcelizer(i2));
                        i += iWrite;
                    }
                    break;
                case 10:
                    if (write((Object) t, i2)) {
                        iWrite = DownloadManager.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, (DownloadIndex) DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j));
                        i += iWrite;
                    }
                    break;
                case 11:
                    if (write((Object) t, i2)) {
                        iWrite = DownloadManager.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, DownloadProgress.AudioAttributesImplApi21Parcelizer(t, j));
                        i += iWrite;
                    }
                    break;
                case 12:
                    if (write((Object) t, i2)) {
                        iWrite = DownloadManager.IconCompatParcelizer(iRemoteActionCompatParcelizer, DownloadProgress.AudioAttributesImplApi21Parcelizer(t, j));
                        i += iWrite;
                    }
                    break;
                case 13:
                    if (write((Object) t, i2)) {
                        iWrite = DownloadManager.AudioAttributesImplApi21Parcelizer(iRemoteActionCompatParcelizer);
                        i += iWrite;
                    }
                    break;
                case 14:
                    if (write((Object) t, i2)) {
                        iWrite = DownloadManager.MediaBrowserCompatItemReceiver(iRemoteActionCompatParcelizer);
                        i += iWrite;
                    }
                    break;
                case 15:
                    if (write((Object) t, i2)) {
                        iWrite = DownloadManager.write(iRemoteActionCompatParcelizer, DownloadProgress.AudioAttributesImplApi21Parcelizer(t, j));
                        i += iWrite;
                    }
                    break;
                case 16:
                    if (write((Object) t, i2)) {
                        iWrite = DownloadManager.IconCompatParcelizer(iRemoteActionCompatParcelizer, DownloadProgress.MediaBrowserCompatItemReceiver(t, j));
                        i += iWrite;
                    }
                    break;
                case 17:
                    if (write((Object) t, i2)) {
                        iWrite = DownloadManager.IconCompatParcelizer(iRemoteActionCompatParcelizer, (DownloadManagerExternalSyntheticLambda0) DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j), AudioAttributesCompatParcelizer(i2));
                        i += iWrite;
                    }
                    break;
                case 18:
                    iWrite = DownloadManagerListener.IconCompatParcelizer(iRemoteActionCompatParcelizer, read(t, j));
                    i += iWrite;
                    break;
                case 19:
                    iWrite = DownloadManagerListener.read(iRemoteActionCompatParcelizer, read(t, j));
                    i += iWrite;
                    break;
                case 20:
                    iWrite = DownloadManagerListener.AudioAttributesImplApi26Parcelizer(iRemoteActionCompatParcelizer, read(t, j));
                    i += iWrite;
                    break;
                case 21:
                    iWrite = DownloadManagerListener.RatingCompat(iRemoteActionCompatParcelizer, read(t, j));
                    i += iWrite;
                    break;
                case 22:
                    iWrite = DownloadManagerListener.MediaBrowserCompatItemReceiver(iRemoteActionCompatParcelizer, read(t, j));
                    i += iWrite;
                    break;
                case 23:
                    iWrite = DownloadManagerListener.IconCompatParcelizer(iRemoteActionCompatParcelizer, read(t, j));
                    i += iWrite;
                    break;
                case 24:
                    iWrite = DownloadManagerListener.read(iRemoteActionCompatParcelizer, read(t, j));
                    i += iWrite;
                    break;
                case 25:
                    iWrite = DownloadManagerListener.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, read(t, j));
                    i += iWrite;
                    break;
                case 26:
                    iWrite = DownloadManagerListener.AudioAttributesImplBaseParcelizer(iRemoteActionCompatParcelizer, read(t, j));
                    i += iWrite;
                    break;
                case 27:
                    iWrite = DownloadManagerListener.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, read(t, j), AudioAttributesCompatParcelizer(i2));
                    i += iWrite;
                    break;
                case 28:
                    iWrite = DownloadManagerListener.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, read(t, j));
                    i += iWrite;
                    break;
                case 29:
                    iWrite = DownloadManagerListener.MediaBrowserCompatMediaItem(iRemoteActionCompatParcelizer, read(t, j));
                    i += iWrite;
                    break;
                case 30:
                    iWrite = DownloadManagerListener.write(iRemoteActionCompatParcelizer, read(t, j));
                    i += iWrite;
                    break;
                case 31:
                    iWrite = DownloadManagerListener.read(iRemoteActionCompatParcelizer, read(t, j));
                    i += iWrite;
                    break;
                case 32:
                    iWrite = DownloadManagerListener.IconCompatParcelizer(iRemoteActionCompatParcelizer, read(t, j));
                    i += iWrite;
                    break;
                case 33:
                    iWrite = DownloadManagerListener.AudioAttributesImplApi21Parcelizer(iRemoteActionCompatParcelizer, read(t, j));
                    i += iWrite;
                    break;
                case 34:
                    iWrite = DownloadManagerListener.MediaBrowserCompatCustomActionResultReceiver(iRemoteActionCompatParcelizer, read(t, j));
                    i += iWrite;
                    break;
                case 35:
                    iWrite2 = DownloadManagerListener.write((List) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i3, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat + iWrite2;
                        i += iWrite;
                    }
                    break;
                case 36:
                    iWrite2 = DownloadManagerListener.AudioAttributesCompatParcelizer((List<?>) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i3, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat + iWrite2;
                        i += iWrite;
                    }
                    break;
                case 37:
                    iWrite2 = DownloadManagerListener.AudioAttributesImplBaseParcelizer((List) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i3, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat + iWrite2;
                        i += iWrite;
                    }
                    break;
                case 38:
                    iWrite2 = DownloadManagerListener.AudioAttributesImplApi21Parcelizer((List) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i3, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat + iWrite2;
                        i += iWrite;
                    }
                    break;
                case 39:
                    iWrite2 = DownloadManagerListener.IconCompatParcelizer((List) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i3, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat + iWrite2;
                        i += iWrite;
                    }
                    break;
                case 40:
                    iWrite2 = DownloadManagerListener.write((List) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i3, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat + iWrite2;
                        i += iWrite;
                    }
                    break;
                case 41:
                    iWrite2 = DownloadManagerListener.AudioAttributesCompatParcelizer((List<?>) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i3, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat + iWrite2;
                        i += iWrite;
                    }
                    break;
                case 42:
                    iWrite2 = DownloadManagerListener.RemoteActionCompatParcelizer((List<?>) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i3, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat + iWrite2;
                        i += iWrite;
                    }
                    break;
                case 43:
                    iWrite2 = DownloadManagerListener.MediaBrowserCompatCustomActionResultReceiver((List) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i3, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat + iWrite2;
                        i += iWrite;
                    }
                    break;
                case 44:
                    iWrite2 = DownloadManagerListener.read((List) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i3, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat + iWrite2;
                        i += iWrite;
                    }
                    break;
                case 45:
                    iWrite2 = DownloadManagerListener.AudioAttributesCompatParcelizer((List<?>) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i3, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat + iWrite2;
                        i += iWrite;
                    }
                    break;
                case 46:
                    iWrite2 = DownloadManagerListener.write((List) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i3, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat + iWrite2;
                        i += iWrite;
                    }
                    break;
                case 47:
                    iWrite2 = DownloadManagerListener.AudioAttributesImplApi26Parcelizer((List) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i3, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat + iWrite2;
                        i += iWrite;
                    }
                    break;
                case 48:
                    iWrite2 = DownloadManagerListener.MediaBrowserCompatItemReceiver((List) unsafe.getObject(t, j));
                    if (iWrite2 > 0) {
                        if (this.onCustomAction) {
                            unsafe.putInt(t, i3, iWrite2);
                        }
                        iMediaBrowserCompatSearchResultReceiver = DownloadManager.MediaBrowserCompatSearchResultReceiver(iRemoteActionCompatParcelizer);
                        iMediaMetadataCompat = DownloadManager.MediaMetadataCompat(iWrite2);
                        iWrite = iMediaBrowserCompatSearchResultReceiver + iMediaMetadataCompat + iWrite2;
                        i += iWrite;
                    }
                    break;
                case 49:
                    iWrite = DownloadManagerListener.write(iRemoteActionCompatParcelizer, read(t, j), AudioAttributesCompatParcelizer(i2));
                    i += iWrite;
                    break;
                case 50:
                    iWrite = this.MediaDescriptionCompat.IconCompatParcelizer(iRemoteActionCompatParcelizer, DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j), write(i2));
                    i += iWrite;
                    break;
                case 51:
                    if (write(t, iRemoteActionCompatParcelizer, i2)) {
                        iWrite = DownloadManager.write(iRemoteActionCompatParcelizer);
                        i += iWrite;
                    }
                    break;
                case 52:
                    if (write(t, iRemoteActionCompatParcelizer, i2)) {
                        iWrite = DownloadManager.AudioAttributesImplBaseParcelizer(iRemoteActionCompatParcelizer);
                        i += iWrite;
                    }
                    break;
                case 53:
                    if (write(t, iRemoteActionCompatParcelizer, i2)) {
                        iWrite = DownloadManager.read(iRemoteActionCompatParcelizer, MediaBrowserCompatSearchResultReceiver(t, j));
                        i += iWrite;
                    }
                    break;
                case 54:
                    if (write(t, iRemoteActionCompatParcelizer, i2)) {
                        iWrite = DownloadManager.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, MediaBrowserCompatSearchResultReceiver(t, j));
                        i += iWrite;
                    }
                    break;
                case 55:
                    if (write(t, iRemoteActionCompatParcelizer, i2)) {
                        iWrite = DownloadManager.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, AudioAttributesImplBaseParcelizer(t, j));
                        i += iWrite;
                    }
                    break;
                case 56:
                    if (write(t, iRemoteActionCompatParcelizer, i2)) {
                        iWrite = DownloadManager.read(iRemoteActionCompatParcelizer);
                        i += iWrite;
                    }
                    break;
                case 57:
                    if (write(t, iRemoteActionCompatParcelizer, i2)) {
                        iWrite = DownloadManager.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer);
                        i += iWrite;
                    }
                    break;
                case 58:
                    if (write(t, iRemoteActionCompatParcelizer, i2)) {
                        iWrite = DownloadManager.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer);
                        i += iWrite;
                    }
                    break;
                case 59:
                    if (write(t, iRemoteActionCompatParcelizer, i2)) {
                        Object objMediaBrowserCompatCustomActionResultReceiver2 = DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j);
                        if (objMediaBrowserCompatCustomActionResultReceiver2 instanceof DownloadIndex) {
                            iWrite = DownloadManager.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, (DownloadIndex) objMediaBrowserCompatCustomActionResultReceiver2);
                        } else {
                            iWrite = DownloadManager.IconCompatParcelizer(iRemoteActionCompatParcelizer, (String) objMediaBrowserCompatCustomActionResultReceiver2);
                        }
                        i += iWrite;
                    }
                    break;
                case 60:
                    if (write(t, iRemoteActionCompatParcelizer, i2)) {
                        iWrite = DownloadManagerListener.IconCompatParcelizer(iRemoteActionCompatParcelizer, DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j), AudioAttributesCompatParcelizer(i2));
                        i += iWrite;
                    }
                    break;
                case 61:
                    if (write(t, iRemoteActionCompatParcelizer, i2)) {
                        iWrite = DownloadManager.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, (DownloadIndex) DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j));
                        i += iWrite;
                    }
                    break;
                case 62:
                    if (write(t, iRemoteActionCompatParcelizer, i2)) {
                        iWrite = DownloadManager.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, AudioAttributesImplBaseParcelizer(t, j));
                        i += iWrite;
                    }
                    break;
                case 63:
                    if (write(t, iRemoteActionCompatParcelizer, i2)) {
                        iWrite = DownloadManager.IconCompatParcelizer(iRemoteActionCompatParcelizer, AudioAttributesImplBaseParcelizer(t, j));
                        i += iWrite;
                    }
                    break;
                case 64:
                    if (write(t, iRemoteActionCompatParcelizer, i2)) {
                        iWrite = DownloadManager.AudioAttributesImplApi21Parcelizer(iRemoteActionCompatParcelizer);
                        i += iWrite;
                    }
                    break;
                case 65:
                    if (write(t, iRemoteActionCompatParcelizer, i2)) {
                        iWrite = DownloadManager.MediaBrowserCompatItemReceiver(iRemoteActionCompatParcelizer);
                        i += iWrite;
                    }
                    break;
                case 66:
                    if (write(t, iRemoteActionCompatParcelizer, i2)) {
                        iWrite = DownloadManager.write(iRemoteActionCompatParcelizer, AudioAttributesImplBaseParcelizer(t, j));
                        i += iWrite;
                    }
                    break;
                case 67:
                    if (write(t, iRemoteActionCompatParcelizer, i2)) {
                        iWrite = DownloadManager.IconCompatParcelizer(iRemoteActionCompatParcelizer, MediaBrowserCompatSearchResultReceiver(t, j));
                        i += iWrite;
                    }
                    break;
                case 68:
                    if (write(t, iRemoteActionCompatParcelizer, i2)) {
                        iWrite = DownloadManager.IconCompatParcelizer(iRemoteActionCompatParcelizer, (DownloadManagerExternalSyntheticLambda0) DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j), AudioAttributesCompatParcelizer(i2));
                        i += iWrite;
                    }
                    break;
            }
        }
        return i + read(this.onAddQueueItem, t);
    }

    private static <UT, UB> int read(DownloadManagerTask<UT, UB> downloadManagerTask, T t) {
        return downloadManagerTask.RemoteActionCompatParcelizer(downloadManagerTask.AudioAttributesCompatParcelizer(t));
    }

    private static List<?> read(Object obj, long j) {
        return (List) DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(obj, j);
    }

    @Override // kotlin.setNotMetRequirements
    public final void AudioAttributesCompatParcelizer(T t, getRetryDelayMillis getretrydelaymillis) throws IOException {
        if (getretrydelaymillis.AudioAttributesCompatParcelizer() == getRetryDelayMillis.read.DESCENDING) {
            IconCompatParcelizer(t, getretrydelaymillis);
        } else if (this.onCommand) {
            write(t, getretrydelaymillis);
        } else {
            RemoteActionCompatParcelizer((Object) t, getretrydelaymillis);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void RemoteActionCompatParcelizer(T r18, kotlin.getRetryDelayMillis r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.compareStartTimes.RemoteActionCompatParcelizer(java.lang.Object, o.getRetryDelayMillis):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void write(T r13, kotlin.getRetryDelayMillis r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.compareStartTimes.write(java.lang.Object, o.getRetryDelayMillis):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void IconCompatParcelizer(T r11, kotlin.getRetryDelayMillis r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.compareStartTimes.IconCompatParcelizer(java.lang.Object, o.getRetryDelayMillis):void");
    }

    private <K, V> void AudioAttributesCompatParcelizer(getRetryDelayMillis getretrydelaymillis, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            getretrydelaymillis.RemoteActionCompatParcelizer(i, this.MediaDescriptionCompat.write(write(i2)), this.MediaDescriptionCompat.RemoteActionCompatParcelizer(obj));
        }
    }

    private static <UT, UB> void AudioAttributesCompatParcelizer(DownloadManagerTask<UT, UB> downloadManagerTask, T t, getRetryDelayMillis getretrydelaymillis) throws IOException {
        downloadManagerTask.IconCompatParcelizer(downloadManagerTask.AudioAttributesCompatParcelizer(t), getretrydelaymillis);
    }

    private setNotMetRequirements AudioAttributesCompatParcelizer(int i) {
        int i2 = (i / 3) << 1;
        setNotMetRequirements setnotmetrequirements = (setNotMetRequirements) this.MediaBrowserCompatSearchResultReceiver[i2];
        if (setnotmetrequirements != null) {
            return setnotmetrequirements;
        }
        setNotMetRequirements<T> setnotmetrequirementsAudioAttributesCompatParcelizer = syncStoppedDownload.write().AudioAttributesCompatParcelizer((Class) this.MediaBrowserCompatSearchResultReceiver[i2 + 1]);
        this.MediaBrowserCompatSearchResultReceiver[i2] = setnotmetrequirementsAudioAttributesCompatParcelizer;
        return setnotmetrequirementsAudioAttributesCompatParcelizer;
    }

    private Object write(int i) {
        return this.MediaBrowserCompatSearchResultReceiver[(i / 3) << 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    @Override // kotlin.setNotMetRequirements
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void RemoteActionCompatParcelizer(T r8) {
        /*
            r7 = this;
            boolean r0 = AudioAttributesImplApi26Parcelizer(r8)
            if (r0 == 0) goto L6c
            boolean r0 = r8 instanceof kotlin.updateWaitingForRequirements
            if (r0 == 0) goto L16
            r0 = r8
            o.updateWaitingForRequirements r0 = (kotlin.updateWaitingForRequirements) r0
            r0.onPrepareFromMediaId()
            r0.onPlayFromUri()
            r0.onSetCaptioningEnabled()
        L16:
            int[] r0 = r7.write
            int r0 = r0.length
            r1 = 0
        L1a:
            if (r1 >= r0) goto L5e
            int r2 = r7.AudioAttributesImplApi26Parcelizer(r1)
            long r3 = read(r2)
            int r2 = MediaBrowserCompatCustomActionResultReceiver(r2)
            r5 = 9
            if (r2 == r5) goto L48
            switch(r2) {
                case 17: goto L48;
                case 18: goto L42;
                case 19: goto L42;
                case 20: goto L42;
                case 21: goto L42;
                case 22: goto L42;
                case 23: goto L42;
                case 24: goto L42;
                case 25: goto L42;
                case 26: goto L42;
                case 27: goto L42;
                case 28: goto L42;
                case 29: goto L42;
                case 30: goto L42;
                case 31: goto L42;
                case 32: goto L42;
                case 33: goto L42;
                case 34: goto L42;
                case 35: goto L42;
                case 36: goto L42;
                case 37: goto L42;
                case 38: goto L42;
                case 39: goto L42;
                case 40: goto L42;
                case 41: goto L42;
                case 42: goto L42;
                case 43: goto L42;
                case 44: goto L42;
                case 45: goto L42;
                case 46: goto L42;
                case 47: goto L42;
                case 48: goto L42;
                case 49: goto L42;
                case 50: goto L30;
                default: goto L2f;
            }
        L2f:
            goto L5b
        L30:
            sun.misc.Unsafe r2 = kotlin.compareStartTimes.RemoteActionCompatParcelizer
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L5b
            o.removeAllDownloads r6 = r7.MediaDescriptionCompat
            java.lang.Object r5 = r6.AudioAttributesCompatParcelizer(r5)
            r2.putObject(r8, r3, r5)
            goto L5b
        L42:
            o.getRequirements r2 = r7.AudioAttributesImplBaseParcelizer
            r2.read(r8, r3)
            goto L5b
        L48:
            boolean r2 = r7.write(r8, r1)
            if (r2 == 0) goto L5b
            o.setNotMetRequirements r2 = r7.AudioAttributesCompatParcelizer(r1)
            sun.misc.Unsafe r5 = kotlin.compareStartTimes.RemoteActionCompatParcelizer
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.RemoteActionCompatParcelizer(r3)
        L5b:
            int r1 = r1 + 3
            goto L1a
        L5e:
            o.DownloadManagerTask<?, ?> r0 = r7.onAddQueueItem
            r0.write(r8)
            boolean r0 = r7.AudioAttributesImplApi21Parcelizer
            if (r0 == 0) goto L6c
            o.notifyWaitingForRequirementsChanged<?> r7 = r7.MediaBrowserCompatCustomActionResultReceiver
            r7.write(r8)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.compareStartTimes.RemoteActionCompatParcelizer(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    @Override // kotlin.setNotMetRequirements
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean write(T r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r0 = r8
            r1 = r9
            r10 = r1
        Lb:
            int r2 = r6.AudioAttributesCompatParcelizer
            r3 = 1
            if (r10 >= r2) goto Lb1
            int[] r2 = r6.AudioAttributesImplApi26Parcelizer
            r11 = r2[r10]
            int r12 = r6.RemoteActionCompatParcelizer(r11)
            int r13 = r6.AudioAttributesImplApi26Parcelizer(r11)
            int[] r2 = r6.write
            int r4 = r11 + 2
            r2 = r2[r4]
            r4 = r2 & r8
            int r2 = r2 >>> 20
            int r14 = r3 << r2
            if (r4 == r0) goto L38
            if (r4 == r8) goto L34
            sun.misc.Unsafe r0 = kotlin.compareStartTimes.RemoteActionCompatParcelizer
            long r1 = (long) r4
            int r0 = r0.getInt(r7, r1)
            r1 = r0
        L34:
            r16 = r1
            r15 = r4
            goto L3b
        L38:
            r15 = r0
            r16 = r1
        L3b:
            boolean r0 = IconCompatParcelizer(r13)
            if (r0 == 0) goto L51
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.RemoteActionCompatParcelizer(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L51
            return r9
        L51:
            int r0 = MediaBrowserCompatCustomActionResultReceiver(r13)
            r1 = 9
            if (r0 == r1) goto L90
            r1 = 17
            if (r0 == r1) goto L90
            r1 = 27
            if (r0 == r1) goto L89
            r1 = 60
            if (r0 == r1) goto L78
            r1 = 68
            if (r0 == r1) goto L78
            r1 = 49
            if (r0 == r1) goto L89
            r1 = 50
            if (r0 != r1) goto Laa
            boolean r0 = r6.IconCompatParcelizer(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L78:
            boolean r0 = r6.write(r7, r12, r11)
            if (r0 == 0) goto Laa
            o.setNotMetRequirements r0 = r6.AudioAttributesCompatParcelizer(r11)
            boolean r0 = write(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        L89:
            boolean r0 = r6.RemoteActionCompatParcelizer(r7, r13, r11)
            if (r0 != 0) goto Laa
            return r9
        L90:
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.RemoteActionCompatParcelizer(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Laa
            o.setNotMetRequirements r0 = r6.AudioAttributesCompatParcelizer(r11)
            boolean r0 = write(r7, r13, r0)
            if (r0 != 0) goto Laa
            return r9
        Laa:
            int r10 = r10 + 1
            r0 = r15
            r1 = r16
            goto Lb
        Lb1:
            boolean r0 = r6.AudioAttributesImplApi21Parcelizer
            if (r0 == 0) goto Lc2
            o.notifyWaitingForRequirementsChanged<?> r0 = r6.MediaBrowserCompatCustomActionResultReceiver
            o.onRequirementsStateChanged r0 = r0.AudioAttributesCompatParcelizer(r7)
            boolean r0 = r0.AudioAttributesImplBaseParcelizer()
            if (r0 != 0) goto Lc2
            return r9
        Lc2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.compareStartTimes.write(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean write(Object obj, int i, setNotMetRequirements setnotmetrequirements) {
        return setnotmetrequirements.write(DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(obj, read(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean RemoteActionCompatParcelizer(Object obj, int i, int i2) {
        List list = (List) DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(obj, read(i));
        if (list.isEmpty()) {
            return true;
        }
        setNotMetRequirements setnotmetrequirementsAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!setnotmetrequirementsAudioAttributesCompatParcelizer.write(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [o.setNotMetRequirements] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    private boolean IconCompatParcelizer(T t, int i, int i2) {
        Map<?, ?> mapRemoteActionCompatParcelizer = this.MediaDescriptionCompat.RemoteActionCompatParcelizer(DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, read(i)));
        if (mapRemoteActionCompatParcelizer.isEmpty()) {
            return true;
        }
        if (this.MediaDescriptionCompat.write(write(i2)).RemoteActionCompatParcelizer.write() != DownloadRequest.IconCompatParcelizer.MESSAGE) {
            return true;
        }
        ?? AudioAttributesCompatParcelizer = 0;
        for (Object obj : mapRemoteActionCompatParcelizer.values()) {
            AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer;
            if (AudioAttributesCompatParcelizer == 0) {
                AudioAttributesCompatParcelizer = syncStoppedDownload.write().AudioAttributesCompatParcelizer(obj.getClass());
            }
            if (!AudioAttributesCompatParcelizer.write(obj)) {
                return false;
            }
        }
        return true;
    }

    private static void IconCompatParcelizer(int i, Object obj, getRetryDelayMillis getretrydelaymillis) throws IOException {
        if (obj instanceof String) {
            getretrydelaymillis.write(i, (String) obj);
        } else {
            getretrydelaymillis.IconCompatParcelizer(i, (DownloadIndex) obj);
        }
    }

    private int RemoteActionCompatParcelizer(int i) {
        return this.write[i];
    }

    private int AudioAttributesImplApi26Parcelizer(int i) {
        return this.write[i + 1];
    }

    private int AudioAttributesImplApi21Parcelizer(int i) {
        return this.write[i + 2];
    }

    private static boolean AudioAttributesImplApi26Parcelizer(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof updateWaitingForRequirements) {
            return ((updateWaitingForRequirements) obj).onPrepareFromUri();
        }
        return true;
    }

    private static void read(Object obj) {
        if (!AudioAttributesImplApi26Parcelizer(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static <T> double IconCompatParcelizer(T t, long j) {
        return DownloadProgress.AudioAttributesImplApi26Parcelizer(t, j);
    }

    private static <T> float AudioAttributesCompatParcelizer(T t, long j) {
        return DownloadProgress.AudioAttributesImplBaseParcelizer(t, j);
    }

    private static <T> int RemoteActionCompatParcelizer(T t, long j) {
        return DownloadProgress.AudioAttributesImplApi21Parcelizer(t, j);
    }

    private static <T> long MediaBrowserCompatItemReceiver(T t, long j) {
        return DownloadProgress.MediaBrowserCompatItemReceiver(t, j);
    }

    private static <T> boolean write(T t, long j) {
        return DownloadProgress.IconCompatParcelizer(t, j);
    }

    private static <T> double AudioAttributesImplApi26Parcelizer(T t, long j) {
        return ((Double) DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j)).doubleValue();
    }

    private static <T> float AudioAttributesImplApi21Parcelizer(T t, long j) {
        return ((Float) DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j)).floatValue();
    }

    private static <T> int AudioAttributesImplBaseParcelizer(T t, long j) {
        return ((Integer) DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j)).intValue();
    }

    private static <T> long MediaBrowserCompatSearchResultReceiver(T t, long j) {
        return ((Long) DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j)).longValue();
    }

    private static <T> boolean MediaBrowserCompatCustomActionResultReceiver(T t, long j) {
        return ((Boolean) DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j)).booleanValue();
    }

    private boolean read(T t, T t2, int i) {
        return write((Object) t, i) == write((Object) t2, i);
    }

    private boolean RemoteActionCompatParcelizer(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return write((Object) t, i);
        }
        return (i3 & i4) != 0;
    }

    private boolean write(T t, int i) {
        boolean zEquals;
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(i);
        long j = 1048575 & iAudioAttributesImplApi21Parcelizer;
        if (j != 1048575) {
            return ((1 << (iAudioAttributesImplApi21Parcelizer >>> 20)) & DownloadProgress.AudioAttributesImplApi21Parcelizer(t, j)) != 0;
        }
        int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(i);
        long j2 = read(iAudioAttributesImplApi26Parcelizer);
        switch (MediaBrowserCompatCustomActionResultReceiver(iAudioAttributesImplApi26Parcelizer)) {
            case 0:
                return Double.doubleToRawLongBits(DownloadProgress.AudioAttributesImplApi26Parcelizer(t, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(DownloadProgress.AudioAttributesImplBaseParcelizer(t, j2)) != 0;
            case 2:
                return DownloadProgress.MediaBrowserCompatItemReceiver(t, j2) != 0;
            case 3:
                return DownloadProgress.MediaBrowserCompatItemReceiver(t, j2) != 0;
            case 4:
                return DownloadProgress.AudioAttributesImplApi21Parcelizer(t, j2) != 0;
            case 5:
                return DownloadProgress.MediaBrowserCompatItemReceiver(t, j2) != 0;
            case 6:
                return DownloadProgress.AudioAttributesImplApi21Parcelizer(t, j2) != 0;
            case 7:
                return DownloadProgress.IconCompatParcelizer(t, j2);
            case 8:
                Object objMediaBrowserCompatCustomActionResultReceiver = DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j2);
                if (objMediaBrowserCompatCustomActionResultReceiver instanceof String) {
                    zEquals = ((String) objMediaBrowserCompatCustomActionResultReceiver).isEmpty();
                } else if (objMediaBrowserCompatCustomActionResultReceiver instanceof DownloadIndex) {
                    zEquals = DownloadIndex.RemoteActionCompatParcelizer.equals(objMediaBrowserCompatCustomActionResultReceiver);
                } else {
                    throw new IllegalArgumentException();
                }
                break;
            case 9:
                return DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j2) != null;
            case 10:
                zEquals = DownloadIndex.RemoteActionCompatParcelizer.equals(DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j2));
                break;
            case 11:
                return DownloadProgress.AudioAttributesImplApi21Parcelizer(t, j2) != 0;
            case 12:
                return DownloadProgress.AudioAttributesImplApi21Parcelizer(t, j2) != 0;
            case 13:
                return DownloadProgress.AudioAttributesImplApi21Parcelizer(t, j2) != 0;
            case 14:
                return DownloadProgress.MediaBrowserCompatItemReceiver(t, j2) != 0;
            case 15:
                return DownloadProgress.AudioAttributesImplApi21Parcelizer(t, j2) != 0;
            case 16:
                return DownloadProgress.MediaBrowserCompatItemReceiver(t, j2) != 0;
            case 17:
                return DownloadProgress.MediaBrowserCompatCustomActionResultReceiver(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    private void RemoteActionCompatParcelizer(T t, int i) {
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(i);
        long j = 1048575 & iAudioAttributesImplApi21Parcelizer;
        if (j == 1048575) {
            return;
        }
        DownloadProgress.write((Object) t, j, (1 << (iAudioAttributesImplApi21Parcelizer >>> 20)) | DownloadProgress.AudioAttributesImplApi21Parcelizer(t, j));
    }

    private boolean write(T t, int i, int i2) {
        return DownloadProgress.AudioAttributesImplApi21Parcelizer(t, (long) (AudioAttributesImplApi21Parcelizer(i2) & 1048575)) == i;
    }

    private boolean AudioAttributesCompatParcelizer(T t, T t2, int i) {
        long jAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(i) & 1048575;
        return DownloadProgress.AudioAttributesImplApi21Parcelizer(t, jAudioAttributesImplApi21Parcelizer) == DownloadProgress.AudioAttributesImplApi21Parcelizer(t2, jAudioAttributesImplApi21Parcelizer);
    }

    private void read(T t, int i, int i2) {
        DownloadProgress.write((Object) t, AudioAttributesImplApi21Parcelizer(i2) & 1048575, i);
    }
}
