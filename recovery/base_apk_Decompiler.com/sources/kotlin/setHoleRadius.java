package kotlin;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.setDrawRoundedSlices;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u000b\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u000b\u0010\u0017JE\u0010\u0010\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u001f\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u0010\u0010 J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010!J)\u0010\"\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0010\u0010\u0019\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001e0\u001dH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\fJ\u0015\u0010%\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u001e\u0010\b\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00188V@WX\u0096\u000e¢\u0006\u0006\"\u0004\b\b\u0010(R\u0014\u0010\u000b\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0014R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010*R\u0014\u0010\u0010\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0014R(\u0010\u0011\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060-\u0018\u00010,8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010."}, d2 = {"Lo/setHoleRadius;", "Lo/setDrawSliceText;", "Landroid/database/sqlite/SQLiteDatabase;", "p0", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "Lo/setEntryLabelTypeface;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Lo/setEntryLabelTypeface;", "", "AudioAttributesCompatParcelizer", "()V", "RatingCompat", "Landroid/database/sqlite/SQLiteTransactionListener;", "onAddQueueItem", "write", "MediaBrowserCompatItemReceiver", "", "AudioAttributesImplApi26Parcelizer", "()Z", "Lo/setMaxAngle;", "Landroid/database/Cursor;", "(Lo/setMaxAngle;)Landroid/database/Cursor;", "", "p1", "Landroid/content/ContentValues;", "p2", "p3", "", "", "p4", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "(Ljava/lang/String;)V", "IconCompatParcelizer", "(Ljava/lang/String;[Ljava/lang/Object;)V", "close", "read", "(Landroid/database/sqlite/SQLiteDatabase;)Z", "Landroid/database/sqlite/SQLiteDatabase;", "(I)V", "AudioAttributesImplBaseParcelizer", "()Ljava/lang/String;", "MediaBrowserCompatCustomActionResultReceiver", "", "Landroid/util/Pair;", "()Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setHoleRadius implements setDrawSliceText {

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final SQLiteDatabase read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String[] AudioAttributesCompatParcelizer = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] RemoteActionCompatParcelizer = new String[0];
    private static final RenewEligible<Method> IconCompatParcelizer = getRenewExpiresOn.write(RenewEligibleCompanion.read, new getCreatedOnDateMs() { // from class: o.setTransparentCircleRadius
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return setHoleRadius.onCustomAction();
        }
    });
    private static final RenewEligible<Method> read = getRenewExpiresOn.write(RenewEligibleCompanion.read, new getCreatedOnDateMs() { // from class: o.PieRadarChartBase
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return setHoleRadius.MediaMetadataCompat();
        }
    });

    public setHoleRadius(SQLiteDatabase sQLiteDatabase) {
        toMagicModuleMetaRepoModel.write(sQLiteDatabase, "");
        this.read = sQLiteDatabase;
    }

    @Override // kotlin.setDrawSliceText
    public final setEntryLabelTypeface RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        SQLiteStatement sQLiteStatementCompileStatement = this.read.compileStatement(p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sQLiteStatementCompileStatement, "");
        return new setRotationEnabled(sQLiteStatementCompileStatement);
    }

    @Override // kotlin.setDrawSliceText
    public final void AudioAttributesCompatParcelizer() {
        this.read.beginTransaction();
    }

    @Override // kotlin.setDrawSliceText
    public final void RemoteActionCompatParcelizer() {
        this.read.beginTransactionNonExclusive();
    }

    @Override // kotlin.setDrawSliceText
    public final void RatingCompat() throws IllegalAccessException, InvocationTargetException {
        onAddQueueItem();
    }

    private final void onAddQueueItem() throws IllegalAccessException, InvocationTargetException {
        if (Companion.read() == null || Companion.AudioAttributesCompatParcelizer() == null) {
            AudioAttributesCompatParcelizer();
            return;
        }
        Method method = Companion.read();
        toMagicModuleMetaRepoModel.write(method);
        Method methodAudioAttributesCompatParcelizer = Companion.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.write(methodAudioAttributesCompatParcelizer);
        Object objInvoke = methodAudioAttributesCompatParcelizer.invoke(this.read, new Object[0]);
        if (objInvoke != null) {
            method.invoke(objInvoke, 0, null, 0, null);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // kotlin.setDrawSliceText
    public final void write() {
        this.read.endTransaction();
    }

    @Override // kotlin.setDrawSliceText
    public final void MediaBrowserCompatItemReceiver() {
        this.read.setTransactionSuccessful();
    }

    @Override // kotlin.setDrawSliceText
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.read.inTransaction();
    }

    @Override // kotlin.setDrawSliceText
    public final void RemoteActionCompatParcelizer(int i) {
        this.read.setVersion(i);
    }

    @Override // kotlin.setDrawSliceText
    public final Cursor AudioAttributesCompatParcelizer(final setMaxAngle p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final getMagicModuleStat getmagicmodulestat = new getMagicModuleStat() { // from class: o.setHoleColor
            @Override // kotlin.getMagicModuleStat
            public final Object write(Object obj, Object obj2, Object obj3, Object obj4) {
                return setHoleRadius.AudioAttributesCompatParcelizer(p0, (SQLiteCursorDriver) obj2, (String) obj3, (SQLiteQuery) obj4);
            }
        };
        Cursor cursorRawQueryWithFactory = this.read.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: o.setMinAngleForSlices
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return setHoleRadius.write(getmagicmodulestat, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, p0.getRead(), RemoteActionCompatParcelizer, null);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cursorRawQueryWithFactory, "");
        return cursorRawQueryWithFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SQLiteCursor AudioAttributesCompatParcelizer(setMaxAngle setmaxangle, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        toMagicModuleMetaRepoModel.write(sQLiteQuery);
        setmaxangle.AudioAttributesCompatParcelizer(new setSkipWebLineCount(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor write(getMagicModuleStat getmagicmodulestat, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return (Cursor) getmagicmodulestat.write(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // kotlin.setDrawSliceText
    public final int write(String p0, int p1, ContentValues p2, String p3, Object[] p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        if (p2.size() == 0) {
            throw new IllegalArgumentException("Empty values".toString());
        }
        int size = p2.size();
        int length = p4 == null ? size : p4.length + size;
        Object[] objArr = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(AudioAttributesCompatParcelizer[p1]);
        sb.append(p0);
        sb.append(" SET ");
        int i = 0;
        for (String str : p2.keySet()) {
            sb.append(i > 0 ? "," : "");
            sb.append(str);
            objArr[i] = p2.get(str);
            sb.append("=?");
            i++;
        }
        if (p4 != null) {
            for (int i2 = size; i2 < length; i2++) {
                objArr[i2] = p4[i2 - size];
            }
        }
        if (!TextUtils.isEmpty(p3)) {
            sb.append(" WHERE ");
            sb.append(p3);
        }
        setEntryLabelTypeface setentrylabeltypefaceRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(sb.toString());
        setDrawRoundedSlices.Companion companion = setDrawRoundedSlices.INSTANCE;
        setDrawRoundedSlices.Companion.read(setentrylabeltypefaceRemoteActionCompatParcelizer, objArr);
        return setentrylabeltypefaceRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setDrawSliceText
    public final void AudioAttributesCompatParcelizer(String p0) throws SQLException {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.read.execSQL(p0);
    }

    @Override // kotlin.setDrawSliceText
    public final void IconCompatParcelizer(String p0, Object[] p1) throws SQLException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        this.read.execSQL(p0, p1);
    }

    @Override // kotlin.setDrawSliceText
    public final boolean AudioAttributesImplBaseParcelizer() {
        return this.read.isOpen();
    }

    @Override // kotlin.setDrawSliceText
    public final String read() {
        return this.read.getPath();
    }

    @Override // kotlin.setDrawSliceText
    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.read.isWriteAheadLoggingEnabled();
    }

    @Override // kotlin.setDrawSliceText
    public final List<Pair<String, String>> IconCompatParcelizer() {
        return this.read.getAttachedDbs();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.read.close();
    }

    public final boolean read(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, p0);
    }

    /* JADX INFO: renamed from: o.setHoleRadius$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000b8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001d\u0010\t\u001a\u0004\u0018\u00010\u000b8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\n\u0010\r"}, d2 = {"Lo/setHoleRadius$write;", "", "<init>", "()V", "", "", "AudioAttributesCompatParcelizer", "[Ljava/lang/String;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "read", "Ljava/lang/reflect/Method;", "Lo/RenewEligible;", "()Ljava/lang/reflect/Method;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Method AudioAttributesCompatParcelizer() {
            return (Method) setHoleRadius.IconCompatParcelizer.RemoteActionCompatParcelizer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Method read() {
            return (Method) setHoleRadius.read.RemoteActionCompatParcelizer();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method onCustomAction() {
        try {
            Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method MediaMetadataCompat() {
        Class<?> returnType;
        try {
            Method methodAudioAttributesCompatParcelizer = Companion.AudioAttributesCompatParcelizer();
            if (methodAudioAttributesCompatParcelizer == null || (returnType = methodAudioAttributesCompatParcelizer.getReturnType()) == null) {
                return null;
            }
            return returnType.getDeclaredMethod("beginTransaction", Integer.TYPE, SQLiteTransactionListener.class, Integer.TYPE, CancellationSignal.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
