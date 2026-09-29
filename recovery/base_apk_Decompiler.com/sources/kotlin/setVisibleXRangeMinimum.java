package kotlin;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.setVisibleXRangeMinimum;

/* JADX INFO: loaded from: classes2.dex */
public final class setVisibleXRangeMinimum implements setEntryLabelTextSize, ULongKeyDeserializer {
    private final setVisibleYRangeMaximum AudioAttributesCompatParcelizer;
    private final write RemoteActionCompatParcelizer;
    private final setEntryLabelTextSize write;

    @Override // kotlin.ULongKeyDeserializer
    public final setEntryLabelTextSize RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final setVisibleYRangeMaximum IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.setEntryLabelTextSize
    public final setDrawSliceText write() {
        this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.setEntryLabelTextSize
    public final setDrawSliceText AudioAttributesCompatParcelizer() {
        this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.setEntryLabelTextSize, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.RemoteActionCompatParcelizer.close();
    }

    @Override // kotlin.setEntryLabelTextSize
    /* JADX INFO: renamed from: read */
    public final String getRead() {
        return this.write.getRead();
    }

    @Override // kotlin.setEntryLabelTextSize
    public final void read(boolean z) {
        this.write.read(z);
    }

    public static final class write implements setDrawSliceText {
        private final setVisibleYRangeMaximum write;

        public final void AudioAttributesImplApi21Parcelizer() {
            this.write.write(new getAnswerMap() { // from class: o.setDescription
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return setVisibleXRangeMinimum.write.AudioAttributesCompatParcelizer((setDrawSliceText) obj);
                }
            });
        }

        @Override // kotlin.setDrawSliceText
        public final setEntryLabelTypeface RemoteActionCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            return new IconCompatParcelizer(str, this.write);
        }

        @Override // kotlin.setDrawSliceText
        public final void AudioAttributesCompatParcelizer() {
            try {
                this.write.read().AudioAttributesCompatParcelizer();
            } catch (Throwable th) {
                this.write.write();
                throw th;
            }
        }

        @Override // kotlin.setDrawSliceText
        public final void RemoteActionCompatParcelizer() {
            try {
                this.write.read().RemoteActionCompatParcelizer();
            } catch (Throwable th) {
                this.write.write();
                throw th;
            }
        }

        @Override // kotlin.setDrawSliceText
        public final void write() {
            try {
                setDrawSliceText audioAttributesImplBaseParcelizer = this.write.getAudioAttributesImplBaseParcelizer();
                toMagicModuleMetaRepoModel.write(audioAttributesImplBaseParcelizer);
                audioAttributesImplBaseParcelizer.write();
            } finally {
                this.write.write();
            }
        }

        @Override // kotlin.setDrawSliceText
        public final void MediaBrowserCompatItemReceiver() {
            setDrawSliceText audioAttributesImplBaseParcelizer = this.write.getAudioAttributesImplBaseParcelizer();
            toMagicModuleMetaRepoModel.write(audioAttributesImplBaseParcelizer);
            audioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver();
        }

