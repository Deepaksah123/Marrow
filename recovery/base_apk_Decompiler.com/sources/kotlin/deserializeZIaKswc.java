package kotlin;

import com.google.android.exoplayer2.C;
import java.util.Iterator;
import java.util.List;
import kotlin.C0177getRfBanners;
import kotlin.Metadata;
import kotlin.ValueClassSerializerStaticJsonValue;
import kotlin.ValueClassUnboxSerializer;
import kotlin.deserializeZIaKswc;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u000f2\u00020\u0001:\u0002\u001a\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0006\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0004¢\u0006\u0004\b\u0006\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ'\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0004¢\u0006\u0004\b\f\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0004¢\u0006\u0004\b\u001a\u0010\u000bJ\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u0012J\u0013\u0010\f\u001a\u00020\u0015*\u00020\u001dH\u0004¢\u0006\u0004\b\f\u0010\u001eJ\u0013\u0010\u000f\u001a\u00020\u0015*\u00020\u001dH\u0004¢\u0006\u0004\b\u000f\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010\u000bJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010\u000bJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\u000bR\u0014\u0010\u001b\u001a\u00020\"8%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010#R\u0014\u0010\f\u001a\u00020$8%X¤\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010%R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020'0&8%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010(R\u0016\u0010\u0006\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010)R\u0016\u0010\u000f\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010)"}, d2 = {"Lo/deserializeZIaKswc;", "", "<init>", "()V", "", "p0", "IconCompatParcelizer", "(Ljava/lang/String;)Ljava/lang/String;", "Lo/setDrawHoleEnabled;", "", "MediaBrowserCompatCustomActionResultReceiver", "(Lo/setDrawHoleEnabled;)V", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi26Parcelizer", "read", "", "MediaBrowserCompatMediaItem", "(Lo/setDrawHoleEnabled;)Z", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "AudioAttributesImplApi21Parcelizer", "", "p1", "p2", "(Lo/setDrawHoleEnabled;II)V", "MediaBrowserCompatItemReceiver", "AudioAttributesCompatParcelizer", "write", "RatingCompat", "Lo/ValueClassSerializerStaticJsonValue$IconCompatParcelizer;", "(Lo/ValueClassSerializerStaticJsonValue$IconCompatParcelizer;)I", "MediaDescriptionCompat", "MediaBrowserCompatSearchResultReceiver", "MediaMetadataCompat", "Lo/UShortDeserializer;", "()Lo/UShortDeserializer;", "Lo/ValueClassUnboxSerializer;", "()Lo/ValueClassUnboxSerializer;", "", "Lo/ValueClassSerializerStaticJsonValue$read;", "()Ljava/util/List;", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class deserializeZIaKswc {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;

    public final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[ValueClassSerializerStaticJsonValue.IconCompatParcelizer.values().length];
            try {
                iArr[ValueClassSerializerStaticJsonValue.IconCompatParcelizer.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValueClassSerializerStaticJsonValue.IconCompatParcelizer.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    protected abstract UShortDeserializer AudioAttributesCompatParcelizer();

    protected abstract ValueClassUnboxSerializer RemoteActionCompatParcelizer();

    protected abstract List<ValueClassSerializerStaticJsonValue.read> read();

    protected final class AudioAttributesCompatParcelizer implements setCenterTextTypeface {
        final /* synthetic */ deserializeZIaKswc AudioAttributesCompatParcelizer;
        private final setCenterTextTypeface RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(deserializeZIaKswc deserializeziakswc, setCenterTextTypeface setcentertexttypeface) {
            toMagicModuleMetaRepoModel.write(setcentertexttypeface, "");
            this.AudioAttributesCompatParcelizer = deserializeziakswc;
            this.RemoteActionCompatParcelizer = setcentertexttypeface;
        }

        @Override // kotlin.setCenterTextTypeface
        public final setDrawHoleEnabled AudioAttributesCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            return read(this.AudioAttributesCompatParcelizer.IconCompatParcelizer(str));
        }

        private final setDrawHoleEnabled read(final String str) {
            setDragOffsetY setdragoffsety = new setDragOffsetY(str, (this.AudioAttributesCompatParcelizer.IconCompatParcelizer || this.AudioAttributesCompatParcelizer.read || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) ":memory:")) ? false : true);
            final deserializeZIaKswc deserializeziakswc = this.AudioAttributesCompatParcelizer;
            return (setDrawHoleEnabled) setdragoffsety.read(new getCreatedOnDateMs() { // from class: o.deserializeKeywoJcscw
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return deserializeZIaKswc.AudioAttributesCompatParcelizer.read(deserializeziakswc, this, str);
                }
            }, new read(str));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final setDrawHoleEnabled read(deserializeZIaKswc deserializeziakswc, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, String str) throws Exception {
            if (deserializeziakswc.read) {
                throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?".toString());
            }
            setDrawHoleEnabled setdrawholeenabledAudioAttributesCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(str);
            if (!deserializeziakswc.IconCompatParcelizer) {
                try {
                    deserializeziakswc.read = true;
                    deserializeziakswc.MediaBrowserCompatCustomActionResultReceiver(setdrawholeenabledAudioAttributesCompatParcelizer);
                    return setdrawholeenabledAudioAttributesCompatParcelizer;
                } finally {
                    deserializeziakswc.read = false;
                }
            }
            deserializeziakswc.RemoteActionCompatParcelizer(setdrawholeenabledAudioAttributesCompatParcelizer);
            return setdrawholeenabledAudioAttributesCompatParcelizer;
        }

        static final class read implements getAnswerMap {
            final /* synthetic */ String IconCompatParcelizer;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Void invoke(Throwable th) {
                toMagicModuleMetaRepoModel.write(th, "");
                StringBuilder sb = new StringBuilder("Unable to open database '");
                sb.append(this.IconCompatParcelizer);
                sb.append("'. Was a proper path / name used in Room's database builder?");
                throw new IllegalStateException(sb.toString(), th);
            }

            read(String str) {
                this.IconCompatParcelizer = str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatCustomActionResultReceiver(setDrawHoleEnabled p0) throws Exception {
        Object obj;
        AudioAttributesImplBaseParcelizer(p0);
        AudioAttributesImplApi26Parcelizer(p0);
        read(p0);
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = p0.IconCompatParcelizer("PRAGMA user_version");
        try {
            setDrawEntryLabels setdrawentrylabels = setdrawentrylabelsIconCompatParcelizer;
            setdrawentrylabels.write();
            int iIconCompatParcelizer = (int) setdrawentrylabels.IconCompatParcelizer(0);
            submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, null);
            if (iIconCompatParcelizer != RemoteActionCompatParcelizer().RemoteActionCompatParcelizer()) {
                setDrawCenterText.read(p0, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                    deserializeZIaKswc deserializeziakswc = this;
                    if (iIconCompatParcelizer == 0) {
                        IconCompatParcelizer(p0);
                    } else {
                        RemoteActionCompatParcelizer(p0, iIconCompatParcelizer, RemoteActionCompatParcelizer().RemoteActionCompatParcelizer());
                    }
                    StringBuilder sb = new StringBuilder("PRAGMA user_version = ");
                    sb.append(RemoteActionCompatParcelizer().RemoteActionCompatParcelizer());
                    setDrawCenterText.read(p0, sb.toString());
                    obj = C0177getRfBanners.read(getShowPopup.INSTANCE);
                } catch (Throwable th) {
                    C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
                    obj = C0177getRfBanners.read(SdkPayloadData.write(th));
                }
                if (C0177getRfBanners.write(obj)) {
                    setDrawCenterText.read(p0, "END TRANSACTION");
                }
                Throwable thIconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer(obj);
                if (thIconCompatParcelizer != null) {
                    setDrawCenterText.read(p0, "ROLLBACK TRANSACTION");
                    throw thIconCompatParcelizer;
                }
            }
            AudioAttributesCompatParcelizer(p0);
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(setDrawHoleEnabled p0) throws Exception {
        AudioAttributesImplApi26Parcelizer(p0);
        read(p0);
        RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(p0);
    }

    private final void AudioAttributesImplBaseParcelizer(setDrawHoleEnabled p0) throws Exception {
        if (AudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver == ValueClassSerializerStaticJsonValue.IconCompatParcelizer.write) {
            setDrawCenterText.read(p0, "PRAGMA journal_mode = WAL");
        } else {
            setDrawCenterText.read(p0, "PRAGMA journal_mode = TRUNCATE");
        }
    }

    private final void AudioAttributesImplApi26Parcelizer(setDrawHoleEnabled p0) throws Exception {
        if (AudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver == ValueClassSerializerStaticJsonValue.IconCompatParcelizer.write) {
            setDrawCenterText.read(p0, "PRAGMA synchronous = NORMAL");
        } else {
            setDrawCenterText.read(p0, "PRAGMA synchronous = FULL");
        }
    }

    private static void read(setDrawHoleEnabled p0) throws Exception {
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = p0.IconCompatParcelizer("PRAGMA busy_timeout");
        try {
            setDrawEntryLabels setdrawentrylabels = setdrawentrylabelsIconCompatParcelizer;
            setdrawentrylabels.write();
            long jIconCompatParcelizer = setdrawentrylabels.IconCompatParcelizer(0);
            submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, null);
            if (jIconCompatParcelizer < C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
                setDrawCenterText.read(p0, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, th);
                throw th2;
            }
        }
    }

    protected final void IconCompatParcelizer(setDrawHoleEnabled p0) throws Exception {
        toMagicModuleMetaRepoModel.write(p0, "");
        boolean zMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(p0);
        RemoteActionCompatParcelizer().write(p0);
        if (!zMediaBrowserCompatMediaItem) {
            ValueClassUnboxSerializer.IconCompatParcelizer iconCompatParcelizerAudioAttributesImplApi21Parcelizer = RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer(p0);
            if (!iconCompatParcelizerAudioAttributesImplApi21Parcelizer.read) {
                StringBuilder sb = new StringBuilder("Pre-packaged database has an invalid schema: ");
                sb.append(iconCompatParcelizerAudioAttributesImplApi21Parcelizer.IconCompatParcelizer);
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(p0);
        RemoteActionCompatParcelizer().IconCompatParcelizer(p0);
        MediaDescriptionCompat(p0);
    }

    private static boolean MediaBrowserCompatMediaItem(setDrawHoleEnabled p0) throws Exception {
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = p0.IconCompatParcelizer("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            setDrawEntryLabels setdrawentrylabels = setdrawentrylabelsIconCompatParcelizer;
            boolean z = false;
            if (setdrawentrylabels.write()) {
                if (setdrawentrylabels.IconCompatParcelizer(0) == 0) {
                    z = true;
                }
            }
            submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, null);
            return z;
        } finally {
        }
    }

    private final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(setDrawHoleEnabled p0) throws Exception {
        AudioAttributesImplApi21Parcelizer(p0);
        setDrawCenterText.read(p0, getValueParameters.read(RemoteActionCompatParcelizer().write()));
    }

    private static void AudioAttributesImplApi21Parcelizer(setDrawHoleEnabled p0) throws Exception {
        setDrawCenterText.read(p0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    protected final void RemoteActionCompatParcelizer(setDrawHoleEnabled p0, int p1, int p2) throws Exception {
        toMagicModuleMetaRepoModel.write(p0, "");
        List<setVisibleYRange> listIconCompatParcelizer = setMarker.IconCompatParcelizer(AudioAttributesCompatParcelizer().MediaBrowserCompatSearchResultReceiver, p1, p2);
        if (listIconCompatParcelizer != null) {
            RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(p0);
            Iterator<T> it = listIconCompatParcelizer.iterator();
            while (it.hasNext()) {
                ((setVisibleYRange) it.next()).AudioAttributesCompatParcelizer(p0);
            }
            ValueClassUnboxSerializer.IconCompatParcelizer iconCompatParcelizerAudioAttributesImplApi21Parcelizer = RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer(p0);
            if (!iconCompatParcelizerAudioAttributesImplApi21Parcelizer.read) {
                StringBuilder sb = new StringBuilder("Migration didn't properly handle: ");
                sb.append(iconCompatParcelizerAudioAttributesImplApi21Parcelizer.IconCompatParcelizer);
                throw new IllegalStateException(sb.toString().toString());
            }
            RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(p0);
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(p0);
            return;
        }
        if (setMarker.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(), p1, p2)) {
            StringBuilder sb2 = new StringBuilder("A migration from ");
            sb2.append(p1);
            sb2.append(" to ");
            sb2.append(p2);
            sb2.append(" was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.");
            throw new IllegalStateException(sb2.toString().toString());
        }
        MediaBrowserCompatItemReceiver(p0);
        MediaBrowserCompatSearchResultReceiver(p0);
        RemoteActionCompatParcelizer().write(p0);
    }

    private final void MediaBrowserCompatItemReceiver(setDrawHoleEnabled p0) throws Exception {
        if (AudioAttributesCompatParcelizer().write) {
            setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = p0.IconCompatParcelizer("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                setDrawEntryLabels setdrawentrylabels = setdrawentrylabelsIconCompatParcelizer;
                List listIconCompatParcelizer = IntermediateLoginResponseBody.IconCompatParcelizer();
                while (setdrawentrylabels.write()) {
                    String strAudioAttributesCompatParcelizer = setdrawentrylabels.AudioAttributesCompatParcelizer(0);
                    if (!TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(strAudioAttributesCompatParcelizer, "sqlite_") && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strAudioAttributesCompatParcelizer, (Object) "android_metadata")) {
                        listIconCompatParcelizer.add(setAction.write(strAudioAttributesCompatParcelizer, Boolean.valueOf(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) setdrawentrylabels.AudioAttributesCompatParcelizer(1), (Object) "view"))));
                    }
                }
                List<Pair> listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(listIconCompatParcelizer);
                submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, null);
                for (Pair pair : listAudioAttributesCompatParcelizer) {
                    String str = (String) pair.RemoteActionCompatParcelizer();
                    if (((Boolean) pair.read()).booleanValue()) {
                        setDrawCenterText.read(p0, "DROP VIEW IF EXISTS ".concat(String.valueOf(str)));
                    } else {
                        setDrawCenterText.read(p0, "DROP TABLE IF EXISTS ".concat(String.valueOf(str)));
                    }
                }
            } finally {
            }
        } else {
            RemoteActionCompatParcelizer().read(p0);
        }
    }

    protected final void AudioAttributesCompatParcelizer(setDrawHoleEnabled p0) throws Exception {
        toMagicModuleMetaRepoModel.write(p0, "");
        write(p0);
        RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(p0);
        MediaMetadataCompat(p0);
        this.IconCompatParcelizer = true;
    }

    private final void write(setDrawHoleEnabled p0) throws Exception {
        Object obj;
        ValueClassUnboxSerializer.IconCompatParcelizer iconCompatParcelizerAudioAttributesImplApi21Parcelizer;
        if (RatingCompat(p0)) {
            setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = p0.IconCompatParcelizer("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
            try {
                setDrawEntryLabels setdrawentrylabels = setdrawentrylabelsIconCompatParcelizer;
                String strAudioAttributesCompatParcelizer = setdrawentrylabels.write() ? setdrawentrylabels.AudioAttributesCompatParcelizer(0) : null;
                submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, null);
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) RemoteActionCompatParcelizer().write(), (Object) strAudioAttributesCompatParcelizer) || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(), (Object) strAudioAttributesCompatParcelizer)) {
                    return;
                }
                StringBuilder sb = new StringBuilder("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ");
                sb.append(RemoteActionCompatParcelizer().write());
                sb.append(", found: ");
                sb.append(strAudioAttributesCompatParcelizer);
                throw new IllegalStateException(sb.toString().toString());
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, th);
                    throw th2;
                }
            }
        }
        setDrawCenterText.read(p0, "BEGIN EXCLUSIVE TRANSACTION");
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            deserializeZIaKswc deserializeziakswc = this;
            iconCompatParcelizerAudioAttributesImplApi21Parcelizer = RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer(p0);
        } catch (Throwable th3) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th3));
        }
        if (!iconCompatParcelizerAudioAttributesImplApi21Parcelizer.read) {
            StringBuilder sb2 = new StringBuilder("Pre-packaged database has an invalid schema: ");
            sb2.append(iconCompatParcelizerAudioAttributesImplApi21Parcelizer.IconCompatParcelizer);
            throw new IllegalStateException(sb2.toString().toString());
        }
        RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(p0);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(p0);
        obj = C0177getRfBanners.read(getShowPopup.INSTANCE);
        if (C0177getRfBanners.write(obj)) {
            setDrawCenterText.read(p0, "END TRANSACTION");
        }
        Throwable thIconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer(obj);
        if (thIconCompatParcelizer != null) {
            setDrawCenterText.read(p0, "ROLLBACK TRANSACTION");
            throw thIconCompatParcelizer;
        }
        C0177getRfBanners.AudioAttributesCompatParcelizer(obj);
    }

    private static boolean RatingCompat(setDrawHoleEnabled p0) throws Exception {
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = p0.IconCompatParcelizer("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            setDrawEntryLabels setdrawentrylabels = setdrawentrylabelsIconCompatParcelizer;
            boolean z = false;
            if (setdrawentrylabels.write()) {
                if (setdrawentrylabels.IconCompatParcelizer(0) != 0) {
                    z = true;
                }
            }
            submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, null);
            return z;
        } finally {
        }
    }

    protected static int RemoteActionCompatParcelizer(ValueClassSerializerStaticJsonValue.IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        int i = IconCompatParcelizer.AudioAttributesCompatParcelizer[iconCompatParcelizer.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 4;
        }
        StringBuilder sb = new StringBuilder("Can't get max number of reader for journal mode '");
        sb.append(iconCompatParcelizer);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    protected static int read(ValueClassSerializerStaticJsonValue.IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        int i = IconCompatParcelizer.AudioAttributesCompatParcelizer[iconCompatParcelizer.ordinal()];
        if (i == 1 || i == 2) {
            return 1;
        }
        StringBuilder sb = new StringBuilder("Can't get max number of writers for journal mode '");
        sb.append(iconCompatParcelizer);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    private final void MediaDescriptionCompat(setDrawHoleEnabled p0) {
        for (ValueClassSerializerStaticJsonValue.read readVar : read()) {
            ValueClassSerializerStaticJsonValue.read.RemoteActionCompatParcelizer(p0);
        }
    }

    private final void MediaBrowserCompatSearchResultReceiver(setDrawHoleEnabled p0) {
        for (ValueClassSerializerStaticJsonValue.read readVar : read()) {
            ValueClassSerializerStaticJsonValue.read.AudioAttributesCompatParcelizer(p0);
        }
    }

    private final void MediaMetadataCompat(setDrawHoleEnabled p0) {
        Iterator<T> it = read().iterator();
        while (it.hasNext()) {
            ((ValueClassSerializerStaticJsonValue.read) it.next()).IconCompatParcelizer(p0);
        }
    }

    public String IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0;
    }
}
