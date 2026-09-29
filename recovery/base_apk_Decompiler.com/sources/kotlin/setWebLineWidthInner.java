package kotlin;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.setWebLineWidthInner;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000 \u00182\u00020\u0001:\u0003\u0018\u0012\u000bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u00028\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00048\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\"\u0010\u0018\u001a\u00020\u00138\u0005@\u0005X\u0085\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\n\u0082\u0001\u0002\u0019\u001a"}, d2 = {"Lo/setWebLineWidthInner;", "Lo/setDrawEntryLabels;", "Landroid/database/sqlite/SQLiteDatabase;", "p0", "", "p1", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V", "", "MediaBrowserCompatCustomActionResultReceiver", "()V", "AudioAttributesCompatParcelizer", "Landroid/database/sqlite/SQLiteDatabase;", "read", "()Landroid/database/sqlite/SQLiteDatabase;", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "()Ljava/lang/String;", "IconCompatParcelizer", "", "Z", "AudioAttributesImplBaseParcelizer", "()Z", "MediaBrowserCompatItemReceiver", "write", "Lo/setWebLineWidthInner$AudioAttributesCompatParcelizer;", "Lo/setWebLineWidthInner$IconCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class setWebLineWidthInner implements setDrawEntryLabels {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final SQLiteDatabase RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean write;

    private setWebLineWidthInner(SQLiteDatabase sQLiteDatabase, String str) {
        this.RemoteActionCompatParcelizer = sQLiteDatabase;
        this.IconCompatParcelizer = str;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    protected final SQLiteDatabase getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    protected final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    protected final boolean getWrite() {
        return this.write;
    }

    protected final void MediaBrowserCompatItemReceiver() {
        this.write = true;
    }

    protected final void MediaBrowserCompatCustomActionResultReceiver() {
        if (this.write) {
            setDrawCenterText.write(21, "statement is closed");
            throw new PlanDetailsCreator();
        }
    }

    public /* synthetic */ setWebLineWidthInner(SQLiteDatabase sQLiteDatabase, String str, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(sQLiteDatabase, str);
    }

    /* JADX INFO: renamed from: o.setWebLineWidthInner$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/setWebLineWidthInner$write;", "", "<init>", "()V", "Landroid/database/sqlite/SQLiteDatabase;", "p0", "", "p1", "Lo/setWebLineWidthInner;", "IconCompatParcelizer", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Lo/setWebLineWidthInner;", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static setWebLineWidthInner IconCompatParcelizer(SQLiteDatabase p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            if (RemoteActionCompatParcelizer(p1)) {
                return new IconCompatParcelizer(p0, p1);
            }
            return new AudioAttributesCompatParcelizer(p0, p1);
        }

        private static boolean RemoteActionCompatParcelizer(String p0) {
            String string = TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) p0).toString();
            if (string.length() < 3) {
                return false;
            }
            String strSubstring = string.substring(0, 3);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            String upperCase = strSubstring.toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
            int iHashCode = upperCase.hashCode();
            if (iHashCode != 79487) {
                if (iHashCode != 81978) {
                    if (iHashCode == 85954 && upperCase.equals("WIT")) {
                        return true;
                    }
                } else if (upperCase.equals("SEL")) {
                    return true;
                }
            } else if (upperCase.equals("PRA")) {
                return true;
            }
            return false;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0012J\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0013J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020!H\u0002¢\u0006\u0004\b\u0015\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010&R\u0016\u0010\u0015\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0016\u0010\u000e\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u0010\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010-R\u001e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00101R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00102"}, d2 = {"Lo/setWebLineWidthInner$IconCompatParcelizer;", "Lo/setWebLineWidthInner;", "Landroid/database/sqlite/SQLiteDatabase;", "p0", "", "p1", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V", "", "", "", "read", "(I[B)V", "", "IconCompatParcelizer", "(IJ)V", "RemoteActionCompatParcelizer", "(ILjava/lang/String;)V", "(I)V", "(I)[B", "(I)J", "AudioAttributesCompatParcelizer", "(I)Ljava/lang/String;", "", "AudioAttributesImplBaseParcelizer", "(I)Z", "()I", "write", "()Z", "()V", "close", "(II)V", "AudioAttributesImplApi21Parcelizer", "Landroid/database/sqlite/SQLiteProgram;", "(Landroid/database/sqlite/SQLiteProgram;)V", "Landroid/database/Cursor;", "AudioAttributesImplApi26Parcelizer", "()Landroid/database/Cursor;", "(Landroid/database/Cursor;I)V", "", "[I", "", "MediaBrowserCompatCustomActionResultReceiver", "[J", "", "[D", "", "MediaBrowserCompatItemReceiver", "[Ljava/lang/String;", "[[B", "Landroid/database/Cursor;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends setWebLineWidthInner {
        private int[] AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private double[] RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private byte[][] write;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private long[] IconCompatParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private String[] read;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private Cursor AudioAttributesImplApi26Parcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(SQLiteDatabase sQLiteDatabase, String str) {
            super(sQLiteDatabase, str, null);
            toMagicModuleMetaRepoModel.write(sQLiteDatabase, "");
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = new int[0];
            this.IconCompatParcelizer = new long[0];
            this.RemoteActionCompatParcelizer = new double[0];
            this.read = new String[0];
            this.write = new byte[0][];
        }

        @Override // kotlin.setDrawEntryLabels
        public final void read(int p0, byte[] p1) {
            toMagicModuleMetaRepoModel.write(p1, "");
            MediaBrowserCompatCustomActionResultReceiver();
            IconCompatParcelizer(4, p0);
            this.AudioAttributesCompatParcelizer[p0] = 4;
            this.write[p0] = p1;
        }

        @Override // kotlin.setDrawEntryLabels
        public final void IconCompatParcelizer(int p0, long p1) {
            MediaBrowserCompatCustomActionResultReceiver();
            IconCompatParcelizer(1, p0);
            this.AudioAttributesCompatParcelizer[p0] = 1;
            this.IconCompatParcelizer[p0] = p1;
        }

        @Override // kotlin.setDrawEntryLabels
        public final void RemoteActionCompatParcelizer(int p0, String p1) {
            toMagicModuleMetaRepoModel.write(p1, "");
            MediaBrowserCompatCustomActionResultReceiver();
            IconCompatParcelizer(3, p0);
            this.AudioAttributesCompatParcelizer[p0] = 3;
            this.read[p0] = p1;
        }

        @Override // kotlin.setDrawEntryLabels
        public final void read(int p0) {
            MediaBrowserCompatCustomActionResultReceiver();
            IconCompatParcelizer(5, p0);
            this.AudioAttributesCompatParcelizer[p0] = 5;
        }

        @Override // kotlin.setDrawEntryLabels
        public final byte[] RemoteActionCompatParcelizer(int p0) {
            MediaBrowserCompatCustomActionResultReceiver();
            Cursor cursorAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
            RemoteActionCompatParcelizer(cursorAudioAttributesImplApi26Parcelizer, p0);
            byte[] blob = cursorAudioAttributesImplApi26Parcelizer.getBlob(p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(blob, "");
            return blob;
        }

        @Override // kotlin.setDrawEntryLabels
        public final long IconCompatParcelizer(int p0) {
            MediaBrowserCompatCustomActionResultReceiver();
            Cursor cursorAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
            RemoteActionCompatParcelizer(cursorAudioAttributesImplApi26Parcelizer, p0);
            return cursorAudioAttributesImplApi26Parcelizer.getLong(p0);
        }

        @Override // kotlin.setDrawEntryLabels
        public final String AudioAttributesCompatParcelizer(int p0) {
            MediaBrowserCompatCustomActionResultReceiver();
            Cursor cursorAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
            RemoteActionCompatParcelizer(cursorAudioAttributesImplApi26Parcelizer, p0);
            String string = cursorAudioAttributesImplApi26Parcelizer.getString(p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            return string;
        }

        @Override // kotlin.setDrawEntryLabels
        public final boolean AudioAttributesImplBaseParcelizer(int p0) {
            MediaBrowserCompatCustomActionResultReceiver();
            Cursor cursorAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
            RemoteActionCompatParcelizer(cursorAudioAttributesImplApi26Parcelizer, p0);
            return cursorAudioAttributesImplApi26Parcelizer.isNull(p0);
        }

        @Override // kotlin.setDrawEntryLabels
        public final int IconCompatParcelizer() {
            MediaBrowserCompatCustomActionResultReceiver();
            AudioAttributesImplApi21Parcelizer();
            Cursor cursor = this.AudioAttributesImplApi26Parcelizer;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // kotlin.setDrawEntryLabels
        public final String write(int p0) {
            MediaBrowserCompatCustomActionResultReceiver();
            AudioAttributesImplApi21Parcelizer();
            Cursor cursor = this.AudioAttributesImplApi26Parcelizer;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            RemoteActionCompatParcelizer(cursor, p0);
            String columnName = cursor.getColumnName(p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(columnName, "");
            return columnName;
        }

        @Override // kotlin.setDrawEntryLabels
        public final boolean write() {
            MediaBrowserCompatCustomActionResultReceiver();
            AudioAttributesImplApi21Parcelizer();
            Cursor cursor = this.AudioAttributesImplApi26Parcelizer;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        @Override // kotlin.setDrawEntryLabels
        public final void AudioAttributesCompatParcelizer() {
            MediaBrowserCompatCustomActionResultReceiver();
            Cursor cursor = this.AudioAttributesImplApi26Parcelizer;
            if (cursor != null) {
                cursor.close();
            }
            this.AudioAttributesImplApi26Parcelizer = null;
        }

        @Override // kotlin.setDrawEntryLabels, java.lang.AutoCloseable
        public final void close() {
            if (!getWrite()) {
                AudioAttributesCompatParcelizer();
            }
            MediaBrowserCompatItemReceiver();
        }

        private final void IconCompatParcelizer(int p0, int p1) {
            int i = p1 + 1;
            int[] iArr = this.AudioAttributesCompatParcelizer;
            if (iArr.length < i) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iArrCopyOf, "");
                this.AudioAttributesCompatParcelizer = iArrCopyOf;
            }
            if (p0 == 1) {
                long[] jArr = this.IconCompatParcelizer;
                if (jArr.length < i) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jArrCopyOf, "");
                    this.IconCompatParcelizer = jArrCopyOf;
                    return;
                }
                return;
            }
            if (p0 == 2) {
                double[] dArr = this.RemoteActionCompatParcelizer;
                if (dArr.length < i) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(dArrCopyOf, "");
                    this.RemoteActionCompatParcelizer = dArrCopyOf;
                    return;
                }
                return;
            }
            if (p0 == 3) {
                String[] strArr = this.read;
                if (strArr.length < i) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
                    this.read = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (p0 == 4) {
                byte[][] bArr = this.write;
                if (bArr.length < i) {
                    Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf2, "");
                    this.write = (byte[][]) objArrCopyOf2;
                }
            }
        }

        private final void AudioAttributesImplApi21Parcelizer() {
            if (this.AudioAttributesImplApi26Parcelizer == null) {
                this.AudioAttributesImplApi26Parcelizer = getRemoteActionCompatParcelizer().rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: o.setWebColorInner
                    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                        return setWebLineWidthInner.IconCompatParcelizer.read(this.read, sQLiteCursorDriver, str, sQLiteQuery);
                    }
                }, getIconCompatParcelizer(), new String[0], null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Cursor read(IconCompatParcelizer iconCompatParcelizer, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            toMagicModuleMetaRepoModel.write(sQLiteQuery);
            iconCompatParcelizer.AudioAttributesCompatParcelizer(sQLiteQuery);
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }

        private final void AudioAttributesCompatParcelizer(SQLiteProgram p0) {
            int length = this.AudioAttributesCompatParcelizer.length;
            for (int i = 1; i < length; i++) {
                int i2 = this.AudioAttributesCompatParcelizer[i];
                if (i2 == 1) {
                    p0.bindLong(i, this.IconCompatParcelizer[i]);
                } else if (i2 == 2) {
                    p0.bindDouble(i, this.RemoteActionCompatParcelizer[i]);
                } else if (i2 == 3) {
                    p0.bindString(i, this.read[i]);
                } else if (i2 == 4) {
                    p0.bindBlob(i, this.write[i]);
                } else if (i2 == 5) {
                    p0.bindNull(i);
                }
            }
        }

        private final Cursor AudioAttributesImplApi26Parcelizer() {
            Cursor cursor = this.AudioAttributesImplApi26Parcelizer;
            if (cursor != null) {
                return cursor;
            }
            setDrawCenterText.write(21, "no row");
            throw new PlanDetailsCreator();
        }

        private static void RemoteActionCompatParcelizer(Cursor p0, int p1) {
            if (p1 < 0 || p1 >= p0.getColumnCount()) {
                setDrawCenterText.write(25, "column index out of range");
                throw new PlanDetailsCreator();
            }
        }
    }

    static final class AudioAttributesCompatParcelizer extends setWebLineWidthInner {
        private final SQLiteStatement AudioAttributesCompatParcelizer;

        @Override // kotlin.setDrawEntryLabels
        public final void AudioAttributesCompatParcelizer() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(SQLiteDatabase sQLiteDatabase, String str) {
            super(sQLiteDatabase, str, null);
            toMagicModuleMetaRepoModel.write(sQLiteDatabase, "");
            toMagicModuleMetaRepoModel.write(str, "");
            SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement(str);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sQLiteStatementCompileStatement, "");
            this.AudioAttributesCompatParcelizer = sQLiteStatementCompileStatement;
        }

        @Override // kotlin.setDrawEntryLabels
        public final void read(int i, byte[] bArr) {
            toMagicModuleMetaRepoModel.write(bArr, "");
            MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesCompatParcelizer.bindBlob(i, bArr);
        }

        @Override // kotlin.setDrawEntryLabels
        public final void IconCompatParcelizer(int i, long j) {
            MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesCompatParcelizer.bindLong(i, j);
        }

        @Override // kotlin.setDrawEntryLabels
        public final void RemoteActionCompatParcelizer(int i, String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesCompatParcelizer.bindString(i, str);
        }

        @Override // kotlin.setDrawEntryLabels
        public final void read(int i) {
            MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesCompatParcelizer.bindNull(i);
        }

        @Override // kotlin.setDrawEntryLabels
        public final byte[] RemoteActionCompatParcelizer(int i) {
            MediaBrowserCompatCustomActionResultReceiver();
            setDrawCenterText.write(21, "no row");
            throw new PlanDetailsCreator();
        }

        @Override // kotlin.setDrawEntryLabels
        public final long IconCompatParcelizer(int i) {
            MediaBrowserCompatCustomActionResultReceiver();
            setDrawCenterText.write(21, "no row");
            throw new PlanDetailsCreator();
        }

        @Override // kotlin.setDrawEntryLabels
        public final String AudioAttributesCompatParcelizer(int i) {
            MediaBrowserCompatCustomActionResultReceiver();
            setDrawCenterText.write(21, "no row");
            throw new PlanDetailsCreator();
        }

        @Override // kotlin.setDrawEntryLabels
        public final boolean AudioAttributesImplBaseParcelizer(int i) {
            MediaBrowserCompatCustomActionResultReceiver();
            setDrawCenterText.write(21, "no row");
            throw new PlanDetailsCreator();
        }

        @Override // kotlin.setDrawEntryLabels
        public final int IconCompatParcelizer() {
            MediaBrowserCompatCustomActionResultReceiver();
            return 0;
        }

        @Override // kotlin.setDrawEntryLabels
        public final String write(int i) {
            MediaBrowserCompatCustomActionResultReceiver();
            setDrawCenterText.write(21, "no row");
            throw new PlanDetailsCreator();
        }

        @Override // kotlin.setDrawEntryLabels
        public final boolean write() {
            MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesCompatParcelizer.execute();
            return false;
        }

        @Override // kotlin.setDrawEntryLabels, java.lang.AutoCloseable
        public final void close() {
            this.AudioAttributesCompatParcelizer.close();
            MediaBrowserCompatItemReceiver();
        }
    }
}