        @Override // kotlin.setDrawSliceText
        public final boolean AudioAttributesImplApi26Parcelizer() {
            if (this.write.getAudioAttributesImplBaseParcelizer() == null) {
                return false;
            }
            return ((Boolean) this.write.write(read.IconCompatParcelizer)).booleanValue();
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        final /* synthetic */ class read extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<setDrawSliceText, Boolean> {
            public static final read IconCompatParcelizer = new read();

            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(setDrawSliceText setdrawslicetext) {
                toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
                return Boolean.valueOf(setdrawslicetext.AudioAttributesImplApi26Parcelizer());
            }

            read() {
                super(1, setDrawSliceText.class, "inTransaction", "inTransaction()Z", 0);
            }
        }

        @Override // kotlin.setDrawSliceText
        public final void RemoteActionCompatParcelizer(final int i) {
            this.write.write(new getAnswerMap() { // from class: o.setVisibleYRangeMinimum
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return setVisibleXRangeMinimum.write.read(i, (setDrawSliceText) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(int i, setDrawSliceText setdrawslicetext) {
            toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
            setdrawslicetext.RemoteActionCompatParcelizer(i);
            return getShowPopup.INSTANCE;
        }

        @Override // kotlin.setDrawSliceText
        public final Cursor AudioAttributesCompatParcelizer(setMaxAngle setmaxangle) {
            toMagicModuleMetaRepoModel.write(setmaxangle, "");
            try {
                return new read(this.write.read().AudioAttributesCompatParcelizer(setmaxangle), this.write);
            } catch (Throwable th) {
                this.write.write();
                throw th;
            }
        }

        @Override // kotlin.setDrawSliceText
        public final int write(final String str, final int i, final ContentValues contentValues, final String str2, final Object[] objArr) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(contentValues, "");
            return ((Number) this.write.write(new getAnswerMap() { // from class: o.setXAxisRenderer
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Integer.valueOf(setVisibleXRangeMinimum.write.write(str, i, contentValues, str2, objArr, (setDrawSliceText) obj));
                }
            })).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int write(String str, int i, ContentValues contentValues, String str2, Object[] objArr, setDrawSliceText setdrawslicetext) {
            toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
            return setdrawslicetext.write(str, i, contentValues, str2, objArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup write(String str, setDrawSliceText setdrawslicetext) {
            toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
            setdrawslicetext.AudioAttributesCompatParcelizer(str);
            return getShowPopup.INSTANCE;
        }

        @Override // kotlin.setDrawSliceText
        public final void AudioAttributesCompatParcelizer(final String str) throws SQLException {
            toMagicModuleMetaRepoModel.write(str, "");
            this.write.write(new getAnswerMap() { // from class: o.BubbleChart
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return setVisibleXRangeMinimum.write.write(str, (setDrawSliceText) obj);
                }
            });
        }

        @Override // kotlin.setDrawSliceText
        public final void IconCompatParcelizer(final String str, final Object[] objArr) throws SQLException {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(objArr, "");
            this.write.write(new getAnswerMap() { // from class: o.CandleStickChart
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return setVisibleXRangeMinimum.write.AudioAttributesCompatParcelizer(str, objArr, (setDrawSliceText) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesCompatParcelizer(String str, Object[] objArr, setDrawSliceText setdrawslicetext) {
            toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
            setdrawslicetext.IconCompatParcelizer(str, objArr);
            return getShowPopup.INSTANCE;
        }

        @Override // kotlin.setDrawSliceText
        public final boolean AudioAttributesImplBaseParcelizer() {
            setDrawSliceText audioAttributesImplBaseParcelizer = this.write.getAudioAttributesImplBaseParcelizer();
            if (audioAttributesImplBaseParcelizer != null) {
                return audioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer();
            }
            return false;
        }

        @Override // kotlin.setDrawSliceText
        public final String read() {
            return (String) this.write.write(new downloadMagicModuleMetalambda0() { // from class: o.setVisibleXRangeMinimum.write.write
                @Override // kotlin.downloadMagicModuleMetalambda0, kotlin.isVideoNetworkError
                public final Object AudioAttributesCompatParcelizer(Object obj) {
                    return ((setDrawSliceText) obj).read();
                }
            });
        }

        @Override // kotlin.setDrawSliceText
        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            return ((Boolean) this.write.write(new downloadMagicModuleMetalambda0() { // from class: o.setVisibleXRangeMinimum.write.RemoteActionCompatParcelizer
                @Override // kotlin.downloadMagicModuleMetalambda0, kotlin.isVideoNetworkError
                public final Object AudioAttributesCompatParcelizer(Object obj) {
                    return Boolean.valueOf(((setDrawSliceText) obj).MediaBrowserCompatCustomActionResultReceiver());
                }
            })).booleanValue();
        }

        @Override // kotlin.setDrawSliceText
        public final List<Pair<String, String>> IconCompatParcelizer() {
            return (List) this.write.write(new downloadMagicModuleMetalambda0() { // from class: o.setVisibleXRangeMinimum.write.AudioAttributesCompatParcelizer
                @Override // kotlin.downloadMagicModuleMetalambda0, kotlin.isVideoNetworkError
                public final Object AudioAttributesCompatParcelizer(Object obj) {
                    return ((setDrawSliceText) obj).IconCompatParcelizer();
                }
            });
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.write.AudioAttributesCompatParcelizer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object AudioAttributesCompatParcelizer(setDrawSliceText setdrawslicetext) {
            toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
            return null;
        }
    }

    static final class read implements Cursor {
        private final Cursor AudioAttributesCompatParcelizer;
        private final setVisibleYRangeMaximum read;

        public read(Cursor cursor, setVisibleYRangeMaximum setvisibleyrangemaximum) {
            toMagicModuleMetaRepoModel.write(cursor, "");
            toMagicModuleMetaRepoModel.write(setvisibleyrangemaximum, "");
            this.AudioAttributesCompatParcelizer = cursor;
            this.read = setvisibleyrangemaximum;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.AudioAttributesCompatParcelizer.close();
            this.read.write();
        }

        @Override // android.database.Cursor
        public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            this.AudioAttributesCompatParcelizer.copyStringToBuffer(i, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @getRenewGrpId
        public final void deactivate() {
            this.AudioAttributesCompatParcelizer.deactivate();
        }

        @Override // android.database.Cursor
        public final byte[] getBlob(int i) {
            return this.AudioAttributesCompatParcelizer.getBlob(i);
        }

        @Override // android.database.Cursor
        public final int getColumnCount() {
            return this.AudioAttributesCompatParcelizer.getColumnCount();
        }

        @Override // android.database.Cursor
        public final int getColumnIndex(String str) {
            return this.AudioAttributesCompatParcelizer.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public final int getColumnIndexOrThrow(String str) {
            return this.AudioAttributesCompatParcelizer.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public final String getColumnName(int i) {
            return this.AudioAttributesCompatParcelizer.getColumnName(i);
        }

        @Override // android.database.Cursor
        public final String[] getColumnNames() {
            return this.AudioAttributesCompatParcelizer.getColumnNames();
        }

        @Override // android.database.Cursor
        public final int getCount() {
            return this.AudioAttributesCompatParcelizer.getCount();
        }

        @Override // android.database.Cursor
        public final double getDouble(int i) {
            return this.AudioAttributesCompatParcelizer.getDouble(i);
        }

        @Override // android.database.Cursor
        public final Bundle getExtras() {
            return this.AudioAttributesCompatParcelizer.getExtras();
        }

        @Override // android.database.Cursor
        public final float getFloat(int i) {
            return this.AudioAttributesCompatParcelizer.getFloat(i);
        }

        @Override // android.database.Cursor
        public final int getInt(int i) {
            return this.AudioAttributesCompatParcelizer.getInt(i);
        }

        @Override // android.database.Cursor
        public final long getLong(int i) {
            return this.AudioAttributesCompatParcelizer.getLong(i);
        }

        @Override // android.database.Cursor
        public final Uri getNotificationUri() {
            return this.AudioAttributesCompatParcelizer.getNotificationUri();
        }

        @Override // android.database.Cursor
        public final int getPosition() {
            return this.AudioAttributesCompatParcelizer.getPosition();
        }

        @Override // android.database.Cursor
        public final short getShort(int i) {
            return this.AudioAttributesCompatParcelizer.getShort(i);
        }

        @Override // android.database.Cursor
        public final String getString(int i) {
            return this.AudioAttributesCompatParcelizer.getString(i);
        }

        @Override // android.database.Cursor
        public final int getType(int i) {
            return this.AudioAttributesCompatParcelizer.getType(i);
        }

        @Override // android.database.Cursor
        public final boolean getWantsAllOnMoveCalls() {
            return this.AudioAttributesCompatParcelizer.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public final boolean isAfterLast() {
            return this.AudioAttributesCompatParcelizer.isAfterLast();
        }

        @Override // android.database.Cursor
        public final boolean isBeforeFirst() {
            return this.AudioAttributesCompatParcelizer.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public final boolean isClosed() {
            return this.AudioAttributesCompatParcelizer.isClosed();
        }

        @Override // android.database.Cursor
        public final boolean isFirst() {
            return this.AudioAttributesCompatParcelizer.isFirst();
        }

        @Override // android.database.Cursor
        public final boolean isLast() {
            return this.AudioAttributesCompatParcelizer.isLast();
        }

        @Override // android.database.Cursor
        public final boolean isNull(int i) {
            return this.AudioAttributesCompatParcelizer.isNull(i);
        }

        @Override // android.database.Cursor
        public final boolean move(int i) {
            return this.AudioAttributesCompatParcelizer.move(i);
        }

        @Override // android.database.Cursor
        public final boolean moveToFirst() {
            return this.AudioAttributesCompatParcelizer.moveToFirst();
        }

        @Override // android.database.Cursor
        public final boolean moveToLast() {
            return this.AudioAttributesCompatParcelizer.moveToLast();
        }

        @Override // android.database.Cursor
        public final boolean moveToNext() {
            return this.AudioAttributesCompatParcelizer.moveToNext();
        }

        @Override // android.database.Cursor
        public final boolean moveToPosition(int i) {
            return this.AudioAttributesCompatParcelizer.moveToPosition(i);
        }

        @Override // android.database.Cursor
        public final boolean moveToPrevious() {
            return this.AudioAttributesCompatParcelizer.moveToPrevious();
        }

        @Override // android.database.Cursor
        public final void registerContentObserver(ContentObserver contentObserver) {
            this.AudioAttributesCompatParcelizer.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.AudioAttributesCompatParcelizer.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @getRenewGrpId
        public final boolean requery() {
            return this.AudioAttributesCompatParcelizer.requery();
        }

        @Override // android.database.Cursor
        public final Bundle respond(Bundle bundle) {
            return this.AudioAttributesCompatParcelizer.respond(bundle);
        }

        @Override // android.database.Cursor
        public final void setExtras(Bundle bundle) {
            this.AudioAttributesCompatParcelizer.setExtras(bundle);
        }

        @Override // android.database.Cursor
        public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.AudioAttributesCompatParcelizer.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public final void unregisterContentObserver(ContentObserver contentObserver) {
            this.AudioAttributesCompatParcelizer.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.AudioAttributesCompatParcelizer.unregisterDataSetObserver(dataSetObserver);
        }
    }

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u000b\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u001aJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u0011\u0010\u001cJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u001dJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u0011\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0016\u0010\u0013\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u0016\u0010\u0018\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u0011\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010)R\u001e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010."}, d2 = {"Lo/setVisibleXRangeMinimum$IconCompatParcelizer;", "Lo/setEntryLabelTypeface;", "", "p0", "Lo/setVisibleYRangeMaximum;", "p1", "<init>", "(Ljava/lang/String;Lo/setVisibleYRangeMaximum;)V", "", "close", "()V", "IconCompatParcelizer", "", "RemoteActionCompatParcelizer", "()I", "T", "Lkotlin/Function1;", "write", "(Lo/getAnswerMap;)Ljava/lang/Object;", "read", "(I)V", "", "(IJ)V", "", "AudioAttributesCompatParcelizer", "(ID)V", "(ILjava/lang/String;)V", "", "(I[B)V", "(II)V", "Lo/setEntryLabelColor;", "(Lo/setEntryLabelColor;)V", "AudioAttributesImplApi21Parcelizer", "Ljava/lang/String;", "Lo/setVisibleYRangeMaximum;", "", "[I", "", "AudioAttributesImplApi26Parcelizer", "[J", "", "[D", "", "MediaBrowserCompatCustomActionResultReceiver", "[Ljava/lang/String;", "MediaBrowserCompatItemReceiver", "[[B", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer implements setEntryLabelTypeface {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private int[] read;

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
        private final String IconCompatParcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private long[] AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final setVisibleYRangeMaximum RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private String[] MediaBrowserCompatItemReceiver;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private byte[][] AudioAttributesImplBaseParcelizer;
        private double[] write;

        public IconCompatParcelizer(String str, setVisibleYRangeMaximum setvisibleyrangemaximum) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(setvisibleyrangemaximum, "");
            this.IconCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = setvisibleyrangemaximum;
            this.read = new int[0];
            this.AudioAttributesCompatParcelizer = new long[0];
            this.write = new double[0];
            this.MediaBrowserCompatItemReceiver = new String[0];
            this.AudioAttributesImplBaseParcelizer = new byte[0][];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            write();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesCompatParcelizer(setEntryLabelTypeface setentrylabeltypeface) {
            toMagicModuleMetaRepoModel.write(setentrylabeltypeface, "");
            setentrylabeltypeface.IconCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        @Override // kotlin.setEntryLabelTypeface
        public final void IconCompatParcelizer() {
            write(new getAnswerMap() { // from class: o.setDragDecelerationEnabled
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return setVisibleXRangeMinimum.IconCompatParcelizer.AudioAttributesCompatParcelizer((setEntryLabelTypeface) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int IconCompatParcelizer(setEntryLabelTypeface setentrylabeltypeface) {
            toMagicModuleMetaRepoModel.write(setentrylabeltypeface, "");
            return setentrylabeltypeface.RemoteActionCompatParcelizer();
        }

        @Override // kotlin.setEntryLabelTypeface
        public final int RemoteActionCompatParcelizer() {
            return ((Number) write(new getAnswerMap() { // from class: o.Chart
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Integer.valueOf(setVisibleXRangeMinimum.IconCompatParcelizer.IconCompatParcelizer((setEntryLabelTypeface) obj));
                }
            })).intValue();
        }

        private final <T> T write(final getAnswerMap<? super setEntryLabelTypeface, ? extends T> p0) {
            return (T) this.RemoteActionCompatParcelizer.write(new getAnswerMap() { // from class: o.setDragDecelerationFrictionCoef
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return setVisibleXRangeMinimum.IconCompatParcelizer.AudioAttributesCompatParcelizer(this.write, p0, (setDrawSliceText) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, getAnswerMap getanswermap, setDrawSliceText setdrawslicetext) {
            toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
            setEntryLabelTypeface setentrylabeltypefaceRemoteActionCompatParcelizer = setdrawslicetext.RemoteActionCompatParcelizer(iconCompatParcelizer.IconCompatParcelizer);
            iconCompatParcelizer.write(setentrylabeltypefaceRemoteActionCompatParcelizer);
            return getanswermap.invoke(setentrylabeltypefaceRemoteActionCompatParcelizer);
        }

        @Override // kotlin.setEntryLabelColor
        public final void read(int p0) {
            RemoteActionCompatParcelizer(5, p0);
            this.read[p0] = 5;
        }

        @Override // kotlin.setEntryLabelColor
        public final void IconCompatParcelizer(int p0, long p1) {
            RemoteActionCompatParcelizer(1, p0);
            this.read[p0] = 1;
            this.AudioAttributesCompatParcelizer[p0] = p1;
        }

        @Override // kotlin.setEntryLabelColor
        public final void AudioAttributesCompatParcelizer(int p0, double p1) {
            RemoteActionCompatParcelizer(2, p0);
            this.read[p0] = 2;
            this.write[p0] = p1;
        }

        @Override // kotlin.setEntryLabelColor
        public final void read(int p0, String p1) {
            toMagicModuleMetaRepoModel.write(p1, "");
            RemoteActionCompatParcelizer(3, p0);
            this.read[p0] = 3;
            this.MediaBrowserCompatItemReceiver[p0] = p1;
        }

        @Override // kotlin.setEntryLabelColor
        public final void write(int p0, byte[] p1) {
            toMagicModuleMetaRepoModel.write(p1, "");
            RemoteActionCompatParcelizer(4, p0);
            this.read[p0] = 4;
            this.AudioAttributesImplBaseParcelizer[p0] = p1;
        }

        private void write() {
            this.read = new int[0];
            this.AudioAttributesCompatParcelizer = new long[0];
            this.write = new double[0];
            this.MediaBrowserCompatItemReceiver = new String[0];
            this.AudioAttributesImplBaseParcelizer = new byte[0][];
        }

        private final void RemoteActionCompatParcelizer(int p0, int p1) {
            int i = p1 + 1;
            int[] iArr = this.read;
            if (iArr.length < i) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iArrCopyOf, "");
                this.read = iArrCopyOf;
            }
            if (p0 == 1) {
                long[] jArr = this.AudioAttributesCompatParcelizer;
                if (jArr.length < i) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jArrCopyOf, "");
                    this.AudioAttributesCompatParcelizer = jArrCopyOf;
                    return;
                }
                return;
            }
            if (p0 == 2) {
                double[] dArr = this.write;
                if (dArr.length < i) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(dArrCopyOf, "");
                    this.write = dArrCopyOf;
                    return;
                }
                return;
            }
            if (p0 == 3) {
                String[] strArr = this.MediaBrowserCompatItemReceiver;
                if (strArr.length < i) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
                    this.MediaBrowserCompatItemReceiver = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (p0 == 4) {
                byte[][] bArr = this.AudioAttributesImplBaseParcelizer;
                if (bArr.length < i) {
                    Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf2, "");
                    this.AudioAttributesImplBaseParcelizer = (byte[][]) objArrCopyOf2;
                }
            }
        }

        private final void write(setEntryLabelColor p0) {
            int length = this.read.length;
            for (int i = 1; i < length; i++) {
                int i2 = this.read[i];
                if (i2 == 1) {
                    p0.IconCompatParcelizer(i, this.AudioAttributesCompatParcelizer[i]);
                } else if (i2 == 2) {
                    p0.AudioAttributesCompatParcelizer(i, this.write[i]);
                } else if (i2 == 3) {
                    String str = this.MediaBrowserCompatItemReceiver[i];
                    toMagicModuleMetaRepoModel.write((Object) str);
                    p0.read(i, str);
                } else if (i2 == 4) {
                    byte[] bArr = this.AudioAttributesImplBaseParcelizer[i];
                    toMagicModuleMetaRepoModel.write(bArr);
                    p0.write(i, bArr);
                } else if (i2 == 5) {
                    p0.read(i);
                }
            }
        }
    }
}
