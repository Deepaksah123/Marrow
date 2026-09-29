package kotlin;

import android.database.Cursor;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u00182\u00020\u0001:\u0003\u0018\r\u000fB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u00028\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000b\u001a\u00020\u00048\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\"\u0010\r\u001a\u00020\u00138\u0005@\u0005X\u0085\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\n\u0082\u0001\u0002\u0019\u001a"}, d2 = {"Lo/setVisibleXRange;", "Lo/setDrawEntryLabels;", "Lo/setDrawSliceText;", "p0", "", "p1", "<init>", "(Lo/setDrawSliceText;Ljava/lang/String;)V", "", "AudioAttributesImplBaseParcelizer", "()V", "RemoteActionCompatParcelizer", "Lo/setDrawSliceText;", "read", "()Lo/setDrawSliceText;", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "()Ljava/lang/String;", "", "Z", "MediaBrowserCompatItemReceiver", "()Z", "AudioAttributesImplApi21Parcelizer", "write", "Lo/setVisibleXRange$read;", "Lo/setVisibleXRange$IconCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class setVisibleXRange implements setDrawEntryLabels {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setDrawSliceText IconCompatParcelizer;
    private boolean read;

    private setVisibleXRange(setDrawSliceText setdrawslicetext, String str) {
        this.IconCompatParcelizer = setdrawslicetext;
        this.RemoteActionCompatParcelizer = str;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    protected final setDrawSliceText getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    protected final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    protected final void AudioAttributesImplApi21Parcelizer() {
        this.read = true;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    protected final boolean getRead() {
        return this.read;
    }

    protected final void AudioAttributesImplBaseParcelizer() {
        if (this.read) {
            setDrawCenterText.write(21, "statement is closed");
            throw new PlanDetailsCreator();
        }
    }

    public /* synthetic */ setVisibleXRange(setDrawSliceText setdrawslicetext, String str, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(setdrawslicetext, str);
    }

    /* JADX INFO: renamed from: o.setVisibleXRange$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/setVisibleXRange$write;", "", "<init>", "()V", "Lo/setDrawSliceText;", "p0", "", "p1", "Lo/setVisibleXRange;", "AudioAttributesCompatParcelizer", "(Lo/setDrawSliceText;Ljava/lang/String;)Lo/setVisibleXRange;", "", "write", "(Ljava/lang/String;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static setVisibleXRange AudioAttributesCompatParcelizer(setDrawSliceText p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            if (write(p1)) {
                return new read(p0, p1);
            }
            return new IconCompatParcelizer(p0, p1);
        }

        private static boolean write(String p0) {
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

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0012J\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0013J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010 J\u000f\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u001dJ\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010%R\u0016\u0010\u000b\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010'R\u0016\u0010\u0015\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u001b\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010/R\u001e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0018\u0010)\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00101"}, d2 = {"Lo/setVisibleXRange$read;", "Lo/setVisibleXRange;", "Lo/setDrawSliceText;", "p0", "", "p1", "<init>", "(Lo/setDrawSliceText;Ljava/lang/String;)V", "", "", "", "read", "(I[B)V", "", "IconCompatParcelizer", "(IJ)V", "RemoteActionCompatParcelizer", "(ILjava/lang/String;)V", "(I)V", "(I)[B", "(I)J", "AudioAttributesCompatParcelizer", "(I)Ljava/lang/String;", "", "AudioAttributesImplBaseParcelizer", "(I)Z", "()I", "write", "()Z", "()V", "RatingCompat", "close", "(II)V", "AudioAttributesImplApi26Parcelizer", "Landroid/database/Cursor;", "MediaBrowserCompatCustomActionResultReceiver", "()Landroid/database/Cursor;", "(Landroid/database/Cursor;I)V", "", "[I", "", "MediaBrowserCompatItemReceiver", "[J", "", "AudioAttributesImplApi21Parcelizer", "[D", "", "[Ljava/lang/String;", "[[B", "Landroid/database/Cursor;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class read extends setVisibleXRange {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private int[] read;

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
        private double[] write;

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private String[] IconCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private Cursor MediaBrowserCompatItemReceiver;

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private long[] AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private byte[][] RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(setDrawSliceText setdrawslicetext, String str) {
            super(setdrawslicetext, str, null);
            toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = new int[0];
            this.AudioAttributesCompatParcelizer = new long[0];
            this.write = new double[0];
            this.IconCompatParcelizer = new String[0];
            this.RemoteActionCompatParcelizer = new byte[0][];
        }

        @Override // kotlin.setDrawEntryLabels
        public final void read(int p0, byte[] p1) {
            toMagicModuleMetaRepoModel.write(p1, "");
            AudioAttributesImplBaseParcelizer();
            IconCompatParcelizer(4, p0);
            this.read[p0] = 4;
            this.RemoteActionCompatParcelizer[p0] = p1;
        }

        @Override // kotlin.setDrawEntryLabels
        public final void IconCompatParcelizer(int p0, long p1) {
            AudioAttributesImplBaseParcelizer();
            IconCompatParcelizer(1, p0);
            this.read[p0] = 1;
            this.AudioAttributesCompatParcelizer[p0] = p1;
        }

        @Override // kotlin.setDrawEntryLabels
        public final void RemoteActionCompatParcelizer(int p0, String p1) {
            toMagicModuleMetaRepoModel.write(p1, "");
            AudioAttributesImplBaseParcelizer();
            IconCompatParcelizer(3, p0);
            this.read[p0] = 3;
            this.IconCompatParcelizer[p0] = p1;
        }

        @Override // kotlin.setDrawEntryLabels
        public final void read(int p0) {
            AudioAttributesImplBaseParcelizer();
            IconCompatParcelizer(5, p0);
            this.read[p0] = 5;
        }

        @Override // kotlin.setDrawEntryLabels
        public final byte[] RemoteActionCompatParcelizer(int p0) {
            AudioAttributesImplBaseParcelizer();
            Cursor cursorMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
            RemoteActionCompatParcelizer(cursorMediaBrowserCompatCustomActionResultReceiver, p0);
            byte[] blob = cursorMediaBrowserCompatCustomActionResultReceiver.getBlob(p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(blob, "");
            return blob;
        }

        @Override // kotlin.setDrawEntryLabels
        public final long IconCompatParcelizer(int p0) {
            AudioAttributesImplBaseParcelizer();
            Cursor cursorMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
            RemoteActionCompatParcelizer(cursorMediaBrowserCompatCustomActionResultReceiver, p0);
            return cursorMediaBrowserCompatCustomActionResultReceiver.getLong(p0);
        }

        @Override // kotlin.setDrawEntryLabels
        public final String AudioAttributesCompatParcelizer(int p0) {
            AudioAttributesImplBaseParcelizer();
            Cursor cursorMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
            RemoteActionCompatParcelizer(cursorMediaBrowserCompatCustomActionResultReceiver, p0);
            String string = cursorMediaBrowserCompatCustomActionResultReceiver.getString(p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            return string;
        }

        @Override // kotlin.setDrawEntryLabels
        public final boolean AudioAttributesImplBaseParcelizer(int p0) {
            AudioAttributesImplBaseParcelizer();
            Cursor cursorMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
            RemoteActionCompatParcelizer(cursorMediaBrowserCompatCustomActionResultReceiver, p0);
            return cursorMediaBrowserCompatCustomActionResultReceiver.isNull(p0);
        }

        @Override // kotlin.setDrawEntryLabels
        public final int IconCompatParcelizer() {
            AudioAttributesImplBaseParcelizer();
            AudioAttributesImplApi26Parcelizer();
            Cursor cursor = this.MediaBrowserCompatItemReceiver;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // kotlin.setDrawEntryLabels
        public final String write(int p0) {
            AudioAttributesImplBaseParcelizer();
            AudioAttributesImplApi26Parcelizer();
            Cursor cursor = this.MediaBrowserCompatItemReceiver;
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
            AudioAttributesImplBaseParcelizer();
            AudioAttributesImplApi26Parcelizer();
            Cursor cursor = this.MediaBrowserCompatItemReceiver;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        @Override // kotlin.setDrawEntryLabels
        public final void AudioAttributesCompatParcelizer() {
            AudioAttributesImplBaseParcelizer();
            Cursor cursor = this.MediaBrowserCompatItemReceiver;
            if (cursor != null) {
                cursor.close();
            }
            this.MediaBrowserCompatItemReceiver = null;
        }

        private void RatingCompat() {
            AudioAttributesImplBaseParcelizer();
            this.read = new int[0];
            this.AudioAttributesCompatParcelizer = new long[0];
            this.write = new double[0];
            this.IconCompatParcelizer = new String[0];
            this.RemoteActionCompatParcelizer = new byte[0][];
        }

        @Override // kotlin.setDrawEntryLabels, java.lang.AutoCloseable
        public final void close() {
            if (!getRead()) {
                RatingCompat();
                AudioAttributesCompatParcelizer();
            }
            AudioAttributesImplApi21Parcelizer();
        }

        private final void IconCompatParcelizer(int p0, int p1) {
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
                String[] strArr = this.IconCompatParcelizer;
                if (strArr.length < i) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
                    this.IconCompatParcelizer = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (p0 == 4) {
                byte[][] bArr = this.RemoteActionCompatParcelizer;
                if (bArr.length < i) {
                    Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf2, "");
                    this.RemoteActionCompatParcelizer = (byte[][]) objArrCopyOf2;
                }
            }
        }

        private final void AudioAttributesImplApi26Parcelizer() {
            if (this.MediaBrowserCompatItemReceiver == null) {
                this.MediaBrowserCompatItemReceiver = getIconCompatParcelizer().AudioAttributesCompatParcelizer(new write());
            }
        }

        public static final class write implements setMaxAngle {
            write() {
            }

            @Override // kotlin.setMaxAngle
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
            public final String getRead() {
                return read.this.getRemoteActionCompatParcelizer();
            }

            @Override // kotlin.setMaxAngle
            public final void AudioAttributesCompatParcelizer(setEntryLabelColor setentrylabelcolor) {
                toMagicModuleMetaRepoModel.write(setentrylabelcolor, "");
                int length = read.this.read.length;
                for (int i = 1; i < length; i++) {
                    int i2 = read.this.read[i];
                    if (i2 == 1) {
                        setentrylabelcolor.IconCompatParcelizer(i, read.this.AudioAttributesCompatParcelizer[i]);
                    } else if (i2 == 2) {
                        setentrylabelcolor.AudioAttributesCompatParcelizer(i, read.this.write[i]);
                    } else if (i2 == 3) {
                        String str = read.this.IconCompatParcelizer[i];
                        toMagicModuleMetaRepoModel.write((Object) str);
                        setentrylabelcolor.read(i, str);
                    } else if (i2 == 4) {
                        byte[] bArr = read.this.RemoteActionCompatParcelizer[i];
                        toMagicModuleMetaRepoModel.write(bArr);
                        setentrylabelcolor.write(i, bArr);
                    } else if (i2 == 5) {
                        setentrylabelcolor.read(i);
                    }
                }
            }
        }

        private final Cursor MediaBrowserCompatCustomActionResultReceiver() {
            Cursor cursor = this.MediaBrowserCompatItemReceiver;
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

    static final class IconCompatParcelizer extends setVisibleXRange {
        private final setEntryLabelTypeface RemoteActionCompatParcelizer;

        @Override // kotlin.setDrawEntryLabels
        public final void AudioAttributesCompatParcelizer() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(setDrawSliceText setdrawslicetext, String str) {
            super(setdrawslicetext, str, null);
            toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = setdrawslicetext.RemoteActionCompatParcelizer(str);
        }

        @Override // kotlin.setDrawEntryLabels
        public final void read(int i, byte[] bArr) {
            toMagicModuleMetaRepoModel.write(bArr, "");
            AudioAttributesImplBaseParcelizer();
            this.RemoteActionCompatParcelizer.write(i, bArr);
        }

        @Override // kotlin.setDrawEntryLabels
        public final void IconCompatParcelizer(int i, long j) {
            AudioAttributesImplBaseParcelizer();
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(i, j);
        }

        @Override // kotlin.setDrawEntryLabels
        public final void RemoteActionCompatParcelizer(int i, String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            AudioAttributesImplBaseParcelizer();
            this.RemoteActionCompatParcelizer.read(i, str);
        }

        @Override // kotlin.setDrawEntryLabels
        public final void read(int i) {
            AudioAttributesImplBaseParcelizer();
            this.RemoteActionCompatParcelizer.read(i);
        }

        @Override // kotlin.setDrawEntryLabels
        public final byte[] RemoteActionCompatParcelizer(int i) {
            AudioAttributesImplBaseParcelizer();
            setDrawCenterText.write(21, "no row");
            throw new PlanDetailsCreator();
        }

        @Override // kotlin.setDrawEntryLabels
        public final long IconCompatParcelizer(int i) {
            AudioAttributesImplBaseParcelizer();
            setDrawCenterText.write(21, "no row");
            throw new PlanDetailsCreator();
        }

        @Override // kotlin.setDrawEntryLabels
        public final String AudioAttributesCompatParcelizer(int i) {
            AudioAttributesImplBaseParcelizer();
            setDrawCenterText.write(21, "no row");
            throw new PlanDetailsCreator();
        }

        @Override // kotlin.setDrawEntryLabels
        public final boolean AudioAttributesImplBaseParcelizer(int i) {
            AudioAttributesImplBaseParcelizer();
            setDrawCenterText.write(21, "no row");
            throw new PlanDetailsCreator();
        }

        @Override // kotlin.setDrawEntryLabels
        public final int IconCompatParcelizer() {
            AudioAttributesImplBaseParcelizer();
            return 0;
        }

        @Override // kotlin.setDrawEntryLabels
        public final String write(int i) {
            AudioAttributesImplBaseParcelizer();
            setDrawCenterText.write(21, "no row");
            throw new PlanDetailsCreator();
        }

        @Override // kotlin.setDrawEntryLabels
        public final boolean write() {
            AudioAttributesImplBaseParcelizer();
            this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            return false;
        }

        @Override // kotlin.setDrawEntryLabels, java.lang.AutoCloseable
        public final void close() {
            this.RemoteActionCompatParcelizer.close();
            AudioAttributesImplApi21Parcelizer();
        }
    }
}
