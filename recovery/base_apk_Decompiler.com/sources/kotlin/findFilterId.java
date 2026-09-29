package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\tR\u001a\u0010\f\u001a\u00020\r8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\r8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0012\u0010\u001eR\u001a\u0010 \u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010\"\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\u0014\u0010\u001eR\u001a\u0010%\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001eR\u001a\u0010$\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b\"\u0010\u001eR\u001a\u0010\u0014\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b%\u0010\u001eR\u001a\u0010(\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001eR\u001a\u0010\u0013\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b#\u0010\u001eR\u001a\u0010'\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b!\u0010\u001eR\u001a\u0010&\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\f\u0010\u001eR\u001a\u0010!\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b&\u0010\u001eR\u001a\u0010#\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\b\u0010\u001eR\u001a\u0010,\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\n\u0010\u001eR\u001a\u0010+\u001a\u00020-8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b\u001a\u0010/R\u001a\u0010\u0010\u001a\u00020-8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b\u0018\u0010/R\u001a\u0010\u0012\u001a\u00020\u001b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b0\u0010\u001d\u001a\u0004\b)\u0010\u001eR\u001a\u0010)\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u000b\u0010\u001eR\u001a\u00100\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u001a\u0010\u0016\u001a\u00020-8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b'\u0010/R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020-018\u0001X\u0081\u0004¢\u0006\f\n\u0004\b(\u00102\u001a\u0004\b \u00103"}, d2 = {"Lo/findFilterId;", "", "<init>", "()V", "Lo/findRootName;", "p0", "", "p1", "read", "(Lo/findRootName;D)D", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "write", "", "onPlayFromUri", "[F", "onPause", "()[F", "onPlayFromMediaId", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "MediaMetadataCompat", "AudioAttributesCompatParcelizer", "onPrepareFromSearch", "Lo/findRootName;", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "Lo/findPOJOBuilder;", "onPrepareFromMediaId", "Lo/findPOJOBuilder;", "()Lo/findPOJOBuilder;", "RatingCompat", "AudioAttributesImplApi26Parcelizer", "onCommand", "MediaBrowserCompatItemReceiver", "onAddQueueItem", "MediaBrowserCompatSearchResultReceiver", "MediaBrowserCompatMediaItem", "handleMediaPlayPauseIfPendingOnHandler", "onCustomAction", "MediaDescriptionCompat", "onFastForward", "onPrepare", "onPlay", "onMediaButtonEvent", "Lo/findImplicitPropertyName;", "Lo/findImplicitPropertyName;", "()Lo/findImplicitPropertyName;", "onPlayFromSearch", "", "[Lo/findImplicitPropertyName;", "()[Lo/findImplicitPropertyName;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class findFilterId {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final findPOJOBuilder onAddQueueItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private static final findRootName AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private static final findPOJOBuilder onPlayFromSearch;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private static final findPOJOBuilder onFastForward;
    public static final findFilterId INSTANCE = new findFilterId();
    public static final int IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private static final findRootName AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private static final findPOJOBuilder MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private static final findImplicitPropertyName onPause;
    private static final findPOJOBuilder MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private static final findPOJOBuilder AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private static final findImplicitPropertyName[] onPlayFromUri;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private static final float[] AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private static final findImplicitPropertyName onPlay;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static final findPOJOBuilder handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private static final findPOJOBuilder RatingCompat;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private static final findPOJOBuilder MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private static final findPOJOBuilder MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private static final findPOJOBuilder MediaDescriptionCompat;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private static final findPOJOBuilder MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private static final findImplicitPropertyName onPrepareFromSearch;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private static final findRootName RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private static final findPOJOBuilder onCommand;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private static final float[] read;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private static final findPOJOBuilder onPlayFromMediaId;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private static final float[] write;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private static final findPOJOBuilder onCustomAction;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private static final findPOJOBuilder MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private static final findRootName IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final findPOJOBuilder onMediaButtonEvent;

    private findFilterId() {
    }

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        write = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        read = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        AudioAttributesCompatParcelizer = fArr3;
        findRootName findrootname = new findRootName(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        IconCompatParcelizer = findrootname;
        findRootName findrootname2 = new findRootName(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        RemoteActionCompatParcelizer = findrootname2;
        findRootName findrootname3 = new findRootName(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        AudioAttributesImplApi21Parcelizer = findrootname3;
        findRootName findrootname4 = new findRootName(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        AudioAttributesImplBaseParcelizer = findrootname4;
        findPOJOBuilder findpojobuilder = new findPOJOBuilder("sRGB IEC61966-2.1", fArr, findNamingStrategy.INSTANCE.AudioAttributesCompatParcelizer(), findrootname, 0);
        MediaBrowserCompatCustomActionResultReceiver = findpojobuilder;
        findPOJOBuilder findpojobuilder2 = new findPOJOBuilder("sRGB IEC61966-2.1 (Linear)", fArr, findNamingStrategy.INSTANCE.AudioAttributesCompatParcelizer(), 1.0d, BitmapDescriptorFactory.HUE_RED, 1.0f, 1);
        AudioAttributesImplApi26Parcelizer = findpojobuilder2;
        findPOJOBuilder findpojobuilder3 = new findPOJOBuilder("scRGB-nl IEC 61966-2-2:2003", fArr, findNamingStrategy.INSTANCE.AudioAttributesCompatParcelizer(), null, new findNameForDeserialization() { // from class: o.findEnumNamingStrategy
            @Override // kotlin.findNameForDeserialization
            public final double read(double d) {
                return findFilterId.MediaBrowserCompatSearchResultReceiver(d);
            }
        }, new findNameForDeserialization() { // from class: o.findEnumValues
            @Override // kotlin.findNameForDeserialization
            public final double read(double d) {
                return findFilterId.MediaBrowserCompatMediaItem(d);
            }
        }, -0.799f, 2.399f, findrootname, 2);
        MediaBrowserCompatItemReceiver = findpojobuilder3;
        findPOJOBuilder findpojobuilder4 = new findPOJOBuilder("scRGB IEC 61966-2-2:2003", fArr, findNamingStrategy.INSTANCE.AudioAttributesCompatParcelizer(), 1.0d, -0.5f, 7.499f, 3);
        MediaBrowserCompatMediaItem = findpojobuilder4;
        findPOJOBuilder findpojobuilder5 = new findPOJOBuilder("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, findNamingStrategy.INSTANCE.AudioAttributesCompatParcelizer(), new findRootName(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        MediaBrowserCompatSearchResultReceiver = findpojobuilder5;
        findPOJOBuilder findpojobuilder6 = new findPOJOBuilder("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, findNamingStrategy.INSTANCE.AudioAttributesCompatParcelizer(), new findRootName(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        MediaMetadataCompat = findpojobuilder6;
        findPOJOBuilder findpojobuilder7 = new findPOJOBuilder("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new findSerializationPropertyOrder(0.314f, 0.351f), 2.6d, BitmapDescriptorFactory.HUE_RED, 1.0f, 6);
        RatingCompat = findpojobuilder7;
        findPOJOBuilder findpojobuilder8 = new findPOJOBuilder("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, findNamingStrategy.INSTANCE.AudioAttributesCompatParcelizer(), findrootname, 7);
        MediaDescriptionCompat = findpojobuilder8;
        findPOJOBuilder findpojobuilder9 = new findPOJOBuilder("NTSC (1953)", fArr2, findNamingStrategy.INSTANCE.IconCompatParcelizer(), new findRootName(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = findpojobuilder9;
        findPOJOBuilder findpojobuilder10 = new findPOJOBuilder("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, findNamingStrategy.INSTANCE.AudioAttributesCompatParcelizer(), new findRootName(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        onCustomAction = findpojobuilder10;
        findPOJOBuilder findpojobuilder11 = new findPOJOBuilder("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, findNamingStrategy.INSTANCE.AudioAttributesCompatParcelizer(), 2.2d, BitmapDescriptorFactory.HUE_RED, 1.0f, 10);
        handleMediaPlayPauseIfPendingOnHandler = findpojobuilder11;
        findPOJOBuilder findpojobuilder12 = new findPOJOBuilder("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, findNamingStrategy.INSTANCE.read(), new findRootName(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        onCommand = findpojobuilder12;
        findPOJOBuilder findpojobuilder13 = new findPOJOBuilder("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0E-4f, -0.077f}, findNamingStrategy.INSTANCE.RemoteActionCompatParcelizer(), 1.0d, -65504.0f, 65504.0f, 12);
        onAddQueueItem = findpojobuilder13;
        findPOJOBuilder findpojobuilder14 = new findPOJOBuilder("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, findNamingStrategy.INSTANCE.RemoteActionCompatParcelizer(), 1.0d, -65504.0f, 65504.0f, 13);
        onMediaButtonEvent = findpojobuilder14;
        findSerializationConverter findserializationconverter = new findSerializationConverter("Generic XYZ", 14);
        onPlay = findserializationconverter;
        findNameForSerialization findnameforserialization = new findNameForSerialization("Generic L*a*b*", 15);
        onPause = findnameforserialization;
        findPOJOBuilder findpojobuilder15 = new findPOJOBuilder("None", fArr, findNamingStrategy.INSTANCE.AudioAttributesCompatParcelizer(), findrootname2, 16);
        onPlayFromMediaId = findpojobuilder15;
        findPOJOBuilder findpojobuilder16 = new findPOJOBuilder("Hybrid Log Gamma encoding", fArr3, findNamingStrategy.INSTANCE.AudioAttributesCompatParcelizer(), null, new findNameForDeserialization() { // from class: o.findKeySerializer
            @Override // kotlin.findNameForDeserialization
            public final double read(double d) {
                return findFilterId.AudioAttributesImplBaseParcelizer(d);
            }
        }, new findNameForDeserialization() { // from class: o.findMergeInfo
            @Override // kotlin.findNameForDeserialization
            public final double read(double d) {
                return findFilterId.MediaBrowserCompatItemReceiver(d);
            }
        }, BitmapDescriptorFactory.HUE_RED, 1.0f, findrootname3, 17);
        onFastForward = findpojobuilder16;
        findPOJOBuilder findpojobuilder17 = new findPOJOBuilder("Perceptual Quantizer encoding", fArr3, findNamingStrategy.INSTANCE.AudioAttributesCompatParcelizer(), null, new findNameForDeserialization() { // from class: o.findInjectableValueId
            @Override // kotlin.findNameForDeserialization
            public final double read(double d) {
                return findFilterId.AudioAttributesImplApi21Parcelizer(d);
            }
        }, new findNameForDeserialization() { // from class: o.findInjectableValue
            @Override // kotlin.findNameForDeserialization
            public final double read(double d) {
                return findFilterId.MediaBrowserCompatCustomActionResultReceiver(d);
            }
        }, BitmapDescriptorFactory.HUE_RED, 1.0f, findrootname4, 18);
        onPlayFromSearch = findpojobuilder17;
        findNullSerializer findnullserializer = new findNullSerializer("Oklab", 19);
        onPrepareFromSearch = findnullserializer;
        onPlayFromUri = new findImplicitPropertyName[]{findpojobuilder, findpojobuilder2, findpojobuilder3, findpojobuilder4, findpojobuilder5, findpojobuilder6, findpojobuilder7, findpojobuilder8, findpojobuilder9, findpojobuilder10, findpojobuilder11, findpojobuilder12, findpojobuilder13, findpojobuilder14, findserializationconverter, findnameforserialization, findpojobuilder15, findpojobuilder16, findpojobuilder17, findnullserializer};
        IconCompatParcelizer = 8;
    }

    public final float[] onPause() {
        return write;
    }

    public final float[] MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return read;
    }

    public final findPOJOBuilder onPlayFromMediaId() {
        return MediaBrowserCompatCustomActionResultReceiver;
    }

    public final findPOJOBuilder RatingCompat() {
        return AudioAttributesImplApi26Parcelizer;
    }

    public final findPOJOBuilder MediaMetadataCompat() {
        return MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double MediaBrowserCompatSearchResultReceiver(double d) {
        return findFormat.IconCompatParcelizer(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double MediaBrowserCompatMediaItem(double d) {
        return findFormat.RemoteActionCompatParcelizer(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public final findPOJOBuilder MediaBrowserCompatSearchResultReceiver() {
        return MediaBrowserCompatMediaItem;
    }

    public final findPOJOBuilder MediaBrowserCompatItemReceiver() {
        return MediaBrowserCompatSearchResultReceiver;
    }

    public final findPOJOBuilder AudioAttributesCompatParcelizer() {
        return MediaMetadataCompat;
    }

    public final findPOJOBuilder MediaBrowserCompatMediaItem() {
        return RatingCompat;
    }

    public final findPOJOBuilder MediaDescriptionCompat() {
        return MediaDescriptionCompat;
    }

    public final findPOJOBuilder onAddQueueItem() {
        return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final findPOJOBuilder onCommand() {
        return onCustomAction;
    }

    public final findPOJOBuilder write() {
        return handleMediaPlayPauseIfPendingOnHandler;
    }

    public final findPOJOBuilder handleMediaPlayPauseIfPendingOnHandler() {
        return onCommand;
    }

    public final findPOJOBuilder read() {
        return onAddQueueItem;
    }

    public final findPOJOBuilder RemoteActionCompatParcelizer() {
        return onMediaButtonEvent;
    }

    public final findImplicitPropertyName AudioAttributesImplBaseParcelizer() {
        return onPlay;
    }

    public final findImplicitPropertyName MediaBrowserCompatCustomActionResultReceiver() {
        return onPause;
    }

    public final findPOJOBuilder onFastForward() {
        return onPlayFromMediaId;
    }

    public final findPOJOBuilder IconCompatParcelizer() {
        return onFastForward;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double AudioAttributesImplBaseParcelizer(double d) {
        return INSTANCE.read(AudioAttributesImplApi21Parcelizer, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double MediaBrowserCompatItemReceiver(double d) {
        return INSTANCE.RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer, d);
    }

    public final findPOJOBuilder AudioAttributesImplApi21Parcelizer() {
        return onPlayFromSearch;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double AudioAttributesImplApi21Parcelizer(double d) {
        return INSTANCE.IconCompatParcelizer(AudioAttributesImplBaseParcelizer, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double MediaBrowserCompatCustomActionResultReceiver(double d) {
        return INSTANCE.write(AudioAttributesImplBaseParcelizer, d);
    }

    public final findImplicitPropertyName onCustomAction() {
        return onPrepareFromSearch;
    }

    public final findImplicitPropertyName[] AudioAttributesImplApi26Parcelizer() {
        return onPlayFromUri;
    }

    public final double read(findRootName p0, double p1) {
        double dLog;
        double d = p1 < 0.0d ? -1.0d : 1.0d;
        double remoteActionCompatParcelizer = 1.0d / p0.getRemoteActionCompatParcelizer();
        double read2 = 1.0d / p0.getRead();
        double audioAttributesCompatParcelizer = 1.0d / p0.getAudioAttributesCompatParcelizer();
        double iconCompatParcelizer = p0.getIconCompatParcelizer();
        double mediaBrowserCompatItemReceiver = p0.getMediaBrowserCompatItemReceiver();
        double d2 = d;
        double audioAttributesImplApi26Parcelizer = (p1 * d) / (p0.getAudioAttributesImplApi26Parcelizer() + 1.0d);
        if (audioAttributesImplApi26Parcelizer <= 1.0d) {
            dLog = remoteActionCompatParcelizer * Math.pow(audioAttributesImplApi26Parcelizer, read2);
        } else {
            dLog = (audioAttributesCompatParcelizer * Math.log(audioAttributesImplApi26Parcelizer - iconCompatParcelizer)) + mediaBrowserCompatItemReceiver;
        }
        return d2 * dLog;
    }

    public final double RemoteActionCompatParcelizer(findRootName p0, double p1) {
        double dExp;
        double d = p1 < 0.0d ? -1.0d : 1.0d;
        double d2 = p1 * d;
        double remoteActionCompatParcelizer = p0.getRemoteActionCompatParcelizer();
        double read2 = p0.getRead();
        double audioAttributesCompatParcelizer = p0.getAudioAttributesCompatParcelizer();
        double iconCompatParcelizer = p0.getIconCompatParcelizer();
        double mediaBrowserCompatItemReceiver = p0.getMediaBrowserCompatItemReceiver();
        double audioAttributesImplApi26Parcelizer = p0.getAudioAttributesImplApi26Parcelizer();
        double d3 = remoteActionCompatParcelizer * d2;
        if (d3 <= 1.0d) {
            dExp = Math.pow(d3, read2);
        } else {
            dExp = Math.exp((d2 - mediaBrowserCompatItemReceiver) * audioAttributesCompatParcelizer) + iconCompatParcelizer;
        }
        return (audioAttributesImplApi26Parcelizer + 1.0d) * d * dExp;
    }

    public final double IconCompatParcelizer(findRootName p0, double p1) {
        double d = p1 < 0.0d ? -1.0d : 1.0d;
        double d2 = p1 * d;
        double d3 = -p0.getRemoteActionCompatParcelizer();
        double iconCompatParcelizer = p0.getIconCompatParcelizer();
        double audioAttributesImplApi26Parcelizer = 1.0d / p0.getAudioAttributesImplApi26Parcelizer();
        return d * Math.pow(Math.max(d3 + (iconCompatParcelizer * Math.pow(d2, audioAttributesImplApi26Parcelizer)), 0.0d) / (p0.getRead() + ((-p0.getMediaBrowserCompatItemReceiver()) * Math.pow(d2, audioAttributesImplApi26Parcelizer))), 1.0d / p0.getAudioAttributesCompatParcelizer());
    }

    public final double write(findRootName p0, double p1) {
        double d = p1 < 0.0d ? -1.0d : 1.0d;
        double d2 = p1 * d;
        return d * Math.pow(getQues.AudioAttributesCompatParcelizer(p0.getRemoteActionCompatParcelizer() + (p0.getRead() * Math.pow(d2, p0.getAudioAttributesCompatParcelizer()))) / (p0.getIconCompatParcelizer() + (p0.getMediaBrowserCompatItemReceiver() * Math.pow(d2, p0.getAudioAttributesCompatParcelizer()))), p0.getAudioAttributesImplApi26Parcelizer());
    }
}
