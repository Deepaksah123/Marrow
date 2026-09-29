package kotlin;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\u0018\u0000 \u001d2\u00020\u0001:\u0002&\u001dB[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010\"\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010 \u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010#\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u001a\u0010&\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b$\u0010!R\u001a\u0010+\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u001a\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b+\u0010.R\u001a\u0010\u001e\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010/\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010)\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u00100\u001a\u0004\b&\u00101R\u001a\u0010'\u001a\u00020\u00128\u0001X\u0081\u0004¢\u0006\f\n\u0004\b)\u0010/\u001a\u0004\b'\u0010\u0019"}, d2 = {"Lo/findExpectedFormat;", "", "", "p0", "Lo/assignParameter;", "p1", "p2", "", "p3", "p4", "Lo/getClassAnnotations;", "p5", "Lo/switchToNext;", "p6", "Lo/createInstance;", "p7", "", "p8", "", "p9", "<init>", "(Ljava/lang/String;FFFFLo/getClassAnnotations;JIZILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "AudioAttributesImplApi26Parcelizer", "Ljava/lang/String;", "()Ljava/lang/String;", "read", "AudioAttributesImplBaseParcelizer", "F", "AudioAttributesCompatParcelizer", "()F", "RemoteActionCompatParcelizer", "write", "RatingCompat", "MediaBrowserCompatMediaItem", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "Lo/getClassAnnotations;", "MediaBrowserCompatItemReceiver", "()Lo/getClassAnnotations;", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatSearchResultReceiver", "J", "()J", "I", "Z", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class findExpectedFormat {
    private static final Object AudioAttributesCompatParcelizer;
    private static int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getClassAnnotations MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final float RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final long AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final float write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    private findExpectedFormat(String str, float f, float f2, float f3, float f4, getClassAnnotations getclassannotations, long j, int i, boolean z, int i2) {
        this.read = str;
        this.RemoteActionCompatParcelizer = f;
        this.AudioAttributesCompatParcelizer = f2;
        this.write = f3;
        this.IconCompatParcelizer = f4;
        this.MediaBrowserCompatCustomActionResultReceiver = getclassannotations;
        this.AudioAttributesImplApi26Parcelizer = j;
        this.AudioAttributesImplBaseParcelizer = i;
        this.MediaBrowserCompatItemReceiver = z;
        this.AudioAttributesImplApi21Parcelizer = i2;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final float getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final float getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final float getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final float getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final getClassAnnotations getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final long getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final int getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public /* synthetic */ findExpectedFormat(String str, float f, float f2, float f3, float f4, getClassAnnotations getclassannotations, long j, int i, boolean z, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, f, f2, f3, f4, getclassannotations, j, i, z, (i3 & 512) != 0 ? INSTANCE.read() : i2, null);
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001EBO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011BG\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0012Jf\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(J\u0006\u0010*\u001a\u00020\u0000J¡\u0001\u0010+\u001a\u00020\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\b\b\u0002\u00101\u001a\u00020\b2\n\b\u0002\u00102\u001a\u0004\u0018\u0001002\b\b\u0002\u00103\u001a\u00020\b2\b\b\u0002\u00104\u001a\u00020\b2\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020\b2\b\b\u0002\u0010:\u001a\u00020\b2\b\b\u0002\u0010;\u001a\u00020\b2\b\b\u0002\u0010<\u001a\u00020\b¢\u0006\u0004\b=\u0010>J\u0006\u0010?\u001a\u00020@J\b\u0010A\u001a\u00020BH\u0002J\f\u0010C\u001a\u00020D*\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006F"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "", "name", "", "defaultWidth", "Landroidx/compose/ui/unit/Dp;", "defaultHeight", "viewportWidth", "", "viewportHeight", "tintColor", "Landroidx/compose/ui/graphics/Color;", "tintBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "autoMirror", "", "<init>", "(Ljava/lang/String;FFFFJIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;FFFFJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "J", "I", "nodes", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "Lkotlin/collections/ArrayList;", "root", "isConsumed", "currentGroup", "getCurrentGroup", "()Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "addGroup", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clearGroup", "addPath", "pathData", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "addPath-oIyEayM", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFF)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "build", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ensureNotConsumed", "", "asVectorGroup", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "GroupParams", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private final float AudioAttributesCompatParcelizer;
        private final long AudioAttributesImplApi21Parcelizer;
        private final int AudioAttributesImplApi26Parcelizer;
        private C0087IconCompatParcelizer AudioAttributesImplBaseParcelizer;
        private final String IconCompatParcelizer;
        private final ArrayList<C0087IconCompatParcelizer> MediaBrowserCompatCustomActionResultReceiver;
        private final float MediaBrowserCompatItemReceiver;
        private final float RatingCompat;
        private final float RemoteActionCompatParcelizer;
        private boolean read;
        private final boolean write;

        private IconCompatParcelizer(String str, float f, float f2, float f3, float f4, long j, int i, boolean z) {
            this.IconCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = f;
            this.AudioAttributesCompatParcelizer = f2;
            this.RatingCompat = f3;
            this.MediaBrowserCompatItemReceiver = f4;
            this.AudioAttributesImplApi21Parcelizer = j;
            this.AudioAttributesImplApi26Parcelizer = i;
            this.write = z;
            ArrayList<C0087IconCompatParcelizer> arrayList = new ArrayList<>();
            this.MediaBrowserCompatCustomActionResultReceiver = arrayList;
            C0087IconCompatParcelizer c0087IconCompatParcelizer = new C0087IconCompatParcelizer(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null);
            this.AudioAttributesImplBaseParcelizer = c0087IconCompatParcelizer;
            findInjectables.write(arrayList, c0087IconCompatParcelizer);
        }

        public /* synthetic */ IconCompatParcelizer(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i2 & 1) != 0 ? "" : str, f, f2, f3, f4, (i2 & 32) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer() : j, (i2 & 64) != 0 ? createInstance.INSTANCE.onPlayFromUri() : i, (i2 & 128) != 0 ? false : z, null);
        }

        private final C0087IconCompatParcelizer write() {
            return (C0087IconCompatParcelizer) findInjectables.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ IconCompatParcelizer RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i, Object obj) {
            String str2 = (i & 1) != 0 ? "" : str;
            int i2 = i & 2;
            float f8 = BitmapDescriptorFactory.HUE_RED;
            float f9 = i2 != 0 ? 0.0f : f;
            float f10 = (i & 4) != 0 ? 0.0f : f2;
            float f11 = (i & 8) != 0 ? 0.0f : f3;
            float f12 = (i & 16) != 0 ? 1.0f : f4;
            float f13 = (i & 32) == 0 ? f5 : 1.0f;
            float f14 = (i & 64) != 0 ? 0.0f : f6;
            if ((i & 128) == 0) {
                f8 = f7;
            }
            return iconCompatParcelizer.read(str2, f9, f10, f11, f12, f13, f14, f8, (i & 256) != 0 ? getFactoryMethods.AudioAttributesCompatParcelizer() : list);
        }

        public final IconCompatParcelizer read(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends getBeanClass> list) {
            read();
            findInjectables.write(this.MediaBrowserCompatCustomActionResultReceiver, new C0087IconCompatParcelizer(str, f, f2, f3, f4, f5, f6, f7, list, null, 512, null));
            return this;
        }

        public final IconCompatParcelizer AudioAttributesCompatParcelizer() {
            read();
            write().write().add(write((C0087IconCompatParcelizer) findInjectables.read(this.MediaBrowserCompatCustomActionResultReceiver)));
            return this;
        }

        public final IconCompatParcelizer IconCompatParcelizer(List<? extends getBeanClass> list, int i, String str, Instantiatable instantiatable, float f, Instantiatable instantiatable2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
            read();
            write().write().add(new getFactoryMethodsWithMode(str, list, i, instantiatable, f, instantiatable2, f2, f3, i2, i3, f4, f5, f6, f7, null));
            return this;
        }

        public final findExpectedFormat RemoteActionCompatParcelizer() {
            read();
            while (this.MediaBrowserCompatCustomActionResultReceiver.size() > 1) {
                AudioAttributesCompatParcelizer();
            }
            findExpectedFormat findexpectedformat = new findExpectedFormat(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.RatingCompat, this.MediaBrowserCompatItemReceiver, write(this.AudioAttributesImplBaseParcelizer), this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplApi26Parcelizer, this.write, 0, 512, null);
            this.read = true;
            return findexpectedformat;
        }

        private final void read() {
            if (this.read) {
                reportWrongTokenException.read("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        private final getClassAnnotations write(C0087IconCompatParcelizer c0087IconCompatParcelizer) {
            return new getClassAnnotations(c0087IconCompatParcelizer.getAudioAttributesCompatParcelizer(), c0087IconCompatParcelizer.getIconCompatParcelizer(), c0087IconCompatParcelizer.getRemoteActionCompatParcelizer(), c0087IconCompatParcelizer.getWrite(), c0087IconCompatParcelizer.getRead(), c0087IconCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver(), c0087IconCompatParcelizer.getAudioAttributesImplApi26Parcelizer(), c0087IconCompatParcelizer.getAudioAttributesImplBaseParcelizer(), c0087IconCompatParcelizer.read(), c0087IconCompatParcelizer.write());
        }

        /* JADX INFO: renamed from: o.findExpectedFormat$IconCompatParcelizer$IconCompatParcelizer, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\u00020\u00028\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0016\u001a\u00020\u00048\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u00020\u00048\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0018\u0010\u001cR\u001c\u0010\u001e\u001a\u00020\u00048\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\u0014\u001a\u00020\u00048\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001c\u0010\u0019\u001a\u00020\u00048\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u001c\u0010 \u001a\u00020\u00048\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b!\u0010\u001cR\u001c\u0010!\u001a\u00020\u00048\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\"\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b\u0014\u0010#R\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b\u001e\u0010#"}, d2 = {"Lo/findExpectedFormat$IconCompatParcelizer$IconCompatParcelizer;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "", "Lo/getBeanClass;", "p8", "", "Lo/getConstructors;", "p9", "<init>", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "read", "Ljava/lang/String;", "IconCompatParcelizer", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "F", "AudioAttributesImplApi21Parcelizer", "()F", "RemoteActionCompatParcelizer", "write", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "Ljava/util/List;", "()Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class C0087IconCompatParcelizer {

            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
            private List<getConstructors> AudioAttributesImplApi21Parcelizer;

            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
            private float AudioAttributesImplApi26Parcelizer;

            /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
            private float AudioAttributesImplBaseParcelizer;

            /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
            private float MediaBrowserCompatCustomActionResultReceiver;

            /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
            private float write;

            /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
            private float IconCompatParcelizer;

            /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
            private float read;
            private float RemoteActionCompatParcelizer;

            /* JADX INFO: renamed from: read, reason: from kotlin metadata */
            private String AudioAttributesCompatParcelizer;

            /* JADX INFO: renamed from: write, reason: from kotlin metadata */
            private List<? extends getBeanClass> MediaBrowserCompatItemReceiver;

            public C0087IconCompatParcelizer(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends getBeanClass> list, List<getConstructors> list2) {
                this.AudioAttributesCompatParcelizer = str;
                this.IconCompatParcelizer = f;
                this.RemoteActionCompatParcelizer = f2;
                this.write = f3;
                this.read = f4;
                this.MediaBrowserCompatCustomActionResultReceiver = f5;
                this.AudioAttributesImplApi26Parcelizer = f6;
                this.AudioAttributesImplBaseParcelizer = f7;
                this.MediaBrowserCompatItemReceiver = list;
                this.AudioAttributesImplApi21Parcelizer = list2;
            }

            public /* synthetic */ C0087IconCompatParcelizer(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) == 0 ? f5 : 1.0f, (i & 64) != 0 ? 0.0f : f6, (i & 128) == 0 ? f7 : BitmapDescriptorFactory.HUE_RED, (i & 256) != 0 ? getFactoryMethods.AudioAttributesCompatParcelizer() : list, (i & 512) != 0 ? new ArrayList() : list2);
            }

            /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
            public final String getAudioAttributesCompatParcelizer() {
                return this.AudioAttributesCompatParcelizer;
            }

            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
            public final float getIconCompatParcelizer() {
                return this.IconCompatParcelizer;
            }

            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
            public final float getRemoteActionCompatParcelizer() {
                return this.RemoteActionCompatParcelizer;
            }

            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
            public final float getWrite() {
                return this.write;
            }

            /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
            public final float getRead() {
                return this.read;
            }

            /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
            public final float getMediaBrowserCompatCustomActionResultReceiver() {
                return this.MediaBrowserCompatCustomActionResultReceiver;
            }

            /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
            public final float getAudioAttributesImplApi26Parcelizer() {
                return this.AudioAttributesImplApi26Parcelizer;
            }

            /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
            public final float getAudioAttributesImplBaseParcelizer() {
                return this.AudioAttributesImplBaseParcelizer;
            }

            public final List<getBeanClass> read() {
                return this.MediaBrowserCompatItemReceiver;
            }

            public final List<getConstructors> write() {
                return this.AudioAttributesImplApi21Parcelizer;
            }

            public C0087IconCompatParcelizer() {
                this(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null);
            }
        }

        public /* synthetic */ IconCompatParcelizer(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(str, f, f2, f3, f4, j, i, z);
        }
    }

    /* JADX INFO: renamed from: o.findExpectedFormat$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u00060\u0001j\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b"}, d2 = {"Lo/findExpectedFormat$read;", "", "<init>", "()V", "", "read", "()I", "RemoteActionCompatParcelizer", "I", "AudioAttributesCompatParcelizer", "Lo/SynchronizedObject;", "Ljava/lang/Object;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int read() {
            int i;
            synchronized (findExpectedFormat.AudioAttributesCompatParcelizer) {
                i = findExpectedFormat.RemoteActionCompatParcelizer;
                Companion companion = findExpectedFormat.INSTANCE;
                findExpectedFormat.RemoteActionCompatParcelizer = i + 1;
            }
            return i;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        AudioAttributesCompatParcelizer = companion;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof findExpectedFormat)) {
            return false;
        }
        findExpectedFormat findexpectedformat = (findExpectedFormat) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) findexpectedformat.read) && assignParameter.IconCompatParcelizer(this.RemoteActionCompatParcelizer, findexpectedformat.RemoteActionCompatParcelizer) && assignParameter.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, findexpectedformat.AudioAttributesCompatParcelizer) && this.write == findexpectedformat.write && this.IconCompatParcelizer == findexpectedformat.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, findexpectedformat.MediaBrowserCompatCustomActionResultReceiver) && switchToNext.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, findexpectedformat.AudioAttributesImplApi26Parcelizer) && createInstance.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, findexpectedformat.AudioAttributesImplBaseParcelizer) && this.MediaBrowserCompatItemReceiver == findexpectedformat.MediaBrowserCompatItemReceiver;
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iAudioAttributesCompatParcelizer = assignParameter.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        int iAudioAttributesCompatParcelizer2 = assignParameter.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        int iHashCode2 = Float.hashCode(this.write);
        int iHashCode3 = Float.hashCode(this.IconCompatParcelizer);
        int iHashCode4 = this.MediaBrowserCompatCustomActionResultReceiver.hashCode();
        return (((((((((((((((iHashCode * 31) + iAudioAttributesCompatParcelizer) * 31) + iAudioAttributesCompatParcelizer2) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.AudioAttributesImplApi26Parcelizer)) * 31) + createInstance.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer)) * 31) + Boolean.hashCode(this.MediaBrowserCompatItemReceiver);
    }

    public /* synthetic */ findExpectedFormat(String str, float f, float f2, float f3, float f4, getClassAnnotations getclassannotations, long j, int i, boolean z, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, f, f2, f3, f4, getclassannotations, j, i, z, i2);
    }
}
