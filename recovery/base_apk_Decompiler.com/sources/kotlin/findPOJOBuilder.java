package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.findPOJOBuilder;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u00013B]\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u000f\u0012\u0006\u0010\n\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0015BA\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0016\u0012\u0006\u0010\n\u001a\u00020\f\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0017B!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u0019\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0019\u0010\u001fJ'\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\fH\u0010¢\u0006\u0004\b\u001c\u0010 J7\u0010\u0019\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0019\u0010\"J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001dJ\u001a\u0010%\u001a\u00020$2\b\u0010\u0003\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010(R\u0017\u0010\u001c\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010\u0019\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u001b\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u001c\u00103\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b-\u00102R\u001a\u00107\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b+\u00104\u001a\u0004\b5\u00106R\u001a\u0010:\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u00106R\u001a\u0010<\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b<\u00106R\u001a\u0010@\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b9\u0010=\u001a\u0004\b>\u0010?R&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160A8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010;\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b>\u0010=\u001a\u0004\b/\u0010?R\u001a\u0010-\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\b:\u0010?R&\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160A8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010B\u001a\u0004\b@\u0010DR\u001a\u0010/\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bC\u0010=\u001a\u0004\b;\u0010?R\u0014\u00105\u001a\u00020$8\u0016X\u0097\u0004¢\u0006\u0006\n\u0004\b<\u0010ER\u001a\u0010>\u001a\u00020$8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b:\u0010E\u001a\u0004\b\u001c\u0010F"}, d2 = {"Lo/findPOJOBuilder;", "Lo/findImplicitPropertyName;", "", "p0", "", "p1", "Lo/findSerializationPropertyOrder;", "p2", "p3", "Lo/findNameForDeserialization;", "p4", "p5", "", "p6", "p7", "Lo/findRootName;", "p8", "", "p9", "<init>", "(Ljava/lang/String;[FLo/findSerializationPropertyOrder;[FLo/findNameForDeserialization;Lo/findNameForDeserialization;FFLo/findRootName;I)V", "(Ljava/lang/String;[FLo/findSerializationPropertyOrder;Lo/findRootName;I)V", "", "(Ljava/lang/String;[FLo/findSerializationPropertyOrder;DFFI)V", "(Lo/findPOJOBuilder;[FLo/findSerializationPropertyOrder;)V", "RemoteActionCompatParcelizer", "(I)F", "AudioAttributesCompatParcelizer", "read", "([F)[F", "", "(FFF)J", "(FFF)F", "Lo/switchToNext;", "(FFFFLo/findImplicitPropertyName;)J", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "handleMediaPlayPauseIfPendingOnHandler", "Lo/findSerializationPropertyOrder;", "onCustomAction", "()Lo/findSerializationPropertyOrder;", "MediaMetadataCompat", "F", "MediaBrowserCompatMediaItem", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/findRootName;", "()Lo/findRootName;", "IconCompatParcelizer", "[F", "MediaBrowserCompatSearchResultReceiver", "()[F", "write", "onCommand", "MediaDescriptionCompat", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "Lo/findNameForDeserialization;", "RatingCompat", "()Lo/findNameForDeserialization;", "MediaBrowserCompatCustomActionResultReceiver", "Lkotlin/Function1;", "Lo/getAnswerMap;", "AudioAttributesImplBaseParcelizer", "()Lo/getAnswerMap;", "Z", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class findPOJOBuilder extends findImplicitPropertyName {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<Double, Double> MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final boolean RatingCompat;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final findNameForDeserialization MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final findNameForDeserialization MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final float[] AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final getAnswerMap<Double, Double> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final findRootName IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final findNameForDeserialization MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final float RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final findNameForDeserialization MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final findSerializationPropertyOrder read;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final float[] AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final float[] write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int write = 8;
    private static final findNameForDeserialization read = new findNameForDeserialization() { // from class: o.findPropertyAliases
        @Override // kotlin.findNameForDeserialization
        public final double read(double d) {
            return findPOJOBuilder.RemoteActionCompatParcelizer(d);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final double RemoteActionCompatParcelizer(double d) {
        return d;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final findSerializationPropertyOrder getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final findRootName getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public findPOJOBuilder(String str, float[] fArr, findSerializationPropertyOrder findserializationpropertyorder, float[] fArr2, findNameForDeserialization findnamefordeserialization, findNameForDeserialization findnamefordeserialization2, float f, float f2, findRootName findrootname, int i) {
        super(str, findEnumAliases.INSTANCE.write(), i, null);
        this.read = findserializationpropertyorder;
        this.RemoteActionCompatParcelizer = f;
        this.AudioAttributesCompatParcelizer = f2;
        this.IconCompatParcelizer = findrootname;
        this.MediaBrowserCompatCustomActionResultReceiver = findnamefordeserialization;
        this.AudioAttributesImplBaseParcelizer = new AnonymousClass4();
        this.MediaBrowserCompatItemReceiver = new findNameForDeserialization() { // from class: o.findPropertyAccess
            @Override // kotlin.findNameForDeserialization
            public final double read(double d) {
                return findPOJOBuilder.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, d);
            }
        };
        this.MediaMetadataCompat = findnamefordeserialization2;
        this.MediaDescriptionCompat = new AnonymousClass2();
        this.MediaBrowserCompatMediaItem = new findNameForDeserialization() { // from class: o.findObjectReferenceInfo
            @Override // kotlin.findNameForDeserialization
            public final double read(double d) {
                return findPOJOBuilder.read(this.RemoteActionCompatParcelizer, d);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f >= f2) {
            StringBuilder sb = new StringBuilder("Invalid range: min=");
            sb.append(f);
            sb.append(", max=");
            sb.append(f2);
            sb.append("; min must be strictly < max");
            throw new IllegalArgumentException(sb.toString());
        }
        Companion companion = INSTANCE;
        float[] fArr3 = companion.read(fArr);
        this.write = fArr3;
        if (fArr2 != null) {
            if (fArr2.length != 9) {
                StringBuilder sb2 = new StringBuilder("Transform must have 9 entries! Has ");
                sb2.append(fArr2.length);
                throw new IllegalArgumentException(sb2.toString());
            }
            this.AudioAttributesImplApi26Parcelizer = fArr2;
        } else {
            this.AudioAttributesImplApi26Parcelizer = companion.write(fArr3, findserializationpropertyorder);
        }
        this.AudioAttributesImplApi21Parcelizer = findFormat.write(this.AudioAttributesImplApi26Parcelizer);
        this.MediaBrowserCompatSearchResultReceiver = companion.write(fArr3, f, f2);
        this.RatingCompat = companion.AudioAttributesCompatParcelizer(fArr3, findserializationpropertyorder, findnamefordeserialization, findnamefordeserialization2, f, f2, i);
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final float[] getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final float[] getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final float[] getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final findNameForDeserialization getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: o.findPOJOBuilder$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "p0", "write", "(D)Ljava/lang/Double;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<Double, Double> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Double invoke(Double d) {
            return write(d.doubleValue());
        }

        public final Double write(double d) {
            return Double.valueOf(getQues.read(findPOJOBuilder.this.getMediaBrowserCompatCustomActionResultReceiver().read(d), findPOJOBuilder.this.RemoteActionCompatParcelizer, findPOJOBuilder.this.AudioAttributesCompatParcelizer));
        }

        AnonymousClass4() {
            super(1);
        }
    }

    public final getAnswerMap<Double, Double> AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final findNameForDeserialization getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double RemoteActionCompatParcelizer(findPOJOBuilder findpojobuilder, double d) {
        return getQues.read(findpojobuilder.MediaBrowserCompatCustomActionResultReceiver.read(d), findpojobuilder.RemoteActionCompatParcelizer, findpojobuilder.AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final findNameForDeserialization getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: o.findPOJOBuilder$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "p0", "IconCompatParcelizer", "(D)Ljava/lang/Double;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<Double, Double> {
        public final Double IconCompatParcelizer(double d) {
            return Double.valueOf(findPOJOBuilder.this.getMediaMetadataCompat().read(getQues.read(d, findPOJOBuilder.this.RemoteActionCompatParcelizer, findPOJOBuilder.this.AudioAttributesCompatParcelizer)));
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Double invoke(Double d) {
            return IconCompatParcelizer(d.doubleValue());
        }

        AnonymousClass2() {
            super(1);
        }
    }

    public final getAnswerMap<Double, Double> MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final findNameForDeserialization getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double read(findPOJOBuilder findpojobuilder, double d) {
        return findpojobuilder.MediaMetadataCompat.read(getQues.read(d, findpojobuilder.RemoteActionCompatParcelizer, findpojobuilder.AudioAttributesCompatParcelizer));
    }

    @Override // kotlin.findImplicitPropertyName
    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public findPOJOBuilder(String str, float[] fArr, findSerializationPropertyOrder findserializationpropertyorder, findRootName findrootname, int i) {
        Companion companion = INSTANCE;
        this(str, fArr, findserializationpropertyorder, null, companion.AudioAttributesCompatParcelizer(findrootname), companion.RemoteActionCompatParcelizer(findrootname), BitmapDescriptorFactory.HUE_RED, 1.0f, findrootname, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public findPOJOBuilder(String str, float[] fArr, findSerializationPropertyOrder findserializationpropertyorder, final double d, float f, float f2, int i) {
        findNameForDeserialization findnamefordeserialization;
        findNameForDeserialization findnamefordeserialization2;
        if (d == 1.0d) {
            findnamefordeserialization = read;
        } else {
            findnamefordeserialization = new findNameForDeserialization() { // from class: o.findPropertyContentTypeResolver
                @Override // kotlin.findNameForDeserialization
                public final double read(double d2) {
                    return findPOJOBuilder.read(d, d2);
                }
            };
        }
        findNameForDeserialization findnamefordeserialization3 = findnamefordeserialization;
        if (d == 1.0d) {
            findnamefordeserialization2 = read;
        } else {
            findnamefordeserialization2 = new findNameForDeserialization() { // from class: o.findPropertyDescription
                @Override // kotlin.findNameForDeserialization
                public final double read(double d2) {
                    return findPOJOBuilder.RemoteActionCompatParcelizer(d, d2);
                }
            };
        }
        this(str, fArr, findserializationpropertyorder, null, findnamefordeserialization3, findnamefordeserialization2, f, f2, new findRootName(d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double read(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, 1.0d / d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double RemoteActionCompatParcelizer(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, d);
    }

    public findPOJOBuilder(findPOJOBuilder findpojobuilder, float[] fArr, findSerializationPropertyOrder findserializationpropertyorder) {
        this(findpojobuilder.getRemoteActionCompatParcelizer(), findpojobuilder.write, findserializationpropertyorder, fArr, findpojobuilder.MediaBrowserCompatCustomActionResultReceiver, findpojobuilder.MediaMetadataCompat, findpojobuilder.RemoteActionCompatParcelizer, findpojobuilder.AudioAttributesCompatParcelizer, findpojobuilder.IconCompatParcelizer, -1);
    }

    @Override // kotlin.findImplicitPropertyName
    public final float RemoteActionCompatParcelizer(int p0) {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.findImplicitPropertyName
    public final float AudioAttributesCompatParcelizer(int p0) {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.findImplicitPropertyName
    public final float[] read(float[] p0) {
        if (p0.length < 3) {
            return p0;
        }
        p0[0] = (float) this.MediaBrowserCompatMediaItem.read(p0[0]);
        p0[1] = (float) this.MediaBrowserCompatMediaItem.read(p0[1]);
        p0[2] = (float) this.MediaBrowserCompatMediaItem.read(p0[2]);
        return findFormat.write(this.AudioAttributesImplApi26Parcelizer, p0);
    }

    @Override // kotlin.findImplicitPropertyName
    public final long RemoteActionCompatParcelizer(float p0, float p1, float p2) {
        float f = (float) this.MediaBrowserCompatMediaItem.read(p0);
        float f2 = (float) this.MediaBrowserCompatMediaItem.read(p1);
        float f3 = (float) this.MediaBrowserCompatMediaItem.read(p2);
        float[] fArr = this.AudioAttributesImplApi26Parcelizer;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = fArr[0];
        float f5 = fArr[3];
        float f6 = fArr[6];
        float f7 = fArr[1];
        float f8 = fArr[4];
        float f9 = fArr[7];
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(((f4 * f) + (f5 * f2)) + (f6 * f3))) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits((f7 * f) + (f8 * f2) + (f9 * f3));
        long j = -1;
        return (jFloatToRawIntBits2 & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | jFloatToRawIntBits;
    }

    @Override // kotlin.findImplicitPropertyName
    public final float read(float p0, float p1, float p2) {
        float f = (float) this.MediaBrowserCompatMediaItem.read(p0);
        float f2 = (float) this.MediaBrowserCompatMediaItem.read(p1);
        float f3 = (float) this.MediaBrowserCompatMediaItem.read(p2);
        float[] fArr = this.AudioAttributesImplApi26Parcelizer;
        return (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
    }

    @Override // kotlin.findImplicitPropertyName
    public final long RemoteActionCompatParcelizer(float p0, float p1, float p2, float p3, findImplicitPropertyName p4) {
        float[] fArr = this.AudioAttributesImplApi21Parcelizer;
        return RequestPayload.write((float) this.MediaBrowserCompatItemReceiver.read((fArr[0] * p0) + (fArr[3] * p1) + (fArr[6] * p2)), (float) this.MediaBrowserCompatItemReceiver.read((fArr[1] * p0) + (fArr[4] * p1) + (fArr[7] * p2)), (float) this.MediaBrowserCompatItemReceiver.read((fArr[2] * p0) + (fArr[5] * p1) + (fArr[8] * p2)), p3, p4);
    }

    @Override // kotlin.findImplicitPropertyName
    public final float[] RemoteActionCompatParcelizer(float[] p0) {
        findFormat.write(this.AudioAttributesImplApi21Parcelizer, p0);
        if (p0.length < 3) {
            return p0;
        }
        p0[0] = (float) this.MediaBrowserCompatItemReceiver.read(p0[0]);
        p0[1] = (float) this.MediaBrowserCompatItemReceiver.read(p0[1]);
        p0[2] = (float) this.MediaBrowserCompatItemReceiver.read(p0[2]);
        return p0;
    }

    @Override // kotlin.findImplicitPropertyName
    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || getClass() != p0.getClass() || !super.equals(p0)) {
            return false;
        }
        findPOJOBuilder findpojobuilder = (findPOJOBuilder) p0;
        if (Float.compare(findpojobuilder.RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer) != 0 || Float.compare(findpojobuilder.AudioAttributesCompatParcelizer, this.AudioAttributesCompatParcelizer) != 0 || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, findpojobuilder.read) || !Arrays.equals(this.write, findpojobuilder.write)) {
            return false;
        }
        findRootName findrootname = this.IconCompatParcelizer;
        if (findrootname != null) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(findrootname, findpojobuilder.IconCompatParcelizer);
        }
        if (findpojobuilder.IconCompatParcelizer == null) {
            return true;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, findpojobuilder.MediaBrowserCompatCustomActionResultReceiver)) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaMetadataCompat, findpojobuilder.MediaMetadataCompat);
        }
        return false;
    }

    @Override // kotlin.findImplicitPropertyName
    public final int hashCode() {
        int iHashCode = super.hashCode();
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = Arrays.hashCode(this.write);
        float f = this.RemoteActionCompatParcelizer;
        int iFloatToIntBits = f == BitmapDescriptorFactory.HUE_RED ? 0 : Float.floatToIntBits(f);
        float f2 = this.AudioAttributesCompatParcelizer;
        int iFloatToIntBits2 = f2 == BitmapDescriptorFactory.HUE_RED ? 0 : Float.floatToIntBits(f2);
        findRootName findrootname = this.IconCompatParcelizer;
        int iHashCode4 = (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iFloatToIntBits) * 31) + iFloatToIntBits2) * 31) + (findrootname != null ? findrootname.hashCode() : 0);
        if (this.IconCompatParcelizer == null) {
            return (((iHashCode4 * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + this.MediaMetadataCompat.hashCode();
        }
        return iHashCode4;
    }

    /* JADX INFO: renamed from: o.findPOJOBuilder$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0018J\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u001cJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u0011\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 "}, d2 = {"Lo/findPOJOBuilder$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "Lo/findSerializationPropertyOrder;", "p1", "Lo/findNameForDeserialization;", "p2", "p3", "", "p4", "p5", "", "p6", "", "AudioAttributesCompatParcelizer", "([FLo/findSerializationPropertyOrder;Lo/findNameForDeserialization;Lo/findNameForDeserialization;FFI)Z", "", "IconCompatParcelizer", "(DLo/findNameForDeserialization;Lo/findNameForDeserialization;)Z", "write", "([FFF)Z", "([F)F", "([F[F)Z", "read", "([F)[F", "([FLo/findSerializationPropertyOrder;)[F", "Lo/findRootName;", "(Lo/findRootName;)Lo/findNameForDeserialization;", "RemoteActionCompatParcelizer", "Lo/findNameForDeserialization;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean AudioAttributesCompatParcelizer(float[] p0, findSerializationPropertyOrder p1, findNameForDeserialization p2, findNameForDeserialization p3, float p4, float p5, int p6) {
            if (p6 == 0) {
                return true;
            }
            if (!findFormat.AudioAttributesCompatParcelizer(p0, findFilterId.INSTANCE.onPause()) || !findFormat.write(p1, findNamingStrategy.INSTANCE.AudioAttributesCompatParcelizer()) || p4 != BitmapDescriptorFactory.HUE_RED || p5 != 1.0f) {
                return false;
            }
            findPOJOBuilder findpojobuilderOnPlayFromMediaId = findFilterId.INSTANCE.onPlayFromMediaId();
            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                if (!IconCompatParcelizer(d, p2, findpojobuilderOnPlayFromMediaId.getMediaBrowserCompatCustomActionResultReceiver()) || !IconCompatParcelizer(d, p3, findpojobuilderOnPlayFromMediaId.getMediaMetadataCompat())) {
                    return false;
                }
            }
            return true;
        }

        private final boolean IconCompatParcelizer(double p0, findNameForDeserialization p1, findNameForDeserialization p2) {
            return Math.abs(p1.read(p0) - p2.read(p0)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean write(float[] p0, float p1, float p2) {
            if (write(p0) / write(findFilterId.INSTANCE.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) <= 0.9f || !IconCompatParcelizer(p0, findFilterId.INSTANCE.onPause())) {
                return p1 < BitmapDescriptorFactory.HUE_RED && p2 > 1.0f;
            }
            return true;
        }

        private final float write(float[] p0) {
            if (p0.length < 6) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            float f = p0[0];
            float f2 = p0[1];
            float f3 = p0[2];
            float f4 = p0[3];
            float f5 = p0[4];
            float f6 = p0[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < BitmapDescriptorFactory.HUE_RED ? -f7 : f7;
        }

        private final boolean IconCompatParcelizer(float[] p0, float[] p1) {
            float f = p0[0];
            float f2 = p1[0];
            float f3 = p0[1];
            float f4 = p1[1];
            float f5 = p0[2];
            float f6 = p1[2];
            float f7 = p0[3];
            float f8 = p1[3];
            float f9 = p0[4];
            float f10 = p1[4];
            float f11 = p0[5];
            float f12 = p1[5];
            float[] fArr = {f - f2, f3 - f4, f5 - f6, f7 - f8, f9 - f10, f11 - f12};
            float f13 = fArr[0];
            float f14 = fArr[1];
            if (((f4 - f12) * f13) - ((f2 - f10) * f14) >= BitmapDescriptorFactory.HUE_RED && ((f2 - f6) * f14) - ((f4 - f8) * f13) >= BitmapDescriptorFactory.HUE_RED) {
                float f15 = fArr[2];
                float f16 = fArr[3];
                if (((f8 - f4) * f15) - ((f6 - f2) * f16) >= BitmapDescriptorFactory.HUE_RED && ((f6 - f10) * f16) - ((f8 - f12) * f15) >= BitmapDescriptorFactory.HUE_RED) {
                    float f17 = fArr[4];
                    float f18 = fArr[5];
                    if (((f12 - f8) * f17) - ((f10 - f6) * f18) >= BitmapDescriptorFactory.HUE_RED && ((f10 - f2) * f18) - ((f12 - f4) * f17) >= BitmapDescriptorFactory.HUE_RED) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] read(float[] p0) {
            float[] fArr = new float[6];
            if (p0.length != 9) {
                getOrderDetails.IconCompatParcelizer(p0, fArr, 0, 0, 6);
                return fArr;
            }
            float f = p0[0];
            float f2 = p0[1];
            float f3 = f + f2 + p0[2];
            fArr[0] = f / f3;
            fArr[1] = f2 / f3;
            float f4 = p0[3];
            float f5 = p0[4];
            float f6 = f4 + f5 + p0[5];
            fArr[2] = f4 / f6;
            fArr[3] = f5 / f6;
            float f7 = p0[6];
            float f8 = p0[7];
            float f9 = f7 + f8 + p0[8];
            fArr[4] = f7 / f9;
            fArr[5] = f8 / f9;
            return fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] write(float[] p0, findSerializationPropertyOrder p1) {
            float f = p0[0];
            float f2 = p0[1];
            float f3 = p0[2];
            float f4 = p0[3];
            float f5 = p0[4];
            float f6 = p0[5];
            float remoteActionCompatParcelizer = p1.getRemoteActionCompatParcelizer();
            float audioAttributesCompatParcelizer = p1.getAudioAttributesCompatParcelizer();
            float f7 = 1.0f - f;
            float f8 = f7 / f2;
            float f9 = 1.0f - f3;
            float f10 = 1.0f - f5;
            float f11 = (1.0f - remoteActionCompatParcelizer) / audioAttributesCompatParcelizer;
            float f12 = f / f2;
            float f13 = (f3 / f4) - f12;
            float f14 = (remoteActionCompatParcelizer / audioAttributesCompatParcelizer) - f12;
            float f15 = (f9 / f4) - f8;
            float f16 = (f5 / f6) - f12;
            float f17 = (((f11 - f8) * f13) - (f14 * f15)) / ((((f10 / f6) - f8) * f13) - (f15 * f16));
            float f18 = (f14 - (f16 * f17)) / f13;
            float f19 = (1.0f - f18) - f17;
            float f20 = f19 / f2;
            float f21 = f18 / f4;
            float f22 = f17 / f6;
            return new float[]{f * f20, f19, f20 * (f7 - f2), f3 * f21, f18, f21 * (f9 - f4), f5 * f22, f17, f22 * (f10 - f6)};
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final findNameForDeserialization AudioAttributesCompatParcelizer(final findRootName p0) {
            if (p0.MediaBrowserCompatCustomActionResultReceiver()) {
                return new findNameForDeserialization() { // from class: o.findReferenceType
                    @Override // kotlin.findNameForDeserialization
                    public final double read(double d) {
                        return findPOJOBuilder.Companion.RatingCompat(p0, d);
                    }
                };
            }
            if (p0.AudioAttributesImplBaseParcelizer()) {
                return new findNameForDeserialization() { // from class: o.findPropertyIndex
                    @Override // kotlin.findNameForDeserialization
                    public final double read(double d) {
                        return findPOJOBuilder.Companion.MediaBrowserCompatSearchResultReceiver(p0, d);
                    }
                };
            }
            if (p0.getMediaBrowserCompatItemReceiver() == 0.0d && p0.getAudioAttributesImplApi26Parcelizer() == 0.0d) {
                return new findNameForDeserialization() { // from class: o.findPropertyInclusionByName
                    @Override // kotlin.findNameForDeserialization
                    public final double read(double d) {
                        return findPOJOBuilder.Companion.MediaBrowserCompatMediaItem(p0, d);
                    }
                };
            }
            return new findNameForDeserialization() { // from class: o.findPropertyInclusion
                @Override // kotlin.findNameForDeserialization
                public final double read(double d) {
                    return findPOJOBuilder.Companion.handleMediaPlayPauseIfPendingOnHandler(p0, d);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double RatingCompat(findRootName findrootname, double d) {
            return findFilterId.INSTANCE.read(findrootname, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double MediaBrowserCompatSearchResultReceiver(findRootName findrootname, double d) {
            return findFilterId.INSTANCE.IconCompatParcelizer(findrootname, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double MediaBrowserCompatMediaItem(findRootName findrootname, double d) {
            return findFormat.read(d, findrootname.getRemoteActionCompatParcelizer(), findrootname.getRead(), findrootname.getAudioAttributesCompatParcelizer(), findrootname.getIconCompatParcelizer(), findrootname.getWrite());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double handleMediaPlayPauseIfPendingOnHandler(findRootName findrootname, double d) {
            return findFormat.write(d, findrootname.getRemoteActionCompatParcelizer(), findrootname.getRead(), findrootname.getAudioAttributesCompatParcelizer(), findrootname.getIconCompatParcelizer(), findrootname.getMediaBrowserCompatItemReceiver(), findrootname.getAudioAttributesImplApi26Parcelizer(), findrootname.getWrite());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final findNameForDeserialization RemoteActionCompatParcelizer(final findRootName p0) {
            if (p0.MediaBrowserCompatCustomActionResultReceiver()) {
                return new findNameForDeserialization() { // from class: o.findPropertyIgnorals
                    @Override // kotlin.findNameForDeserialization
                    public final double read(double d) {
                        return findPOJOBuilder.Companion.AudioAttributesImplApi21Parcelizer(p0, d);
                    }
                };
            }
            if (p0.AudioAttributesImplBaseParcelizer()) {
                return new findNameForDeserialization() { // from class: o.findPropertyIgnoralByName
                    @Override // kotlin.findNameForDeserialization
                    public final double read(double d) {
                        return findPOJOBuilder.Companion.AudioAttributesImplBaseParcelizer(p0, d);
                    }
                };
            }
            if (p0.getMediaBrowserCompatItemReceiver() == 0.0d && p0.getAudioAttributesImplApi26Parcelizer() == 0.0d) {
                return new findNameForDeserialization() { // from class: o.findPropertyDefaultValue
                    @Override // kotlin.findNameForDeserialization
                    public final double read(double d) {
                        return findPOJOBuilder.Companion.MediaMetadataCompat(p0, d);
                    }
                };
            }
            return new findNameForDeserialization() { // from class: o.findPropertyTypeResolver
                @Override // kotlin.findNameForDeserialization
                public final double read(double d) {
                    return findPOJOBuilder.Companion.MediaDescriptionCompat(p0, d);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double AudioAttributesImplApi21Parcelizer(findRootName findrootname, double d) {
            return findFilterId.INSTANCE.RemoteActionCompatParcelizer(findrootname, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double AudioAttributesImplBaseParcelizer(findRootName findrootname, double d) {
            return findFilterId.INSTANCE.write(findrootname, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double MediaMetadataCompat(findRootName findrootname, double d) {
            return findFormat.AudioAttributesCompatParcelizer(d, findrootname.getRemoteActionCompatParcelizer(), findrootname.getRead(), findrootname.getAudioAttributesCompatParcelizer(), findrootname.getIconCompatParcelizer(), findrootname.getWrite());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double MediaDescriptionCompat(findRootName findrootname, double d) {
            return findFormat.IconCompatParcelizer(d, findrootname.getRemoteActionCompatParcelizer(), findrootname.getRead(), findrootname.getAudioAttributesCompatParcelizer(), findrootname.getIconCompatParcelizer(), findrootname.getMediaBrowserCompatItemReceiver(), findrootname.getAudioAttributesImplApi26Parcelizer(), findrootname.getWrite());
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
