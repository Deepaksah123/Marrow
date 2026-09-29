package kotlin;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.Objects;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.setDrawSlicesUnderHole;
import kotlin.setEntryLabelTextSize;
import kotlin.setUsePercentValues;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0003\u0012\u001a\u001bB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0016\u0010 \u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0015\u0010\u0015\u001a\u00020\u001d8CX\u0082\u0084\u0002¢\u0006\u0006\u001a\u0004\b\u001b\u0010!R\u0016\u0010#\u001a\u0004\u0018\u00010\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\"R\u0014\u0010\u0018\u001a\u00020$8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010%R\u0014\u0010&\u001a\u00020$8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010%"}, d2 = {"Lo/setUsePercentValues;", "Lo/setEntryLabelTextSize;", "Landroid/content/Context;", "p0", "", "p1", "Lo/setEntryLabelTextSize$RemoteActionCompatParcelizer;", "p2", "", "p3", "p4", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lo/setEntryLabelTextSize$RemoteActionCompatParcelizer;ZZ)V", "", "read", "(Z)V", "close", "()V", "AudioAttributesCompatParcelizer", "Landroid/content/Context;", "write", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/lang/String;", "Lo/setEntryLabelTextSize$RemoteActionCompatParcelizer;", "AudioAttributesImplBaseParcelizer", "Z", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/RenewEligible;", "Lo/setUsePercentValues$AudioAttributesCompatParcelizer;", "Lo/RenewEligible;", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "()Lo/setUsePercentValues$AudioAttributesCompatParcelizer;", "()Ljava/lang/String;", "AudioAttributesImplApi21Parcelizer", "Lo/setDrawSliceText;", "()Lo/setDrawSliceText;", "MediaBrowserCompatMediaItem"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setUsePercentValues implements setEntryLabelTextSize {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Context write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible<AudioAttributesCompatParcelizer> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final setEntryLabelTextSize.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;

    public setUsePercentValues(Context context, String str, setEntryLabelTextSize.RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z, boolean z2) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        this.write = context;
        this.read = str;
        this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = z2;
        this.AudioAttributesImplApi26Parcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.setTransparentCircleAlpha
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setUsePercentValues.read(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AudioAttributesCompatParcelizer read(setUsePercentValues setusepercentvalues) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
        String str = setusepercentvalues.read;
        if (str != null && setusepercentvalues.IconCompatParcelizer) {
            audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(setusepercentvalues.write, new File(setDrawSlicesUnderHole.RemoteActionCompatParcelizer.IconCompatParcelizer(setusepercentvalues.write), setusepercentvalues.read).getAbsolutePath(), new RemoteActionCompatParcelizer(), setusepercentvalues.AudioAttributesCompatParcelizer, setusepercentvalues.RemoteActionCompatParcelizer);
        } else {
            audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(setusepercentvalues.write, str, new RemoteActionCompatParcelizer(), setusepercentvalues.AudioAttributesCompatParcelizer, setusepercentvalues.RemoteActionCompatParcelizer);
        }
        audioAttributesCompatParcelizer.setWriteAheadLoggingEnabled(setusepercentvalues.MediaBrowserCompatItemReceiver);
        return audioAttributesCompatParcelizer;
    }

    private final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setEntryLabelTextSize
    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    @Override // kotlin.setEntryLabelTextSize
    public final void read(boolean p0) {
        if (this.AudioAttributesImplApi26Parcelizer.write()) {
            RemoteActionCompatParcelizer().setWriteAheadLoggingEnabled(p0);
        }
        this.MediaBrowserCompatItemReceiver = p0;
    }

    @Override // kotlin.setEntryLabelTextSize
    public final setDrawSliceText write() {
        return RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(true);
    }

    @Override // kotlin.setEntryLabelTextSize
    public final setDrawSliceText AudioAttributesCompatParcelizer() {
        return RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(false);
    }

    @Override // kotlin.setEntryLabelTextSize, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.AudioAttributesImplApi26Parcelizer.write()) {
            RemoteActionCompatParcelizer().close();
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 %2\u00020\u0001:\u0003#\u0014%B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u0019J'\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0011\u0010%\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b#\u0010$R\u0011\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u0011\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010'"}, d2 = {"Lo/setUsePercentValues$AudioAttributesCompatParcelizer;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/content/Context;", "p0", "", "p1", "Lo/setUsePercentValues$RemoteActionCompatParcelizer;", "p2", "Lo/setEntryLabelTextSize$RemoteActionCompatParcelizer;", "p3", "", "p4", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lo/setUsePercentValues$RemoteActionCompatParcelizer;Lo/setEntryLabelTextSize$RemoteActionCompatParcelizer;Z)V", "Lo/setDrawSliceText;", "RemoteActionCompatParcelizer", "(Z)Lo/setDrawSliceText;", "Landroid/database/sqlite/SQLiteDatabase;", "IconCompatParcelizer", "(Z)Landroid/database/sqlite/SQLiteDatabase;", "write", "Lo/setHoleRadius;", "(Landroid/database/sqlite/SQLiteDatabase;)Lo/setHoleRadius;", "", "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "onConfigure", "onDowngrade", "onOpen", "close", "()V", "Landroid/content/Context;", "read", "Lo/setUsePercentValues$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "Lo/setEntryLabelTextSize$RemoteActionCompatParcelizer;", "Z", "MediaBrowserCompatItemReceiver", "Lo/setWebColor;", "AudioAttributesImplApi21Parcelizer", "Lo/setWebColor;", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
        private final setWebColor AudioAttributesImplApi26Parcelizer;
        private boolean AudioAttributesImplBaseParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final Context read;

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private boolean RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final boolean write;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final setEntryLabelTextSize.RemoteActionCompatParcelizer IconCompatParcelizer;

        public final /* synthetic */ class RemoteActionCompatParcelizer {
            public static final /* synthetic */ int[] write;

            static {
                int[] iArr = new int[write.values().length];
                try {
                    iArr[write.AudioAttributesCompatParcelizer.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[write.RemoteActionCompatParcelizer.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[write.read.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[write.IconCompatParcelizer.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[write.write.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                write = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(Context context, String str, final RemoteActionCompatParcelizer remoteActionCompatParcelizer, final setEntryLabelTextSize.RemoteActionCompatParcelizer remoteActionCompatParcelizer2, boolean z) {
            super(context, str, null, remoteActionCompatParcelizer2.RemoteActionCompatParcelizer, new DatabaseErrorHandler() { // from class: o.setTransparentCircleColor
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    setUsePercentValues.AudioAttributesCompatParcelizer.read(remoteActionCompatParcelizer2, remoteActionCompatParcelizer, sQLiteDatabase);
                }
            });
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer2, "");
            this.read = context;
            this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
            this.IconCompatParcelizer = remoteActionCompatParcelizer2;
            this.write = z;
            if (str == null) {
                str = UUID.randomUUID().toString();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            }
            this.AudioAttributesImplApi26Parcelizer = new setWebColor(str, context.getCacheDir(), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void read(setEntryLabelTextSize.RemoteActionCompatParcelizer remoteActionCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer2, SQLiteDatabase sQLiteDatabase) {
            toMagicModuleMetaRepoModel.write(sQLiteDatabase);
            setEntryLabelTextSize.RemoteActionCompatParcelizer.read(Companion.write(remoteActionCompatParcelizer2, sQLiteDatabase));
        }

        public final setDrawSliceText RemoteActionCompatParcelizer(boolean p0) {
            setHoleRadius setholeradiusIconCompatParcelizer;
            try {
                this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer((this.AudioAttributesImplBaseParcelizer || getDatabaseName() == null) ? false : true);
                this.RemoteActionCompatParcelizer = false;
                SQLiteDatabase sQLiteDatabaseIconCompatParcelizer = IconCompatParcelizer(p0);
                if (this.RemoteActionCompatParcelizer) {
                    close();
                    setholeradiusIconCompatParcelizer = RemoteActionCompatParcelizer(p0);
                } else {
                    setholeradiusIconCompatParcelizer = IconCompatParcelizer(sQLiteDatabaseIconCompatParcelizer);
                }
                return setholeradiusIconCompatParcelizer;
            } finally {
                this.AudioAttributesImplApi26Parcelizer.write();
            }
        }

        private final SQLiteDatabase IconCompatParcelizer(boolean p0) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z = this.AudioAttributesImplBaseParcelizer;
            if (databaseName != null && !z && (parentFile = this.read.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Objects.toString(parentFile);
                }
            }
            try {
                return write(p0);
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return this.write(p0);
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof read) {
                        read readVar = (read) th;
                        Throwable cause = readVar.getCause();
                        int i = RemoteActionCompatParcelizer.write[readVar.AudioAttributesCompatParcelizer().ordinal()];
                        if (i == 1 || i == 2 || i == 3 || i == 4) {
                            throw cause;
                        }
                        if (i != 5) {
                            throw new RenewEligibleCreator();
                        }
                        if (!(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                        th = cause;
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.write) {
                        throw th;
                    }
                    this.read.deleteDatabase(databaseName);
                    try {
                        return this.write(p0);
                    } catch (read e) {
                        throw e.getCause();
                    }
                }
            }
        }

        private final SQLiteDatabase write(boolean p0) {
            if (p0) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                toMagicModuleMetaRepoModel.write(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            toMagicModuleMetaRepoModel.write(readableDatabase);
            return readableDatabase;
        }

        private setHoleRadius IconCompatParcelizer(SQLiteDatabase p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return Companion.write(this.AudioAttributesCompatParcelizer, p0);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            try {
                this.IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer(p0));
            } catch (Throwable th) {
                throw new read(write.RemoteActionCompatParcelizer, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase p0, int p1, int p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.RemoteActionCompatParcelizer = true;
            try {
                this.IconCompatParcelizer.RemoteActionCompatParcelizer(IconCompatParcelizer(p0), p1, p2);
            } catch (Throwable th) {
                throw new read(write.read, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (!this.RemoteActionCompatParcelizer && this.IconCompatParcelizer.RemoteActionCompatParcelizer != p0.getVersion()) {
                p0.setMaxSqlCacheSize(1);
            }
            try {
                setEntryLabelTextSize.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(IconCompatParcelizer(p0));
            } catch (Throwable th) {
                throw new read(write.AudioAttributesCompatParcelizer, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase p0, int p1, int p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.RemoteActionCompatParcelizer = true;
            try {
                this.IconCompatParcelizer.read(IconCompatParcelizer(p0), p1, p2);
            } catch (Throwable th) {
                throw new read(write.IconCompatParcelizer, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (!this.RemoteActionCompatParcelizer) {
                try {
                    this.IconCompatParcelizer.RemoteActionCompatParcelizer(IconCompatParcelizer(p0));
                } catch (Throwable th) {
                    throw new read(write.write, th);
                }
            }
            this.AudioAttributesImplBaseParcelizer = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            try {
                setWebColor setwebcolor = this.AudioAttributesImplApi26Parcelizer;
                setwebcolor.RemoteActionCompatParcelizer(setwebcolor.IconCompatParcelizer);
                super.close();
                this.AudioAttributesCompatParcelizer.read(null);
                this.AudioAttributesImplBaseParcelizer = false;
            } finally {
                this.AudioAttributesImplApi26Parcelizer.write();
            }
        }

        static final class read extends RuntimeException {
            private final write IconCompatParcelizer;
            private final Throwable write;

            public final write AudioAttributesCompatParcelizer() {
                return this.IconCompatParcelizer;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.write;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public read(write writeVar, Throwable th) {
                super(th);
                toMagicModuleMetaRepoModel.write(writeVar, "");
                toMagicModuleMetaRepoModel.write(th, "");
                this.IconCompatParcelizer = writeVar;
                this.write = th;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lo/setUsePercentValues$AudioAttributesCompatParcelizer$write;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "read", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class write {
            private static final /* synthetic */ write[] AudioAttributesImplBaseParcelizer;
            public static final write AudioAttributesCompatParcelizer = new write("ON_CONFIGURE", 0);
            public static final write RemoteActionCompatParcelizer = new write("ON_CREATE", 1);
            public static final write read = new write("ON_UPGRADE", 2);
            public static final write IconCompatParcelizer = new write("ON_DOWNGRADE", 3);
            public static final write write = new write("ON_OPEN", 4);

            private write(String str, int i) {
            }

            static {
                write[] writeVarArrIconCompatParcelizer = IconCompatParcelizer();
                AudioAttributesImplBaseParcelizer = writeVarArrIconCompatParcelizer;
                getMagicModuleTimeline.IconCompatParcelizer(writeVarArrIconCompatParcelizer);
            }

            public static write valueOf(String str) {
                return (write) Enum.valueOf(write.class, str);
            }

            public static write[] values() {
                return (write[]) AudioAttributesImplBaseParcelizer.clone();
            }

            private static final /* synthetic */ write[] IconCompatParcelizer() {
                return new write[]{AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer, read, IconCompatParcelizer, write};
            }
        }

        /* JADX INFO: renamed from: o.setUsePercentValues$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/setUsePercentValues$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/setUsePercentValues$RemoteActionCompatParcelizer;", "p0", "Landroid/database/sqlite/SQLiteDatabase;", "p1", "Lo/setHoleRadius;", "write", "(Lo/setUsePercentValues$RemoteActionCompatParcelizer;Landroid/database/sqlite/SQLiteDatabase;)Lo/setHoleRadius;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public static setHoleRadius write(RemoteActionCompatParcelizer p0, SQLiteDatabase p1) {
                toMagicModuleMetaRepoModel.write(p0, "");
                toMagicModuleMetaRepoModel.write(p1, "");
                setHoleRadius setholeradiusAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer();
                if (setholeradiusAudioAttributesCompatParcelizer != null && setholeradiusAudioAttributesCompatParcelizer.read(p1)) {
                    return setholeradiusAudioAttributesCompatParcelizer;
                }
                setHoleRadius setholeradius = new setHoleRadius(p1);
                p0.read(setholeradius);
                return setholeradius;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }
    }

    static final class RemoteActionCompatParcelizer {
        private setHoleRadius IconCompatParcelizer = null;

        public final setHoleRadius AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final void read(setHoleRadius setholeradius) {
            this.IconCompatParcelizer = setholeradius;
        }
    }
}
